package org.example.lld.designpractice.tictactoe.model;

import org.example.lld.designpractice.tictactoe.enums.DifficultyLevel;
import org.example.lld.designpractice.tictactoe.enums.SymbolEnum;
import org.example.lld.designpractice.tictactoe.strategies.MovingStratgy;

public class BotPlayer extends Player {

    private DifficultyLevel difficultyLevel;
    private MovingStratgy movingStratgy;


    public Move makeMove(Board board){  // here if we return Cell it also contains Symbol therefore creating a new Class Move
        return movingStratgy.makeMove(board);
    }

}
