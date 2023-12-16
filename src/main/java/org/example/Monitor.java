package org.example;

import static java.lang.Thread.sleep;

public class Monitor {
    public boolean ready;

    public Monitor(boolean ready) {
        this.ready = ready;
    }

    public synchronized void provide() throws InterruptedException {

        if (ready)
            return;

        sleep(1000);

        ready = true;
        System.out.println("Инициировали событие");
        this.notify();
    }

    public synchronized void consume() throws InterruptedException {
        while(!ready)
            this.wait();
        System.out.println("Получили событие");
        ready = false;
    }
}
