package org.example;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor(false);
        for (int i = 0; i < 100000; i++) {
            ProviderThread providerThread = new ProviderThread();
            providerThread.setMonitor(monitor);
            providerThread.start();
            ConsumerThread consumerThread = new ConsumerThread();
            consumerThread.setMonitor(monitor);
            consumerThread.start();
        }
    }
}