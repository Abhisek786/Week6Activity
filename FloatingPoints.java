// WAP to print if the floating point numbers are equal or not upto second decimal.

import java.util.Scanner;

public class FloatingPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ask user for input
        System.out.print("Enter a floating point number:- ");
        float fnum = sc.nextFloat();
        System.out.print("Enter another one:- ");
        float snum = sc.nextFloat();

        fun(fnum, snum);
    }

    public static void fun(float fnum, float snum) {
        // Multiplying by 100 to get to second decimal point
        fnum = fnum * 100;
        // Converting float type to integer
        int fnum0 = (int) fnum;
        snum = snum * 100;
        int snum0 = (int) snum;

        if (fnum0 == snum0)
            System.out.println("The numbers are same");
        else
            System.out.println("The numbers are different");
    }
}
