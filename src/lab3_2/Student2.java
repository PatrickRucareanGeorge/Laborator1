package lab3_2;

public class Student2 implements Comparable<Student2> {
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

    public String getNume() { return nume; }

    @Override
    public String toString() {
        return numarMatricol + "," + prenume + "," + nume + "," + formatieDeStudiu;
    }

    // Sorting logic: compares by last name (nume)
    @Override
    public int compareTo(Student2 other) {
        return this.nume.compareTo(other.nume);
    }

    // Keep your existing equals and hashCode methods here...
}