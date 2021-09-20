package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        Company c = new Company("Dan");

        c.addBus(new Bus("12-345-67", 50));
        c.addBus(new Bus("12-333-67", 40));
        c.addBus(new Bus("12-888-67", 45));

        System.out.println(c.toString());

        Line l1 = new Line(149, "Tel-Aviv", "Kfar-Saba");
        Line l2 = new Line(501, "Haifa", "Eilat");

        c.addLine(l1);
        c.addLine(l2);

        LocalDateTime t1 = LocalDateTime.of(LocalDate.of(2021,9,20), LocalTime.of(16,20));
        Drive d1 = new Drive(t1,l1,c.getBusByLicensePlate("12-333-67"));
        c.addDrive(d1);

        System.out.println(c.toString());

        c.removeDrive(l1, t1);
        System.out.println("After removing a drive:\n" + c.toString());
    }
}
