import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Set<Student2> listaStudenti = new HashSet<>();

    listaStudenti.add(new Student2("120", "Alis", "Popa", "TI22/2"));

    Student2 B = new Student2("120", "Alis", "Popa", "TI21/2");
    Student2 C = new Student2("112", "Maria", "Popa", "TI21/1");

    System.out.println(verificaPrezenta(listaStudenti, B));
    System.out.println(verificaPrezenta(listaStudenti, C));
  }

  public static boolean verificaPrezenta(Set<Student2> studenti, Student2 s) {
    return studenti.contains(s);
  }
}