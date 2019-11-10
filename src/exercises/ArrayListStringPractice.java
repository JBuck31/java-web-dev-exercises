package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStringPractice {
    public static void main(String[] args) {
        ArrayList<String> randomWords = new ArrayList<>(); //creates an ArrayList object for Strings

        randomWords.add("candy");
        randomWords.add("tree");
        randomWords.add("birds");
        randomWords.add("dog");
        randomWords.add("coffee");
        randomWords.add("phone");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a length:");
        Double targetLength = input.nextDouble();

        for(int i = 0; i < randomWords.size(); i++ ) {
            if(randomWords.get(i).length() == targetLength ){
                System.out.println(randomWords.get(i));
            }
        }
    }
}
