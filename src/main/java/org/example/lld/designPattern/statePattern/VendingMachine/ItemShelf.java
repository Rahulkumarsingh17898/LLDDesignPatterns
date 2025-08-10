package org.example.lld.designPattern.statePattern.VendingMachine;

public class ItemShelf {
    int code;
    Item item;
    boolean soldOut;

    public ItemShelf(){

    }

    public ItemShelf(int code, Item item, boolean soldOut) {
        this.code = code;
        this.item = item;
        this.soldOut = soldOut; // Initially not sold out
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }
}
