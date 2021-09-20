package com.company;

import java.time.LocalDateTime;

public class Drive {
    private LocalDateTime theTime;
    private Line theLine;
    private Bus theBus;

    public Drive(LocalDateTime theTime, Line theLine, Bus theBus){
        this.theLine = theLine;
        setTime(theTime);
        setBus(theBus);
    }
    public void setTime(LocalDateTime theTime){
        this.theTime = theTime;
    }
    public void setBus(Bus theBus){
        this.theBus = theBus;
    }
    public LocalDateTime getTheTime(){
        return theTime;
    }
    public Line getTheLine(){
        return theLine;
    }
    public Bus getTheBus() {
        return theBus;
    }
    public String toString(){
        return theLine.toString() + "\nDepart Time: " + theTime.toString() + "\nBus info:\n" + theBus.toString();
    }
}
