package jewely_demo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.Serial;

import java.awt.Checkbox;
import javax.swing.*;
import javax.swing.border.Border;




public class OrderBasket extends JFrame {

    @Serial
    private static final long serialVersionUID = 1L;
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
    JButton reSelect = new JButton("선택 수정하기");
    JButton Order = new JButton("주문하기");


    ImageIcon stoneImg = new ImageIcon("다이아몬드.jpg");
    ImageIcon colorImg = new ImageIcon("gold.jpg");
    ImageIcon designImg = new ImageIcon("bold.jfif");
    JLabel stoneimgLabel = new JLabel(stoneImg);
    JLabel colorimgLabel = new JLabel(colorImg);
    JLabel designimgLabel = new JLabel(designImg);
    JLabel stonetxtLabel = new JLabel("4월 다이아몬드 : 100000원",SwingConstants.CENTER);
    JLabel colortxtLabel = new JLabel("Gold 색상 : 15000원",SwingConstants.CENTER);
    JLabel designtxtLabel = new JLabel("Bold Design : 20000원",SwingConstants.CENTER);
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
        textPanel.add(new JTextField("호수", 2));
        textPanel.add(new JLabel("커플링 호수: "));
        textPanel.add(new JTextField("커플링 호수", 2));
        textPanel.add(new JLabel("각인: "));
        textPanel.add(new JTextField("각인 내용", 10));
        textPanel.add(new JLabel("커플링 각인: "));
        textPanel.add(new JTextField("커플링 각인 내용", 10));
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

    public static void main(String[] args) {
        OrderBasket frame = new OrderBasket();
        frame.createAndShowGUI();
    }



    class ButtonListenerpopup implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == reSelect) {
                JOptionPane.showMessageDialog(null, "선택 화면으로 돌아갑니다.", "message", JOptionPane.INFORMATION_MESSAGE);
            }
            if (e.getSource() == Order) {
                JOptionPane.showMessageDialog(null, "주문이 완료 되었습니다.", "message", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }


}
