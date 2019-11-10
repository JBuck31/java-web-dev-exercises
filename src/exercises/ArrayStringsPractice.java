package exercises;

import java.util.Arrays;

public class ArrayStringsPractice {
    public static void main(String[] args) {
        String rhyme = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] rhymeArray = rhyme.split("\\."); //declares new array for strings;

        System.out.println(Arrays.toString(rhymeArray));
    }
}
