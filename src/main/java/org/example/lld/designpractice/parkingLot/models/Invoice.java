package org.example.lld.designpractice.parkingLot.models;

import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@SuperBuilder
public class Invoice extends BaseModel{
    private Ticket ticket;
    private LocalDateTime exitTime;
    private Double amount;

    private List<Payment> paymentsMade = new ArrayList<>(); //allowing partial payments , payments might fail



}
