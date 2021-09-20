package com.company;

public class Bus {
    private String licensePlate;
    private int numOfSeats;

    public Bus(String licensePlate, int numOfSeats){
        this.licensePlate = licensePlate;
        this.numOfSeats = numOfSeats;
    }
    public String getLicensePlate(){
        return  licensePlate;
    }
    public int getNumOfSeats() {
        return numOfSeats;
    }
    public String toString(){
        return "License Number: " +licensePlate + "\nNumber of seats: " + numOfSeats + "\n-------------------------";
    }
}
