package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        char symbol = input.charAt(0);
        String result = "" + symbol;
        int counter = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                counter++;
                result = result;
            } else {
                result = counter == 1 ? result + "" + input.charAt(i) : result + "" + counter + "" + input.charAt(i);
                counter = 1;
            }
        }
        if (counter != 1) {
            result = result + "" + counter;
        }
        return result;
    }
}