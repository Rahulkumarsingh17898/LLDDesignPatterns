package org.example.lld.designpractice.tictactoe.model;

import org.example.lld.designpractice.tictactoe.enums.SymbolEnum;

public class HumanPlayer {
    private String name;
    private String email;

    private Byte[] profileImage;

    private SymbolEnum playerSymbol;


    public Move makeMove(Board board){  // here if we return Cell it also contains Symbol therefore creating a new Class Move
        return null;
    }

}
