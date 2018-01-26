package com.sabel.lautstaerke.APP;

import com.sabel.lautstaerke.GUI.Controller;
import com.sabel.lautstaerke.GUI.LautstaerkeFenster;
import com.sabel.lautstaerke.Model.Lautstaerke;

public class Main {

    public static void main(String[] args) {

        Lautstaerke model = new Lautstaerke();
        LautstaerkeFenster view = new LautstaerkeFenster();

        Controller controller = new Controller(model);
        view.setController(controller);

        model.addObserver(view);
        model.addObserver(controller);

        model.setLautstaerke(7);

    }

}
