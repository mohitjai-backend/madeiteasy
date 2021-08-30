package main.java.string;

public class FindExcelColumnName {
    public static void main(String[] args) {
        FindExcelColumnName obj = new FindExcelColumnName();
        System.out.println(obj.findExcelColumnName(26));
        System.out.println(obj.findExcelColumnName(51));
        System.out.println(obj.findExcelColumnName(52));
        System.out.println(obj.findExcelColumnName(80));
        System.out.println(obj.findExcelColumnName(676));
        System.out.println(obj.findExcelColumnName(702));
        System.out.println(obj.findExcelColumnName(705));

    }

    String findExcelColumnName(int number) {
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            int remainder = number % 26;
            if (remainder == 0) {
                sb.append('Z');
                number = number / 26 - 1;
            } else {
                sb.append((char) (remainder - 1 + 'A'));
                number = number / 26;
            }
        }

        return sb.reverse().toString();
    }
}

// https://www.geeksforgeeks.org/find-excel-column-name-given-number/
