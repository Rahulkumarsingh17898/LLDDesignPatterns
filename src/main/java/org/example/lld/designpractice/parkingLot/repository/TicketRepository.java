package org.example.lld.designpractice.parkingLot.repository;

import org.example.lld.designpractice.parkingLot.models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketRepository {
    private List<Ticket> tickets = new ArrayList<>();

    public Ticket save(Ticket ticket) {
        tickets.add(ticket);
        return ticket;
    }


}
