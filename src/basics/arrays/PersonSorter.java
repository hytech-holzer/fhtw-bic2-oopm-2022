package basics.arrays;

import java.util.Scanner;

public class PersonSorter {

    public static void main(String[] args) {
        Person[] personArray = new Person[0];
        while (true) {
            Person newPerson = readPerson();
            if (newPerson == null) {
                break;
            }
            personArray = addElement(personArray, newPerson);
        }
        print(getSortedArray(personArray));
    }


    private static Person[] getSortedArray(Person[] unsortedArray) {
        Person[] sortedArray = unsortedArray;
        Person temp;
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

    private static void print(Person[] array) {
        for (Person p : array) {
            System.out.printf("%s %S\n", p.getVorname(), p.getNachname());
        }
    }

    private static Person[] addElement(Person[] array, Person newElement) {
        Person[] newArray = new Person[array.length+1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = newElement;
        return newArray;
    }

    private static Person readPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Neue Person: ['stop' beendet die Eingabe]");
        System.out.print("Vorname: ");
        String vorname = scanner.nextLine();
        if (vorname.equals("stop")) {
            return null;
        }
        System.out.print("Nachname: ");
        String nachname = scanner.nextLine();
        Person person = new Person(vorname, nachname);
        return person;
    }
}
