package org.example;


import java.time.LocalDateTime;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        //The simplest example of logging for console

        System.out.println("OUT");
        System.err.println("ERR");

        //java.util.logging(JUL)

        Logger logger = Logger.getLogger(Main.class.getName()); // string
        //levels
        logger.info(LocalDateTime.now() + " INFO");
        logger.fine(LocalDateTime.now() + " FINE");
        logger.finer(LocalDateTime.now() + " FINER");
        logger.finest(LocalDateTime.now() + " FINEST");
        logger.warning(LocalDateTime.now() + " WARNING");
        logger.severe(LocalDateTime.now() + " SEVERE");


    }
}
