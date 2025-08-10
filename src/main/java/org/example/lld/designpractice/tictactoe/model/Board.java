package org.example.lld.designpractice.tictactoe.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Board {
//    private Cell[][] cells;

    private List<List<Cell>> cells = new ArrayList<>();;


}
