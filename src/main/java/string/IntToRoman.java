package main.java.string;

public class IntToRoman {
    public static void main(String[] args) {
        int values[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String symbols[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        IntToRoman obj = new IntToRoman();
        System.out.println(obj.intToRoman(1994, values, symbols));
    }

    String intToRoman(int num, int values[], String symbols[]) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num = num - values[i];
                sb.append(symbols[i]);
            }
        }

        return sb.toString();
    }
}
