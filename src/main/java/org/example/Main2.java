package org.example;

import org.apache.log4j.Logger;
import org.example.config.Log4jConfig;

public class Main2 {
    private static final Logger log = Logger.getLogger(Main2.class);

    public static void main(String[] args) {

        Log4jConfig.configure();
        log.info("INFO");
        log.warn("WARN");
        log.error("ERROR");
    }
}
