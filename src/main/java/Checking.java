public class Checking {
    public static boolean isInt(String input) {
        int intValue;

        if (input == null || input.isEmpty()) {
            System.out.println("Нулевая строка! Введите числовое значение:");
            return false;
        }

        try {
            intValue = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Должно быть указано числовое значение! Пожалуйста повторите ввод:");
        }
        return false;
    }

    public static boolean isNotEmpty(String input) {
        if (input == null || input.isEmpty()) {
            System.out.print("Нулевая строка! ");
            return false;
        }
        return true;
    }

    public static boolean isDouble(String input) {
        double doubleValue;

        if (input == null || input.isEmpty()) {
            System.out.println("Нулевая строка! Введите числовое значение:");
            return false;
        }

        try {
            doubleValue = Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            System.out.print("Должно быть указано числовое значение! ");
        }
        return false;
    }
}


