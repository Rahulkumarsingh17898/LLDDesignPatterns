package org.example.lld.designpractice.parkingLot.Exceptions;

public class InvalidParkingLotRequest extends  RuntimeException{
    public InvalidParkingLotRequest(){
        super("ID is Required");
    }
}
