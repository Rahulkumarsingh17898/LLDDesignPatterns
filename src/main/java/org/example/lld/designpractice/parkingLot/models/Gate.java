package org.example.lld.designpractice.parkingLot.models;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Gate extends BaseModel{
    private Integer gateNumber;
    private GateType type;
    private Operator operator;
    private PaymentCounter paymentCounter;
    private  DisplayBoard displayBoard;
}
