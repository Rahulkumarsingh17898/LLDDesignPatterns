package org.example.lld.designPattern.statePattern.VendingMachine.states;

import org.example.lld.designPattern.statePattern.VendingMachine.VendingMachine;
import org.example.lld.designPattern.statePattern.VendingMachine.VendingMachineState;

public class HasMoneyState implements VendingMachineState {

    HasMoneyState(){
        System.out.println("Vending machine is now HasMoneyState");
    }

    @Override
    public void startInsertingCoin(VendingMachine product) {
        System.out.println("Transaction already started. You can insert more coins or select a product.");
    }

    @Override
    public void insertCoin(VendingMachine product, int amount) {
        product.addMoney(amount);
        System.out.println("Coin inserted. Current balance: " + product.getBalance());

    }

    @Override
    public void startProductSelection(VendingMachine product) {
        if(product.getBalance() > 0) {
            System.out.println("You can now select a product.");
            product.setCurrentState(new ProductSelectionState());
        } else {
            System.out.println("Please insert more coins to select a product.");
        }
    }

    @Override
    public void insertProductCode(VendingMachine product, String productCode) {
        System.out.println("Please select a product after inserting coins.");
    }

    @Override
    public void confirmProductSelection(VendingMachine product) {
        System.out.println("Please select a product first.");
    }

    @Override
    public void cancelTransaction(VendingMachine product) {
        System.out.println("Transaction cancelled. Returning coins: " + product.getBalance());
        product.setInsertedCoins(0);
        product.setCurrentState(new IdleState());
    }

    @Override
    public void insufficientFunds(VendingMachine product) {
        System.out.println("insufficient funds available. Please insert coins to continue.");
        product.setInsertedCoins(0);
        product.setCurrentState(new IdleState());
    }

    @Override
    public void dispenseProduct(VendingMachine product) {
        System.out.println("Please select a product before dispensing.");
    }
}
