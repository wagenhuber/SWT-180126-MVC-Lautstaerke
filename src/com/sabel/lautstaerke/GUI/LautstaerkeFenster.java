package com.sabel.lautstaerke.GUI;

import com.sabel.lautstaerke.Model.Lautstaerke;
import com.sabel.lautstaerke.Model.LautstaerkeLesen;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class LautstaerkeFenster extends JFrame implements Observer{

    private JButton buttonLauter, buttonLeiser, buttonMute;
    private JLabel labelLautstaerke;

    public LautstaerkeFenster() {
        this.initComponents();
    }

    private void initComponents() {
        buttonLauter = new JButton("+");
        buttonLeiser = new JButton("-");
        buttonMute = new JButton("Mute");
        labelLautstaerke = new JLabel("---");
        labelLautstaerke.setHorizontalAlignment(0);
        this.add(buttonLauter, BorderLayout.EAST);
        this.add(buttonLeiser, BorderLayout.WEST);
        this.add(buttonMute, BorderLayout.NORTH);
        this.add(labelLautstaerke);

        this.setTitle("Lautstärke");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        //view holt sich Daten vom Model
        int lautstaerke = ((LautstaerkeLesen) o).getLautstaerke();


        //Daten werden angezeigt
        String lautstaerkeText = String.valueOf(lautstaerke);
        labelLautstaerke.setText(lautstaerkeText);
    }
}
