package org.example.lld.designPattern.statePattern.VendingMachine;

public class Main {


    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        System.out.println("Filling up inventory...");

        fillUpInventory(vendingMachine);
        displayInventory(vendingMachine);
        System.out.println("||||");
        System.out.println("clicking on insert coin Button");
        System.out.println("||||");

        VendingMachineState vendingMachineState = vendingMachine.getCurrentState();
        System.out.println("Current State: " + vendingMachineState);
        vendingMachineState.startInsertingCoin(vendingMachine);

        vendingMachineState = vendingMachine.getCurrentState();
        vendingMachineState.insertCoin(vendingMachine,10);

        System.out.println("||||");
        System.out.println("clicking on Product Selection Button");
        System.out.println("||||");

        vendingMachineState.startProductSelection(vendingMachine);

        vendingMachineState = vendingMachine.getCurrentState();
        vendingMachineState.insertProductCode(vendingMachine, "1");
        vendingMachineState.confirmProductSelection(vendingMachine);

        displayInventory(vendingMachine);




    }

    public static void fillUpInventory(VendingMachine vendingMachine) {
       ItemShelf[] slots = vendingMachine.getInventory().getInventory();
       for(int i = 0; i < slots.length; i++) {
           Item item = new Item();
           if(i>=0 && i<3) {
               item.setItemType(ItemType.COKE);
               item.setPrice(5);
           } else if(i>=3 && i<6) {
               item.setItemType(ItemType.PEPSI);
               item.setPrice(5);
           } else if(i>=6 && i<8){
               item.setItemType(ItemType.JUICE);
               item.setPrice(5);
           }else {
               item.setItemType(ItemType.SODA);
               item.setPrice(5);
           }

           slots[i].setCode(i+1); // Assuming codes start from 1
           slots[i].setItem(item);
           slots[i].setSoldOut(false); // Initially not sold out
       }

    }

    public static void displayInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        System.out.println("Current Inventory:");
        for (ItemShelf slot : slots) {
            if (!slot.isSoldOut()) {
                System.out.println("Code: " + slot.getCode() + ", Item: " + slot.getItem().getItemType() + ", Price: " + slot.getItem().getPrice());
            } else {
                System.out.println("Code: " + slot.getCode() + " is sold out.");
            }
        }
    }
}
