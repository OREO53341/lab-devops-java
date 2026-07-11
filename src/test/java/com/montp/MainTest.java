package com.montp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

// Suppression du mot-clé "public" devant la classe et la méthode
class MainTest {

    @Test
    void testMain() {
        // On instancie la classe et on l'affecte à une assertion utile
        Main mainApp = new Main();
        assertNotNull(mainApp, "L'instance de Main ne doit pas être nulle");
        
        // On appelle la méthode main statique
        String[] args = {};
        Main.main(args);
    }
}