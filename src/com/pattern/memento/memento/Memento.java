package com.pattern.memento.memento;

import com.pattern.memento.model.Game;

public class Memento {

    private Game state;

    public Memento(Game state) {
        this.state = state;
    }

    public Game getState() {
        return state;
    }

}
