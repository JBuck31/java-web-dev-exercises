package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer,String> studentIDList = new HashMap<>(); //declares new HashMap
        Scanner input = new Scanner(System.in);
        Integer newId; //declares newId as an integer

        System.out.println("Enter first ID Number (or 0 to finish):");

        do{

            System.out.print("Student ID: ");
            newId = input.nextInt();

            if (newId != 0) {
                System.out.print("Student Name:");
                String nextStudent = input.next();
                studentIDList.put(newId, nextStudent);

                input.nextLine(); // Read in the newline before looping back
            }

        }while (newId != 0);

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> id : studentIDList .entrySet()) {
            System.out.println(id.getKey() + " (" + id.getValue() + ")");
        }
    }
}
