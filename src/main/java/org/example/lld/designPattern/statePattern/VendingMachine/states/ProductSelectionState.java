package org.example.lld.designPattern.statePattern.VendingMachine.states;

import org.example.lld.designPattern.statePattern.VendingMachine.VendingMachine;
import org.example.lld.designPattern.statePattern.VendingMachine.VendingMachineState;

public class ProductSelectionState implements VendingMachineState {

    ProductSelectionState(){
        System.out.println("Vending Machine is now in Product Selection State.");
    }

    @Override
    public void startInsertingCoin(VendingMachine product) {
        System.out.println("Transaction already started. You can insert more coins or select a product.");
    }

    @Override
    public void insertCoin(VendingMachine product, int amount) {
        product.addMoney(amount);
    }

    @Override
    public void startProductSelection(VendingMachine product) {
        System.out.println("You can now select a product. Please enter the product code.");
    }

    @Override
    public void insertProductCode(VendingMachine product, String productCode) {
        System.out.println("Product code " + productCode + " selected.");
        product.setProductSelectionCode(Integer.parseInt(productCode));
    }

    @Override
    public void confirmProductSelection(VendingMachine product) {
        System.out.println("Confirming product selection for code: " + product.getProductSelectionCode());
        if (product.getBalance() >= product.getProductPrice(product.getProductSelectionCode())) {
            product.setCurrentState(new DispenseState());

        } else {
            System.out.println("Insufficient funds for selected product. Please insert more coins.");
            product.setCurrentState(new IdleState());
        }
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
        System.out.println("Please confirm a product code before dispensing.");
    }
}
