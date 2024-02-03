public class Format {
    public static String formatRubles(double rubles) {
        int intRubles = (int) Math.floor(rubles);
        if (intRubles % 10 == 1) {
            return "рубль";
        } else if (intRubles % 10 == 2 || intRubles % 10 == 3 || intRubles % 10 == 4) {
            return "рубля";
        } else {
            return "рублей";
        }
    }
}
