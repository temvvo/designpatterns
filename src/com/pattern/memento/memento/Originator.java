package com.pattern.memento.memento;

import com.pattern.memento.model.Game;

public class Originator {
    private Game state;

    public void setState(Game state) {
        this.state = state;
    }

    public Game getState() {
        return state;
    }

    public Memento save() {
        return new Memento(state);
    }

    public void restore(Memento m) {
        this.state = m.getState();
    }
}
