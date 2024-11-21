package Inlämining;

public class Main {
    public static void main(String[] args) {
        TextAnalyzer analyzer = new TextAnalyzer();  //  Instans av TextAnalyzer
        TextReader reader = new TextReader(analyzer);  // Instans av TextReader
        reader.readAndPrintText();  // Progammet körs
    }
}




