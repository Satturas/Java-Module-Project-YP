public class Checking {
    public static boolean isInt(String input) {

        if (input == null || input.isEmpty()) {
            System.out.println("Нулевая строка! Введите числовое значение:");
            return false;
        }

        try {
            Integer.parseInt(input);
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

        if (input == null || input.isEmpty()) {
            System.out.print("Нулевая строка! ");
            return false;
        }

        try {
            Double.parseDouble(input);
            String[] splitter = input.split("\\.");
            if (splitter[1].length() != 2) {
                System.out.print("После точки должно быть 2 цифры! ");
                return false;
            } else {
                return true;
            }
        } catch (NumberFormatException e) {
            System.out.print("Должно быть указано числовое значение! ");
        }
        return false;
    }
}


