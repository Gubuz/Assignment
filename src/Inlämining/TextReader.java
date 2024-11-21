package Inlämining;

import java.util.Scanner;

public class TextReader {
    private TextAnalyzer analyzer;  // Referens till TextAnalyzer för att hålla koll på rader och tecken

    // Konstruktor
    public TextReader(TextAnalyzer analyzer) {
        this.analyzer = analyzer;
    }

    // Metod för att läsa text och skriva ut resultatet
    public void readAndPrintText() {
        Scanner scanner = new Scanner(System.in);
        String input;

        // Läs rad för rad tills användaren skriver 'stop'
        while (true) {
            System.out.print("Ac Milan Bästa Laget (skriv 'stop' för att avsluta): ");
            input = scanner.nextLine();  // Läs kommandon

            // Kontrollera om användaren skrev 'stop'
            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Programmet avslutas.");
                break;  // Avsluta loopen om 'stop' är skriven
            }

            // Uppdatera räkningarna och skriv ut resultatet
            analyzer.updateCounts(input);
            System.out.println("Du skrev: " + input);
        }

        // Skriv ut resultatet efter att loopen avslutas
        System.out.println("Totalt antal rader: " + analyzer.getTotalLines());
        System.out.println("Totalt antal tecken: " + analyzer.getTotalCharacters());

        // Stäng scanner
        scanner.close();
    }
}