package org.example.lld.designpractice.parkingLot.repository;

import org.example.lld.designpractice.parkingLot.models.ParkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ParkingLotRepository {

    public List<ParkingLot> parkingLots = new ArrayList<>();

    public ParkingLot findById_ForLoop(Long id){

        for (ParkingLot parkingLot : parkingLots){
            if(Objects.equals(id,parkingLot.getId())){
                return parkingLot;
            }
        }

        return null;
    }

    public ParkingLot findById(Long id){

       return parkingLots.stream().
               filter(parkingLot -> parkingLot.getId().equals(id))
               .findFirst()
               .orElse(null);
    }

    public ParkingLot save(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
        return parkingLot;
    }
}
