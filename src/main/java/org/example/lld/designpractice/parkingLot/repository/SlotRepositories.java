package org.example.lld.designpractice.parkingLot.repository;

import org.example.lld.designpractice.parkingLot.models.Slot;
import org.example.lld.designpractice.parkingLot.models.SpotStatus;
import org.example.lld.designpractice.parkingLot.models.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class SlotRepositories {
    private  List<Slot> slots = new ArrayList<>();
    public void saveAll(List<Slot> parkingSlots){
        slots.addAll(parkingSlots);
    }

    public Slot findOneByVehicleTypeAndStatusAvailable(VehicleType vehicleType) {
        for(Slot slot: slots){
            if(slot.getSpotType() == vehicleType && slot.getSpotStatus() == SpotStatus.FREE ){
                return slot;
            }

        }
        return null;
    }

    public void save(Slot slot) {
    slots.add(slot);
    }
}
