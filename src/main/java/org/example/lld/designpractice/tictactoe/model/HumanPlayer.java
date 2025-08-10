package org.example.lld.designpractice.tictactoe.model;

import lombok.Getter;
import lombok.Setter;
import org.example.lld.designpractice.tictactoe.enums.SymbolEnum;
@Getter
@Setter
public class HumanPlayer extends Player{



    private User user;
    private SymbolEnum playerSymbol;

    @Override
    public Move makeMove(Board board){  // here if we return Cell it also contains Symbol therefore creating a new Class Move
        return null;
    }

}
//it is extrinsic state for flyweight DP
// here Association of what type
// 1 user can be part of many players
// Association of type Aggregation as it can exist alone
