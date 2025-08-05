package org.example.lld.designPattern.statePattern.VendingMachine;

public interface VendingMachineState {
    void startInsertingCoin(VendingMachine product);

    void insertCoin(VendingMachine product,int amount);
    void startProductSelection(VendingMachine product);

    void insertProductCode(VendingMachine product, String productCode);
    void confirmProductSelection(VendingMachine product);
    void cancelTransaction(VendingMachine product);
    void insufficientFunds(VendingMachine product);

    void dispenseProduct(VendingMachine product);

}
