
    package Inlämining;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

    class TextAnalyzerTest {

        private TextAnalyzer analyzer;

        @BeforeEach
        void setUp() {
            analyzer = new TextAnalyzer(); // Skapa en ny instans före varje test
        }

        // Testfall 1: Kontrollera uppdatering av tecken och rader med normal input
        @Test
        void testUpdateCountsNormalInput1Row() {
            analyzer.updateCounts("Paolo Maldini");
            assertEquals(1, analyzer.getTotalLines(), "Antalet rader borde vara 1");
            //assertEquals(13, analyzer.getTotalCharacters(), "Antalet tecken borde vara 13");

        }
        @Test
        void testUpdateCountsNormalInput2Rows() {
            analyzer.updateCounts("Paolo Maldini");
            analyzer.updateCounts("Richardo Kaka");
            assertEquals(2, analyzer.getTotalLines(), "Antalet rader borde vara 2");
           // assertEquals(26, analyzer.getTotalCharacters(), "Antalet tecken borde vara 26");
        }

        // Testfall 2: Kontroll av strängar
        @Test
        void testUpdateCountsEmptyInput() {
            analyzer.updateCounts("");
            assertEquals(1, analyzer.getTotalLines(), "Antalet rader borde vara 1 även om raden är tom");
            assertEquals(0, analyzer.getTotalCharacters(), "Antalet tecken borde vara 0 för en tom rad");
        }

        // Testfall 3: Kontrollera flera på varandra följande uppdateringar
        @Test
        void testUpdateCountsMultipleUpdates() {
            analyzer.updateCounts("Ac Milan");
            analyzer.updateCounts("Bästa laget");
            analyzer.updateCounts("Forever!");

            //assertEquals(3, analyzer.getTotalLines(), "Antalet rader borde vara 3");
            assertEquals(27, analyzer.getTotalCharacters(), "Antalet tecken borde vara summan av alla tecken: 27");
        }
    }
}

