package com.pattern.strategy.model;

import com.pattern.strategy.strategy.impl.SimpleAnalisys;

public class SimpleAntivirus extends SimpleAnalisys {
    @Override
    protected void init() {
        System.out.println("Antivirus Simple - Análisis simple iniciado");
    }

    @Override
    protected void analizeMemory() {
        try {
            System.out.println("Analizando Memoria RAM...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void stop() {
        System.out.println("Antivirus Simple - Análisis simple finalizado");
    }
}
