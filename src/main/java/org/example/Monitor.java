package org.example;

public class Monitor {
    public boolean ready;
    public synchronized void provide()
    {
        if (ready)
            return;
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
