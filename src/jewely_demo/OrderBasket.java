
package jewely_demo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.io.Serial;

import javax.swing.*;
import javax.swing.border.Border;




public class OrderBasket extends JFrame {




    Image lookImage = null;
    Image lookcoImage = null;
    Image lookdeImage = null;
    Image changeImg = null;
    Image changecoImg =null;
    Image changedeImg = null;
    ImageIcon afterImg =  null;
    ImageIcon aftercoImg = null;
    ImageIcon afterdeImg = null;
    JLabel lookLabel = null;
    JLabel lookcoLabel = null;
    JLabel lookdeLabel = null;
    JLabel stmeanLabel = null;

    @Serial
    private static final long serialVersionUID = 1L;

    String finalStone = null;
    int finalStoneprice = 0;
    String finalColor = null;
    int finalColorprice = 0;
    String finalDesign = null;
    int finalDesignprice = 0;





    //JTextField resultTF = new JTextField("0", 20);
    JPanel TopPanel = new JPanel(new GridLayout(1, 3));
    JPanel stPanel = new JPanel(new GridLayout(4,1));
    JPanel coPanel = new JPanel(new GridLayout(3,1));
    JPanel dePanel = new JPanel(new GridLayout(3,1));


    JPanel textPanel = new JPanel(new GridLayout(3, 4));
    JPanel ucheckLabel = new JPanel(new GridLayout(1,2));
    JLabel blankLabel2 = new JLabel();
    JPanel ucheckLabel2 = new JPanel(new GridLayout(1,2));
    RoundedButton chartButton = new RoundedButton("반지 호수표 확인하기");

    JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
    RoundedButton Order = new RoundedButton("주문하기");

    String stones[] = {"가넷(1월)", "자수정(2월)", "아쿠아마린(3월)", "다이아몬드(4월)", "에메랄드(5월)", "진주(6월)", "루비(7월)",
            "페리도트(8월)", "사파이어(9월)", "오팔(10월)", "토파즈(11월)", "터키석(12월)"};
    String means[] = {"진실, 우애, 정조", "평화, 성실","젊음, 총명, 침착","사랑, 순결, 신념",
            "행운, 연애, 행복","부귀, 장수, 건강","사랑, 진실, 정조","화합, 부부애정","성실, 지혜, 자애",
            "희망, 안락, 인내","건강, 우정, 희망, 결백","성공, 번영, 불굴"};
    String designs[] = {"bold", "thin", "wave"};
    String colors[] ={"실버", "골드", "로즈골드"};
    ImageIcon[] beforeallImage = {
            new ImageIcon("./StoneImage/가넷.jpg"), new ImageIcon("./StoneImage/자수정.jpg"),
            new ImageIcon("./StoneImage/아쿠아마린.jpg"), new ImageIcon("./StoneImage/다이아몬드.jpg"),
            new ImageIcon("./StoneImage/에메랄드.jpg"), new ImageIcon("./StoneImage/진주.jpg"),
            new ImageIcon("./StoneImage/루비.jpg"), new ImageIcon("./StoneImage/페리도트.jpg"),
            new ImageIcon("./StoneImage/사파이어.jpg"),  new ImageIcon("./StoneImage/오팔.jpg"),
            new ImageIcon("./StoneImage/토파즈.jpg"), new ImageIcon("./StoneImage/터키석.jpg")};
    ImageIcon[] beforecoImage = {new ImageIcon("./RingColorImage/실버.PNG"),new ImageIcon("./RingColorImage/골드.PNG"),new ImageIcon("./RingColorImage/로즈골드.PNG")  };

    ImageIcon[] beforedeImage = {new ImageIcon("./DesignImage/thindesign.jpg"),new ImageIcon("./DesignImage/wavedesign.jfif"),new ImageIcon("./DesignImage/bold.jfif")};

    //    ImageIcon stoneImg = new ImageIcon("bold.jfif");
//    ImageIcon colorImg = new ImageIcon("bold.jfif");
//    ImageIcon designImg = new ImageIcon("bold.jfif");
    ImageIcon ringChart = new ImageIcon("ringsizechart.jpg");
    JLabel stoneimgLabel;
    JLabel colorimgLabel;
    JLabel designimgLabel;
    JLabel stonetxtLabel;





    public OrderBasket(String finalDesign, String finalColor, String finalStone, String finalCarat) {
        this.finalStone = finalStone;
        stonetxtLabel = new JLabel("선택한 원석: "+this.finalStone, SwingConstants.CENTER);
        if (stones[0].equals(finalStone)) {
            stoneimgLabel = new JLabel(beforeallImage[0]);
            lookImage = beforeallImage[0].getImage();
            stmeanLabel = new JLabel(means[0], SwingConstants.CENTER);
        }
        if (stones[1].equals(finalStone)) {
            stoneimgLabel = new JLabel(beforeallImage[1]);
            lookImage = beforeallImage[1].getImage();
            stmeanLabel = new JLabel(means[1], SwingConstants.CENTER);
        }
        if (stones[2].equals(finalStone)) {
            stoneimgLabel = new JLabel(beforeallImage[2]);
            lookImage = beforeallImage[2].getImage();
            stmeanLabel = new JLabel(means[2], SwingConstants.CENTER);
        }
        if (stones[3].equals(finalStone)) {
            stoneimgLabel = new JLabel(beforeallImage[3]);
            lookImage = beforeallImage[3].getImage();
            stmeanLabel = new JLabel(means[3], SwingConstants.CENTER);
        }
        if (stones[4].equals(finalStone)) {
            stoneimgLabel = new JLabel(beforeallImage[4]);
            lookImage = beforeallImage[4].getImage();
            stmeanLabel = new JLabel(means[4], SwingConstants.CENTER);
        }
        if (stones[5].equals(finalStone)) {
            stoneimgLabel = new JLabel(beforeallImage[5]);
            lookImage = beforeallImage[5].getImage();
            stmeanLabel = new JLabel(means[5], SwingConstants.CENTER);
        }
        if (stones[6].equals(finalStone)) {
            stoneimgLabel = new JLabel(beforeallImage[6]);
            lookImage = beforeallImage[6].getImage();
            stmeanLabel = new JLabel(means[6], SwingConstants.CENTER);
        }
        if (stones[7].equals(finalStone)) {
            stoneimgLabel = new JLabel(beforeallImage[7]);
            lookImage = beforeallImage[7].getImage();
            stmeanLabel = new JLabel(means[7], SwingConstants.CENTER);
        }
        if (stones[8].equals(finalStone)) {
            stoneimgLabel = new JLabel(beforeallImage[8]);
            lookImage = beforeallImage[8].getImage();
            stmeanLabel = new JLabel(means[8], SwingConstants.CENTER);
        }
        if (stones[9].equals(finalStone)) {
            stoneimgLabel = new JLabel(beforeallImage[9]);
            lookImage = beforeallImage[9].getImage();
            stmeanLabel = new JLabel(means[9], SwingConstants.CENTER);
        }
        if (stones[10].equals(finalStone)) {
            stoneimgLabel = new JLabel(beforeallImage[10]);
            lookImage = beforeallImage[10].getImage();
            stmeanLabel = new JLabel(means[10], SwingConstants.CENTER);
        }
        if (stones[11].equals(finalStone)) {
            stoneimgLabel = new JLabel(beforeallImage[11]);
            lookImage = beforeallImage[11].getImage();
            stmeanLabel = new JLabel(means[11], SwingConstants.CENTER);
        }

    }

    public  void colorOrderBasket(String finalColor){
        this.finalColor = finalColor;
        if (colors[0].equals(finalColor)) {
            colorimgLabel = new JLabel(beforecoImage[0]);
            lookcoImage = beforecoImage[0].getImage();
        }
        if (colors[1].equals(finalColor)) {
            colorimgLabel = new JLabel(beforecoImage[1]);
            lookcoImage = beforecoImage[2].getImage();
        }
        if (colors[3].equals(finalColor)) {
            colorimgLabel = new JLabel(beforecoImage[3]);
            lookcoImage = beforecoImage[3].getImage();
        }


    }
    public void designOrderBasket(String finalDesign){
        this.finalDesign = finalDesign;

        if (designs[0].equals(finalDesign)) {
            designimgLabel  = new JLabel(beforedeImage[0]);
            lookdeImage = beforedeImage[0].getImage();
        }

        if (designs[1].equals(finalDesign)) {
            designimgLabel  = new JLabel(beforedeImage[1]);
            lookdeImage = beforedeImage[1].getImage();
        }

        if (designs[2].equals(finalDesign)) {
            designimgLabel  = new JLabel(beforedeImage[2]);
            lookdeImage = beforedeImage[2].getImage();
        }

    }





    //JLabel stonetxtLabel = new JLabel("선택한 원석: "+this.finalStone, SwingConstants.CENTER);
    JLabel stonePLabel = new JLabel("원석 가격: "+finalStoneprice+"원", SwingConstants.CENTER);
    JLabel colortxtLabel = new JLabel("선택한 반지 색상: "+finalColor, SwingConstants.CENTER);
    JLabel colorPLabel = new JLabel("반지 가격: "+finalColorprice+"원", SwingConstants.CENTER);
    JLabel designtxtLabel = new JLabel("선택한 디자인: "+finalDesign, SwingConstants.CENTER);
    JLabel designPLabel = new JLabel("디자인 가격: "+finalDesignprice+"원", SwingConstants.CENTER);
    JCheckBox chk1 = new JCheckBox("내부");
    JCheckBox chk2 = new JCheckBox("외부");
    JCheckBox chk3 = new JCheckBox("커플내부");
    JCheckBox chk4 = new JCheckBox("커플외부");


    Border itemborder = BorderFactory.createTitledBorder("주문목록");
    Border textborder = BorderFactory.createTitledBorder("입력목록");
    Border stborder = BorderFactory.createTitledBorder("선택한 원석");
    Border coborder = BorderFactory.createTitledBorder("선택한 색상");
    Border deborder = BorderFactory.createTitledBorder("선택한 디자인");







    public void addComponentsTopane() {
        if ( lookImage != null ) {
            changeImg = lookImage.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            afterImg = new ImageIcon(changeImg);
            lookLabel = new JLabel(afterImg);
        }
        if ( lookcoImage != null ) {
            changecoImg = lookcoImage.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            aftercoImg = new ImageIcon(changecoImg);
            lookcoLabel = new JLabel(aftercoImg);
        }
        if ( lookdeImage != null ) {
            changedeImg = lookdeImage.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            afterdeImg = new ImageIcon(changedeImg);
            lookdeLabel = new JLabel(afterdeImg);
        }


        setTitle("basket");
        Container pane = getContentPane();
        TopPanel.setPreferredSize(new Dimension(400, 400));
        textPanel.setPreferredSize(new Dimension(50, 300));
        bottomPanel.setPreferredSize(new Dimension(100, 50));

        pane.add(TopPanel, BorderLayout.PAGE_START);
        pane.add(textPanel, BorderLayout.CENTER);
        pane.add(bottomPanel, BorderLayout.PAGE_END);

        TopPanel.setBorder(itemborder);
        stPanel.setBorder(stborder);
        coPanel.setBorder(coborder);
        dePanel.setBorder(deborder);
        TopPanel.add(stPanel, BorderLayout.EAST);
        TopPanel.add(coPanel, BorderLayout.SOUTH);
        TopPanel.add(dePanel, BorderLayout.WEST);
        lookLabel.setBounds(100, 100, 250, 250);
        stPanel.add(lookLabel);
        stPanel.add(stonetxtLabel);
        stPanel.add(stonePLabel);
        stPanel.add(stmeanLabel, BorderLayout.CENTER);
//        lookcoLabel.setBounds(100, 100, 250, 250);
//        coPanel.add(lookcoLabel);
        coPanel.add(colortxtLabel);
        coPanel.add(colorPLabel);
//        lookdeLabel.setBounds(100, 100, 250, 250);
//        dePanel.add(lookdeLabel);
        dePanel.add(designtxtLabel);
        dePanel.add(designPLabel);

        textPanel.setBorder(textborder);
        textPanel.add(new JLabel("호수: "));
        textPanel.add(new RoundJTextField(2));
        textPanel.add(new JLabel("커플링 호수: "));
        textPanel.add(new RoundJTextField(2));
        textPanel.add(new JLabel("각인: "));
        textPanel.add(new RoundJTextField( 10));
        textPanel.add(new JLabel("커플링 각인: "));
        textPanel.add(new RoundJTextField(10));
        textPanel.add(chartButton,BorderLayout.WEST);
        textPanel.add(ucheckLabel);
        ucheckLabel.add(chk1,BorderLayout.EAST);
        ucheckLabel.add(chk2,BorderLayout.WEST);
        textPanel.add(blankLabel2);
        textPanel.add(ucheckLabel2);
        ucheckLabel2.add(chk3,BorderLayout.EAST);
        ucheckLabel2.add(chk4,BorderLayout.WEST);


        bottomPanel.add(Order, BorderLayout.CENTER);




        ActionListener listenerpopup = new ButtonListenerpopup();

        Order.addActionListener(listenerpopup);
        chartButton.addActionListener(listenerpopup);


    }

    public void createAndShowGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addComponentsTopane();
        setPreferredSize(new Dimension(1920, 1280));
        pack();
        setVisible(true);
    }



    class ButtonListenerpopup implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == Order) {
                JOptionPane.showMessageDialog(null, finalStone+"원석, "+finalDesign+"반지 디자인, "+finalColor+"색상의 반지주문이 완료 되었습니다.", "주문 완료",
                        JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);

            }
            if(e.getSource() == chartButton){
                JOptionPane.showMessageDialog(null, "", "반지 호수표",
                        JOptionPane.INFORMATION_MESSAGE,ringChart);

            }


        }
    }



    public class RoundedButton extends JButton {
        public RoundedButton() { super(); decorate(); }
        public RoundedButton(String text) { super(text); decorate(); }
        public RoundedButton(Action action) { super(action); decorate(); }
        public RoundedButton(Icon icon) { super(icon); decorate(); }
        public RoundedButton(String text, Icon icon) { super(text, icon); decorate(); }
        protected void decorate() { setBorderPainted(false); setOpaque(false); }
        @Override
        protected void paintComponent(Graphics g) {
            Color c=new Color(255,247,242); //배경색 결정
            Color o=new Color(50,50,112); //글자색 결정
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (getModel().isArmed()) { graphics.setColor(c.darker()); }
            else if (getModel().isRollover()) { graphics.setColor(c.brighter()); }
            else { graphics.setColor(c); }
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
            g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
            super.paintComponent(g);
        }
        protected void paintBorder(Graphics g) {
            g.setColor(getForeground());
            g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
        }
        public boolean contains(int x, int y) {
            if (shape == null || !shape.getBounds().equals(getBounds())) {
                shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
            }
            return shape.contains(x, y);
        }
    }

}