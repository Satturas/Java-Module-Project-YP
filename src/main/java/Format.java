public class Format {
    public static String formatRubles(double rubles) {
        int intRubles = (int) Math.floor(rubles) % 10;
        if (intRubles == 1 && (rubles % 100 < 11 || rubles % 100 > 19)) {
            return "рубль";
        } else if (intRubles >= 2 && intRubles <= 4 && (rubles % 100 < 11 || rubles % 100 > 19)) {
            return "рубля";
        } else {
            return "рублей";
        }
    }
}
