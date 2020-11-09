package com.pattern.observer.observer;

public class PesoMXObserver extends Observer{
    private double valorCambio = 19.07;
    private Subject subject;

    public PesoMXObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("MX: " + (subject.getState() * valorCambio));
    }
}
