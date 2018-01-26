package com.sabel.lautstaerke.GUI;

import com.sabel.lautstaerke.Model.Lautstaerke;
import com.sabel.lautstaerke.Model.LautstaerkeLesen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class LautstaerkeFenster extends JFrame implements Observer{

    private JButton buttonLauter, buttonLeiser, buttonMute;
    private JLabel labelLautstaerke;
    private EventController controller;

    public LautstaerkeFenster() {
        this.initComponents();
    }

    public void setController(EventController controller){
        this.controller = controller;
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
        LautstaerkeLesen model = (LautstaerkeLesen)o;

        int lautstaerke = model.getLautstaerke();


        //Daten werden angezeigt
        String lautstaerkeText = String.valueOf(lautstaerke);
        labelLautstaerke.setText(lautstaerkeText);
    }
    
    private void initEvents(){
        buttonLauter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               controller.lauter();
            }
        });
        
        buttonLeiser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.leiser();
            }
        });
        
        buttonMute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.mute();
            }
        });
    }
    
}
