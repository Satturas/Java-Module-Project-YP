import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Добро пожаловать в программу 'Калькулятор счета'.");
        System.out.println("Укажите в числовом виде количество гостей, на которых необходимо разделить счет:");
        int numInput = 0;
        while (true) {
            String textInput = scanner.nextLine();
            if (Checking.isNumeric(textInput)) {
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
    }
}
