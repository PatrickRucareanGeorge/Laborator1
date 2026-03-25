package lab3_2;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student2> listaStudenti = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("studenti_in.txt"))) {
            String linie;
            while ((linie = br.readLine()) != null) {
                String[] date = linie.split(",");
                if (date.length == 4) {
                    listaStudenti.add(new Student2(date[0].trim(), date[1].trim(), date[2].trim(), date[3].trim()));
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        for (Student2 s : listaStudenti) {
            System.out.println(s);
        }

        listaStudenti.sort(Comparator.comparing(Student2::getNume));

        try (PrintWriter pw = new PrintWriter(new FileWriter("studenti_out.txt"))) {
            for (Student2 s : listaStudenti) {
                pw.println(s.toString());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}