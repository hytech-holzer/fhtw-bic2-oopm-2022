package basics.arrays;

import java.util.Arrays;

public class SimpleSorter {

    public static void main(String[] args) {
        String[] array = {"a", "c", "z", "b", "f"};
        String[] sortedArray = getSortedArray(array);
        printArray(sortedArray);
    }

    private static void printArray(String[] array) {
        for (String string : array) {
            System.out.println(string);
        }
    }

    private static String[] getSortedArray(String[] unsortedArray) {
        String[] sortedArray = unsortedArray;
        String temp;
        for (int j = 0; j < sortedArray.length; j++) {
            for (int i = j + 1; i < sortedArray.length; i++) {
                if (sortedArray[i].compareTo(sortedArray[j]) < 0) {
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[i];
                    sortedArray[i] = temp;
                }
            }
        }
        return sortedArray;
    }



}
