package com.sabel.lautstaerke.GUI;

import com.sabel.lautstaerke.Model.Lautstaerke;
import com.sabel.lautstaerke.Model.LautstaerkeLesen;
import com.sabel.lautstaerke.Model.LautstraerkeSchreiben;

import java.util.Observable;
import java.util.Observer;

public class Controller implements EventController, Observer {
    private LautstaerkeLesen modelLesen;
    private LautstraerkeSchreiben modelSchreiben;
    private int lautstaerke;

    public Controller(LautstraerkeSchreiben modelSchreiben) {
        this.modelSchreiben = modelSchreiben;
    }


    @Override
    public void lauter() {
        modelSchreiben.setLautstaerke(lautstaerke += 1);
    }

    @Override
    public void leiser() {
        System.out.println("Controller.leiser");
    }

    @Override
    public void mute() {
        System.out.println("Controller.mute");
    }

    @Override
    public void update(Observable o, Object arg) {
        //controller holt sich Daten vom Model
        LautstaerkeLesen model = (LautstaerkeLesen) o;
        lautstaerke = model.getLautstaerke();
    }
}
