package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle?");
        Integer length = Integer.valueOf(input.nextLine());
        System.out.println("What is the width of your rectangle?");
        Integer width = Integer.valueOf(input.nextLine());
        Integer area = length*width;
        System.out.println("The area of your rectangle is " + area);
        input.close();
    }
}
