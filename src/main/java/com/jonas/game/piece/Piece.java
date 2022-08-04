package com.jonas.game.piece;

import com.jonas.game.piece.enuns.Color;
import com.jonas.game.piece.enuns.Name;
import com.jonas.game.piece.enuns.Status;

import java.util.Arrays;
import java.util.List;

public abstract class Piece {
    private int x, y;
    private List<Integer> initialPosition;
    private Color color;
    private Name name;
    private int movementCounter;
    private Status status;

    public Piece(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        movementCounter = 0;
        status = Status.IN_GAME;
        initialPosition = Arrays.asList(x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getMovementCounter() {
        return movementCounter;
    }

    public void setMovementCounter(int movementCounter) {
        this.movementCounter = movementCounter;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
