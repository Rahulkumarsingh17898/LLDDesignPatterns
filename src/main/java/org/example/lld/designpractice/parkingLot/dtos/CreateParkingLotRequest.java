package org.example.lld.designpractice.parkingLot.dtos;

import lombok.Getter;
import org.example.lld.designpractice.parkingLot.generators.FloorId;
import org.example.lld.designpractice.parkingLot.generators.SlotId;
import org.example.lld.designpractice.parkingLot.models.*;

import java.util.Collections;
import java.util.List;

@Getter
public class CreateParkingLotRequest {
    private Long id;
    private String name;
    private String address;
    private Integer numberOfFloors;
    private Integer numberOfSlotsPerFloor;
    private Integer numberOfGates;

    public ParkingLot toParkingLot() {

        //a list of 5 parking spot
        //Collection.nCopies(5, new ParkingSpot())

        List<Slot> parkingSlots = Collections.nCopies(numberOfSlotsPerFloor,Slot.mediumAvailable());

        parkingSlots.forEach(parkingSlot -> parkingSlot.setId(SlotId.nextId()));

        List<Floor> parkingFloors = Collections.nCopies(numberOfFloors,
                Floor
                        .builder()
                        .slots(parkingSlots)
                        .paymentCounter(PaymentCounter.builder().build())
                        .build());
        parkingFloors.forEach(parkingFloor -> parkingFloor.setId(FloorId.nextId()));


        return ParkingLot
                .builder()
                .id(id)
                .name(name)
                .address(address)
                .floors(parkingFloors)
                .entryGates(Collections.nCopies(numberOfFloors, Gate.builder().build()))
                .exitGates(Collections.nCopies(numberOfFloors, Gate.builder().build()))
                .build();

    }
}
