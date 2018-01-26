package com.sabel.lautstaerke.APP;

import com.sabel.lautstaerke.GUI.LautstaerkeFenster;
import com.sabel.lautstaerke.Model.Lautstaerke;

public class Main {

    public static void main(String[] args) {

        Lautstaerke model = new Lautstaerke();
        LautstaerkeFenster fenster = new LautstaerkeFenster();

        model.addObserver(fenster);
        model.setLautstaerke(7);

    }

}
