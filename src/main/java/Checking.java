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
            if (input.indexOf('.') != -1) {
                String[] splitter = input.split("\\.");
                if (splitter[1].length() > 2) {
                    System.out.print("Количество копеек не может быть больше 100! ");
                    return false;
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } catch (NumberFormatException e) {
            System.out.print("Должно быть указано числовое значение! ");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Формат введенной стоимости не соответствует 'рубли.копейки'! ");
        }
        return false;
    }
}


