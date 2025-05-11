package com.example.designpattern.PrototypePattern.Without;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    private List<GamePiece> gamePieces = new ArrayList<>();

    public void addPiece(GamePiece gamePiece){
        gamePieces.add(gamePiece);
    }

    public List<GamePiece> getGamePieces(){
        return gamePieces;
    }

    public void showBoardState() {
        System.out.println("Current Board State: ");
        for (GamePiece gamePiece : gamePieces) {
            System.out.println(gamePiece);
        }
    }

}
