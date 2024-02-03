import java.util.HashMap;
import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Добро пожаловать в программу 'Калькулятор счета'.");
        System.out.println("Укажите в числовом виде количество гостей, на которых необходимо разделить счет:");

        int numInput;

        while (true) {
            String textInput = scanner.nextLine();
            if (Checking.isInt(textInput)) {
                numInput = Integer.parseInt(textInput);
            } else {
                continue;
            }
            if (numInput == 1) {
                System.out.println("Для одного гостя калькулятор не нужен! Пожалуйста введите число больше 1:");
            } else if (numInput < 1) {
                System.out.println("Некорректный ввод! Пожалуйста введите число больше 1:");
            } else {
                break;
            }
        }

        HashMap<String, Double> goodsMap = new HashMap<>();

        String goodsName;
        double goodsPrice;

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
                    break;
                }
            }
            Goods product = new Goods(goodsName, goodsPrice);
            goodsMap.put(product.name, product.price);
            break;


        }



    }
}
