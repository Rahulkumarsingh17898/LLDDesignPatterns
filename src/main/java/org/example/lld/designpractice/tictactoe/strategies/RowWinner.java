package org.example.lld.designpractice.tictactoe.strategies;

import org.example.lld.designpractice.tictactoe.enums.SymbolEnum;
import org.example.lld.designpractice.tictactoe.model.Board;
import org.example.lld.designpractice.tictactoe.model.Cell;

import java.util.ArrayList;
import java.util.List;

public class RowWinner implements GameStrategy{
    @Override
    public boolean checkWinner(Board board) {
        List<List<Cell>> cells = board.getCells();
        int flag;

        for(int i=0;i<cells.size();i++){
            flag = 1;
            for(int j=1;j<cells.size();j++){

                SymbolEnum symbolEnumPrev = cells.get(i).get(j-1).getSymbol();
                SymbolEnum symbolEnum = cells.get(i).get(j).getSymbol();
                if (symbolEnumPrev != symbolEnum) {
                    flag = 0;
                    break;
                }
            }

            if(flag == 1 ){
                return true;
            }
        }

        return false;
    }
}
