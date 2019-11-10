package exercises;

import java.util.Scanner;

public class StringsExtended {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("What word are you searching for?");
        String searchTerm = input.nextLine().toLowerCase();
        boolean isInSentence = sentence.toLowerCase().contains(searchTerm);
        if (isInSentence == true) {
            System.out.println("The word '" + searchTerm + "' is at index " + sentence.indexOf(searchTerm) + " and the length is " + searchTerm.length());
            String[] newSentence = sentence.split(searchTerm);
            System.out.println(newSentence[0]);
        } else {
            System.out.println("The word " + searchTerm + " is NOT in the sentence.");
        }

    }
}
