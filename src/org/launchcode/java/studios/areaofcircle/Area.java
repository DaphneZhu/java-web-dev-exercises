package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("What's the radius:");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);
        input.close();

        System.out.println("The area of a circle of radius " + radius +" is: " + area);
    }
}
