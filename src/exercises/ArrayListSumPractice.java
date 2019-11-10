package exercises;

import java.util.ArrayList;

public class ArrayListSumPractice {
    public static void main(String[] args) {

        ArrayList<Double> randomNumbers = new ArrayList<>(); //creates an ArrayList object for Integers

        randomNumbers.add(4.0);
        randomNumbers.add(2.0);
        randomNumbers.add(5.0);
        randomNumbers.add(5.0);
        randomNumbers.add(4.0);
        randomNumbers.add(7.0);
        randomNumbers.add(14.0);
        randomNumbers.add(43.0);
        randomNumbers.add(19.0);
        randomNumbers.add(10.0);

        Double sum = 0.0;
        for (int i = 0; i < randomNumbers.size(); i++){
            if((randomNumbers.get(i) % 2) == 0) {
                sum += randomNumbers.get(i);
            }
        }System.out.print(sum);
    }
}

