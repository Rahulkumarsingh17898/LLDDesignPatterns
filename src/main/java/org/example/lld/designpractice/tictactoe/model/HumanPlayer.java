package org.example.lld.designpractice.tictactoe.model;

import org.example.lld.designpractice.tictactoe.enums.SymbolEnum;

public class HumanPlayer{



    private User user;
    private SymbolEnum playerSymbol;


    public Move makeMove(Board board){  // here if we return Cell it also contains Symbol therefore creating a new Class Move
        return null;
    }

}

// here Association of what type
// 1 user can be part of many players
// Association of type Aggregation as it can exist alone
