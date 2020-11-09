package com.pattern.observer;

import com.pattern.observer.observer.PesoARGObserver;
import com.pattern.observer.observer.PesoMXObserver;
import com.pattern.observer.observer.SolObserver;
import com.pattern.observer.observer.Subject;

public class App {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new SolObserver(subject);
        new PesoARGObserver(subject);
        new PesoMXObserver(subject);

        System.out.println("Si desea cambiar 10 dólares obtendrá : ");
        subject.setState(10);
        System.out.println("-----------------");
        System.out.println("Si desea cambiar 100 dólares obtendrá : ");
        subject.setState(100);
    }
}
