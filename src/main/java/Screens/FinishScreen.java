package Screens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinishScreen extends JFrame {

    public JLabel lblScore=new JLabel();
    private JButton btnExit=new JButton("Exit");
    private JButton btnBack=new JButton("Back");
    private JLabel lblBG=new JLabel();

    public FinishScreen(int score) {
        setTitle("Yes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1000,800);
        setUndecorated(true);
        lblScore.setText("Your Score is: "+score+" but you can keep fishing to increase your score!");
        lblScore.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblScore.setForeground(Color.BLACK);
        lblScore.setBounds(200 ,200,800,200);
        btnExit.setBounds(200,400,200,200);
        btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnBack.setBounds(500,400,200,200);
        btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnExit.addActionListener(new ExitListener());
        btnBack.addActionListener(new BackListener());
        add(lblScore);
        add(btnExit);
        add(btnBack);
        lblBG.setIcon(new ImageIcon("src/main/resources/Icons/end-of-evangelion.png"));
        lblBG.setBounds(0, 0, 1000, 800);
        add(lblBG);
        setVisible(true);
    }

    private class ExitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class BackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    }
}
