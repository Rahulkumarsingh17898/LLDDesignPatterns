package org.example.lld.designPattern.observerPattern;

public class Client {
//    It will make use of observable to first create an observer with email id of user and what its observing hich Item and then when we hit the condition then the notifications are sent to observer from observable;
    public static void main(String[] args) {
        IphoneObservable stockObservable = new IphoneObservable();
        Observer observerEmail = new ObserverEmail("zxc", stockObservable);
        Observer observerPhone = new ObserverPhone("123", stockObservable);

        stockObservable.addObserver(observerEmail);
        stockObservable.addObserver(observerPhone);

        stockObservable.setData(100);

    }
}
