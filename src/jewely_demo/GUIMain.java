package jewely_demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

import store.JewelryStore;
import store.Order;
import store.OrderManager;

import java.awt.BorderLayout;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
import store.JewelryStore;
import store.Order;
import store.OrderManager;

public class GUIMain extends JFrame{
    static JewelryStore store = JewelryStore.getInstance();

    private static final long serialVersionUID = 1L;
    //JTextField resultTF = new JTextField("0", 20);
    JPanel topLabel = new JPanel(new GridLayout(1, 2));
    JPanel middleLabel = new JPanel(new GridLayout(1, 2));
    JPanel bottomLabel = new JPanel(new GridLayout(1, 2));
    JButton detail = new JButton("주문내역 확인");
    JButton order = new JButton("주문하기");

    public void addComponentsTopane() {
        Container pane = getContentPane();
        topLabel.setPreferredSize(new Dimension(300, 100));
        middleLabel.setPreferredSize(new Dimension(300,40));
        bottomLabel.setPreferredSize(new Dimension(300, 100));
        pane.add(topLabel, BorderLayout.PAGE_START);
        pane.add(middleLabel, BorderLayout.CENTER);
        pane.add(bottomLabel, BorderLayout.PAGE_END);

        middleLabel.add(detail, BorderLayout.WEST);
        middleLabel.add(order, BorderLayout.EAST);

        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ordered();
                Ordered fram = new Ordered();
                fram.createAndShowGUI();
                setVisible(false);

            }
        });

        detail.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Detail();
                Detail fram = new Detail();
                fram.createAndShowGUI();

            }

        });

    }


    void createAndShowGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addComponentsTopane();
        setPreferredSize(new Dimension(800, 300));
        pack();
        setVisible(true);

    }
    public static void main(String[] args) {
        GUIMain frame = new GUIMain();
        frame.createAndShowGUI();
    }

    public class Ordered extends JFrame{
        Ordered() {
            Container contentPane = this.getContentPane();
            JPanel pane = new JPanel();

            JTextField textPeriod = new JTextField(5);
            JLabel labelPeriod = new JLabel("이름: ");

            JTextField textPeriod2 = new JTextField(5);
            JLabel labelPeriod2 = new JLabel("번호 : ");

            JTextField textPeriod3 = new JTextField(5);
            JLabel labelPeriod3 = new JLabel("주소: ");


            JButton buttonStart = new JButton("반지 색상 선택하기");
            buttonStart.setMnemonic('S');

            pane.add(labelPeriod);
            pane.add(textPeriod);
            pane.add(labelPeriod2);
            pane.add(textPeriod2);
            pane.add(labelPeriod3);
            pane.add(textPeriod3);
            pane.add(buttonStart);
            contentPane.add(pane);

        }

        public void createAndShowGUI() {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            addComponentsTopane();
            setPreferredSize(new Dimension(800, 300));
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
            setPreferredSize(new Dimension(800, 300));
            pack();
            setVisible(true);
        }
    }

}
