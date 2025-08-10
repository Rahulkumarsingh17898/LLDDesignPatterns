package org.example.lld.designPattern.statePattern.VendingMachine;

public class Inventory {
    ItemShelf[] inventory = null;

    public Inventory() {
        // Default constructor
    }
    Inventory(int itemCount) {
        inventory = new ItemShelf[itemCount];
        for (int i = 0; i < itemCount; i++) {
            ItemShelf itemShelf = new ItemShelf();
            itemShelf.setCode(i + 1); // Assuming codes start from 1
            itemShelf.setSoldOut(true);
            inventory[i] = itemShelf;
        }
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public void addItem(Item item, int codeNumber){
        for(ItemShelf itemShelfCurr : inventory) {
            if (itemShelfCurr.code == codeNumber && itemShelfCurr.isSoldOut()) {
                itemShelfCurr.setItem(item);
                itemShelfCurr.setSoldOut(false);
                return;
            }
        }
    }

}
