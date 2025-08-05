package org.example.lld.designpractice.tictactoe.strategies;

import org.example.lld.designpractice.tictactoe.model.Board;
import org.example.lld.designpractice.tictactoe.model.Move;

public interface MovingStratgy {
    Move makeMove(Board board);
}
