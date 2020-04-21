package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("What's the length for the rectangle:");
        double length = input.nextDouble();
        System.out.println ("what's the width for the rectangle:");
        double width = input.nextDouble();
        double areaOfRectangle = (length * width);
        input.close();

        System.out.println("Area of the rectangle is: " + areaOfRectangle);

    }
}
