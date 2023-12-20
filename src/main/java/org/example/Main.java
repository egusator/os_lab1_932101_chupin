package org.example;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor(false);
        ProviderThread providerThread = new ProviderThread();
        providerThread.setMonitor(monitor);
        ConsumerThread consumerThread = new ConsumerThread();
        consumerThread.setMonitor(monitor);

        providerThread.start();
        consumerThread.start();
    }
}