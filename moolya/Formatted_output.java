package moolya;

public class Formatted_output {
    public static void main(String[] args) {
        //There are different ways in which we can format output in Java. Some of them are given below.
        //Using System.out.printf()
        //Using DecimalFormat class
        //Using SimpleDateFormat class (for formatting Dates)
        int x = 100;
        //%d is used to print an integer in decimal (base 10) format, so the output of the first printf statement will be "Printing simple integer: x = 100".
        System.out.printf("Printing simple integer: x = %d\n", x);
        //%o is used to print an integer in octal (base 8) format, so the output of the second printf statement will be "Printing simple integer: x = 144", which is the octal equivalent of the decimal value 100.
        System.out.printf("Printing simple integer: x = %o\n", x);
        //%x is used to print an integer in hexadecimal (base 16) format, so the output of the third printf statement will be "Printing simple integer: x = 64", which is the hexadecimal equivalent of the decimal value 100.
        System.out.printf("Printing simple integer: x = %x\n", x);

        // this will print it upto 2 decimal places
        System.out.printf("Formatted with precision: PI = %.2f\n", Math.PI);

        float n = 5.2f;

        // automatically appends zero to the rightmost part
        // of decimal
        System.out.printf("Formatted to specific width: n = %.4f\n", n);
        n = 2324435.3f;

        // here number is formatted from right margin and
        // occupies a width of 20 characters
        System.out.printf("Formatted to right margin: n = %20.4f\n", n);


    }
}
