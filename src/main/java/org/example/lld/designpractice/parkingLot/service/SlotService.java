package org.example.lld.designpractice.parkingLot.service;

import org.example.lld.designpractice.parkingLot.models.Slot;
import org.example.lld.designpractice.parkingLot.models.VehicleType;
import org.example.lld.designpractice.parkingLot.repository.SlotRepositories;

import java.util.List;

public class SlotService {

    private SlotRepositories slotRepository;
    public void createParkingSlots(List<Slot> slots){
        slotRepository.saveAll(slots);
    }

    public Slot allocateSlot(VehicleType vehicleType) {
        return slotRepository.findOneByVehicleTypeAndStatusAvailable(vehicleType);
    }

    public void save(Slot slot) {
        slotRepository.save(slot);
    }
}
