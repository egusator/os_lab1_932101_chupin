package org.example;

public class ConsumerThread extends Thread{
    private Monitor monitor;
    public void run() {
        try {
            monitor.consume();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
