package com.company;

public class Main {

    public static void main(String[] args) {
        ToDrive toDrive = new ToDrive();
        toDrive.setTransmission(new Shift1());
        toDrive.gearShift();toDrive.setTransmission(new Shift2());
        toDrive.gearShift();
        toDrive.setTransmission(new ReverseShift());
        toDrive.gearShift();

    }
}
