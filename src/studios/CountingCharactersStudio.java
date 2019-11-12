package studios;


import java.util.*;


public class CountingCharactersStudio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = input.nextLine().toLowerCase();
        char[] charactersInSentence = sentence.toCharArray(); //turns the sentence into an array of characters
        HashMap<Character, Integer> characterList = new HashMap<>(); //declares new HashMap which will hold character and number of characters

        for (int i = 0; i < charactersInSentence.length; i++) {
            char letter = charactersInSentence[i];
            if (!String.valueOf(letter).equals(" ")) {
                if (!characterList.containsKey(letter)) {
                characterList.put(letter, 1);
                }else {
                    characterList.put(letter, (characterList.get(letter) + 1));
                }
            }
        }System.out.println(characterList);
    }
}

