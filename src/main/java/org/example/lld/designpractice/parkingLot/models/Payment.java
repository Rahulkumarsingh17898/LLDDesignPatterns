package org.example.lld.designpractice.parkingLot.models;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Payment extends BaseModel{
    private PaymentType type;
    private PaymentStatus status;

    private Double amount;// it could be the tota amont or patial amount that user paid
    private Ticket ticket;
}
