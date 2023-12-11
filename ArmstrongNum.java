// WAP to print if a number is armstrong or not.

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        System.out.print("Enter a number:- ");
        String arm = sc.next();
        int arm0 = Integer.parseInt(arm); // Converting string to integer

        fun(num, sum, arm, arm0); // Calling the function
    }
    public static void fun(int num, int sum, String arm, int arm0){
        for (int i =0; i<arm.length(); i++) {
            num = arm.charAt(i)-48;
            num = num*num*num;
            sum = sum + num;
        }
        // Checking the condition
        if (sum == arm0)
            System.out.println("Yes, the given number is Armstrong");
        else
            System.out.println("No, The given number is not Armstrong");
    }
}
