package org.example.lld.designpractice.parkingLot.controller;

import lombok.AllArgsConstructor;
import org.example.lld.designpractice.parkingLot.Exceptions.InvalidParkingLotRequest;
import org.example.lld.designpractice.parkingLot.dtos.CreateParkingLotRequest;
import org.example.lld.designpractice.parkingLot.models.ParkingLot;
import org.example.lld.designpractice.parkingLot.service.ParkingLotService;

//Request Layer has two small responsibilities
//1. Request level Validation -> Only for the request; not business logic
//2. Data Transformation -> Request to DTO

@AllArgsConstructor
public class ParkingLotController {

    private ParkingLotService parkingLotService;

    // Read a parking lot  -> GET /parking-lot/:id
    public ParkingLot getParkingLot(Long id){
        validateId(id);
        return parkingLotService.getParkingLot(id);

    }

    private static void validateId(Long id) {
        if(id == null){
//            return 4xx error code client error 400 ->  bad request
            throw new InvalidParkingLotRequest();

        }
    }

//    create ParkingLot   -> POST /parking-lot/model
    // DTO - Request body - Data transfer object
    public ParkingLot createParkingLot(CreateParkingLotRequest parkingLotRequest){
        validateRequest(parkingLotRequest);
        return parkingLotService.createParkingLot(parkingLotRequest.toParkingLot());
    }

    private void validateRequest(CreateParkingLotRequest parkingLotRequest) {
        if(parkingLotRequest.getNumberOfFloors() == null || parkingLotRequest.getNumberOfSlotsPerFloor() == null ){
            throw new InvalidParkingLotRequest();
        }
    }
}


// methods in parking lot controller
// resource - Parking lot
// CRUD
// Read a parking lot  -> GET /parking-lot/:id
// create ParkingLot   -> POST /parking-lot/model
// update a lot -> PUT /parking-lot/:id vs PATCH
// delete a lot -> DELETE / parking-lot/:id