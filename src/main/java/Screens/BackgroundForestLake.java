package Screens;

import javax.swing.*;

public class BackgroundForestLake extends JFrame {

    private JLabel lblBackground;

    public BackgroundForestLake() {
        setTitle("Yes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        ImageIcon icon = new ImageIcon("src/main/resources/Icons/end-of-evangelion.png");
        setIconImage(icon.getImage());
        setSize(1920,1080);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        lblBackground = new JLabel(new ImageIcon("src/main/resources/BackGrounds/Game_Bg.png"));
        lblBackground.setBounds(0, 0, 1920, 1080);
        add(lblBackground);
        setVisible(true);
    }
}
