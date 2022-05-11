package model;

public class DemoStudent {


    public static void main(String[] args) {

        Student maxMusternann = new Student();
        maxMusternann.setVorname("Max");
        maxMusternann.setNachname("Mustermann");
        maxMusternann.setMatrikelnr(1234);

        System.out.printf("%s %S (%d)",
                maxMusternann.getVorname(),
                maxMusternann.getNachname(),
                maxMusternann.getMatrikelnr());

        Student anna1 = new Student();
        anna1.setVorname("Anna");
        Student anna2 = new Student();
        anna2.setVorname("Anna");
        System.out.println(anna1.equals(anna2));
    }


}
