package com.company;

public class ToDrive {
    Transmission transmission;
    void setTransmission(Transmission x){
        transmission = x;
    }
    void gearShift(){
        transmission.gearShift();
    }
}
