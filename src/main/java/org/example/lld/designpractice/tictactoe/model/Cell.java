package org.example.lld.designpractice.tictactoe.model;

import lombok.Getter;
import lombok.Setter;
import org.example.lld.designpractice.tictactoe.enums.SymbolEnum;

@Setter
@Getter
public class Cell {
    int row;
    int column;
    public SymbolEnum symbol;



}
