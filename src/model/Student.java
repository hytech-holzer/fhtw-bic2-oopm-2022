package model;

import java.util.Objects;

public class Student extends Person {
    private int matrikelnr;

    public int getMatrikelnr() {
        return matrikelnr;
    }

    public void setMatrikelnr(int matrikelnr) {
        this.matrikelnr = matrikelnr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Student)) return false;
        Student student = (Student) o;
        return this.getVorname().equals(student.getVorname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(matrikelnr);
    }
}


