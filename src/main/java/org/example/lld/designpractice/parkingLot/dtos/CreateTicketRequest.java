package org.example.lld.designpractice.parkingLot.dtos;

import lombok.Getter;
import org.example.lld.designpractice.parkingLot.models.VehicleType;

import java.time.LocalDateTime;
import java.util.Date;
@Getter
public class CreateTicketRequest {
    private String vehicleNumber;
    private VehicleType vehicleType;
    private LocalDateTime entryTime;

}
