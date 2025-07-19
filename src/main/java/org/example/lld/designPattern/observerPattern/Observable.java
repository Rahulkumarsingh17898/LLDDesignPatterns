package org.example.lld.designPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public interface Observable {

    List<Observer> observerList = new ArrayList<>();

     void addObserver(Observer observer);

     void removeObserver(Observer observer);

     void notifyObservers() ;

     void setData(int stockCount);

     int getData();
}
