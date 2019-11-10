package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = Integer.valueOf(input.nextLine());
        if(radius<0){
            System.out.println("ERROR");
            System.exit(0);
        }
        double pi = 3.14;
        double area = Circle.getArea(radius);
        System.out.println("The area of your circle is " + area);
        input.close();
    }
}
