package jewely_demo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.*;

public class Temp2 extends JFrame{

    String finalColor = null;
    String finalStone = null;
    String finalSize = null;
    String colors[] = {"실버", "골드", "로즈골드"};
    String stones[] = {"가넷(1월)", "자수정(2월)", "아쿠아마린(3월)", "다이아몬드(4월)", "에메랄드(5월)", "진주(6월)","루비(7월)",
            "페리도트(8월)", "사파이어(9월)", "오팔(10월)", "토파즈(11월)", "터키석(12월)"};
    String sizes[] = {"4호", "5호", "6호", "7호", "8호", "9호", "10호", "11호"};
    String means[] = {"진실", "평화","젊음","사랑","행운","부귀","사랑","화합","성실","희망","건강","성공"};
    ImageIcon ring0;
    ImageIcon ring1;
    ImageIcon ring2;
    ImageIcon stone0;
    ImageIcon stone1;
    ImageIcon stone2;
    ImageIcon stone3;
    ImageIcon stone4;
    ImageIcon stone5;
    ImageIcon stone6;
    ImageIcon stone7;
    ImageIcon stone8;
    ImageIcon stone9;
    ImageIcon stone10;
    ImageIcon stone11;

    JLabel imageLabel = new JLabel();
    JLabel stoneLabel = new JLabel();
    JPanel mainPanel;
    JComboBox<String> cbbRings;
    JLabel ringPrint;
    JComboBox<String> cbbStones;
    JLabel stonePrint;
    JComboBox<String> cbbSizes;
    JLabel sizePrint;
    JButton decision = new JButton("선택 완료");
    JButton mean = new JButton("의미 보기");




    public Temp2() {

        setTitle("반지 커스텀");
        setSize(1200,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        cbbRings = new JComboBox(colors);
        ringPrint = new JLabel("반지 색상: 선택되지 않음");
        cbbStones = new JComboBox(stones);
        stonePrint = new JLabel("탄생석 : 선택되지 않음");
        cbbSizes = new JComboBox(sizes);
        sizePrint = new JLabel("사이즈(미국호수) : 선택되지 않음");

        cbbRings.setBounds(800,10,80,25);
        ringPrint.setBounds(900,7,200,35);
        cbbStones.setBounds(800,80,120,25);
        stonePrint.setBounds(930, 77,200,35);
        cbbSizes.setBounds(800, 150,70,25);
        sizePrint.setBounds(900,147,200,35);
        mean.setBounds(1070,80,90,25);

        ring0 = new ImageIcon("실버.PNG");
        ring1 = new ImageIcon("골드.PNG");
        ring2 = new ImageIcon("로즈골드.PNG");
        stone0 = new ImageIcon("가넷.jpg");
        stone1 = new ImageIcon("자수정.jpg");
        stone2 = new ImageIcon("아쿠아마린.jpg");
        stone3 = new ImageIcon("다이아몬드.jpg");
        stone4 = new ImageIcon("에메랄드.jpg");
        stone5 = new ImageIcon("진주.jpg");
        stone6 = new ImageIcon("루비.jpg");
        stone7 = new ImageIcon("페리도트.jpg");
        stone8 = new ImageIcon("사파이어.jpg");
        stone9 = new ImageIcon("오팔.jpg");
        stone10 = new ImageIcon("토파즈.jpg");
        stone11 = new ImageIcon("터키석.jpg");

        imageLabel.setIcon(ring0);
        stoneLabel.setIcon(stone0);
        imageLabel.setBounds(1,10,350,350);
        stoneLabel.setBounds(360,10,350,310);

        decision.setBounds(800, 220, 100,25);


        mainPanel.add(cbbRings);
        mainPanel.add(ringPrint);
        mainPanel.add(cbbStones);
        mainPanel.add(stonePrint);
        mainPanel.add(cbbSizes);
        mainPanel.add(sizePrint);
        mainPanel.add(imageLabel);
        mainPanel.add(stoneLabel);
        mainPanel.add(decision);
        mainPanel.add(mean);


        cbbRings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color = cbbRings.getSelectedItem().toString();
                ringPrint.setText("반지 색상: " + color);
                if(color.contentEquals("실버")) imageLabel.setIcon(ring0);
                if(color.contentEquals("골드")) imageLabel.setIcon(ring1);
                if(color.contentEquals("로즈골드")) imageLabel.setIcon(ring2);
                finalColor = color;
            }
        });
        cbbStones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String stone = cbbStones.getSelectedItem().toString();
                stonePrint.setText("탄생석: " + stone);
                if(stone.contentEquals(stones[0])) stoneLabel.setIcon(stone0);
                if(stone.contentEquals(stones[1])) stoneLabel.setIcon(stone1);
                if(stone.contentEquals(stones[2])) stoneLabel.setIcon(stone2);
                if(stone.contentEquals(stones[3])) stoneLabel.setIcon(stone3);
                if(stone.contentEquals(stones[4])) stoneLabel.setIcon(stone4);
                if(stone.contentEquals(stones[5])) stoneLabel.setIcon(stone5);
                if(stone.contentEquals(stones[6])) stoneLabel.setIcon(stone6);
                if(stone.contentEquals(stones[7])) stoneLabel.setIcon(stone7);
                if(stone.contentEquals(stones[8])) stoneLabel.setIcon(stone8);
                if(stone.contentEquals(stones[9])) stoneLabel.setIcon(stone9);
                if(stone.contentEquals(stones[10])) stoneLabel.setIcon(stone10);
                if(stone.contentEquals(stones[11])) stoneLabel.setIcon(stone11);
                finalStone = stone;
            }
        });
        cbbSizes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String size = cbbSizes.getSelectedItem().toString();
                sizePrint.setText("사이즈(미국호수): " + size);
                finalSize = size;
            }
        });
        decision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "반지 색상: " + finalColor +
                                " 탄생석: " + finalStone + " 사이즈: " + finalSize + "를 최종 선택하시겠습니까?","Confirm",
                        JOptionPane.YES_NO_OPTION);
                // YES면 다음 페이지와 연결, NO면 그냥 이 페이지

            }
        });
        mean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i=0; i<12; i++) {
                    if(finalStone.contentEquals(stones[i]))
                        JOptionPane.showMessageDialog(null, finalStone+"는 " + means[i]
                                + "를 의미합니다.", "message", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });

        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        Temp2 frame = new Temp2();
    }

}
