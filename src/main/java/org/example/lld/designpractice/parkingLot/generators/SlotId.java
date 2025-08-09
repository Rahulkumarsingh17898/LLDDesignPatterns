package org.example.lld.designpractice.parkingLot.generators;

import java.util.concurrent.atomic.AtomicLong;

public class SlotId
{
    //generate a random long id for us
    //generate a sequence for us
    private static AtomicLong idCounter = new AtomicLong();
    public static Long nextId(){
        return idCounter.getAndIncrement();
    }
}
