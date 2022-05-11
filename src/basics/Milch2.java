package basics;

import java.util.Scanner;



public class Milch2 {
    public static void main(String[] args) {
        int fat = readFat();
        int haltbar = readHaltbar();

        if(isValid(fat, haltbar)) {
            System.out.printf("%s %s",
                    getFettgehaltDescription(fat),
                    getHaltbarkeitDescription(haltbar));
        } else {
            System.out.printf("Ungueltig!");
        }

    }

    private static boolean isValid(int fat, int haltbar) {
        if(fat < 0 || haltbar < 0 || haltbar > 1){
            return false;
        }
        return true;
    }

    private static int readFat() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Fettgehalt: ");
        Integer fat = sc.nextInt();
        return fat;
    }

    private static int readHaltbar() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Haltbar: ");
        Integer haltbar =sc.nextInt();
        return haltbar;
    }

    private static String getFettgehaltDescription(int fat) {
        if( fat <3 ){
            return "Leichtmilch";
        } else if(fat <=7){
            return "Normalmilch";
        } else {
            return "Extravollmilch";
        }
    }

    private static String getHaltbarkeitDescription(int haltbar) {
        if(haltbar == 0){
            return "(frisch)";
        } else {
            return "(haltbar)";
        }
    }
}