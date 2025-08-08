package org.example.lld.designpractice.tictactoe.strategies;

import org.example.lld.designpractice.tictactoe.enums.SymbolEnum;
import org.example.lld.designpractice.tictactoe.model.Board;
import org.example.lld.designpractice.tictactoe.model.Cell;

import java.util.List;

public class ColumnWinner implements GameStrategy{
    @Override
    public boolean checkWinner(Board board) {
        List<List<Cell>> cells = board.getCells();
        int flag;

        for(int j=0;j<cells.get(0).size();j++){
            flag = 1;
            for(int i=1;i<cells.size();i++){

                SymbolEnum symbolEnumPrev = cells.get(i-1).get(j).getSymbol();
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
