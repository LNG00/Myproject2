package com.lin.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessNumber extends JFrame {
    JButton button = new JButton("GUESS");
    JLabel label= new JLabel("Enter a number between 1-10");
    JTextField number = new JTextField(10);
    int secret = new Random().nextInt(10)+1;

    public GuessNumber(){
        super();
        System.out.println("Secret number: "+ secret);
        setSize(600,100);
        setLocation(350,250);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
                if (num > secret){
                    label.setText("Smaller");
                }else if (num < secret){
                    label.setText("Bigger");
                }else {
                    label.setText("You got it !!! The secret number is "+secret);
                }
            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(label);
        add(button);
        setVisible(true);
    }

    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
    }
}