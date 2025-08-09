package org.example.lld.designpractice.parkingLot.service;

import org.example.lld.designpractice.parkingLot.Exceptions.SlotNotAvailableException;
import org.example.lld.designpractice.parkingLot.dtos.CreateTicketRequest;
import org.example.lld.designpractice.parkingLot.models.*;
import org.example.lld.designpractice.parkingLot.repository.TicketRepository;

public class TicketService {
    public Ticket createTicket(CreateTicketRequest request){
        //check if slot is available
        // if not available , throw an error
        // if available , mark the slot as occupied and save it
        SlotService slotService = new SlotService();
        VehicleService vehicleService = new VehicleService();
        TicketRepository ticketRepository = new TicketRepository();
        Slot slot = slotService.allocateSlot(request.getVehicleType());

        if(slot == null){
            throw  new SlotNotAvailableException();
        }

        slot.setSpotStatus(SpotStatus.OCCUPIED);
        slotService.save(slot);
        //if vehicle is new create a new object
//        if has come to use before use the existing one
        Vehicle vehicle = vehicleService.findOrCreate(request.getVehicleNumber(),request.getVehicleType());

        // create the ticket

        Ticket ticket =Ticket
                .builder()
                .entryTime(request.getEntryTime())
                .slot(slot)
                .vehicle(vehicle)
                .build();

        return ticketRepository.save(ticket);


    }
}
