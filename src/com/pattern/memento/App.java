package com.pattern.memento;

import com.pattern.memento.memento.Caretaker;
import com.pattern.memento.memento.Originator;
import com.pattern.memento.model.Game;

public class App {

    public static void main(String[] args) {
        String gameName = "Crash Bandicoot";

        Game game = new Game();
        game.setName(gameName);
        game.setCheckpoint(1);

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        game = new Game();
        game.setName(gameName);
        game.setCheckpoint(2);
        originator.setState(game);

        game = new Game();
        game.setName(gameName);
        game.setCheckpoint(3);
        originator.setState(game);

        caretaker.addMemento(originator.save()); // ESTADO POSICION 0

        game = new Game();
        game.setName(gameName);
        game.setCheckpoint(4);

        originator.setState(game);
        caretaker.addMemento(originator.save()); // ESTADO POSICION 1

        game = new Game();
        game.setName(gameName);
        game.setCheckpoint(5);
        originator.setState(game);
        caretaker.addMemento(originator.save()); // ESTADO POSICION 2

        originator.setState(game);
        originator.restore(caretaker.getMemento(0));

        game = originator.getState();
        System.out.println(game);
    }
}
