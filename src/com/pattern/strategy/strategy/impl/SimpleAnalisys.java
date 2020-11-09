package com.pattern.strategy.strategy.impl;

import com.pattern.strategy.strategy.IStrategy;

public abstract class SimpleAnalisys implements IStrategy {
    @Override
    public void analize() {
        init();
        analizeMemory();
        stop();
    }
    protected abstract void init();

    protected abstract void analizeMemory();

    protected abstract void stop();

}
