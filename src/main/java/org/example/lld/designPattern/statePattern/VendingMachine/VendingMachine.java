package org.example.lld.designPattern.statePattern.VendingMachine;

import org.example.lld.designPattern.statePattern.VendingMachine.states.IdleState;

public class VendingMachine {
    private VendingMachineState currentState;
    private Inventory inventory;
public VendingMachine() {
        this.currentState = new IdleState();
        this.inventory = new Inventory(10);

    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public VendingMachineState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(VendingMachineState state) {
        this.currentState = state;
    }

    int insertedCoins = 0;
    int productSelectionCode = 0;

    String selectedProduct = "";

    public int getInsertedCoins() {
        return insertedCoins;
    }

    public void setInsertedCoins(int insertedCoins) {
        this.insertedCoins = insertedCoins;
    }

    public int getProductSelectionCode() {
        return productSelectionCode;
    }

    public void setProductSelectionCode(int productSelectionCode) {
        this.productSelectionCode = productSelectionCode;
    }

    public String getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(String selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public void addMoney(int amount) {
        this.insertedCoins += amount;
    }

    public int getBalance() {
        return this.insertedCoins;
    }

    public int getProductPrice(int productCode) {
        // In a real application, this would look up the price based on the product code.
        // For simplicity, let's assume each product costs 10 units.
        return 10;
    }
}
