package org.launchcode;

import java.util.Scanner;
public class NumericTypes {
    public static void main(String[] args) {
        Scanner lengthInput = new Scanner(System.in);
        System.out.println("What are the rectangle's length?");

        int rectangleLength = lengthInput.nextInt();

        Scanner widthInput = new Scanner(System.in);
        System.out.println("What are the rectangle's width?");

        int rectangleWidth = widthInput.nextInt();

        int rectangleArea = rectangleLength * rectangleWidth;

        System.out.println("The area of the rectangle is" + rectangleArea);
    }
}
