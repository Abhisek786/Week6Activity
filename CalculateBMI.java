// WAP to calculate BMI.

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter your height(In Metres):- ");
        float height = sc.nextFloat();
        System.out.print("Enter your Weight(In KiloGrams):- ");
        float weight = sc.nextFloat();

        fun(height, weight);
    }

    public static void fun(float height, float weight) {
        // Display result to the user
        float bmi = weight / (height * height);
        System.out.println("Your BMI is:- " + bmi + " kg/m²");
    }
}
