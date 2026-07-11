import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testMain() {
        // On crée un tableau de chaînes vide pour les arguments
        String[] args = {};
        
        // On appelle explicitement la méthode main de la classe Main
        // Cela va forcer JaCoCo à traverser le code de Main.java !
        Main.main(args);
    }
}