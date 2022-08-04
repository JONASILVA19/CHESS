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
    private Status status;

    public Piece(int x, int y, Color color) {
        this.x = x;
        this.y = y;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
