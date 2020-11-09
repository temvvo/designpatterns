package com.pattern.observer.observer;

public class SolObserver extends Observer{
    private double valorCambio = 3.25;
    private Subject subject;

    public SolObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("SOL: " + (subject.getState() * valorCambio));
    }
}
