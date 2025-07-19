package org.example.lld.designPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements Observable{

    List<Observer> observerList = new ArrayList<>();
    public int stockCount = 0;

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    public void setData(int stockCount){
        if(this.stockCount == 0){
            this.stockCount += stockCount;
            notifyObservers();
        }
        else {
            this.stockCount += stockCount;
        }

        // This method can be called to notify all observers of a change

    }

    public int getData() {
        return stockCount;
    }

}
