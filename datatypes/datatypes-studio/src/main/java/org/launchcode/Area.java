package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        double radius;

        input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = input.nextDouble();
        input.close();

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is " + area);

    }
}
