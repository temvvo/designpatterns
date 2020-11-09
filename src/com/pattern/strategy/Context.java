package com.pattern.strategy;

import com.pattern.strategy.strategy.IStrategy;

public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        this.strategy.analize();
    }
}
