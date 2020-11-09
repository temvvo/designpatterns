package com.pattern.strategy.model;

import com.pattern.strategy.strategy.impl.AdvancedAnalisys;

public class AdvancedAntivirus extends AdvancedAnalisys {

    @Override
    protected void init() {
        System.out.println("Antivirus Avanzado - Análisis avanzado iniciado");
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
    protected void analizeKeyloggers() {
        try {
            System.out.println("Analizando en busca de Keyloggers...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void analizeRootKits() {
        try {
            System.out.println("Analizando en busca de RootKits...");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void unzip() {
        try {
            System.out.println("Analizando archivos zip...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void stop() {
        System.out.println("Antivirus Avanzado - Análisis avanzado finalizado");
    }

}
