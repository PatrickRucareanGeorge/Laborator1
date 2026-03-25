package lab3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Definim calea către fișiere
            Path inputPath = Paths.get("in.txt");
            Path outputPath = Paths.get("out.txt");

            // Citirea datelor dintr-un fișier într-o listă în memorie
            // Conform exemplului 3.1: Citire din fisiere text
            List<String> lines = Files.readAllLines(inputPath);

            // Listă pentru a stoca rezultatele finale (Requirement c)
            List<String> finalOutput = new ArrayList<>();

            // --- Cerinta a) ---
            // Parcurgeti fiecare linie si adaugati inca un newline (\n)
            finalOutput.add("REZULTAT CERINTA A");
            for (String line : lines) {
                // Afișăm pe consolă conform cerinței
                System.out.println(line + "\n");
                // Adăugăm în lista pentru salvare
                finalOutput.add(line);
                finalOutput.add(""); // Adaugă o linie goală (echivalentul a încă unui \n)
            }

            // --- Cerinta b) ---
            // Parcurgeti fiecare linie si adaugati un newline pentru fiecare punct (.)
            // Folosim metoda split() conform capitolului 3.3 din curs
            System.out.println("\nProcesare Cerinta b)...");
            finalOutput.add("\n--- REZULTAT CERINTA B ---");
            for (String line : lines) {
                // Split după punct. Atenție: în regex, punctul se scrie "\\."
                String[] sentences = line.split("\\.");
                for (String s : sentences) {
                    String formatted = s.trim() + ".";
                    System.out.println(formatted);
                    finalOutput.add(formatted);
                }
            }

            // --- Cerinta c) ---
            // Salvati in fisierul out.txt rezultatul modificarilor
            // Conform exemplului 3.2: Scriere in fisier text (writeSmallTextFile style)
            Files.write(outputPath, finalOutput);

            System.out.println("\nSucces! Rezultatele au fost salvate în out.txt.");

        } catch (IOException e) {
            System.err.println("Eroare la manipularea fisierelor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}