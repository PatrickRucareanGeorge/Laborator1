package lab3;

import java.util.Objects;

public class Student {
    private String numarMatricol;
    private String prenume;
    private String nume;
    private String formatieDeStudiu;

    public Student(String numarMatricol, String prenume, String nume, String formatieDeStudiu) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
    }

    @Override
    public String toString() {
        return "lab3.Student [" +
                "Matricol: " + numarMatricol +
                ", Nume: " + nume +
                ", Prenume: " + prenume +
                ", Grupa: " + formatieDeStudiu +
                "]";
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student2 = (Student) o;
        return Objects.equals(nume, student2.nume) &&
                Objects.equals(prenume, student2.prenume) &&
                Objects.equals(formatieDeStudiu, student2.formatieDeStudiu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume, formatieDeStudiu);
    }
}
