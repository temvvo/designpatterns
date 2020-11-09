package com.pattern.observer.observer;

public class PesoARGObserver extends Observer{
    private double valorCambio = 29.86;
    private Subject subject;

    public PesoARGObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("ARG: " + (subject.getState() * valorCambio));
    }
}
