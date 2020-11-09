package com.pattern.strategy.strategy.impl;

import com.pattern.strategy.strategy.IStrategy;

public abstract class AdvancedAnalisys implements IStrategy {

    @Override
    public void analize() {
            init();
            analizeMemory();
            analizeKeyloggers();
            analizeRootKits();
            unzip();
            stop();
        }

        protected abstract void init();

        protected abstract void analizeMemory();

        protected abstract void analizeKeyloggers();

        protected abstract void analizeRootKits();

        protected abstract void unzip();

        protected abstract void stop();
}
