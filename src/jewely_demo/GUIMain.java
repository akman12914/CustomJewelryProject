package jewely_demo;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import facade.DataEngineInterface;
import store.JewelryStore;

import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class GUIMain extends JFrame{

    String design[] = {"다이애나반지", "메리반지", "모던반지", "모어데이반지", "바코드반지", "박스큐빅반지","시계반지",
            "썸타임반지", "애프터레인반지", "월계수반지", "큐빅반지", "타임큐빅반지","투웨이반지","팅커반지","포에버반지"};
    String finalDesign = null;
    String finalOrderId = null;
    ImageIcon design0;
    ImageIcon design1;
    ImageIcon design2;
    ImageIcon design3;
    ImageIcon design4;
    ImageIcon design5;
    ImageIcon design6;
    ImageIcon design7;
    ImageIcon design8;
    ImageIcon design9;
    ImageIcon design10;
    ImageIcon design11;
    ImageIcon design12;
    ImageIcon design13;
    ImageIcon design14;
    public String name;
    String detailId = null;
    static JewelryStore store = JewelryStore.getInstance();
    //JScrollPane scrollPane;
    ImageIcon icon = new ImageIcon("start.png");
    JPanel background = new JPanel() {
        public void paintComponent(Graphics g) {
            g.drawImage(icon.getImage(), 0, 0, null);
            setOpaque(false); //그림을 표시하게 설정,투명하게 조절
            super.paintComponent(g);
        }
    };

    JPanel mainPanel;
    JLabel designLabel = new JLabel();
    JLabel imageLabel = new JLabel();
    JPanel designPanel = new JPanel(new GridLayout(3,5));
    JLabel designPrint;
    JLabel descriptionPrint;
    RoundedButton2 detail = new RoundedButton2("주문내역");
    RoundedButton2 order = new RoundedButton2("보석선택");
    RoundedButton2 user = new RoundedButton2("확인");
    JTextField textPeriod;
    JTextField textPeriod2;
    JTextField textPeriod3;
    JLabel labelPeriod;
    JLabel labelPeriod2;
    JLabel labelPeriod3;


    public void addComponentsTopane() {
        setSize(1920,1080);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2, (windowSize.height - frameSize.height) / 2);
        designPanel.setBorder(BorderFactory.createEmptyBorder(10 , 10 , 30 , 230));
        //designPanel.setBorder(BorderFactory.createEmptyBorder(10 , 10 , 30 , 230));mainPanel = new JPanel();
        //mainPanel.setLayout(null);
        designPrint = new JLabel("반지 디자인 : 선택되지 않음");
        descriptionPrint = new JLabel("");
        JTextField textPeriod = new JTextField(5);
        JLabel labelPeriod = new JLabel("이름: ");
        //labelPeriod.setForeground(Color.white);
        name = textPeriod.getText();
        //Order od = new Order(name);
        JTextField textPeriod2 = new JTextField(5);
        JLabel labelPeriod2 = new JLabel("번호 : ");
        //labelPeriod2.setForeground(Color.white);
        JTextField textPeriod3 = new JTextField(5);
        JLabel labelPeriod3 = new JLabel("주소: ");
        //labelPeriod3.setForeground(Color.white);
        Font font = new Font("맑은 고딕",Font.PLAIN,20);

        //scrollPane = new JScrollPane(background);
        background.setLayout(null);
        //setContentPane(scrollPane);
        designPrint.setBounds(750,450,300,35);
        designPrint.setFont(font);
        designPanel.setBounds(0,500,1920,520);

        detail.setBounds(1470,47,150,25);
        detail.setFont(font);
        order.setBounds(1470, 97, 150, 25);
        order.setFont(font);
        textPeriod.setBounds(1240,157,200,25);
        textPeriod2.setBounds(1240,197,200,25);
        textPeriod3.setBounds(1240,237,200,25);
        labelPeriod.setBounds(1200,157,50,25);
        labelPeriod2.setBounds(1200,197,50,25);
        labelPeriod3.setBounds(1200,237,50,25);
        user.setBounds(1367,277,70,25);




        design0 = new ImageIcon("RingDesignImage/다이애나반지.jpg");
        design1 = new ImageIcon("RingDesignImage/메리반지.jpg");
        design2 = new ImageIcon("RingDesignImage/모던반지.jpg");
        design3 = new ImageIcon("RingDesignImage/모어데이반지.jpg");
        design4 = new ImageIcon("RingDesignImage/바코드반지.jpg");
        design5 = new ImageIcon("RingDesignImage/박스큐빅반지.jpg");
        design6 = new ImageIcon("RingDesignImage/시계반지.jpg");
        design7 = new ImageIcon("RingDesignImage/썸타임반지.jpg");
        design8 = new ImageIcon("RingDesignImage/애프터레인반지.jpg");
        design9 = new ImageIcon("RingDesignImage/원밸리반지.jpg");
        design10 = new ImageIcon("RingDesignImage/월계수반지.jpg");
        design11 = new ImageIcon("RingDesignImage/큐빅반지.jpg");
        design12 = new ImageIcon("RingDesignImage/타임큐빅반지.jpg");
        design13 = new ImageIcon("RingDesignImage/투웨이반지.jpg");
        design14 = new ImageIcon("RingDesignImage/팅커반지.jpg");

        //imageLabel.setIcon(design0);
        //imageLabel.setBounds(50,50,550,350);

        JButton design00 = new JButton("다이애나반지");
        JButton design01 = new JButton("메리반지");
        JButton design02 = new JButton("모던반지");
        JButton design03 = new JButton("모어데이반지");
        JButton design04 = new JButton("바코드반지");
        JButton design05 = new JButton("박스큐빅반지");
        JButton design06 = new JButton("시계반지");
        JButton design07 = new JButton("썸타임반지");
        JButton design08 = new JButton("애프터레인반지");
        JButton design09 = new JButton("원밸리반지");
        JButton design010 = new JButton("월계수반지");
        JButton design011 = new JButton("큐빅반지");
        JButton design012 = new JButton("타임큐빅반지");
        JButton design013 = new JButton("투웨이반지");
        JButton design014 = new JButton("팅커반지");

        finalSetIcon(design00,design0);
        finalSetIcon(design01,design1);
        finalSetIcon(design02,design2);
        finalSetIcon(design03,design3);
        finalSetIcon(design04,design4);
        finalSetIcon(design05,design5);
        finalSetIcon(design06,design6);
        finalSetIcon(design07,design7);
        finalSetIcon(design08,design8);
        finalSetIcon(design09,design9);
        finalSetIcon(design010,design10);
        finalSetIcon(design011,design11);
        finalSetIcon(design012,design12);
        finalSetIcon(design013,design13);
        finalSetIcon(design014,design14);

        designPanel.add(design00);
        designPanel.add(design01);
        designPanel.add(design02);
        designPanel.add(design03);
        designPanel.add(design04);
        designPanel.add(design05);
        designPanel.add(design06);
        designPanel.add(design07);
        designPanel.add(design08);
        designPanel.add(design09);
        designPanel.add(design010);
        designPanel.add(design011);
        designPanel.add(design012);
        designPanel.add(design013);
        designPanel.add(design014);
        //디자인 선택 버튼
        ActionListener listner = new DesignListenerCount();

        background.add(designPrint);
        background.add(designPanel);
        background.add(imageLabel);
        background.add(detail);
        background.add(order);
        background.add(user);
        background.add(textPeriod);
        background.add(textPeriod2);
        background.add(textPeriod3);
        background.add(labelPeriod);
        background.add(labelPeriod2);
        background.add(labelPeriod3);

        design00.addActionListener(listner);
        design01.addActionListener(listner);
        design02.addActionListener(listner);
        design03.addActionListener(listner);
        design04.addActionListener(listner);
        design05.addActionListener(listner);
        design06.addActionListener(listner);
        design07.addActionListener(listner);
        design08.addActionListener(listner);
        design09.addActionListener(listner);
        design010.addActionListener(listner);
        design011.addActionListener(listner);
        design012.addActionListener(listner);
        design013.addActionListener(listner);
        design014.addActionListener(listner);

        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finalOrderId = textPeriod2.getText();
            }
        });

        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(finalDesign==null) {
                    JOptionPane.showMessageDialog(null, "선택되지 않은 사항이 있습니다.",
                            "message", JOptionPane.INFORMATION_MESSAGE);
                }else {
                    new Decision(finalDesign);
                    setVisible(false);
                }
            }
        });

        detail.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Detail d = new Detail();
                d.createAndShowGUI();
            }

        });
        add(background);
        setVisible(true);

    }

    private void finalSetIcon(JButton design00, ImageIcon design0) {
        Image img;
        Image changeImg;
        img = design0.getImage();
        changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(changeImg);
        design00.setIcon(changeIcon);
    }

    void createAndShowGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addComponentsTopane();

        setPreferredSize(new Dimension(1920, 1080));
        setBounds(0,0,1920,1080);
        pack();
        setVisible(true);

    }
    public static void main(String[] args) {
        GUIMain frame = new GUIMain();
        frame.createAndShowGUI();
    }

    void setFinalDesign(String design){
        finalDesign = design;
    }

    class DesignListenerCount implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String buttonName = e.getActionCommand();
            for(String design: design) {
               if(buttonName.contentEquals(design)){
                   setFinalDesign(design);
                   designPrint.setText("반지 디자인 : " + design);
               }
            }


        }
    }

    public class Detail extends JFrame{
        Detail() {


            Container contentPane = this.getContentPane();
            JPanel pane = new JPanel();

            JTextField textPeriod4 = new JTextField(5);
            JLabel labelPeriod4 = new JLabel("번호 : ");


            JButton buttonStart = new JButton("주문내역 확인");
            //buttonStart.setMnemonic('S');

            pane.add(labelPeriod4);
            pane.add(textPeriod4);
            pane.add(buttonStart);
            contentPane.add(pane);


            buttonStart.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    detailId = textPeriod4.getText();
                    if(!detailId.equals(finalOrderId)) {
                        JOptionPane.showMessageDialog(null, "주문번호가 없습니다.",
                                "message", JOptionPane.INFORMATION_MESSAGE);
                    }else {
                       JewelryStore j = new JewelryStore();
                       j.mymain();
                    }
                }
            });

        }
        public void createAndShowGUI() {

            setBounds(1300,200,500,100);
            //setPreferredSize(new Dimension(300, 100));
            pack();
            setVisible(true);
        }
    }


    class RoundedButton2 extends JButton {
       /* public RoundedButton1() {
            super();
            decorate();
        }*/

        public RoundedButton2(String text) {
            super(text);
            decorate();
        }

        /*public RoundedButton2(Action action) {
            super(action);
            decorate();
        }

        public RoundedButton2(Icon icon) {
            super(icon);
            decorate();
        }

        public RoundedButton2(String text, Icon icon) {
            super(text, icon);
            decorate();
        }*/

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
            graphics.setFont(new Font("돋움", Font.BOLD, 15));
            graphics.drawString(getText(), textX, textY);
            graphics.dispose();
            super.paintComponent(g);
        }
    }

}