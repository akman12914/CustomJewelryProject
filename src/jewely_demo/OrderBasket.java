
package jewely_demo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.geom.RoundRectangle2D;
import java.io.Serial;

import javax.swing.*;
import javax.swing.border.Border;



public class OrderBasket extends JFrame {

    @Serial
    private static final long serialVersionUID = 1L;

    JLabel stmeanLabel = null;
    String finalStone = null;
    int finalStoneprice = 0;
    String finalColor = null;
    int finalColorprice = 0;
    String finalDesign = null;
    int finalDesignprice = 0;
    String finalCarat = null;
    String finalrSize = null;
    String finalcprSize = null;
    int finalPrice = 0;
    Font fontstyle1 = new Font("궁서", Font.BOLD, 10);
    Font fontstyle2 = new Font("바탕", Font.BOLD, 10);


    String stones[] = {"가넷(1월)", "자수정(2월)", "아쿠아마린(3월)", "다이아몬드(4월)", "에메랄드(5월)", "진주(6월)", "루비(7월)",
            "페리도트(8월)", "사파이어(9월)", "오팔(10월)", "토파즈(11월)", "터키석(12월)"};
    String means[] = {"진실, 우애, 정조", "평화, 성실", "젊음, 총명, 침착", "사랑, 순결, 신념",
            "행운, 연애, 행복", "부귀, 장수, 건강", "사랑, 진실, 정조", "화합, 부부애정", "성실, 지혜, 자애",
            "희망, 안락, 인내", "건강, 우정, 희망, 결백", "성공, 번영, 불굴"};
    String designs[] = {"bold", "thin", "wave"};
    String colors[] = {"실버", "골드", "로즈골드"};
    String carats[] = {"0.3", "0.5", "0.7", "1.0"};
    String sizes[] = {"1호(44mm)", "2호(45mm)", "3호(46mm)", "4호(47mm)", "5호(47.5mm)", "6호(48.5mm)",
            "7호(49mm)", "8호(50mm)*여성 추천*", "9호(51mm)*여성 추천*", "10호(52mm)*여성 추천*", "11호(53.5mm)*여성 추천*", "12호(54.5mm)", "13호(55.5mm)", "14호(56.5mm)",
            "15호(57.5mm)", "16호(58.5mm)*남성 추천*", "17호(60mm)*남성 추천*", "18호(61.5mm)*남성 추천*", "19호(62.5mm)*남성 추천*", "20호(63.5mm)*남성 추천*", "21호(65mm)", "22호(66mm)",
            "23호(67mm)", "24호(68mm)", "25호(69mm)", "26호(70mm)", "27호(71mm)", "28호(72mm)", "29호(73mm)", "30호(74mm)"};

    String sizes2[] = {"커플링 선택 안함", "1호(44mm)", "2호(45mm)", "3호(46mm)", "4호(47mm)", "5호(47.5mm)", "6호(48.5mm)",
            "7호(49mm)", "8호(50mm)*여성 추천*", "9호(51mm)*여성 추천*", "10호(52mm)*여성 추천*", "11호(53.5mm)*여성 추천*", "12호(54.5mm)", "13호(55.5mm)", "14호(56.5mm)",
            "15호(57.5mm)", "16호(58.5mm)*남성 추천*", "17호(60mm)*남성 추천*", "18호(61.5mm)*남성 추천*", "19호(62.5mm)*남성 추천*", "20호(63.5mm)*남성 추천*", "21호(65mm)", "22호(66mm)",
            "23호(67mm)", "24호(68mm)", "25호(69mm)", "26호(70mm)", "27호(71mm)", "28호(72mm)", "29호(73mm)", "30호(74mm)"};

    ImageIcon fontimage1 = new ImageIcon("./FontImage/font1.jpg");
    ImageIcon fontimage2 = new ImageIcon("./FontImage/font2.jpg");


    //JTextField resultTF = new JTextField("0", 20);
    //상단 패널 안에 원석, 캐럿, 원석명, 가격, 색상, 색상명, 디자인, 디자인명의 패널 추가
    JPanel TopPanel = new JPanel(new GridLayout(1, 3));
    JPanel stPanel = new JPanel(new GridLayout(4, 1));
    JPanel coPanel = new JPanel(new GridLayout(3, 1));
    JPanel dePanel = new JPanel(new GridLayout(3, 1));
    JLabel stonetxtLabel;
    JLabel caratLabel;
    JLabel colortxtLabel;
    JLabel stonePLabel;
    JLabel colorPLabel;
    JLabel designtxtLabel;
    JLabel designPLabel;


    //중간에 위치한 텍스트 패널에 반지호수, 각인, 체크박스 패널을 추가(rletter는 주문자 반지각인, cprletter는 커플링 반지각인을 의미)
    JPanel textPanel = new JPanel(new GridLayout(2, 2));
    JPanel ringsizetxtPanel = new JPanel(new GridLayout(3, 1));
    JPanel cpringsizetxtPanel = new JPanel(new GridLayout(3, 1));
    JPanel sizecomboPanel = new JPanel();
    JPanel sizecombo2Panel = new JPanel();
    JComboBox sizecombo = new JComboBox(sizes);
    JComboBox sizecombo2 = new JComboBox(sizes2);


    JTextField rletterTxtField = new JTextField("각인 내용");
    JTextField cprletterTxtField = new JTextField("커플링 각인 내용");



    JPanel rcheckPanel = new JPanel(new GridLayout(1, 2));
    JCheckBox chk1 = new JCheckBox("내부");
    JCheckBox chk2 = new JCheckBox("외부");

    JPanel cprcheckPanel = new JPanel(new GridLayout(1, 2));
    JCheckBox chk3 = new JCheckBox("커플내부");
    JCheckBox chk4 = new JCheckBox("커플외부");


    public OrderBasket(String finalDesign, String finalColor, String finalStone, String finalCarat) {
        this.finalStone = finalStone;

        stonetxtLabel = new JLabel("선택한 원석: " + this.finalStone, SwingConstants.CENTER);
        stonePLabel = new JLabel("원석 가격: " + finalStoneprice + "원", SwingConstants.CENTER);
        caratLabel = new JLabel("선택한 캐럿: " + this.finalCarat, SwingConstants.CENTER);
        colortxtLabel = new JLabel("선택한 반지 색상: " + this.finalColor, SwingConstants.CENTER);
        colorPLabel = new JLabel("반지 가격: " + finalColorprice + "원", SwingConstants.CENTER);
        designtxtLabel = new JLabel("선택한 디자인: " + this.finalDesign, SwingConstants.CENTER);
        designPLabel = new JLabel("디자인 가격: " + finalDesignprice + "원", SwingConstants.CENTER);
        if (stones[0].equals(finalStone)) {
            stmeanLabel = new JLabel(means[0], SwingConstants.CENTER);
        }
        if (stones[1].equals(finalStone)) {

            stmeanLabel = new JLabel(means[1], SwingConstants.CENTER);
        }
        if (stones[2].equals(finalStone)) {

            stmeanLabel = new JLabel(means[2], SwingConstants.CENTER);
        }
        if (stones[3].equals(finalStone)) {

            stmeanLabel = new JLabel(means[3], SwingConstants.CENTER);
        }
        if (stones[4].equals(finalStone)) {

            stmeanLabel = new JLabel(means[4], SwingConstants.CENTER);
        }
        if (stones[5].equals(finalStone)) {

            stmeanLabel = new JLabel(means[5], SwingConstants.CENTER);
        }
        if (stones[6].equals(finalStone)) {

            stmeanLabel = new JLabel(means[6], SwingConstants.CENTER);
        }
        if (stones[7].equals(finalStone)) {

            stmeanLabel = new JLabel(means[7], SwingConstants.CENTER);
        }
        if (stones[8].equals(finalStone)) {

            stmeanLabel = new JLabel(means[8], SwingConstants.CENTER);
        }
        if (stones[9].equals(finalStone)) {

            stmeanLabel = new JLabel(means[9], SwingConstants.CENTER);
        }
        if (stones[10].equals(finalStone)) {

            stmeanLabel = new JLabel(means[10], SwingConstants.CENTER);
        }
        if (stones[11].equals(finalStone)) {

            stmeanLabel = new JLabel(means[11], SwingConstants.CENTER);
        }


    }


    Border itemborder = BorderFactory.createTitledBorder("주문목록");
    Border textborder = BorderFactory.createTitledBorder("입력목록");
    Border userborder = BorderFactory.createTitledBorder("커스텀링");
    Border coupleborder = BorderFactory.createTitledBorder("커플링");
    Border stborder = BorderFactory.createTitledBorder("선택한 원석");
    Border coborder = BorderFactory.createTitledBorder("선택한 색상");
    Border deborder = BorderFactory.createTitledBorder("선택한 디자인");


    JButton font1 = new JButton();
    JButton font2 = new JButton();

    //하단에 위치한 bottomPanel에  폰트 패널과 주문 패널을 추가, 각 패널에 폰트 버튼과 주문버튼 추가
    JPanel bottomPanel = new JPanel(new GridLayout(2, 1));
    JPanel orderPanel = new JPanel();
    JLabel totalpricePanel = new JLabel("총 가격 : ", SwingConstants.CENTER);
    RoundedButton Order = new RoundedButton("주문하기");

    //폰트 버튼 이미지 아이콘 크기 및 이미지아이콘 변환
    void fontIcon(JButton j, ImageIcon i) {
        Image img;
        img = i.getImage();
        Image changeImg = img.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(changeImg);
        j.setIcon(changeIcon);

    }

    public void addComponentsTopane() {


        setTitle("basket");
        Container pane = getContentPane();
        //상단, 중간, 하단 패널 크기 지정
        TopPanel.setPreferredSize(new Dimension(500, 100));
        textPanel.setPreferredSize(new Dimension(300, 300));
        bottomPanel.setPreferredSize(new Dimension(500, 200));

        //원석, 색상, 디자인 패널 크기 지정
        stPanel.setBounds(100, 100, 50, 50);
        coPanel.setBounds(100, 100, 50, 50);
        dePanel.setBounds(100, 100, 50, 50);

        //중간 패널의 반지호수 패널, 콤보 위치 및 크기 지정
        ringsizetxtPanel.setPreferredSize(new Dimension(100, 10));
        cpringsizetxtPanel.setPreferredSize(new Dimension(100, 10));
        sizecomboPanel.setBounds(100, 100, 150, 10);
        sizecombo2Panel.setBounds(100, 100, 150, 10);
        sizecombo.setPreferredSize(new Dimension(200, 50));
        sizecombo2.setPreferredSize(new Dimension(200, 50));

        //중간 패널의 레터링라벨, 레터링텍스트 필드 위치 및 크기 지정
//        rletterLabel.setBounds(100, 100,150,50);
//        cprletterLabel.setBounds(100, 100,150,50);
        rletterTxtField.setBounds(100, 100, 150, 50);
        cprletterTxtField.setBounds(100, 100, 150, 50);

        //중간 패널의 체크박스 패널, 체크박스 크기 지정
        rcheckPanel.setPreferredSize(new Dimension(50, 10));
        chk1.setPreferredSize(new Dimension(5, 5));
        chk2.setPreferredSize(new Dimension(5, 5));
        cprcheckPanel.setPreferredSize(new Dimension(50, 10));
        chk3.setPreferredSize(new Dimension(5, 5));
        chk4.setPreferredSize(new Dimension(5, 5));

        //폰트 버튼 크기 지정
        font1.setPreferredSize(new Dimension(100, 50));
        font2.setPreferredSize(new Dimension(100, 50));


        orderPanel.setBounds(100, 100, 100, 100);
        Order.setPreferredSize(new Dimension(100, 50));


        pane.add(TopPanel, BorderLayout.PAGE_START);
        pane.add(textPanel, BorderLayout.CENTER);
        pane.add(bottomPanel, BorderLayout.PAGE_END);

        //상단 패널의 아이템 목록 경계선 추가
        TopPanel.setBorder(itemborder);
        stPanel.setBorder(stborder);
        coPanel.setBorder(coborder);
        dePanel.setBorder(deborder);
        TopPanel.add(stPanel, BorderLayout.EAST);
        TopPanel.add(coPanel, BorderLayout.SOUTH);
        TopPanel.add(dePanel, BorderLayout.WEST);

        stPanel.add(stonetxtLabel);
        stPanel.add(stonePLabel);
        stPanel.add(stmeanLabel, BorderLayout.CENTER);

        coPanel.add(colortxtLabel);
        coPanel.add(colorPLabel);
        dePanel.add(designtxtLabel);
        dePanel.add(designPLabel);


        textPanel.setBorder(textborder);
        textPanel.add(cpringsizetxtPanel, SwingConstants.CENTER);
        textPanel.add(ringsizetxtPanel, SwingConstants.CENTER);
        ringsizetxtPanel.setBorder(userborder);
        cpringsizetxtPanel.setBorder(coupleborder);
        ringsizetxtPanel.add(sizecomboPanel);
        cpringsizetxtPanel.add(sizecombo2Panel);
        sizecomboPanel.add(sizecombo);
        sizecombo2Panel.add(sizecombo2);

        ringsizetxtPanel.add(rletterTxtField);
        cpringsizetxtPanel.add(cprletterTxtField);


        bottomPanel.add(Order, BorderLayout.CENTER);

        textPanel.add(font1);
        textPanel.add(font2);

        bottomPanel.add(totalpricePanel);
        bottomPanel.add(orderPanel);
        orderPanel.add(Order, BorderLayout.CENTER);






        ringsizetxtPanel.add(rcheckPanel);
        rcheckPanel.add(chk1, BorderLayout.EAST);
        rcheckPanel.add(chk2, BorderLayout.WEST);
        cpringsizetxtPanel.add(cprcheckPanel);
        cprcheckPanel.add(chk3, BorderLayout.EAST);
        cprcheckPanel.add(chk4, BorderLayout.WEST);


        ActionListener listenerpopup = new ButtonListenerpopup();

        Order.addActionListener(listenerpopup);
        font1.addActionListener(listenerpopup);
        font2.addActionListener(listenerpopup);
        FocusEvent();


    }

    public void createAndShowGUI() {
        fontIcon(font1, fontimage1);
        fontIcon(font2, fontimage2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addComponentsTopane();
        setPreferredSize(new Dimension(1920, 1280));
        pack();
        setVisible(true);
    }

    private void FocusEvent() {
        rletterTxtField.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e) {
                if (rletterTxtField.getText().trim().length() == 0) {
                    rletterTxtField.setText("각인 내용");
                }

            }

            @Override
            public void focusGained(FocusEvent e) {
                if (rletterTxtField.getText().trim().equals("각인 내용")) {
                    rletterTxtField.setText("");
                }
            }
        });
        cprletterTxtField.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e) {
                if (cprletterTxtField.getText().trim().length() == 0) {
                    cprletterTxtField.setText("커플링 각인 내용");
                }
            }

            @Override
            public void focusGained(FocusEvent e) {
                if (cprletterTxtField.getText().trim().equals("커플링 각인 내용")) {
                    cprletterTxtField.setText("");
                }
            }
        });
    }


    class ButtonListenerpopup implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            sizecombo.addActionListener(event -> {
                String rsize = sizecombo.getSelectedItem().toString();
                finalrSize = rsize;
                if (e.getSource() == sizecombo2) {
                    String cprsize = sizecombo2.getSelectedItem().toString();
                    finalcprSize = cprsize;
                    if (finalcprSize.equals("커플링 없음")) {

                    }

                }

            });
            //font1(궁서)이 눌릴때
            if (e.getSource() == font1) {
                rletterTxtField.setFont(fontstyle1);
                cprletterTxtField.setFont(fontstyle1);
                String letter = rletterTxtField.getText().trim();
                String cpletter = cprletterTxtField.getText().trim();
                //font1이 눌리고 Order버튼이 눌렸을 때
                Order.addActionListener(event -> {
                    //주문자 레터링만 있는 경우
                    if (letter != "각인 내용" && cpletter.equals("커플링 각인 내용")) {
                        JOptionPane.showMessageDialog(null, "주문자 반지 :[원석 (" + finalStone + "), 디자인(" + finalDesign
                                + "), 색상(" + finalColor + "), 반지 호수(" + finalrSize + ")]\n각인 내용 : ["
                                + letter + "]\n 폰트 명 : [" + fontstyle1.getFontName()
                                + "]\n총 가격 :" + finalPrice, "주문 완료", JOptionPane.INFORMATION_MESSAGE);
                        setVisible(true);
                    }
                    //주문자 레터링 없고 커플링 레터링만 있는 경우
                    if (cpletter != "커플링 각인 내용" && letter.equals("각인 내용"))
                        JOptionPane.showMessageDialog(null, "주문자 반지 :[원석 (" + finalStone + "), 디자인(" + finalDesign
                                + "), 색상(" + finalColor + "), 반지 호수(" + finalrSize + ")]\n각인 내용 : [" + cpletter + "]\n폰트 명 : [" +
                                fontstyle1.getFontName() + "]" + "\n커플링 반지 : [반지 호수(" + finalcprSize + ")]\n 총 가격 :" + finalPrice + "원입니다.", "주문 완료", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(true);
                    //주문자 커플링 레터링 둘 다 있을 경우
                    if (letter != "각인 내용" && cpletter != "커플링 각인 내용") {
                        JOptionPane.showMessageDialog(null, "주문자 반지 :[원석 (" + finalStone + "), 디자인(" + finalDesign
                                + "), 색상(" + finalColor + "), 반지 호수(" + finalrSize + ")]\n각인 내용 : [" + letter + "]\n폰트 명 : [" +
                                fontstyle1.getFontName() + "]" + "\n커플링 반지 : [반지 호수(" + finalcprSize + ")]\n각인 내용 : [" + cpletter +
                                "]\n폰트 명 : [" + fontstyle1.getFontName() + "]\n 총 가격 :" + finalPrice + "원입니다.", "주문 완료", JOptionPane.INFORMATION_MESSAGE);
                        setVisible(true);


                    }
                });

            }
            //font2(바탕)버튼이 눌릴 때
            if (e.getSource() == font2) {
                rletterTxtField.setFont(fontstyle2);
                cprletterTxtField.setFont(fontstyle2);
                String letter = rletterTxtField.getText().trim();
                String cpletter = cprletterTxtField.getText().trim();
                Order.addActionListener(event -> {
                    //주문자 레터링만 있는 경우
                    if (letter != "각인 내용" && cpletter.equals("커플링 각인 내용")) {
                        JOptionPane.showMessageDialog(null, "주문자 반지 :[원석 (" + finalStone + "), 디자인(" + finalDesign
                                + "), 색상(" + finalColor + "), 반지 호수(" + finalrSize + ")]\n각인 내용 : ["
                                + letter + "]\n 폰트 명 : [" + fontstyle2.getFontName()
                                + "]\n총 가격 :" + finalPrice, "주문 완료", JOptionPane.INFORMATION_MESSAGE);
                        setVisible(true);
                    }
                    //주문자 레터링 없고 커플링 레터링만 있는 경우
                    if (cpletter != "커플링 각인 내용" && letter.equals("각인 내용"))
                        JOptionPane.showMessageDialog(null, "주문자 반지 :[원석 (" + finalStone + "), 디자인(" + finalDesign
                                + "), 색상(" + finalColor + "), 반지 호수(" + finalrSize + ")]\n각인 내용 : [" + cpletter + "]\n폰트 명 : [" +
                                fontstyle2.getFontName() + "]" + "\n커플링 반지 : [반지 호수(" + finalcprSize + ")]\n 총 가격 :" + finalPrice + "원입니다.", "주문 완료", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(true);
                    //주문자 커플링 레터링 둘 다 있을 경우
                    if (letter != "각인 내용" && cpletter != "커플링 각인 내용") {
                        JOptionPane.showMessageDialog(null, "주문자 반지 :[원석 (" + finalStone + "), 디자인(" + finalDesign
                                + "), 색상(" + finalColor + "), 반지 호수(" + finalrSize + ")]\n각인 내용 : [" + letter + "]\n폰트 명 : [" +
                                fontstyle2.getFontName() + "]" + "\n커플링 반지 : [반지 호수(" + finalcprSize + ")]\n각인 내용 : [" + cpletter +
                                "]\n폰트 명 : [" + fontstyle2.getFontName() + "]\n 총 가격 :" + finalPrice + "원입니다.", "주문 완료", JOptionPane.INFORMATION_MESSAGE);
                        setVisible(true);
                    }
                });
            }
        }
    }





    public class RoundedButton extends JButton {
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
            Color o = new Color(50, 50, 112); //글자색 결정
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

    public class RoundJTextField extends JTextField {
        private Shape shape;

        public RoundJTextField(int size) {
            super(size);
            setOpaque(false); // As suggested by @AVD in comment.
        }

        protected void paintComponent(Graphics g) {
            g.setColor(getBackground());
            g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
            super.paintComponent(g);
        }

        protected void paintBorder(Graphics g) {
            g.setColor(getForeground());
            g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
        }

        public boolean contains(int x, int y) {
            if (shape == null || !shape.getBounds().equals(getBounds())) {
                shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
            }
            return shape.contains(x, y);
        }
    }

}


