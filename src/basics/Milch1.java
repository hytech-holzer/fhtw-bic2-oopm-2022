package basics;

import java.util.Scanner;

public class Milch1 {
    public static void main(String[] args) {

        //Aufgabe 19

        Scanner scan = new Scanner(System.in);


        System.out.printf("Fettgehalt: ");
        int fettgehalt = scan.nextInt();
        System.out.printf("Haltbar: ");
        int haltbarkeit = scan.nextInt();

        if (fettgehalt < 3 && fettgehalt >= 0) {
            switch (haltbarkeit) {
                case 0:
                    System.out.println("Leichtmilch (frisch)");
                    break;
                case 1:
                    System.out.println("Leichtmilch (haltbar)");
                    break;
                default:
                    System.out.println("Ungueltig!");
                    break;
            }
        } else if (fettgehalt >= 3 && fettgehalt <= 7) {
            switch (haltbarkeit) {
                case 0:
                    System.out.println("Normalmilch (frisch)");
                    break;
                case 1:
                    System.out.println("Normalmilch (haltbar)");
                    break;
                default:
                    System.out.println("Ungueltig!\n");
                    break;
            }
        } else if (fettgehalt > 7) {
            switch (haltbarkeit) {
                case 0:
                    System.out.println("Extravollmilch (frisch)");
                    break;
                case 1:
                    System.out.println("Extravollmilch (haltbar)");
                    break;
                default:
                    System.out.println("Ungueltig!");
                    break;
            }
        }
        else
            System.out.println("Ungueltig!");


        scan.close();
    }
}