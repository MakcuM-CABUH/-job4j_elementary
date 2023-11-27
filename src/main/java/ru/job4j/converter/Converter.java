package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");

        float inEu = 140;
        float expectedEu = 2;
        float outEu = Converter.rubleToEuro(inEu);
        boolean passedEu = expectedEu == outEu;
        System.out.println("140 rubles are 2 euro. Test result: " + passedEu);

        float inDoll = 120;
        float expectedDoll = 2;
        float outDoll = Converter.rubleToDollar(inDoll);
        boolean passedDoll = expectedDoll == outDoll;
        System.out.println("120 rubles are 2 dollars. Test result: " + passedDoll);
    }
}
