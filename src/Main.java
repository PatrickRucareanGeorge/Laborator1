import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Set<Student> listaStudenti = new HashSet<>();

    listaStudenti.add(new Student("120", "Alis", "Popa", "TI22/2"));

    Student B = new Student("120", "Alis", "Popa", "TI21/2");
    Student C = new Student("112", "Maria", "Popa", "TI21/1");

    System.out.println(verificaPrezenta(listaStudenti, B));
    System.out.println(verificaPrezenta(listaStudenti, C));
  }

  public static boolean verificaPrezenta(Set<Student> studenti, Student s) {
    return studenti.contains(s);
  }
}