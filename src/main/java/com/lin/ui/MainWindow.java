package com.lin.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,300);
        frame.setLocation(450,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("OK");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("WTF!!!");
            }
        });
//        MyActionListener listener = new MyActionListener();
//        button.addActionListener(listener);
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setVisible(true);
    }
}
