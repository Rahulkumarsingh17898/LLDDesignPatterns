package org.example.lld.designpractice.parkingLot.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@SuperBuilder
public class Floor extends BaseModel{
    private int floorNumber;
    private List<Slot>  slots = new ArrayList<>();
    private PaymentCounter paymentCounter;
    private DisplayBoard displayBoard;


}
