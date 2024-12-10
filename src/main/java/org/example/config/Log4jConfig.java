package org.example.config;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;


public class Log4jConfig {

    public static void configure() {
        PatternLayout layout = new PatternLayout();
        layout.setConversionPattern("%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n");

        ConsoleAppender appender = new ConsoleAppender(layout);
        appender.setLayout(layout);
        appender.setThreshold(Level.INFO);
        appender.activateOptions();

        Logger rootLogger = Logger.getRootLogger();
        rootLogger.setLevel(Level.ERROR);
        rootLogger.addAppender(appender);

        Logger logger = Logger.getLogger("org.example");
        logger.setLevel(Level.INFO);
    }
}
