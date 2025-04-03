package app;

public class Main {

    public static final double CONV_K = 2.20462;

    public static void main(String[] args) {
        System.out.println("Converter App.");
        System.out.println("Version 1.0");
        double kgs = 5;
        double pnds = 12;
        double pounds = convKgsToPounds(kgs);
        double kilos = convPoundsToKgs(pnds);
        System.out.println("Result is " + pounds + " pounds and "
                + kilos + " kgs.");
    }

    private static double convKgsToPounds(double kilos){
        return kilos * CONV_K;
    }

    private static double convPoundsToKgs(double pounds){
        return pounds / CONV_K;
    }
}
