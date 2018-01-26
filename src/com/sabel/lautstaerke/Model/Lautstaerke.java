package com.sabel.lautstaerke.Model;

import java.util.Observable;

public class Lautstaerke extends Observable implements LautstaerkeLesen{

    private int lautstaerke;


    public Lautstaerke() {
        this.lautstaerke = 1;

    }

    @Override
    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        if(lautstaerke >= 0 && lautstaerke <= 10){
            this.lautstaerke = lautstaerke;
            //Observer Beobchater benachrichtigen
            this.setChanged();
            this.notifyObservers();
        }
    }
}
