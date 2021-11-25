package jewely_demo;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


import store.JewelryStore;

import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.ArrayList;


import javax.swing.*;
import store.OrderManager;
import store.Order;

public class GUIMain extends JFrame{
    static JewelryStore store = JewelryStore.getInstance();
    private static final long serialVersionUID = 1L;
    //JTextField resultTF = new JTextField("0", 20);
    JScrollPane scrollPane;
    ImageIcon icon = new ImageIcon("start.png");
    JPanel background = new JPanel() {
        public void paintComponent(Graphics g) {
            g.drawImage(icon.getImage(), 0, 0, null);
            setOpaque(false); //그림을 표시하게 설정,투명하게 조절
            super.paintComponent(g);
        }
    };
    JButton detail = new JButton("주문내역 확인");
    JButton order = new JButton("주문하기");

    public void addComponentsTopane() {
        Container pane = getContentPane();
        scrollPane = new JScrollPane(background);
        setContentPane(scrollPane);
        background.add(detail);
        background.add(order);

        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ordered();
                Ordered frame = new Ordered();
                frame.createAndShowGUI();
                setVisible(false);

            }
        });

        detail.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Detail();
                Detail frame = new Detail();
                frame.createAndShowGUI();

            }

        });

    }
    void createAndShowGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addComponentsTopane();
        setPreferredSize(new Dimension(1920, 1080));
        pack();
        setVisible(true);

    }
    public static void main(String[] args) {
        GUIMain frame = new GUIMain();
        frame.createAndShowGUI();
    }

    public class Ordered extends JFrame{
        Ordered() {
            ArrayList<Order> ordereduserList = new ArrayList<>();
            String name = null;
            ImageIcon icon = new ImageIcon("start1.png");
            JPanel background = new JPanel() {
                public void paintComponent(Graphics g) {
                    g.drawImage(icon.getImage(), 0, 0, null);
                    setOpaque(false); //그림을 표시하게 설정,투명하게 조절
                    super.paintComponent(g);
                }
            };
            scrollPane = new JScrollPane(background);
            setContentPane(scrollPane);
            JTextField textPeriod = new JTextField(5);
            JLabel labelPeriod = new JLabel("이름: ");
            labelPeriod.setForeground(Color.white);
            name = textPeriod.getText();
            //Order od = new Order(name);
            JTextField textPeriod2 = new JTextField(5);
            JLabel labelPeriod2 = new JLabel("번호 : ");
            labelPeriod2.setForeground(Color.white);
            JTextField textPeriod3 = new JTextField(5);
            JLabel labelPeriod3 = new JLabel("주소: ");
            labelPeriod3.setForeground(Color.white);


            JButton buttonStart = new JButton("반지 색상 선택하기");
            buttonStart.setMnemonic('S');
            background.add(labelPeriod);
            background.add(textPeriod);
            background.add(labelPeriod2);
            background.add(textPeriod2);
            background.add(labelPeriod3);
            background.add(textPeriod3);
            background.add(buttonStart);

            buttonStart.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new Temp2();
                    setVisible(false);
                }

            });

        }

        public void createAndShowGUI() {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            addComponentsTopane();
            setPreferredSize(new Dimension(1920, 1280));
            pack();
            setVisible(true);
        }
    }

    public class Detail extends JFrame{
        Detail() {
            Container contentPane = this.getContentPane();
            JPanel pane = new JPanel();

            JTextField textPeriod = new JTextField(5);
            JLabel labelPeriod = new JLabel("이름: ");

            JTextField textPeriod2 = new JTextField(5);
            JLabel labelPeriod2 = new JLabel("번호 : ");

            JTextField textPeriod3 = new JTextField(5);
            JLabel labelPeriod3 = new JLabel("주소: ");


            JButton buttonStart = new JButton("주문내역 확인");
            buttonStart.setMnemonic('S');

            pane.add(labelPeriod2);
            pane.add(textPeriod2);
            pane.add(buttonStart);
            contentPane.add(pane);
        }



        public void createAndShowGUI() {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            addComponentsTopane();
            setPreferredSize(new Dimension(1920, 1080));
            pack();
            setVisible(true);
        }
    }

}