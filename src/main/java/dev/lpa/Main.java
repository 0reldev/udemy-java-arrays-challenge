package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = generateRandomIntArray(5);
        sortArraysInDescendingOrder(array);
    }

    public static int[] sortArraysInDescendingOrder(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        int[] reversedArray = new int[sortedArray.length];
        for (int i = 0 ; i < sortedArray.length ; i++) {
            reversedArray[i] = sortedArray[sortedArray.length - i - 1];
        }
        System.out.println("Array's sorting. New array:\n" + Arrays.toString(reversedArray) + "\n");
        return sortedArray;
    }

    public static int[] generateRandomIntArray(int size) {
        int[] randomArray = new int[size];
        Random random = new Random();
        for (int i = 0 ; i < size ; i ++) {
            randomArray[i] = random.nextInt(1000);
        }
        System.out.println("Generation of a random array:\n" + Arrays.toString(randomArray) + "\n");
        return randomArray;
    }
}
