package com.montp;

import java.util.logging.Logger;

public class Main {
    // Remplacement de System.out par un Logger standard
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Hello DevOps encore une fois , ceci juste pour tester le TP3!");
    }
}