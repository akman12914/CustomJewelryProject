
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

    JLabel stMeanLabel = null;
    String finalStone = null;
    String finalColor = null;
    String finalDesign = null;

    String finalCarat = null;
    String finalRSize = null;
    int finalPrice = 0;
    Font fontStyle1 = new Font("궁서", Font.BOLD, 30);
    Font fontStyle2 = new Font("바탕", Font.BOLD, 30);
    Font fontStyle3 = new Font("굴림",Font.BOLD,30);
    Font fontStyle4 = new Font("맑은 고딕",Font.BOLD,30);
    Font fontStyle5 = new Font("굵은안상수체",Font.BOLD,30);
    Font fontStyle6 = new Font("한컴 쿨재즈 B",Font.BOLD,30);






    String stones[] = {"가넷(1월)", "자수정(2월)", "아쿠아마린(3월)", "다이아몬드(4월)", "에메랄드(5월)", "진주(6월)", "루비(7월)",
            "페리도트(8월)", "사파이어(9월)", "오팔(10월)", "토파즈(11월)", "터키석(12월)"};
    String means[] = {"진실, 우애, 정조", "평화, 성실", "젊음, 총명, 침착", "사랑, 순결, 신념",
            "행운, 연애, 행복", "부귀, 장수, 건강", "사랑, 진실, 정조", "화합, 부부애정", "성실, 지혜, 자애",
            "희망, 안락, 인내", "건강, 우정, 희망, 결백", "성공, 번영, 불굴"};
    String colors[] = {"실버", "골드", "로즈골드"};
    String sizes[] = {"1호(44mm)", "2호(45mm)", "3호(46mm)", "4호(47mm)", "5호(47.5mm)", "6호(48.5mm)",
            "7호(49mm)", "8호(50mm)*여성 추천*", "9호(51mm)*여성 추천*", "10호(52mm)*여성 추천*", "11호(53.5mm)*여성 추천*", "12호(54.5mm)", "13호(55.5mm)", "14호(56.5mm)",
            "15호(57.5mm)", "16호(58.5mm)*남성 추천*", "17호(60mm)*남성 추천*", "18호(61.5mm)*남성 추천*", "19호(62.5mm)*남성 추천*", "20호(63.5mm)*남성 추천*", "21호(65mm)", "22호(66mm)",
            "23호(67mm)", "24호(68mm)", "25호(69mm)", "26호(70mm)", "27호(71mm)", "28호(72mm)", "29호(73mm)", "30호(74mm)"};
    ImageIcon[] fontImage = {new ImageIcon("./FontImage/font1.jpg"),new ImageIcon("./FontImage/font2.jpg"),
            new ImageIcon("./FontImage/font3.jpg"),new ImageIcon("./FontImage/font4.jpg"),
            new ImageIcon("./FontImage/font5.jpg"),new ImageIcon("./FontImage/font6.jpg"),};





    //JTextField resultTF = new JTextField("0", 20);
    //상단 패널 안에 원석, 캐럿, 원석명, 가격, 색상, 색상명, 디자인, 디자인명의 패널 추가
    JPanel TopPanel = new JPanel(new GridLayout(1, 3));
    JPanel stPanel = new JPanel(new GridLayout(2, 1));
    JPanel coPanel = new JPanel(new GridLayout(1, 1));
    JPanel dePanel = new JPanel(new GridLayout(1, 1));
    JLabel stone_txtLabel;
    JLabel caratLabel;
    JLabel color_txtLabel;

    JLabel design_txtLabel;




    //중간에 위치한 텍스트 패널에 반지호수, 각인, 체크박스 패널을 추가(rletter는 주문자 반지각인)
    JPanel textPanel = new JPanel(new GridLayout(2, 1));
    JPanel ringSize_txtPanel = new JPanel(new GridLayout(3, 1));
    JPanel sizeComboPanel = new JPanel();
    JComboBox sizeCombo = new JComboBox(sizes);



    JTextField rLetter_TxtField = new JTextField("각인 내용", 5);

//하부에 위치한 각인 위치 내부 외부 체크박스와 텍스트필드, 폰트버튼 추가
    JPanel rCheckPanel = new JPanel(new GridLayout(1, 2));
    JCheckBox chk1 = new JCheckBox("내부");
    JCheckBox chk2 = new JCheckBox("외부");
    JPanel fontPanel = new JPanel(new GridLayout(2, 3));
    JButton font1 = new JButton();
    JButton font2 = new JButton();
    JButton font3 = new JButton();
    JButton font4 = new JButton();
    JButton font5 = new JButton();
    JButton font6 = new JButton();


    //하단에 위치한 bottomPanel에  폰트 패널과 주문 패널을 추가, 각 패널에 폰트 버튼과 주문버튼 추가
    JPanel bottomPanel = new JPanel(new GridLayout(2, 1));
    JPanel orderPanel = new JPanel(new GridLayout(1 ,2));
    JLabel totalPricePanel;
    RoundedButton Order = new RoundedButton("주문하기");
    RoundedButton Main = new RoundedButton("홈으로 돌아가기");



    public OrderBasket(String finalDesign, String finalColor, String finalStone, String finalCarat, int finalPrice) {
        this.finalStone = finalStone;
        this.finalColor = finalColor;
        this.finalCarat = finalCarat;
        this.finalDesign = finalDesign;
        this.finalPrice = finalPrice;
        int total = finalPrice;

        stone_txtLabel = new JLabel("선택한 원석: " + this.finalStone, SwingConstants.CENTER);
        caratLabel = new JLabel("선택한 캐럿: " + this.finalCarat, SwingConstants.CENTER);
        color_txtLabel = new JLabel("선택한 반지 색상: " + this.finalColor, SwingConstants.CENTER);
        design_txtLabel = new JLabel("선택한 디자인: " + this.finalDesign, SwingConstants.CENTER);
        totalPricePanel = new JLabel("총 가격 : " + total, SwingConstants.CENTER);


//선택된 stone에 따라 탄생석 의미 라벨에 추가
        for(int i=0; i<12; i++) {
            if (stones[i].equals(finalStone))
                stMeanLabel = new JLabel(means[i], SwingConstants.CENTER);
        }


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
        ringSize_txtPanel.setBounds(100, 100, 100, 10);
        sizeComboPanel.setBounds(100, 100, 250, 10);
        sizeCombo.setPreferredSize(new Dimension(200, 50));

        //중간 패널의 체크박스 패널, 체크박스 크기 지정
        rCheckPanel.setPreferredSize(new Dimension(50, 10));
        chk1.setPreferredSize(new Dimension(5, 5));
        chk2.setPreferredSize(new Dimension(5, 5));

        //폰트 버튼 크기 지정
        font1.setPreferredSize(new Dimension(100, 50));
        font2.setPreferredSize(new Dimension(100, 50));


        orderPanel.setBounds(100, 100, 100, 100);
        Order.setPreferredSize(new Dimension(100, 50));


        pane.add(TopPanel, BorderLayout.PAGE_START);
        pane.add(textPanel, BorderLayout.CENTER);
        pane.add(bottomPanel, BorderLayout.PAGE_END);

        //상단 패널의 아이템 목록 경계선 추가
        TopPanel.setBorder(itemBorder);
        stPanel.setBorder(stBorder);
        coPanel.setBorder(coBorder);
        dePanel.setBorder(deBorder);
        TopPanel.add(stPanel, BorderLayout.EAST);
        TopPanel.add(coPanel, BorderLayout.SOUTH);
        TopPanel.add(dePanel, BorderLayout.WEST);

        stPanel.add(stone_txtLabel);
        stPanel.add(stMeanLabel, BorderLayout.CENTER);

        coPanel.add(color_txtLabel);
        dePanel.add(design_txtLabel);


        textPanel.setBorder(textBorder);
        textPanel.add(ringSize_txtPanel);
        textPanel.add(fontPanel);

        ringSize_txtPanel.add(sizeComboPanel);
        sizeComboPanel.add(sizeCombo);


        rLetter_TxtField.setBounds(10, 10, 50, 50);

        ringSize_txtPanel.add(rLetter_TxtField);


        ringSize_txtPanel.add(rCheckPanel);
        rCheckPanel.add(chk1, BorderLayout.EAST);
        rCheckPanel.add(chk2, BorderLayout.WEST);


        fontPanel.add(font1);
        fontPanel.add(font2);
        fontPanel.add(font3);
        fontPanel.add(font4);
        fontPanel.add(font5);
        fontPanel.add(font6);

        bottomPanel.add(Order, BorderLayout.CENTER);

        bottomPanel.add(totalPricePanel);
        bottomPanel.add(orderPanel);
        orderPanel.add(Order, BorderLayout.EAST);
        orderPanel.add(Main, BorderLayout.WEST);

        sizeCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rsize = sizeCombo.getSelectedItem().toString();
                finalRSize = rsize;

            }
        });

//각인 내용 입력후 각 폰트 클릭시 변경되는 클릭이벤트
        font1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rLetter_TxtField.setFont(fontStyle1);
            }
        });
        font2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rLetter_TxtField.setFont(fontStyle2);
            }
        });

        font3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rLetter_TxtField.setFont(fontStyle3);
            }
        });
        font4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rLetter_TxtField.setFont(fontStyle4);
            }
        });
        font5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rLetter_TxtField.setFont(fontStyle5);
            }
        });
        font6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rLetter_TxtField.setFont(fontStyle6);
            }
        });
        //주문 버튼 클릭시 각인내용 유무에 따른 이벤트(다이얼로그 주문내역 출력)
        Order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String letter = rLetter_TxtField.getText().trim();

                if (!letter.equals("각인 내용")) {
                    JOptionPane.showMessageDialog(null, "주문자 반지 :[원석 (" + finalStone + "), 디자인(" + finalDesign
                            + "), 색상(" + finalColor + "), 반지 호수(" + finalRSize + ")]\n각인 내용 : ["
                            + letter + "]\n 총 가격 :" + finalPrice, "주문 완료", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(true);
                }

                if (letter.equals("각인 내용"))
                    JOptionPane.showMessageDialog(null, "주문자 반지 :[원석 (" + finalStone + "), 디자인(" + finalDesign
                            + "), 색상(" + finalColor + "), 반지 호수(" + finalRSize + ")]\n총 가격 :" + finalPrice + "원입니다.", "주문 완료", JOptionPane.INFORMATION_MESSAGE);
                setVisible(true);


            }
        });
        //시작화면으로 돌아가는 버튼 이벤트
        Main.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIMain frame = new GUIMain();
                frame.createAndShowGUI();
            }
        });


        FocusEvent();
//font버튼에 이미지 추가하기
        fontIcon(font1, fontImage[0]);
        fontIcon(font2, fontImage[1]);
        fontIcon(font3, fontImage[2]);
        fontIcon(font4, fontImage[3]);
        fontIcon(font5, fontImage[4]);
        fontIcon(font6,fontImage[5]);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1920, 1280));
        pack();
        setVisible(true);

    }

//각 주문 목록에 경계선 추가
    Border itemBorder = BorderFactory.createTitledBorder("주문목록");
    Border textBorder = BorderFactory.createTitledBorder("입력목록");
    Border stBorder = BorderFactory.createTitledBorder("선택한 원석");
    Border coBorder = BorderFactory.createTitledBorder("선택한 색상");
    Border deBorder = BorderFactory.createTitledBorder("선택한 디자인");


    //폰트 버튼 이미지 아이콘 크기 및 이미지아이콘 변환
    void fontIcon(JButton j, ImageIcon i) {
        Image img;
        img = i.getImage();
        Image changeImg = img.getScaledInstance(510, 280, Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(changeImg);
        j.setIcon(changeIcon);

    }

//각인 내용 텍스트 필드 입력시 '각인내용' 없애는 기능
    private void FocusEvent() {
        rLetter_TxtField.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e) {
                if (rLetter_TxtField.getText().trim().length() == 0) {
                    rLetter_TxtField.setText("각인 내용");
                }

            }

            @Override
            public void focusGained(FocusEvent e) {
                if (rLetter_TxtField.getText().trim().equals("각인 내용")) {
                    rLetter_TxtField.setText("");
                }
            }
        });

    }

//버튼 디자인
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
            Color c = new Color(38, 48, 58); //배경색 결정
            Color o = new Color(250, 250, 250); //글자색 결정
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



