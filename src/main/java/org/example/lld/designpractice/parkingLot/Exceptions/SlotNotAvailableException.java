package org.example.lld.designpractice.parkingLot.Exceptions;

import org.example.lld.designpractice.parkingLot.models.Ticket;

public class SlotNotAvailableException extends RuntimeException {
    public SlotNotAvailableException(){
        super("Slot Not Found");
    }
}
