package org.example.lld.designpractice.parkingLot.service;

import lombok.AllArgsConstructor;
import org.example.lld.designpractice.parkingLot.models.Floor;
import org.example.lld.designpractice.parkingLot.models.ParkingLot;
import org.example.lld.designpractice.parkingLot.repository.ParkingLotRepository;
@AllArgsConstructor
public class ParkingLotService {

    private ParkingLotRepository parkingLotRepository;
    private  SlotService parkingSlotService;
    public ParkingLot getParkingLot(Long id){
        System.out.println("Getting Parking lot with id : "+ id);
        return parkingLotRepository.findById(id);
    }

    public  ParkingLot createParkingLot(ParkingLot parkingLot){

        ParkingLot savedLot =  parkingLotRepository.save(parkingLot);
//        Here when we save Parking Lot It contains entities Floor and Slot that also need to be saved
        //Then save the floor
//      Then save the slot
//        for(Floor floor : parkingLot.getFloors()){
//            parkingSlotService.createParkingSlots(floor.getSlots());
//        }
//        functional ways
        parkingLot.getFloors().forEach(floor -> parkingSlotService.createParkingSlots(floor.getSlots()));


        return savedLot;
    }
}
