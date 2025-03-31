package Screens;

import Music.GameMusic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class BackgroundForestLake extends JFrame {

    private JLabel lblBackground;
    private JButton btnFish;
    private JButton btnDone;
    private JLabel lblTextField;
    private int point_count=0;
    private GameMusic gm=new GameMusic();

    public BackgroundForestLake() {
        setTitle("Yes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        ImageIcon icon = new ImageIcon("src/main/resources/Icons/end-of-evangelion.png");
        setIconImage(icon.getImage());
        setSize(1920,1080);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        btnFish = new JButton();
        btnFish.setText("Fish");
        btnFish.setHorizontalTextPosition(JButton.CENTER);
        btnFish.setVerticalTextPosition(JButton.CENTER);
        btnFish.setIcon(new ImageIcon("src/main/resources/Assets/Button.png"));
        btnFish.setBounds(500,200,400,100 );
        btnFish.setForeground(Color.WHITE);
        btnFish.setFont(new Font("Tahoma", Font.PLAIN, 40));
        btnFish.addActionListener(new FishListener());
        btnDone = new JButton();
        btnDone.setText("Done");
        btnDone.setHorizontalTextPosition(JButton.CENTER);
        btnDone.setVerticalTextPosition(JButton.CENTER);
        btnDone.setIcon(new ImageIcon("src/main/resources/Assets/Button.png"));
        btnDone.setBounds(500,400,400,100 );
        btnDone.setForeground(Color.WHITE);
        btnDone.setFont(new Font("Tahoma", Font.PLAIN, 40));
        btnDone.addActionListener(new DoneListener());
        add(btnFish);
        add(btnDone);
        lblTextField = new JLabel();
        lblTextField.setFont(new Font("Tahoma", Font.PLAIN, 100));
        lblTextField.setForeground(Color.BLACK);
        lblTextField.setBounds(200, 680, 1920, 400);
        add(lblTextField);
        lblBackground = new JLabel(new ImageIcon("src/main/resources/BackGrounds/Game_Bg.png"));
        lblBackground.setBounds(0, 0, 1920, 1080);
        add(lblBackground);
        setVisible(true);
        gm.run();
    }

    private class FishListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Random rand = new Random();
            int nr=rand.nextInt(1000);
            if(nr<500)
            {
                lblTextField.setText("You caught a common fish");
                point_count+=10;
            }
            else if(nr<800)
            {
                lblTextField.setText("You caught a rare fish");
                point_count+=100;
            }
            else if(nr<925)
            {
                lblTextField.setText("You caught a epic fish");
                point_count+=1000;
            }
            else if(nr<999)
            {
                lblTextField.setText("You caught a legendary fish");
                point_count+=5000;
            }
            else
            {
                lblTextField.setText("You caught an MYTHICAL!!!! fish");
                point_count+=100000;
            }
        }
    }

    private class DoneListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            FinishScreen fs=new FinishScreen(point_count);
        }
    }
}
