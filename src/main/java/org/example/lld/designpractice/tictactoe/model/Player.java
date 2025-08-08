package org.example.lld.designpractice.tictactoe.model;

import lombok.Getter;
import org.example.lld.designpractice.tictactoe.enums.SymbolEnum;

import java.util.Scanner;
@Getter
public abstract class Player {
    private SymbolEnum symbolEnum;

//    public void makeMove(Board board) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the row number:");
//        int rowNumberInput = sc.nextInt();
//
//        System.out.println("Enter the column number");
//        int colNumberInput = sc.nextInt();
//
//        boolean isValid = validate(rowNumberInput, colNumberInput, board);
//        if (isValid) {
//            playerMoveMarked(rowNumberInput, colNumberInput, board);
//        } else {
//            throw new RuntimeException("Move is not valid move");
//        }
//
//
//    }

    //WHat should be the return type of the MakeMove Method and arguments
//    If we return void or Board we will have to modify the board like above instead what we can do is return cell but cell has Symbol so Move we can use cell as well but Move will be better
    //We are assuming is person calling the makemove will set the symbol


    public Move makeMove(Board board) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row number:");
        int rowNumberInput = sc.nextInt();

        System.out.println("Enter the column number");
        int colNumberInput = sc.nextInt();

        return new Move(rowNumberInput,colNumberInput);

//        boolean isValid = validate(rowNumberInput, colNumberInput, board);
//        if (isValid) {
//            return new Move(rowNumberInput,colNumberInput);
//
//        } else {
//            throw new RuntimeException("Move is not valid move");
//        }


    }


    private void playerMoveMarked(int rowNumberInput, int colNumberInput,Board board) {
        board.getCells().get(rowNumberInput).get(colNumberInput).setSymbol(symbolEnum);
    }
}
