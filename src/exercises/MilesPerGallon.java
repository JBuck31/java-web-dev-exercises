package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        Integer miles = Integer.valueOf(input.nextLine());
        System.out.println("How many gallons did you use?");
        Integer gallons = Integer.valueOf(input.nextLine());
        Integer MPG = miles/gallons;
        System.out.println("Your miles-per-gallon is " + MPG);
        input.close();
    }
}
