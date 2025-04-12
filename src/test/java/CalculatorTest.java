// Uvoz anotacije @Test iz JUnit 5 biblioteke (Jupiter API)
import org.junit.jupiter.api.Test;

// Uvoz metode assertEquals za poređenje očekivane i stvarne vrednosti
import static org.junit.jupiter.api.Assertions.assertEquals;

// Deklaracija test klase koja testira klasu Calculator
public class CalculatorTest {

    // Ova anotacija označava da je metoda ispod nje test metoda
    @Test
    public void testAddition() {
        // Pozivamo metodu Run iz klase Calculator sa izrazom "2+3"
        String result = Calculator.Run("2+3");

        // Upoređujemo dobijeni rezultat sa očekivanom vrednošću "5.0"
        // Ako nije isto, test će pasti i ispisati poruku
        assertEquals("5.0", result, "2+3 should return 5.0");
    }
}