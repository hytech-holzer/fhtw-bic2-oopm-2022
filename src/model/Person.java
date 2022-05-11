package model;

public class Person {
   private String vorname;
   private String nachname;

   public String getVorname() {
      return vorname;
   }
   public String getNachname() {
      return nachname;
   }

   public void setVorname(String vorname) {
      this.vorname = vorname;
   }

   public void setNachname(String nachname) {
      this.nachname = nachname;
   }

   @Override
   public String toString() {
      super.toString();
      return "Person{" +
              "vorname='" + vorname + '\'' +
              ", nachname='" + nachname + '\'' +
              '}';
   }
}