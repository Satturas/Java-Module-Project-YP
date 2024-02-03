public class Checking {
    public static boolean isNumeric(String input) {
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
}
