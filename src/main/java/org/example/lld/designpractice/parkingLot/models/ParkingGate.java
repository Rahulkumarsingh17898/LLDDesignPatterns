package org.example.lld.designpractice.parkingLot.models;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class ParkingGate extends BaseModel {
    private Integer gateNumber;
    private GateType gateType;
    private Operator operator;
    private PaymentCounter paymentCounter;
    private DisplayBoard displayBoard;

}
