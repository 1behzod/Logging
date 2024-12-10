package org.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SLF4J {

    public static void main(String[] args) {
        log.info("Application started");

        SLF4J example = new SLF4J();
        example.performTask("Example Task");

        try {
            int result = example.divideNumbers(10, 0);
            log.info("Division result: {}", result);
        } catch (ArithmeticException e) {
            log.error("An error occurred: {}", e.getMessage(), e);
        }

        log.warn("Application is shutting down");
    }

    public void performTask(String taskName) {
        log.info("Performing task: {}", taskName);

        try {
            Thread.sleep(1000);
            log.debug("Task {} completed successfully", taskName);
        } catch (InterruptedException e) {
            log.error("Task {} interrupted: {}", taskName, e.getMessage());
        }
    }

    public int divideNumbers(int a, int b) {
        log.debug("Dividing {} by {}", a, b);
        return a / b;
    }
}
