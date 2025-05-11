package com.example.designpattern.PrototypePattern.With;



import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype<GameBoard> {
    private List<GamePiece> gamePieces = new ArrayList<>();

    public void addPiece(GamePiece gamePiece){
        gamePieces.add(gamePiece);
    }

    public List<GamePiece> getGamePieces(){
        return gamePieces;
    }

    @Override
    public GameBoard clone() {
        GameBoard newBoard = new GameBoard();
        for (GamePiece gamePiece : gamePieces) {
            newBoard.addPiece(gamePiece.clone()); // Deep Copy
//            newBoard.addPiece(gamePiece);       // Shallow Copy
        }
        return newBoard;
    }

    public void showBoardState() {
        System.out.println("Current Board State: ");
        for (GamePiece gamePiece : gamePieces) {
            System.out.println(gamePiece);
        }
    }
}

