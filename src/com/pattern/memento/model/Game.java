package com.pattern.memento.model;

public class Game {
    private String name;
    private int checkpoint;

    public int getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(int checkpoint) {
        this.checkpoint = checkpoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Game [name=" + name + ", checkpoint=" + checkpoint + "]";
    }

}
