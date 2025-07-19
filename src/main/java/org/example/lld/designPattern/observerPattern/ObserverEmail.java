package org.example.lld.designPattern.observerPattern;

public class ObserverEmail implements Observer {
    IphoneObservable stockObservable ;
    private String email;

    public ObserverEmail(String email,IphoneObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        // Logic to send an email notification
        System.out.println("Sending email notification to: " + email+stockObservable.getData());
    }

    // Additional methods can be added as needed, e.g., to get the state of the observer
}
