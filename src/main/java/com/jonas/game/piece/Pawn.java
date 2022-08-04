package com.jonas.game.piece;

import com.jonas.game.piece.enuns.Color;
import com.jonas.game.piece.enuns.Name;

public class Pawn extends Piece {

    public Pawn(int x, int y, Color color) {
        super(x, y, color);
        setName(Name.PAWN);
    }
}
