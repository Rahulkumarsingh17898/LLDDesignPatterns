package org.example.lld.designpractice.tictactoe.strategies;

import org.example.lld.designpractice.tictactoe.model.Board;
import org.example.lld.designpractice.tictactoe.model.Cell;
import org.example.lld.designpractice.tictactoe.model.Move;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomMovingStrategy implements MovingStratgy{
    @Override
    public Move makeMove(Board board) {

        List<Cell> availableCells = getAvailableCells(board);

        Random random = new Random();
        int randomSelectedCell = random.nextInt(availableCells.size());

        return new Move(availableCells.get(randomSelectedCell).getRow(),availableCells.get(randomSelectedCell).getColumn());

    }

    private List<Cell> getAvailableCells(Board board) {
        List<List<Cell>> cells = board.getCells();
        List<Cell> availableCells = new ArrayList<>();
        int maxRow = cells.size();
        int maxCol = cells.get(0).size();
        for(int i=0;i<maxRow;i++){
            for(int j=0;j<maxCol;j++){
               Cell currCell = cells.get(i).get(j);
                if(currCell.getSymbol()==null){
                    availableCells.add(currCell);
                }
            }
        }

        return availableCells;

    }
}
