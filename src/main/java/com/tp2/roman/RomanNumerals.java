package com.tp2.roman;

public class RomanNumerals {

    public String convert(int number) {
        if (number <= 0 || number > 3999) {
            throw new IllegalArgumentException("Solo entre 1 y 3999");
        }

        int[] values =    {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                sb.append(symbols[i]);
                number -= values[i];
            }
        }
        return sb.toString();
    }
}