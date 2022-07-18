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
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 50;
        expected = 43;
        out = Converter.dollarToEuro(in);
        passed = expected == out;
        System.out.println("50 dollars are 43. Test result : " + passed);
        in = 240;
        expected = 4;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("240 rubles are 4. Test result : " + passed);
        in = 500;
        expected = 585;
        out = Converter.euroToDollar(in);
        passed = expected == out;
        System.out.println("500 euro are 585. Test result : " + passed);
    }
}
