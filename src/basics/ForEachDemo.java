package basics;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachDemo {

    public static void main(String[] args) {

        String[] array = createArray();
        printArray(array);
        array = addElementToArray(array, "f");
        printArray(array);

//        for (String s : myArray) {
//            System.out.println(s);
//        }
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }
        //Arrays.stream(myArray).forEach(System.out::println);
    }

    private static void printArray(String[] array) {
        System.out.println("Ausgabe:");
        Arrays.stream(array).forEach(System.out::println);
    }

    private static String[] createArray() {
        Scanner scanner = new Scanner(System.in);
        String[] myArray = new String[5];
        System.out.println("Bitte geben Sie Werte ein:");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextLine();
        }
        return myArray;
    }

    private static String[] addElementToArray(String[] array, String newElement) {
        String[] newArray = new String[array.length+1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = newElement;
        return newArray;
    }
}
