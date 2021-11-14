package jewely_demo;

import store.Recommend;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.geom.RoundRectangle2D;
import java.io.Serial;

import java.awt.Checkbox;
import javax.swing.*;
import javax.swing.border.Border;




public class OrderBasket extends JFrame {

    @Serial
    private static final long serialVersionUID = 1L;

    String finalStone;
    public OrderBasket(String finalStone) {
        this.finalStone = finalStone;
    }

    //JTextField resultTF = new JTextField("0", 20);
    JPanel TopPanel = new JPanel(new GridLayout(1, 3));
    JPanel stPanel = new JPanel(new GridLayout(2,1));
    JPanel coPanel = new JPanel(new GridLayout(2,1));
    JPanel dePanel = new JPanel(new GridLayout(2,1));

    JPanel textPanel = new JPanel(new GridLayout(3, 4));
    JLabel blankLabel = new JLabel();
    JPanel ucheckLabel = new JPanel(new GridLayout(1,2));
    JLabel blankLabel2 = new JLabel();
    JPanel ucheckLabel2 = new JPanel(new GridLayout(1,2));

    JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
    RoundedButton reSelect = new RoundedButton("선택 수정하기");
    RoundedButton Order = new RoundedButton("주문하기");


    ImageIcon stoneImg = new ImageIcon("bold.jfif");
    ImageIcon colorImg = new ImageIcon("bold.jfif");
    ImageIcon designImg = new ImageIcon("bold.jfif");

    JLabel stoneimgLabel = new JLabel(stoneImg);
    JLabel colorimgLabel = new JLabel(colorImg);
    JLabel designimgLabel = new JLabel(designImg);
    JLabel stonetxtLabel = new JLabel("<html>4월 다이아몬드<br>순결,고귀,용기,신념<p>120000원</html>",SwingConstants.CENTER);
    JLabel colortxtLabel = new JLabel("<html>Gold<br><p>25000원</html>",SwingConstants.CENTER);
    JLabel designtxtLabel = new JLabel("<html>Bold design<br><p>20000원</html>",SwingConstants.CENTER);
    JCheckBox chk1 = new JCheckBox("내부");
    JCheckBox chk2 = new JCheckBox("외부");
    JCheckBox chk3 = new JCheckBox("커플내부");
    JCheckBox chk4 = new JCheckBox("커플외부");

    Border itemborder = BorderFactory.createTitledBorder("주문목록");
    Border textborder = BorderFactory.createTitledBorder("입력목록");
    Border stoneborder = BorderFactory.createTitledBorder("선택한 원석");
    Border colorborder = BorderFactory.createTitledBorder("선택한 색상");
    Border designborder = BorderFactory.createTitledBorder("선택한 디자인");

    public void addComponentsTopane() {
        setTitle("basket");
        Container pane = getContentPane();
        TopPanel.setPreferredSize(new Dimension(400, 400));
        textPanel.setPreferredSize(new Dimension(50, 300));
        bottomPanel.setPreferredSize(new Dimension(100, 50));

        pane.add(TopPanel, BorderLayout.PAGE_START);
        pane.add(textPanel, BorderLayout.CENTER);
        pane.add(bottomPanel, BorderLayout.PAGE_END);

        TopPanel.setBorder(itemborder);
        stPanel.setBorder(stoneborder);
        coPanel.setBorder(colorborder);
        dePanel.setBorder(designborder);
        TopPanel.add(stPanel, BorderLayout.EAST);
        TopPanel.add(coPanel, BorderLayout.SOUTH);
        TopPanel.add(dePanel, BorderLayout.WEST);
        stPanel.add(stoneimgLabel);
        stPanel.add(stonetxtLabel);
        coPanel.add(colorimgLabel);
        coPanel.add(colortxtLabel);
        dePanel.add(designimgLabel);
        dePanel.add(designtxtLabel);

        textPanel.setBorder(textborder);
        textPanel.add(new JLabel("호수: "));
        textPanel.add(new RoundJTextField(2));
        textPanel.add(new JLabel("커플링 호수: "));
        textPanel.add(new RoundJTextField(2));
        textPanel.add(new JLabel("각인: "));
        textPanel.add(new RoundJTextField( 10));
        textPanel.add(new JLabel("커플링 각인: "));
        textPanel.add(new RoundJTextField(10));
        textPanel.add(blankLabel);
        textPanel.add(ucheckLabel);
        ucheckLabel.add(chk1,BorderLayout.EAST);
        ucheckLabel.add(chk2,BorderLayout.WEST);
        textPanel.add(blankLabel2);
        textPanel.add(ucheckLabel2);
        ucheckLabel2.add(chk3,BorderLayout.EAST);
        ucheckLabel2.add(chk4,BorderLayout.WEST);

        bottomPanel.add(reSelect, BorderLayout.WEST);
        bottomPanel.add(Order, BorderLayout.EAST);




        ActionListener listenerpopup = new ButtonListenerpopup();
        reSelect.addActionListener(listenerpopup);
        Order.addActionListener(listenerpopup);


    }

    void createAndShowGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addComponentsTopane();
        setPreferredSize(new Dimension(800, 800));
        pack();
        setVisible(true);
    }



    class ButtonListenerpopup implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == reSelect) {
                JOptionPane.showMessageDialog(null, "선택 화면으로 돌아갑니다.", "message",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            if (e.getSource() == Order) {
                JOptionPane.showMessageDialog(null, "주문이 완료 되었습니다.", "message", JOptionPane.INFORMATION_MESSAGE);
                Recommend rec = new Recommend(finalStone);
                setVisible(false);

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
            Color o=new Color(220,99,12); //글자색 결정
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