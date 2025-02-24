package TP;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileProcessor {

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.docx";
        int numberOfLines = 10;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            int ligne = 0;
            StringBuilder textContent = new StringBuilder();

            while ((line = reader.readLine()) != null && ligne < numberOfLines) {
                System.out.println(line); 
                textContent.append(line).append(System.lineSeparator());
                ligne++;
            }

            writer.write(textContent.toString());

            System.out.println("lecture du test reussi '" + inputFile + "', affiché, et écrit dans '" + outputFile + "'");

        } catch (IOException e) {
            System.err.println("Erreur du traitement des fichiers : " + e.getMessage());
        }
    }
}
