package org.example;

public class ProviderThread extends Thread {
    private Monitor monitor;

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void run() {
        while (true) {
            try {
                sleep(1000);
                monitor.provide();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
