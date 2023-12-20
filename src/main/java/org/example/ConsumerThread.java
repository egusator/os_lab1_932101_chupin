package org.example;

public class ConsumerThread extends Thread {
    private Monitor monitor;

    public void run() {
        while (true) {
            try {
                monitor.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
