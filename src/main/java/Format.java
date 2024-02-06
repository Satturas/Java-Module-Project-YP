public class Format {
    public static String formatRubles(double rubles) {
        int intRubles10 = (int) Math.floor(rubles) % 10;
        int intRubles100 = (int) Math.floor(rubles) % 100;
        if (intRubles10 == 1 && (intRubles100 < 11 || intRubles100 > 19)) {
            return "рубль";
        } else if (intRubles10 >= 2 && intRubles10 <= 4 && (intRubles100 < 11 || intRubles100 > 19)) {
            return "рубля";
        } else {
            return "рублей";
        }
    }
}
