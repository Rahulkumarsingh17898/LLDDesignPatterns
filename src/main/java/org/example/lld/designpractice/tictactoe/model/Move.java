package org.example.lld.designpractice.tictactoe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Move {
    private int row;
    private int column;
}
