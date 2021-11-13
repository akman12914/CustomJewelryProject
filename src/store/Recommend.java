package store;

import javax.swing.*;
import java.awt.*;

public class Recommend extends JFrame {

        int num;
        Recommend(int num) {
            super("결제완료_추천");
            this.num=num;
            setLayout(new FlowLayout());
            JPanel jPanel = new JPanel();
            Dimension frameSize = getSize();
            Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
            jPanel.setBackground(Color.WHITE);
            setSize(1920, 1280);
            add(jPanel);
            setLocation((windowSize.width - frameSize.width) / 2, (windowSize.height - frameSize.height) / 2);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setVisible(true);
        }


        public void paint(Graphics g) {
            super.paint(g);
            g.setColor(Color.black);
            g.setFont(new Font("돋움", Font.BOLD, 30));
            g.drawString("< 주문완료 > ", 200, 300);
            g.setFont(new Font("돋움", Font.PLAIN, 25));
            g.drawString("고객님의 주문이 완료되었습니다.", 210, 400);
            switch (num) {
                case 1:
                    g.drawString("선택하신 1월 탄생석인 가넷은", 210, 450);
                    g.drawString("우아하면서, 격식있는 스타일과 잘어울립니다.", 210, 500);

                    ImageIcon janLook = new ImageIcon("1월.jpg");
                    JLabel janImageLabel = new JLabel(janLook);
                    janImageLabel.setIcon(janLook);
                    add(janImageLabel);
                    setVisible(true);
                    break;
                case 2:
                    g.drawString("선택하신 2월 탄생석인 자수정은", 210, 450);
                    g.drawString("단아하면서, 격식있는 스타일과 잘어울립니다.", 210, 500);

                    ImageIcon febLook = new ImageIcon("2월.jpg");
                    JLabel febImageLabel = new JLabel(febLook);
                    febImageLabel.setIcon(febLook);
                    add(febImageLabel);
                    setVisible(true);
                    break;
                case 3:
                    g.drawString("선택하신 3월 탄생석인 자수정은", 210, 450);
                    g.drawString("단아하면서, 격식있는 스타일과 잘어울립니다.", 210, 500);

                    ImageIcon marLook = new ImageIcon("3월.jpg");
                    JLabel marImageLabel = new JLabel(marLook);
                    marImageLabel.setIcon(marLook);
                    add(marImageLabel);
                    setVisible(true);
                    break;
                case 4:
                    g.drawString("선택하신 4월 탄생석인 자수정은", 210, 450);
                    g.drawString("단아하면서, 격식있는 스타일과 잘어울립니다.", 210, 500);

                    ImageIcon aprLook = new ImageIcon("4월.jpg");
                    JLabel aprImageLabel = new JLabel(aprLook);
                    aprImageLabel.setIcon(aprLook);
                    add(aprImageLabel);
                    setVisible(true);
                    break;
                case 5:
                    g.drawString("선택하신 5월 탄생석인 자수정은", 210, 450);
                    g.drawString("단아하면서, 격식있는 스타일과 잘어울립니다.", 210, 500);

                    ImageIcon mayLook = new ImageIcon("5월.jpg");
                    JLabel mayImageLabel = new JLabel(mayLook);
                    mayImageLabel.setIcon(mayLook);
                    add(mayImageLabel);
                    setVisible(true);
                    break;
                case 6:
                    g.drawString("선택하신 6월 탄생석인 자수정은", 210, 450);
                    g.drawString("단아하면서, 격식있는 스타일과 잘어울립니다.", 210, 500);

                    ImageIcon junLook = new ImageIcon("6월.jpg");
                    JLabel junImageLabel = new JLabel(junLook);
                    junImageLabel.setIcon(junLook);
                    add(junImageLabel);
                    setVisible(true);
                    break;
                case 7:
                    g.drawString("선택하신 7월 탄생석인 자수정은", 210, 450);
                    g.drawString("단아하면서, 격식있는 스타일과 잘어울립니다.", 210, 500);

                    ImageIcon julLook = new ImageIcon("7월.jpg");
                    JLabel julImageLabel = new JLabel(julLook);
                    julImageLabel.setIcon(julLook);
                    add(julImageLabel);
                    setVisible(true);
                    break;
                case 8:
                    g.drawString("선택하신 8월 탄생석인 자수정은", 210, 450);
                    g.drawString("단아하면서, 격식있는 스타일과 잘어울립니다.", 210, 500);

                    ImageIcon ougLook = new ImageIcon("8월.jpg");
                    JLabel ougImageLabel = new JLabel(ougLook);
                    ougImageLabel.setIcon(ougLook);
                    add(ougImageLabel);
                    setVisible(true);
                    break;
                case 9:
                    g.drawString("선택하신 9월 탄생석인 자수정은", 210, 450);
                    g.drawString("단아하면서, 격식있는 스타일과 잘어울립니다.", 210, 500);

                    ImageIcon septLook = new ImageIcon("9월.jpg");
                    JLabel septImageLabel = new JLabel(septLook);
                    septImageLabel.setIcon(septLook);
                    add(septImageLabel);
                    setVisible(true);
                    break;
                case 10:
                    g.drawString("선택하신 10월 탄생석인 자수정은", 210, 450);
                    g.drawString("단아하면서, 격식있는 스타일과 잘어울립니다.", 210, 500);

                    ImageIcon octLook = new ImageIcon("10월.jpg");
                    JLabel octImageLabel = new JLabel(octLook);
                    octImageLabel.setIcon(octLook);
                    add(octImageLabel);
                    setVisible(true);
                    break;
                case 11:
                    g.drawString("선택하신 11월 탄생석인 자수정은", 210, 450);
                    g.drawString("단아하면서, 격식있는 스타일과 잘어울립니다.", 210, 500);

                    ImageIcon novLook = new ImageIcon("11월.jpg");
                    JLabel novImageLabel = new JLabel(novLook);
                    novImageLabel.setIcon(novLook);
                    add(novImageLabel);
                    setVisible(true);
                    break;
                case 12:
                    g.drawString("선택하신 12월 탄생석인 자수정은", 210, 450);
                    g.drawString("단아하면서, 격식있는 스타일과 잘어울립니다.", 210, 500);

                    ImageIcon decLook = new ImageIcon("12월.jpg");
                    JLabel decImageLabel = new JLabel(decLook);
                    decImageLabel.setIcon(decLook);
                    add(decImageLabel);
                    setVisible(true);
                    break;
                default: break;
            }
        }
    }



