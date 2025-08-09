package org.example.lld.designpractice.parkingLot.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@SuperBuilder
public class ParkingLot extends BaseModel{

    private String name;
    private String address;

    private List<Floor> floors = new ArrayList<>();


    private List<Gate> entryGates = new ArrayList<>();
    private List<Gate> exitGates = new ArrayList<>();
//    private ParkingGate[] parkingGates;

}
