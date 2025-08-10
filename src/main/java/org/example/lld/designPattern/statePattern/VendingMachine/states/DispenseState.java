package org.example.lld.designPattern.statePattern.VendingMachine.states;

import org.example.lld.designPattern.statePattern.VendingMachine.VendingMachine;
import org.example.lld.designPattern.statePattern.VendingMachine.VendingMachineState;

public class DispenseState implements VendingMachineState {

    DispenseState(){
        System.out.println("vending machine is in dispense state");

    }

    @Override
    public void startInsertingCoin(VendingMachine product) {

    }

    @Override
    public void insertCoin(VendingMachine product,int amount) {
        System.out.println("Transaction already in progress. Please wait for product to be dispensed.");

    }

    @Override
    public void startProductSelection(VendingMachine product) {

    }

    @Override
    public void insertProductCode(VendingMachine product, String productCode) {

    }

    @Override
    public void confirmProductSelection(VendingMachine product) {

    }

    @Override
    public void cancelTransaction(VendingMachine product) {

    }

    @Override
    public void insufficientFunds(VendingMachine product) {

    }

    @Override
    public void dispenseProduct(VendingMachine product) {
        System.out.println("Dispensing product..."+ product.getSelectedProduct());
    }
}
