package org.example.lld.designPattern.statePattern.VendingMachine.states;

import org.example.lld.designPattern.statePattern.VendingMachine.VendingMachine;
import org.example.lld.designPattern.statePattern.VendingMachine.VendingMachineState;

public class IdleState implements VendingMachineState {

    public IdleState(){
        System.out.println("Vending Machine is currently in Idle State.");
    }

    @Override
    public void startInsertingCoin(VendingMachine product) {
        System.out.println("Please insert a coin to start the transaction.");
        product.setCurrentState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine product, int amount) {
        System.out.println("You need to start inserting coins first.");
    }


    @Override
    public void startProductSelection(VendingMachine product) {
        System.out.println("Please insert a coin before selecting a product.");
    }

    @Override
    public void insertProductCode(VendingMachine product, String productCode) {
        System.out.println("You need to insert a coin first.");
    }

    @Override
    public void confirmProductSelection(VendingMachine product) {
        System.out.println("You need to select a product first.");
    }

    @Override
    public void cancelTransaction(VendingMachine product) {
        System.out.println("No transaction to cancel. Please insert a coin first.");
    }

    @Override
    public void insufficientFunds(VendingMachine product) {
        System.out.println("No funds available. Please insert a coin.");
    }

    @Override
    public void dispenseProduct(VendingMachine product) {
        System.out.println("No product selected. Please select a product after inserting coins.");
    }
}
