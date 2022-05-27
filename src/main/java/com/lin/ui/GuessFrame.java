package com.lin.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    public  GuessFrame(){
        super();
        JButton button = new JButton("Who's The Champion!!!");
        JLabel label= new JLabel("wwwwwww");
        JTextField number = new JTextField(10);
        setSize(600,400);
        setLocation(300,150);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Golden State Warriors!!!");
                //label.setText("Stephen Curry MVP!!!!!");
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
            }
        });
        label.setText("Yaaaaaa");
        setLayout(new FlowLayout());
        add(number);
        add(label);
        add(button);
        setVisible(true);
    }


    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }
}
