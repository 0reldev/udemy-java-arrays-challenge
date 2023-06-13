import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = generateRandomIntArray(10);
        sortArraysInDescendingOrder(array);
    }

    public static int[] sortArraysInDescendingOrder(int[] array) {
        int[] sortedArray = array;
        Arrays.sort(sortedArray);
        int[] reversedArray = new int[sortedArray.length];
        for (int i = 0 ; i < sortedArray.length ; i++) {
            reversedArray[i] = sortedArray[sortedArray.length - i - 1];
        }
        System.out.println("Arrays sorting. New array:\n" + Arrays.toString(reversedArray));
        return sortedArray;
    }

    public static int[] generateRandomIntArray(int size) {
        int[] randomArray = new int[size];
        for (int i = 0 ; i < size ; i ++) {
            Random random = new Random();
            randomArray[i] = random.nextInt();
        }
        System.out.println("Generation of a random array:\n" + Arrays.toString(randomArray));
        return randomArray;
    }
}
