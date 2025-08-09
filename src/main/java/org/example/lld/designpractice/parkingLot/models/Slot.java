package org.example.lld.designpractice.parkingLot.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder// if we have a child clss then we use SuperBuilder otherwise Builder
public class Slot extends  BaseModel{
    private Long spotNumber;
    private Integer floorNumber;
    private VehicleType spotType;
    private SpotStatus spotStatus;

    public static Slot mediumAvailable(){
        return Slot.builder().spotType(VehicleType.MEDIUM).spotStatus(SpotStatus.FREE).build();
    }
}
