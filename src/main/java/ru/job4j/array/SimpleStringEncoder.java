package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;

        for (int i = 0; i < input.length(); i++) {

            if (i == 0) {
                result = result + "" + input.charAt(i);

            } else if (i != 0 && input.charAt(i) == input.charAt(i - 1)) {
                counter++;
                if (i == input.length() - 1) {
                    result = result + "" + counter;
                }
            } else if (input.charAt(i) != input.charAt(i - 1)) {
                if (counter == 1) {
                    result = result + "";
                } else {
                    result = result + "" + counter;
                }
                counter = 1;
                result = result + "" + input.charAt(i);
            }
        }
        return result;
    }
}
