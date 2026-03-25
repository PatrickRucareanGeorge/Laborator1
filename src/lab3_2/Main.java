package lab3_2;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student2> listaStudenti = new ArrayList<>();

        // 1. Read from studenti_in.txt
        try (BufferedReader br = new BufferedReader(new FileReader("studenti_in.txt"))) {
            String linie;
            while ((linie = br.readLine()) != null) {
                String[] date = linie.split(",");
                if (date.length == 4) {
                    listaStudenti.add(new Student2(date[0], date[1], date[2], date[3]));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        // 2. Display the students
        System.out.println("Students read from file:");
        listaStudenti.forEach(System.out::println);

        // 3. Sort students by last name (nume)
        Collections.sort(listaStudenti);

        // 4. Save to studenti_out.txt
        try (PrintWriter pw = new PrintWriter(new FileWriter("studenti_out.txt"))) {
            for (Student2 s : listaStudenti) {
                pw.println(s.toString());
            }
            System.out.println("\nSorted list saved to studenti_out.txt");
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}