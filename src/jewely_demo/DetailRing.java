package jewely_demo;


import store.Ring;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class DetailRing extends JFrame{
    String[] designDetails;
    String[] recommendcolor;
    String[] recommendstone;
    String[] recommendlook;
    JLabel details[] = new JLabel[15];
    Ring ring;

    //private static final Object EXIT_ON_CLOSE = null;
    //String[] content;
    JLabel imageLabel = new JLabel();
    JFrame frame = new JFrame("Ring Design Detail");
    JButton stonebutton = new JButton();
    JLabel[] contentLabel = new JLabel[3];
    JPanel pane = new JPanel(new GridLayout(0,1));
    JButton button = new JButton("확인");
    public static String content[] = {"투웨이반지", "가넷", "가로로 떨어지는 디자인." +
            "정열적인 궁서체,붉은 목도리와 어울립니다."};


    public DetailRing() {
    }

    public void ringdetail() {
        pane.setBackground(Color.white);
        ImageIcon design0;
        contentLabel[0] = new JLabel("디자인명: " + content[0]);
        contentLabel[1] = new JLabel("어울리는 보석: " + content[1]);
        contentLabel[2] = new JLabel("설명: " + content[2]);

        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        contentLabel[0].setHorizontalAlignment(JLabel.CENTER);
        contentLabel[1].setHorizontalAlignment(JLabel.CENTER);
        contentLabel[2].setHorizontalAlignment(JLabel.CENTER);


        for (int i = 0; i < 3; i++) {
            //contentLabel[i].setForeground(Color.white);
            pane.add(contentLabel[i]);
        }

        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setBackground(Color.red);
        button.setForeground(Color.white);
        design0 = new ImageIcon("StoneImage/가넷.jpg");
        imageLabel.setIcon(design0);
        imageLabel.setBounds(200,200,350,350);
        pane.add(imageLabel);
        pane.add(button);

        frame.setBounds(170, 250, 300, 100);
        frame.add(pane);
        //frame.setUndecorated(true);
        frame.setSize(450, 590);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("확인")) {
                    frame.dispose();
                }
            }
        });

    }

    public void createAndShowGUI2() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ringdetail();
        //setPreferredSize(new Dimension(1920, 1080));
        setBounds(0,0,1920,1080);
        pack();
        setVisible(false);

    }


    public static void main(String[] args) {
        DetailRing frame = new DetailRing();
        frame.createAndShowGUI2();
    }


}


