package exercises;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] myNumbers = {
                1, 1, 2, 3, 5, 8
        };

        for (int i = 0; i < myNumbers.length; i++) {
            if ((myNumbers[i] % 2) != 0) {
                System.out.println(myNumbers[i]);
            }
        }
    }
}

