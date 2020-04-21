package exercises;

import java.util.Scanner;

public class milesPerGallon {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        double miles = input.nextDouble();
        System.out.println("How much gas did you consume in gallons: ");
        double gallons = input.nextDouble();
        double milesPerGallon = ( miles / gallons );
        input.close();

        System.out.println("Miles-per-gallon: " + milesPerGallon);
    }
}
