package org.example;

public class ProviderThread extends Thread {
    private Monitor monitor;

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void run() {
        try {
            monitor.provide();
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
