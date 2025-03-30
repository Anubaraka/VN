package Screens;

import Music.MenuMusic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Menu extends JFrame {
    private JButton btnStart;
    private JButton btnExit;
    private JLabel lblBg;
    private JLabel lblTitle = new JLabel("Shinji's day off");
    private MenuMusic menuMusic = new MenuMusic();

    public Menu() {
        setTitle("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        ImageIcon icon = new ImageIcon("src/main/resources/Icons/end-of-evangelion.png");
        setIconImage(icon.getImage());
        setSize(1920,1080);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        lblTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 100));
        lblTitle.setBounds(550, 100, 1000, 200);
        add(lblTitle);
        btnStart=new JButton();
        btnStart.setFont(new Font("Tahoma", Font.BOLD, 40));
        btnStart.setBounds(100,650,800,100);
        btnStart.setIcon(new ImageIcon("src/main/resources/Assets/Button.png"));
        btnStart.setText("Start");
        btnStart.setHorizontalTextPosition(JButton.CENTER);
        btnStart.setVerticalTextPosition(JButton.CENTER);
        btnStart.setForeground(Color.WHITE);
        btnStart.setVisible(false);
        btnStart.setVisible(true);
        btnStart.addActionListener(new StartListener());
        btnExit=new JButton();
        btnExit.setFont(new Font("Tahoma", Font.BOLD, 40));
        btnExit.setBounds(1000,650,800,100);
        btnExit.setIcon(new ImageIcon("src/main/resources/Assets/Button.png"));
        btnExit.setText("Exit");
        btnExit.setHorizontalTextPosition(JButton.CENTER);
        btnExit.setVerticalTextPosition(JButton.CENTER);
        btnExit.setForeground(Color.WHITE);
        btnExit.setVisible(false);
        btnExit.setVisible(true);
        btnExit.addActionListener(new ExitListener());
        add(btnStart);
        add(btnExit);
        ImageIcon bg=new ImageIcon("src/main/resources/BackGrounds/Menu_Background.png");
        lblBg=new JLabel(bg);
        lblBg.setSize(1920,1080);
        add(lblBg);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setVisible(false);
        setVisible(true);
        menuMusic.run();
    }

    private class ExitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
                dispose();
        }
    }

    private class StartListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            BackgroundForestLake bgf=new BackgroundForestLake();
            menuMusic.stop();
        }
    }
}
