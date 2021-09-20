package com.company;

import java.time.LocalDateTime;

public class Company {
    private String name;
    private Bus[] allBuses;
    private int numOfBuses;
    private Line[] allLines;
    private int numOfLines;
    private Drive[] allDrives;
    private int numOfDrives;

    public Company(String name){
        setName(name);
        allBuses = new Bus[50];
        numOfBuses = 0;
        allLines = new Line[50];
        numOfLines = 0;
        allDrives = new Drive[1000];
        numOfDrives = 0;
    }
    public boolean addDrive(Drive d){
        if(numOfDrives == allDrives.length)
            return false;
        allDrives[numOfDrives++] = d;
        return true;
    }
    public boolean addBus(Bus b){
        if(numOfBuses == allBuses.length)
            return false;
        allBuses[numOfBuses++] = b;
        return true;
    }
    public boolean removeBusByLicense(String licensePlate){
        for(int i = 0; i < numOfBuses; i++){
            if(allBuses[i].getLicensePlate().equals(licensePlate)) {
                allBuses[i] = allBuses[--numOfBuses];
                return true;
            }
        }
        return false;
    }
    public boolean removeDrive(Line theLine, LocalDateTime theTime){
        for(int i = 0; i < numOfDrives; i++){
            if(allDrives[i].getTheLine() == theLine && allDrives[i].getTheTime().equals(theTime)) {
                allDrives[i] = allDrives[--numOfDrives];
                return true;
            }
        }
        return false;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getNumOfBuses(){
        return numOfBuses;
    }
    public Bus getBusByLicensePlate(String licensePlate){
        for(int i = 0; i<numOfBuses; i++){
            if(allBuses[i].getLicensePlate().equals(licensePlate))
                return allBuses[i];
        }
        return null;
    }
    public int getNumOfLines(){
        return numOfLines;
    }
    public Line getLineByNumber(int lineNum){
        for(int i = 0; i < numOfLines; i ++){
            if(allLines[i].getLineNum() == lineNum)
                return allLines[i];
        }
        return null;
    }
    public boolean addLine(Line l){
        if(numOfLines == allLines.length)
            return false;
        allLines[numOfLines++] = l;
        return true;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("Company '" + name + "' has " + numOfBuses + " buses.\n");
        for( int i = 0; i < numOfBuses ; i++)
            sb.append(allBuses[i].toString() + "\n");

        sb.append("The lines are:\n");
        for( int i = 0; i < numOfLines ; i++)
            sb.append(allLines[i].toString() + "\n");

        sb.append("The Drives are:\n");
        for( int i = 0; i < numOfDrives ; i++)
            sb.append(allDrives[i].toString() + "\n");

        return sb.toString();
    }
}
