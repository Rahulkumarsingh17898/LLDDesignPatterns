package org.example.lld.designpractice.parkingLot;

import org.example.lld.designpractice.parkingLot.controller.ParkingLotController;
import org.example.lld.designpractice.parkingLot.models.ParkingLot;
import org.example.lld.designpractice.parkingLot.repository.ParkingLotRepository;
import org.example.lld.designpractice.parkingLot.service.ParkingLotService;
import org.example.lld.designpractice.parkingLot.service.SlotService;

public class Main {
    public static void main(String[] args) {
//        ParkingLot parkingLot = new ParkingLot();
//        parkingLot.getId();// we can get the id if we do inheritance Is a relationship between lot and Base instead of association;

        // Dependency Enjection
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        SlotService slotService = new SlotService();
        ParkingLotService parkingLotService = new ParkingLotService(parkingLotRepository,slotService); // here also we need to inject repository
        ParkingLotController parkingLotController = new ParkingLotController(parkingLotService);

        parkingLotController.getParkingLot(1L);



    }
}
