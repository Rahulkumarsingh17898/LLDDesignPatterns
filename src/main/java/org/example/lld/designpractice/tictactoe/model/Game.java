package org.example.lld.designpractice.tictactoe.model;

import org.example.lld.designpractice.tictactoe.enums.GameStatusEnum;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private String name;
    private List<Player> players = new ArrayList<>();
    private Board board;
//    private HumanPlayer humanPlayer;
//
//    private BotPlayer botPlayer;
    private GameStatusEnum gameStatusEnum;


    public void makeMove(){

    }

    public void checkWinner( ){
//there are three way to check the winner this is a strategy
    }
    public void register(){

    }



}
