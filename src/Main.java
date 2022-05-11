import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.print("Hello World.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eingabe: ");
        String eingabe = scanner.nextLine();
        System.out.println(eingabe);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double f = (a*b)/2;
        System.out.println(f);

    }
}
