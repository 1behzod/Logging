package org.example;

import org.apache.log4j.Logger;
import org.example.config.Log4jConfig;

public class Log4j {
    private static final Logger log = Logger.getLogger(Log4j.class);

    public static void main(String[] args) {

        Log4jConfig.configure();
        log.info("INFO");
        log.warn("WARN");
        log.error("ERROR");
    }
}
