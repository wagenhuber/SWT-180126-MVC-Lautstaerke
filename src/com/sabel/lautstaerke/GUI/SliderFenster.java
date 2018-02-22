package com.sabel.lautstaerke.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SliderFenster extends JFrame {

    private JLabel labelLautstaerke;
    private EventController controller;

    public SliderFenster() {
        this.initComponents();
    }

    public void setController(EventController controller) {
        this.controller = controller;
    }


    private void initComponents() {
        labelLautstaerke = new JLabel("---");
        labelLautstaerke.setHorizontalAlignment(0);
        this.add(labelLautstaerke);

        this.setTitle("Lautstärke");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void setLautstaerke(int lautstaerke) {
        //Daten werden angezeigt
        String lautstaerkeText = String.valueOf(lautstaerke);
        labelLautstaerke.setText(lautstaerkeText);
    }

    private void initEvents() {
    }


}



