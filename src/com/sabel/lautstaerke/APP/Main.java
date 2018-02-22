package com.sabel.lautstaerke.APP;

import com.sabel.lautstaerke.GUI.Controller;
import com.sabel.lautstaerke.GUI.LautstaerkeFenster;
import com.sabel.lautstaerke.GUI.SliderFenster;
import com.sabel.lautstaerke.Model.Lautstaerke;

public class Main {

    public static void main(String[] args) {

        Lautstaerke model = new Lautstaerke();
        LautstaerkeFenster view = new LautstaerkeFenster();

        Controller controller = new Controller(model);
        view.setController(controller);

        model.addObserver(controller);

        SliderFenster view2 = new SliderFenster();
        SliderController controller2 = new SliderController(model);
        controller2.setView(view2);

        model.setLautstaerke(7);




    }

}
