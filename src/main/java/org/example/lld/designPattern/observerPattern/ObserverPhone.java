package org.example.lld.designPattern.observerPattern;

public class ObserverPhone implements Observer {
    Observable stockObservable;
    private String phoneNumber;

    public ObserverPhone(String phoneNumber, Observable stockObservable) {
        this.phoneNumber = phoneNumber;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        // Logic to send a phone notification
        System.out.println("Sending phone notification to: " + phoneNumber + " Stock Count: " + stockObservable.getData());
    }

    // Additional methods can be added as needed, e.g., to get the state of the observer
}
