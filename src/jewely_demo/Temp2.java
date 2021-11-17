package jewely_demo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.*;

public class Temp2 extends JFrame{

    String finalColor = null;
    public String finalStone = null;
    String finalSize = null;
    String colors[] = {"실버", "골드", "로즈골드"};
    String stones[] = {"가넷(1월)", "자수정(2월)", "아쿠아마린(3월)", "다이아몬드(4월)", "에메랄드(5월)", "진주(6월)","루비(7월)",
            "페리도트(8월)", "사파이어(9월)", "오팔(10월)", "토파즈(11월)", "터키석(12월)"};
    String sizes[] = {"4호", "5호", "6호", "7호", "8호", "9호", "10호", "11호"};
    String means[] = {"진실, 우애, 정조", "평화, 성실","젊음, 총명, 침착","사랑, 순결, 신념",
                    "행운, 연애, 행복","부귀, 장수, 건강","사랑, 진실, 정조","화합, 부부애정","성실, 지혜, 자애",
                    "희망, 안락, 인내","건강, 우정, 희망, 결백","성공, 번영, 불굴"};
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
    RoundedButton decision = new RoundedButton("선택 완료");
    RoundedButton mean = new RoundedButton("의미 보기");
    JLabel ringPrice;
    JLabel stonePrice;
    //이미지 배율 조정





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
        ringPrice = new JLabel("가격: ");
        stonePrice = new JLabel("탄생석 가격: ");

        cbbRings.setBounds(800,10,80,25);
        ringPrint.setBounds(900,7,200,35);
        cbbStones.setBounds(800,80,120,25);
        stonePrint.setBounds(930, 77,200,35);
        cbbSizes.setBounds(800, 150,70,25);
        sizePrint.setBounds(900,147,200,35);
        mean.setBounds(1070,80,90,25);

        ring0 = new ImageIcon("RingColorImage/실버.PNG");
        ring1 = new ImageIcon("RingColorImage/골드.PNG");
        ring2 = new ImageIcon("RingColorImage/로즈골드.PNG");
        stone0 = new ImageIcon("StoneImage/가넷.jpg");
        stone1 = new ImageIcon("StoneImage/자수정.jpg");
        stone2 = new ImageIcon("StoneImage/아쿠아마린.jpg");
        stone3 = new ImageIcon("StoneImage/다이아몬드.jpg");
        stone4 = new ImageIcon("StoneImage/에메랄드.jpg");
        stone5 = new ImageIcon("StoneImage/진주.jpg");
        stone6 = new ImageIcon("StoneImage/루비.jpg");
        stone7 = new ImageIcon("StoneImage/페리도트.jpg");
        stone8 = new ImageIcon("StoneImage/사파이어.jpg");
        stone9 = new ImageIcon("StoneImage/오팔.jpg");
        stone10 = new ImageIcon("StoneImage/토파즈.jpg");
        stone11 = new ImageIcon("StoneImage/터키석.jpg");

        imageLabel.setIcon(ring0);
        stoneLabel.setIcon(stone0);
        imageLabel.setBounds(1,10,350,350);
        stoneLabel.setBounds(360,10,350,310);

        decision.setBounds(800, 220, 100,25);
        ringPrice.setBounds(800,40,80,25);
        stonePrice.setBounds(800,115,120,25);

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
        mainPanel.add(ringPrice);
        mainPanel.add(stonePrice);

        cbbRings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color = cbbRings.getSelectedItem().toString();
                ringPrint.setText("반지 색상: " + color);
                if(color.contentEquals("실버")) {imageLabel.setIcon(ring0); ringPrice.setText("가격: 15000");}
                if(color.contentEquals("골드")) {imageLabel.setIcon(ring1); ringPrice.setText("가격: 25000");}
                if(color.contentEquals("로즈골드")) {imageLabel.setIcon(ring2); ringPrice.setText("가격: 25000");}
                finalColor = color;
            }
        });
        cbbStones.addActionListener(new ActionListener() {
            Image img;
            Image changeImg;
            @Override
            public void actionPerformed(ActionEvent e) {
                String stone = cbbStones.getSelectedItem().toString();
                stonePrint.setText("탄생석: " + stone);
                if(stone.contentEquals(stones[0])) {
                    stoneLabel.setIcon(stone0); stonePrice.setText("탄생석 가격: 5900");
                    img = stone0.getImage();
                    changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
                    ImageIcon changeIcon = new ImageIcon(changeImg);
                    stoneLabel.setIcon(changeIcon);
                }
                if(stone.contentEquals(stones[1])) {
                    stoneLabel.setIcon(stone1); stonePrice.setText("탄생석 가격: 2000");
                    img = stone1.getImage();
                    changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);

                }
                if(stone.contentEquals(stones[2])) {
                    stoneLabel.setIcon(stone2); stonePrice.setText("탄생석 가격: 1600");
                    img = stone2.getImage();
                    changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
                }
                if(stone.contentEquals(stones[3])) {
                    stoneLabel.setIcon(stone3); stonePrice.setText("탄생석 가격: 120000");
                    img = stone3.getImage();
                    changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
                }
                if(stone.contentEquals(stones[4])) {
                    stoneLabel.setIcon(stone4); stonePrice.setText("탄생석 가격: 2000");
                    img = stone4.getImage();
                    changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
                }
                if(stone.contentEquals(stones[5])) {
                    stoneLabel.setIcon(stone5); stonePrice.setText("탄생석 가격: 100000");
                    img = stone5.getImage();
                    changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
                }
                if(stone.contentEquals(stones[6])) {
                    stoneLabel.setIcon(stone6); stonePrice.setText("탄생석 가격: 25000");
                    img = stone6.getImage();
                    changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
                }
                if(stone.contentEquals(stones[7])) {
                    stoneLabel.setIcon(stone7); stonePrice.setText("탄생석 가격: 2000");
                    img = stone7.getImage();
                    changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
                }
                if(stone.contentEquals(stones[8])) {
                    stoneLabel.setIcon(stone8); stonePrice.setText("탄생석 가격: 6000");
                    img = stone8.getImage();
                    changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
                }
                if(stone.contentEquals(stones[9])) {
                    stoneLabel.setIcon(stone9); stonePrice.setText("탄생석 가격: 22700");
                    img = stone9.getImage();
                    changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
                }
                if(stone.contentEquals(stones[10])) {
                    stoneLabel.setIcon(stone10); stonePrice.setText("탄생석 가격: 3000");
                    img = stone10.getImage();
                    changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
                }
                if(stone.contentEquals(stones[11])) {
                    stoneLabel.setIcon(stone11); stonePrice.setText("탄생석 가격: 14700");
                    img = stone11.getImage();
                    changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
                }
                ImageIcon changeIcon = new ImageIcon(changeImg);
                stoneLabel.setIcon(changeIcon);
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
                if(result == JOptionPane.YES_NO_OPTION) {
                    OrderBasket frame = new OrderBasket(finalStone);
                    frame.createAndShowGUI();
                    setVisible(false);
                }
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
    class RoundedButton extends JButton {
        public RoundedButton() {
            super();
            decorate();
        }

        public RoundedButton(String text) {
            super(text);
            decorate();
        }

        public RoundedButton(Action action) {
            super(action);
            decorate();
        }

        public RoundedButton(Icon icon) {
            super(icon);
            decorate();
        }

        public RoundedButton(String text, Icon icon) {
            super(text, icon);
            decorate();
        }

        protected void decorate() {
            setBorderPainted(false);
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Color c = new Color(255, 247, 242); //배경색 결정
            Color o = new Color(247, 99, 12); //글자색 결정
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (getModel().isArmed()) {
                graphics.setColor(c.darker());
            } else if (getModel().isRollover()) {
                graphics.setColor(c.brighter());
            } else {
                graphics.setColor(c);
            }
            graphics.fillRoundRect(0, 0, width, height, 10, 10);
            FontMetrics fontMetrics = graphics.getFontMetrics();
            Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();
            int textX = (width - stringBounds.width) / 2;
            int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent();
            graphics.setColor(o);
            graphics.setFont(getFont());
            graphics.drawString(getText(), textX, textY);
            graphics.dispose();
            super.paintComponent(g);
        }
    }


}