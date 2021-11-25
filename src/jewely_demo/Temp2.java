package jewely_demo;

import store.Recommend;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.*;

public class Temp2 extends JFrame{

    String finalColor = null;
    public String finalStone = null;
    String ring = null;
    String finalCarat = null;
    String colors[] = {"실버", "골드", "로즈골드"};
    String stones[] = {"가넷(1월)", "자수정(2월)", "아쿠아마린(3월)", "다이아몬드(4월)", "에메랄드(5월)", "진주(6월)","루비(7월)",
            "페리도트(8월)", "사파이어(9월)", "오팔(10월)", "토파즈(11월)", "터키석(12월)"};
    String carats[] = {"0.3", "0.5", "0.7", "1.0"};
    String means[] = {"진실, 우애, 정조", "평화, 성실","젊음, 총명, 침착","사랑, 순결, 신념",
            "행운, 연애, 행복","부귀, 장수, 건강","사랑, 진실, 정조","화합, 부부애정","성실, 지혜, 자애",
            "희망, 안락, 인내","건강, 우정, 희망, 결백","성공, 번영, 불굴"};
    String price[] = {"5900", "2000", "1600", "120000", "2000", "100000", "25000", "2000", "6000", "22700", "3000",
            "14700"};
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
    JPanel jewelPanel = new JPanel(new GridLayout(2,6));
    JComboBox<String> cbbRings;
    JLabel ringPrint;
    JLabel stonePrint;
    JComboBox<String> cbbCarats;
    JLabel caratPrint;
    JLabel meanPrint;
    RoundedButton decision = new RoundedButton("선택 완료");
    RoundedButton previous = new RoundedButton("이전 반지");
    JLabel ringPrice;
    JLabel stonePrice;






    public Temp2() { // public Temp2(ring)
        // this.ring = ring;
        setTitle("반지 커스텀");
        setSize(1920,1080);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        cbbRings = new JComboBox(colors);
        ringPrint = new JLabel("반지 색상: 선택되지 않음");
        stonePrint = new JLabel("탄생석 : 선택되지 않음");
        cbbCarats = new JComboBox(carats);
        caratPrint = new JLabel("캐럿 : 선택되지 않음");
        ringPrice = new JLabel("(가격: )");
        stonePrice = new JLabel("(탄생석 가격: )");
        meanPrint = new JLabel("탄생석을 선택해주세요");
        Font font = new Font("맑은 고딕",Font.PLAIN,20);

        cbbRings.setBounds(1000,50,180,35);
        cbbRings.setFont(font);
        ringPrint.setBounds(1200,47,350,35);
        ringPrint.setFont(font);
        stonePrint.setBounds(1000, 147,350,35);
        stonePrint.setFont(font);
        cbbCarats.setBounds(1000, 350,180,35);
        cbbCarats.setFont(font);
        caratPrint.setBounds(1200,347,220,35);
        meanPrint.setBounds(1000,250,500,35);
        meanPrint.setFont(font);
        caratPrint.setFont(font);


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
        imageLabel.setBounds(50,50,350,350);
        stoneLabel.setBounds(500,50,350,350);

        decision.setBounds(1500, 347, 350,25);
        decision.setFont(font);
        previous.setBounds(10,10,100,25);
        ringPrice.setBounds(1500,47,350,25);
        ringPrice.setFont(font);
        stonePrice.setBounds(1500,147,350,25);
        stonePrice.setFont(font);
        jewelPanel.setBounds(0,500,1920,520);
        JButton jan = new JButton("1월");
        JButton feb = new JButton("2월");
        JButton mar = new JButton("3월");
        JButton apr = new JButton("4월");
        JButton may = new JButton("5월");
        JButton jun = new JButton("6월");
        JButton jul = new JButton("7월");
        JButton aug = new JButton("8월");
        JButton sep = new JButton("9월");
        JButton oct = new JButton("10월");
        JButton nov = new JButton("11월");
        JButton dec = new JButton("12월");
        // 사진 배율조정
        finalSetIcon(jan,stone0);
        finalSetIcon(feb,stone1);
        finalSetIcon(mar,stone2);
        finalSetIcon(apr,stone3);
        finalSetIcon(may,stone4);
        finalSetIcon(jun,stone5);
        finalSetIcon(jul,stone6);
        finalSetIcon(aug,stone7);
        finalSetIcon(sep,stone8);
        finalSetIcon(oct,stone9);
        finalSetIcon(nov,stone10);
        finalSetIcon(dec,stone11);
        // 사진 배율조정


        jewelPanel.add(jan);
        jewelPanel.add(feb);
        jewelPanel.add(mar);
        jewelPanel.add(apr);
        jewelPanel.add(may);
        jewelPanel.add(jun);
        jewelPanel.add(jul);
        jewelPanel.add(aug);
        jewelPanel.add(sep);
        jewelPanel.add(oct);
        jewelPanel.add(nov);
        jewelPanel.add(dec);
        // 보석 버튼
        ActionListener listener = new ButtonListenerCount();
        jan.addActionListener(listener);
        feb.addActionListener(listener);
        mar.addActionListener(listener);
        apr.addActionListener(listener);
        may.addActionListener(listener);
        jun.addActionListener(listener);
        jul.addActionListener(listener);
        aug.addActionListener(listener);
        sep.addActionListener(listener);
        oct.addActionListener(listener);
        nov.addActionListener(listener);
        dec.addActionListener(listener);



        mainPanel.add(cbbRings);
        mainPanel.add(ringPrint);
        mainPanel.add(stonePrint);
        mainPanel.add(cbbCarats);
        mainPanel.add(caratPrint);
        mainPanel.add(imageLabel);
        mainPanel.add(stoneLabel);
        mainPanel.add(decision);
        mainPanel.add(ringPrice);
        mainPanel.add(stonePrice);
        mainPanel.add(previous);
        mainPanel.add(meanPrint);
        mainPanel.add(jewelPanel);
        previous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                GUIMain frame = new GUIMain();
                frame.createAndShowGUI();
            }
        });

        cbbRings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color = cbbRings.getSelectedItem().toString();
                ringPrint.setText("반지 색상: " + color);
                if(color.contentEquals("실버")) {imageLabel.setIcon(ring0); ringPrice.setText("(가격: 15000)");}
                if(color.contentEquals("골드")) {imageLabel.setIcon(ring1); ringPrice.setText("(가격: 25000)");}
                if(color.contentEquals("로즈골드")) {imageLabel.setIcon(ring2); ringPrice.setText("(가격: 25000)");}
                finalColor = color;
            }
        });

        cbbCarats.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String carat = cbbCarats.getSelectedItem().toString();
                caratPrint.setText("캐럿: " + carat);
                finalCarat = carat;
            }
        });
        decision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "반지 색상: " + finalColor +
                                " 탄생석: " + finalStone + " 캐럿: " + finalCarat + "를 최종 선택하시겠습니까?","Confirm",
                        JOptionPane.YES_NO_OPTION);
                // YES면 다음 페이지와 연결, NO면 그냥 이 페이지
                if(result == JOptionPane.YES_NO_OPTION) {
                    //Recommend rec = new Recommend(ring, finalColor, finalStone, finalCarat);
                    OrderBasket frame = new OrderBasket(finalStone);
                    frame.createAndShowGUI();
                    setVisible(false);
                }


            }
        });



        add(mainPanel);
        setVisible(true);
    }
    void setMean(String stone) {
        if(stone == null) meanPrint.setText("탄생석을 선택해주세요");
        for (int i = 0; i < 12; i++){
            if(stone.contentEquals(stones[i])) meanPrint.setText(stone + "은 " + means[i]
                    +"을(를) 의미합니다.");
        }
    }
    void setFinalImage(String stone, String price, ImageIcon i) {
        Image img;
        Image changeImg;
        stonePrint.setText("탄생석: " + stone );
        stoneLabel.setIcon(i);
        stonePrice.setText("(탄생석 가격: " + price + ")");
        img = i.getImage();
        changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(changeImg);
        stoneLabel.setIcon(changeIcon);
    }
    void finalSetIcon(JButton j, ImageIcon i){
        Image img;
        Image changeImg;
        img = i.getImage();
        changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(changeImg);
        j.setIcon(changeIcon);
    }
    void setFinalStone(String stone){
        finalStone = stone;
        setMean(finalStone);
    }
    class ButtonListenerCount implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String buttonName = e.getActionCommand();
            Image img;
            Image changeImg;
            if(buttonName.contentEquals("1월")) {
                setFinalImage(stones[0], price[0], stone0);
                setFinalStone(stones[0]);
            }
            if(buttonName.equals("2월")) {
                setFinalImage(stones[1], price[1], stone1);
                setFinalStone(stones[1]);
            }
            if(buttonName.equals("3월")) {
                setFinalImage(stones[2], price[2], stone2);
                setFinalStone(stones[2]);
            }
            if(buttonName.equals("4월")) {
                setFinalImage(stones[3], price[3], stone3);
                setFinalStone(stones[3]);
            }
            if(buttonName.equals("5월")) {
                setFinalImage(stones[4], price[4], stone4);
                setFinalStone(stones[4]);
            }
            if(buttonName.equals("6월")) {
                setFinalImage(stones[5], price[5], stone5);
                setFinalStone(stones[5]);
            }
            if(buttonName.equals("7월")) {
                setFinalImage(stones[6], price[6], stone6);
                setFinalStone(stones[6]);
            }
            if(buttonName.equals("8월")) {
                setFinalImage(stones[7], price[7], stone7);
                setFinalStone(stones[7]);
            }
            if(buttonName.equals("9월")) {
                setFinalImage(stones[8], price[8], stone8);
                setFinalStone(stones[8]);
            }
            if(buttonName.equals("10월")) {
                setFinalImage(stones[9], price[9], stone9);
                setFinalStone(stones[9]);
            }
            if(buttonName.equals("11월")) {
                setFinalImage(stones[10], price[10], stone10);
                setFinalStone(stones[10]);
            }
            if(buttonName.equals("12월")) {
                setFinalImage(stones[11], price[11], stone11);
                setFinalStone(stones[11]);
            }

        }
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