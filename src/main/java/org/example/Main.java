package org.example;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor(false);
        while (true) {
            ProviderThread providerThread = new ProviderThread();
            providerThread.setMonitor(monitor);
            providerThread.start();
            ConsumerThread consumerThread = new ConsumerThread();
            consumerThread.setMonitor(monitor);
            consumerThread.start();
        }
    }
}