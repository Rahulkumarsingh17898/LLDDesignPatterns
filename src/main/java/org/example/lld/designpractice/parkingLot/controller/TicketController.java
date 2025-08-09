package org.example.lld.designpractice.parkingLot.controller;

import org.example.lld.designpractice.parkingLot.dtos.CreateTicketRequest;
import org.example.lld.designpractice.parkingLot.models.Ticket;
import org.example.lld.designpractice.parkingLot.service.TicketService;

public class TicketController {

    private TicketService ticketService;

    public Ticket createTicket(CreateTicketRequest ticketRequest){
        validate(ticketRequest);
       return ticketService.createTicket(ticketRequest);

    }

    private void validate(CreateTicketRequest ticketRequest) {
    }
}
