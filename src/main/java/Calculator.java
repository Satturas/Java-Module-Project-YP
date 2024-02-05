import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Locale;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Добро пожаловать в программу 'Калькулятор счета'.");
        System.out.println("Укажите в числовом виде количество гостей, на которых необходимо разделить счет:");

        int numGuests;

        while (true) {
            String textInput = scanner.nextLine();
            if (Checking.isInt(textInput)) {
                numGuests = Integer.parseInt(textInput);
            } else {
                continue;
            }
            if (numGuests == 1) {
                System.out.println("Для одного гостя калькулятор не нужен! Пожалуйста введите число больше 1:");
            } else if (numGuests < 1) {
                System.out.println("Некорректный ввод! Пожалуйста введите число больше 1:");
            } else {
                break;
            }
        }

        HashMap<String, Double> goodsMap = new HashMap<>();

        String goodsName;
        double goodsPrice;
        double sum = 0.00;

        while (true) {
            System.out.println("Укажите название товара:");
            String textInput = scanner.nextLine();
            if (Checking.isNotEmpty(textInput)) {
                goodsName = textInput;
            } else {
                continue;
            }

            while (true) {
                System.out.println("Укажите стоимость товара в формате 'ХХ.ХХ' (рубли.копейки):");
                textInput = scanner.nextLine();
                if (Checking.isDouble(textInput)) {
                    goodsPrice = Double.parseDouble(textInput);
                } else {
                    continue;
                }
                if (goodsPrice < 0) {
                    System.out.print("Стоимость товара не может быть меньше 0! ");
                } else {
                    break;
                }
            }
            Goods product = new Goods(goodsName, goodsPrice);
            goodsMap.put(product.name, product.price);
            sum += product.price;
            System.out.println("Товар '" + product.name + "' успешно добавлен.");

            System.out.println("Добавить еще товар? Если нет, введите 'Завершить':");
            if (scanner.nextLine().equalsIgnoreCase("завершить")) {
                break;
            }
        }

        System.out.println("Добавленные товары:");
        for (Map.Entry<String, Double> entry : goodsMap.entrySet()) {
            String key = entry.getKey();
            double value = entry.getValue();
            System.out.printf(Locale.ROOT,"%s %.2f %s%n", key, value, Format.formatRubles(value));
        }
        System.out.println("--------------------");
        double result = sum / numGuests;
        String rubles = Format.formatRubles(result);
        String resultOutput = String.format(Locale.ROOT,"Каждый гость должен заплатить: %.2f %s", result, rubles);
        System.out.println(resultOutput);
    }
}