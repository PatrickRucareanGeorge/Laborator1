package lab3_2;

import java.util.Objects;

public class Student2 {
    private String numarMatricol;
    private String prenume;
    private String nume;
    private String formatieDeStudiu;

    public Student2(String numarMatricol, String prenume, String nume, String formatieDeStudiu) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return numarMatricol + "," + prenume + "," + nume + "," + formatieDeStudiu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student = (Student2) o;
        return Objects.equals(nume, student.nume) &&
                Objects.equals(prenume, student.prenume) &&
                Objects.equals(formatieDeStudiu, student.formatieDeStudiu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume, formatieDeStudiu);
    }
}