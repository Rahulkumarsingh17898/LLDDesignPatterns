package org.example.lld.designpractice.tictactoe.model;

import org.example.lld.designpractice.tictactoe.enums.GameStatusEnum;
import org.example.lld.designpractice.tictactoe.enums.SymbolEnum;
import org.example.lld.designpractice.tictactoe.strategies.ColumnWinner;
import org.example.lld.designpractice.tictactoe.strategies.GameStrategy;
import org.example.lld.designpractice.tictactoe.strategies.RowWinner;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private String name;
    private List<Player> players = new ArrayList<>();
    private Board board;

    private int currentPlayerIndex = 0;
    private GameStatusEnum gameStatusEnum;

    private GameStrategy gameStrategy;


    public void makeMove(){
        Player currPlayer =  players.get(currentPlayerIndex);
        Move move = currPlayer.makeMove(board);

       //check if its a valid move
        if(!validate(move,board)){
            throw new RuntimeException("move is not validated");
        }

        //if yes then mark the symbol
        markMove(move,board,currPlayer.getSymbolEnum());

        //check if game is ovr or if draw

        if (checkWinner()) {
            gameStatusEnum = GameStatusEnum.COMPLETED;
            return;
        }

        if (checkDraw()) {
            gameStatusEnum = GameStatusEnum.DRAW;
            return;
        }

       currentPlayerIndex = (currentPlayerIndex+1)%players.size();

    }

    private void markMove(Move move, Board board, SymbolEnum symbolEnum) {
        board.getCells().get(move.getRow()).get(move.getColumn()).setSymbol(symbolEnum);
    }



    private boolean checkDraw() {
        // Check if the game is draw
        List<Cell> cells = board.getCells().stream().flatMap(List::stream).filter(cell -> cell.getSymbol() == null).toList();
        return cells.isEmpty();
    }


    private boolean validate(Move move,Board board) {
        Cell cell = board.getCells().get(move.getRow()).get(move.getColumn());
        if(cell.getSymbol() == null){
            return  true;
        }else {
            return false;
        }
    }


    public boolean checkWinner( ){
        gameStrategy = new ColumnWinner();
        if( gameStrategy.checkWinner(board)){
            return true;
        }

        gameStrategy = new RowWinner();
        if(gameStrategy.checkWinner(board)){
            return true;
        }

        return false;
//there are three way to check the winner this is a strategy
    }
    public void register(){

    }



}
