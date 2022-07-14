package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        float rsl = value * 0.86f;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 1.17f;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        euro = Converter.dollarToEuro(24);
        System.out.println("24 dollars are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(210);
        System.out.println("210 rubles are " + dollar + " dollar.");
        dollar = Converter.euroToDollar(15);
        System.out.println("15 euro are " + dollar + " dollar.");

    }
}
