package main.java.string;

import java.text.DecimalFormat;

public class NumberToWord {

    private static final String[] tens = { "", " Ten", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety" };
    private static final String[] ones = {
            "",
            " One",
            " Two",
            " Three",
            " Four",
            " Five",
            " Six",
            " Seven",
            " Eight",
            " Nine",
            " Ten",
            " Eleven",
            " Twelve",
            " Thirteen",
            " Fourteen",
            " Fifteen",
            " Sixteen",
            " Seventeen",
            " Eighteen",
            " Nineteen" };

    public static void main(String[] args) {

        NumberToWord obj = new NumberToWord();

        System.out.println(obj.convertNumberToWord(2));
        System.out.println(obj.convertNumberToWord(99));
        System.out.println(obj.convertNumberToWord(456));
        System.out.println(obj.convertNumberToWord(1101));
        System.out.println(obj.convertNumberToWord(19812));
        System.out.println(obj.convertNumberToWord(674319));
        System.out.println(obj.convertNumberToWord(909087531));
        System.out.println(obj.convertNumberToWord(1000000000));
        System.out.println(obj.convertNumberToWord(359999999));
        System.out.println(obj.convertNumberToWord(1213000000L));
        System.out.println(obj.convertNumberToWord(1000000));
        System.out.println(obj.convertNumberToWord(1111111111));
        System.out.println(obj.convertNumberToWord(3000200));
        System.out.println(obj.convertNumberToWord(700000));
        System.out.println(obj.convertNumberToWord(9000000));
    }

    String convertNumberToWord(long number) {
        if (number == 0) {
            return "zero";
        }

        String pattern = "000000000000";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String num = decimalFormat.format(number);

        int billions = Integer.parseInt(num.substring(0, 3));
        int millions = Integer.parseInt(num.substring(3, 6));
        int hundredThousands = Integer.parseInt(num.substring(6, 9));
        int thousands = Integer.parseInt(num.substring(9, 12));

        String totalBillions, totalMillions, totalHundredThousands, totalThousands;

        totalBillions = billions != 0 ? convertUptoThousand(billions) + " Billion " : "";
        String result = totalBillions;

        totalMillions = millions != 0 ? convertUptoThousand(millions) + " Million " : "";
        result = result + totalMillions;

        totalHundredThousands = hundredThousands != 0 ? convertUptoThousand(hundredThousands) + " Thousand " : "";
        result = result + totalHundredThousands;

        totalThousands = convertUptoThousand(thousands);
        result = result + totalThousands;

        return result;
    }

    String convertUptoThousand(int number) {
        String soFar;

        if (number % 100 < 20) {
            soFar = ones[number % 100];
            number = number / 100;
        } else {
            soFar = ones[number % 10];
            number = number / 10;
            soFar = tens[number % 10] + soFar;
            number = number / 10;
        }

        if (number == 0)
            return soFar;
        return ones[number] + " Hundred " + soFar;

    }

}

// https://www.javatpoint.com/java-program-number-to-word
