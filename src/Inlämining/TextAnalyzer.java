package Inlämining;

// Klass för att analysera text
public class TextAnalyzer {
    private int totalCharacters;  // Totalt antal tecken
    private int totalLines;       // Totalt antal rader

    // Konstruktor
    public TextAnalyzer() {
        this.totalCharacters = 0;
        this.totalLines = 0;
    }

    // Uppdatera antal rader och tecken baserat på ny text
    public void updateCounts(String input) {
        totalLines++;  // Öka radantalet
        totalCharacters += input.length();  // Lägg till antalet tecken i raden
    }

    // Hämta totalt antal tecken
    public int getTotalCharacters() {
        return totalCharacters;
    }

    // Hämta totalt antal rader
    public int getTotalLines() {
        return totalLines;
    }
}








