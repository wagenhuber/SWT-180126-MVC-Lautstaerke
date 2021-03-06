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
    private LautstaerkeFenster view;
    private final int MAXVOLUME = 10;

    public Controller(LautstraerkeSchreiben modelSchreiben) {
        this.modelSchreiben = modelSchreiben;
    }

    public void setView(LautstaerkeFenster view) {
        this.view = view;
    }


    @Override
    public void lauter() {
        modelSchreiben.setLautstaerke(lautstaerke + 1);
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

        //
        view.setLautstaerke(lautstaerke);

        // Controller (de)aktiviert Buttons in View
        if(lautstaerke <= 0){
            view.deaktiviereMinus();
        }else{
            view.aktiviereMinus();
        }
        if(lautstaerke >=MAXVOLUME){
            view.deaktivierePlus();
        }else{
            view.aktivierePlus();
        }

    }
}
