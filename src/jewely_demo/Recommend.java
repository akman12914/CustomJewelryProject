
package jewely_demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Recommend extends JFrame {
    JFrame mainFrame;
    JPanel mainPanel;

    //링 컬러 이미지 강제조정
    Image ringColorImage;
    ImageIcon[] beforeRingColorImage =
            {new ImageIcon("RingColorImage/실버.png"), new ImageIcon("RingColorImage/골드.png"),
                    new ImageIcon("RingColorImage/로즈골드.png")};
    Image changeRingColorImage;
    ImageIcon afterRingColorImage;

    //탄생석 이미지 강제조정
    Image stoneImage;
    ImageIcon[] beforeStoneImage = {new ImageIcon("StoneImage/가넷.jpg"),new ImageIcon("StoneImage/자수정.jpg"),
            new ImageIcon("StoneImage/아쿠아마린.jpg"),new ImageIcon("StoneImage/다이아몬드.jpg"),
            new ImageIcon("StoneImage/에메랄드.jpg"),new ImageIcon("StoneImage/진주.jpg"),
            new ImageIcon("StoneImage/루비.jpg"),new ImageIcon("StoneImage/페리도트.jpg"),
            new ImageIcon("StoneImage/사파이어.jpg"), new ImageIcon("StoneImage/오팔.jpg"),
            new ImageIcon("StoneImage/토파즈.jpg"),new ImageIcon("StoneImage/터키석.jpg")};
    Image changeStoneImage;
    ImageIcon afterStoneImage;

    //디자인 이미지 강제조정
    Image designImage;
    ImageIcon[] beforeDesignImage = {new ImageIcon("RingDesignImage/다이애나반지.jpg"),new ImageIcon("RingDesignImage/메리반지.jpg"),
            new ImageIcon("RingDesignImage/모던반지.jpg"),new ImageIcon("RingDesignImage/모어데이반지.jpg"),
            new ImageIcon("RingDesignImage/바코드반지.jpg"),new ImageIcon("RingDesignImage/박스큐빅반지.jpg"),
            new ImageIcon("RingDesignImage/시계반지.jpg"),new ImageIcon("RingDesignImage/썸타임반지.jpg"),
            new ImageIcon("RingDesignImage/애프터레인반지.jpg"),new ImageIcon("RingDesignImage/원밸리반지.jpg"),
            new ImageIcon("RingDesignImage/월계수반지.jpg"),new ImageIcon("RingDesignImage/큐빅반지.jpg"),
            new ImageIcon("RingDesignImage/타임큐빅반지.jpg"),new ImageIcon("RingDesignImage/투웨이반지.jpg"),
            new ImageIcon("RingDesignImage/팅커반지.jpg")};
    Image changeDesignImage;
    ImageIcon afterDesignImage;

    //스타일링 이미지 강제조정을 위한 선언
    Image lookImage;
    ImageIcon[] beforeLookImage = {new ImageIcon("RecommendLookImage/1월.jpg"),
            new ImageIcon("RecommendLookImage/2월.jpg"), new ImageIcon("RecommendLookImage/3월.jpg"),
            new ImageIcon("RecommendLookImage/4월.jpg"), new ImageIcon("RecommendLookImage/5월.jpg"),
            new ImageIcon("RecommendLookImage/6월.jpg"), new ImageIcon("RecommendLookImage/7월.jpg"),
            new ImageIcon("RecommendLookImage/8월.jpg"), new ImageIcon("RecommendLookImage/9월.jpg"),
            new ImageIcon("RecommendLookImage/10월.jpg"), new ImageIcon("RecommendLookImage/11월.jpg"),
            new ImageIcon("RecommendLookImage/12월.jpg")};
    Image changeLookImage;
    ImageIcon afterLookImage;

    JLabel lookLabel;
    JLabel stoneLabel;
    JLabel ringColorLabel;
    JLabel designLabel;
    JLabel masegeLabel1;
    JLabel masegeLabel2;
    JLabel commonLabel1;
    JLabel commonLabel2;

    RoundedButton1 nextPage = new RoundedButton1("다음 페이지");
    RoundedButton1 returnPage = new RoundedButton1("이전 페이지");

    String stones[] = {"가넷(1월)", "자수정(2월)", "아쿠아마린(3월)", "다이아몬드(4월)", "에메랄드(5월)", "진주(6월)", "루비(7월)",
            "페리도트(8월)", "사파이어(9월)", "오팔(10월)", "토파즈(11월)", "터키석(12월)"};
    String colors[] = {"실버", "골드", "로즈골드"};
    String design[] = {"다이애나반지","메리반지","모던반지","모어데이반지","바코드반지","박스큐빅반지","시계반지","썸타임반지","애프터레인반지",
    "원밸리반지","월계수반지","큐빅반지","타임큐빅반지","투웨이반지","팅커반지"};




    public Recommend(String finalDesign, String finalColor, String finalStone, String finalCarat, int finalPrice) {
        mainFrame = new JFrame("결제완료_추천");
        mainFrame.setSize(1920, 1080);
        mainPanel = new JPanel();

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2, (windowSize.height - frameSize.height) / 2);

        mainFrame.setBackground(Color.WHITE);
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(null);

        //공통으로 출력되는 글
        commonLabel1 = new JLabel("< 주문 완료 >");
        commonLabel1.setFont(new Font("돋움", Font.BOLD, 22));
        commonLabel1.setForeground(Color.black);
        commonLabel1.setBounds(170, 100, 400, 200);
        mainPanel.add(commonLabel1);

        //주문사항 확인(문구)
        commonLabel2 = new JLabel("<html>"+finalColor+", "+finalStone+", "+finalDesign+" 디자인으로 선택하셨습니다.</html>");
        commonLabel2.setFont(new Font("돋움", Font.PLAIN, 17));
        commonLabel2.setForeground(Color.black);
        commonLabel2.setBounds(180, 150, 500, 200);
        mainPanel.add(commonLabel2);


        //선택한 월에 따라 변경되는 메세지
        if (stones[0].equals(finalStone)) {
            masegeLabel1 = new JLabel("<html>한 해를 여는 1월의 탄생석 '가넷'은 진실한 우정과 충성, 불현, 진리 등을 상징하는 보석입니다." +
                    "<br>가넷은 붉은색 이외에도 노랑, 주황, 초록, 자주, 검정색 등 다양한 색감을 자랑하는 아름다운 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>White, Black, Rose pink, Burgundy color와 잘 어우러지며<br>" +
                    "세련되고 우아한 무드를 주는 office look, feminine look에<br>Cobjet을 함께 매치해 보세요. :)</html>");

            //JLabel stonetxtLabel = new JLabel("<html>4월 다이아몬드<br>순결,고귀,용기,신념<p>120000원</html>",SwingConstants.CENTER);
        }
        if (stones[1].equals(finalStone)) {
            masegeLabel1 = new JLabel("<html>보랏빛의 맑고 투명한 2월 탄생석 '자수정'은 세계 5대 보석 중 하나로써 " +
                    "품위 있는 보석으로 인정받고 있습니다.<br>성실과 평화를 상징하는 청색과 붉은색 띄는 자수정은 '하늘과 인간을 이어주는 보석'으로 상징되기도 했습니다.</html>");
            masegeLabel2 = new JLabel("<html>클래식한 무드로 고급스러움이 돋보이는 Gray, Skin, Black color와<br>매치함으로써" +
                    "Cobjet과 함께 세련된 무드를 연출해 보세요. :)</html>");
        }
        if (stones[2].equals(finalStone)) {
            masegeLabel1 = new JLabel("<html>'아쿠아(Aqua, 물), 마린(Marine, 바다)'<br>" +
                    "아쿠아마린은 어두운 바다의 등불 같이 빛이나 '밤의 보석 중의 여왕'이라 불리웁니다.<br>아쿠아마린은 예부터 영원한 젊음과 행복을 상징하는 돌로," +
                    "희망과 건강을 갖게 하는 돌이라고 알려져 있습니다.</html>");
            masegeLabel2 = new JLabel("<html>유행 없이 언제 꺼내 착용해도 멋스러워 매 시즌 즐겨 찾는 Cobjet의 아쿠아마린을<br>" +
                    "daily look, vacance look과 함께 매치해 보세요. :)</html>");
        }
        if (stones[3].equals(finalStone)) {
            masegeLabel1 = new JLabel("선택하신 4월 탄생석인 다이아몬드는");
            masegeLabel2 = new JLabel("Black, Rose pink, Burgundy color와 함께 매치해보세요.");
        }
        if (stones[4].equals(finalStone)) {
            masegeLabel1 = new JLabel("<html>5월의 탄생석 '에메랄드'는 진실한 우정과 충성, 불현, 진리 등을 상징하는 보석입니다." +
                    "<br>가넷은 붉은색 이외에도 노랑, 주황, 초록, 자주, 검정색 등 다양한 색감을 자랑하는 아름다운 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>White, Black, Rose pink, Burgundy color와 잘 어우러지며<br>" +
                    "세련되고 우아한 무드를 주는 office look, feminine look에<br>Cobjet을 함께 매치해 보세요. :)</html>");
        }
        if (stones[5].equals(finalStone)){
            masegeLabel1 = new JLabel("<html>6월의 탄생석 '진주'는 진실한 우정과 충성, 불현, 진리 등을 상징하는 보석입니다." +
                    "<br>가넷은 붉은색 이외에도 노랑, 주황, 초록, 자주, 검정색 등 다양한 색감을 자랑하는 아름다운 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>White, Black, Rose pink, Burgundy color와 잘 어우러지며<br>" +
                    "세련되고 우아한 무드를 주는 office look, feminine look에<br>Cobjet을 함께 매치해 보세요. :)</html>");
        }
        if (stones[6].equals(finalStone)) {
            masegeLabel1 = new JLabel("<html>7월의 탄생석 '루비'는 진실한 우정과 충성, 불현, 진리 등을 상징하는 보석입니다." +
                    "<br>가넷은 붉은색 이외에도 노랑, 주황, 초록, 자주, 검정색 등 다양한 색감을 자랑하는 아름다운 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>White, Black, Rose pink, Burgundy color와 잘 어우러지며<br>" +
                    "세련되고 우아한 무드를 주는 office look, feminine look에<br>Cobjet을 함께 매치해 보세요. :)</html>");
        }
        if (stones[7].equals(finalStone)) {
            masegeLabel1 = new JLabel("<html>8월의 탄생석 '페리도트'는 진실한 우정과 충성, 불현, 진리 등을 상징하는 보석입니다." +
                    "<br>가넷은 붉은색 이외에도 노랑, 주황, 초록, 자주, 검정색 등 다양한 색감을 자랑하는 아름다운 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>White, Black, Rose pink, Burgundy color와 잘 어우러지며<br>" +
                    "세련되고 우아한 무드를 주는 office look, feminine look에<br>Cobjet을 함께 매치해 보세요. :)</html>");
        }
        if (stones[8].equals(finalStone)) {
            masegeLabel1 = new JLabel("<html>9월의 탄생석 '사파이어'는 진실한 우정과 충성, 불현, 진리 등을 상징하는 보석입니다." +
                    "<br>가넷은 붉은색 이외에도 노랑, 주황, 초록, 자주, 검정색 등 다양한 색감을 자랑하는 아름다운 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>White, Black, Rose pink, Burgundy color와 잘 어우러지며<br>" +
                    "세련되고 우아한 무드를 주는 office look, feminine look에<br>Cobjet을 함께 매치해 보세요. :)</html>");
        }
        if (stones[9].equals(finalStone)) {
            masegeLabel1 = new JLabel("<html>10월의 탄생석 '오팔'은 진실한 우정과 충성, 불현, 진리 등을 상징하는 보석입니다." +
                    "<br>가넷은 붉은색 이외에도 노랑, 주황, 초록, 자주, 검정색 등 다양한 색감을 자랑하는 아름다운 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>White, Black, Rose pink, Burgundy color와 잘 어우러지며<br>" +
                    "세련되고 우아한 무드를 주는 office look, feminine look에<br>Cobjet을 함께 매치해 보세요. :)</html>");
        }
        if (stones[10].equals(finalStone)) {
            masegeLabel1 = new JLabel("<html>11월의 탄생석 '토파즈'는 진실한 우정과 충성, 불현, 진리 등을 상징하는 보석입니다." +
                    "<br>가넷은 붉은색 이외에도 노랑, 주황, 초록, 자주, 검정색 등 다양한 색감을 자랑하는 아름다운 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>White, Black, Rose pink, Burgundy color와 잘 어우러지며<br>" +
                    "세련되고 우아한 무드를 주는 office look, feminine look에<br>Cobjet을 함께 매치해 보세요. :)</html>");
        }
        if (stones[11].equals(finalStone)) {
            masegeLabel1 = new JLabel("<html>12월의 탄생석 '터키석'은 진실한 우정과 충성, 불현, 진리 등을 상징하는 보석입니다." +
                    "<br>가넷은 붉은색 이외에도 노랑, 주황, 초록, 자주, 검정색 등 다양한 색감을 자랑하는 아름다운 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>White, Black, Rose pink, Burgundy color와 잘 어우러지며<br>" +
                    "세련되고 우아한 무드를 주는 office look, feminine look에<br>Cobjet을 함께 매치해 보세요. :)</html>");
        }

        masegeLabel1.setFont(new Font("돋움", Font.PLAIN, 13));
        masegeLabel1.setForeground(Color.DARK_GRAY);
        masegeLabel1.setBounds(180, 370, 1000, 200);
        mainPanel.add(masegeLabel1);

        masegeLabel2.setFont(new Font("돋움", Font.ITALIC, 18));
        masegeLabel2.setForeground(Color.black);
        masegeLabel2.setBounds(180, 430, 1000, 200);
        mainPanel.add(masegeLabel2);


        //선택한 월에 따라 변경되는 추천 사진
        for(int i=0; i<12; i++) {
            if (stones[i].equals(finalStone)) lookImage = beforeLookImage[i].getImage();
        }

        //추천룩 이미지 배율 강제 조정
        changeLookImage = lookImage.getScaledInstance(450, 675, Image.SCALE_SMOOTH);
        afterLookImage = new ImageIcon(changeLookImage);
        lookLabel = new JLabel(afterLookImage);
        lookLabel.setBounds(780, 110, 450, 675);
        mainPanel.add(lookLabel);

        //선택한 링 컬러 이미지 출력
        for(int i=0; i<3;i++){
            if(colors[i].equals(finalColor)) ringColorImage = beforeRingColorImage[i].getImage();
        }
        //링컬러 이미지 배율 강제 조정
        changeRingColorImage = ringColorImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        afterRingColorImage = new ImageIcon(changeRingColorImage);
        ringColorLabel = new JLabel(afterRingColorImage);
        ringColorLabel.setBounds(180, 310, 100, 100);
        mainPanel.add(ringColorLabel);

        //선택한 스톤 이미지 출력
        for(int i=0; i<12;i++){
            if(stones[i].equals(finalStone)) stoneImage = beforeStoneImage[i].getImage();
        }
        //스톤 이미지 배율 강제 조정
        changeStoneImage = stoneImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        afterStoneImage = new ImageIcon(changeStoneImage);
        stoneLabel = new JLabel(afterStoneImage);
        stoneLabel.setBounds(330, 310, 100, 100);
        mainPanel.add(stoneLabel);

        //선택한 디자인 이미지 출력
        for(int i=0; i<15;i++){
            if(design[i].equals(finalDesign)) designImage = beforeDesignImage[i].getImage();
        }
        //디자인 이미지 배율 강제 조정
        changeDesignImage = designImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        afterDesignImage = new ImageIcon(changeDesignImage);
        designLabel = new JLabel(afterDesignImage);
        designLabel.setBounds(480, 310, 100, 100);
        mainPanel.add(designLabel);

        //다음 페이지로 넘어가는 버튼
        nextPage.setBounds(460,640,250,50);
        mainPanel.add(nextPage);

        nextPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OrderBasket frame = new OrderBasket(finalDesign, finalColor, finalStone, finalCarat, finalPrice);
                frame.createAndShowGUI();
                setVisible(false);

            }
        });
        
        //이전 페이지로 넘어가는 버튼
        returnPage.setBounds(180,640,250,50);
        mainPanel.add(returnPage);

        returnPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Decision temp2 = new Decision(finalDesign);
                setVisible(false);
            }
        });

        mainFrame.add(mainPanel);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);



    }

    class RoundedButton1 extends JButton {
       /* public RoundedButton1() {
            super();
            decorate();
        }*/

        public RoundedButton1(String text) {
            super(text);
            decorate();
        }

        /*public RoundedButton1(Action action) {
            super(action);
            decorate();
        }

        public RoundedButton1(Icon icon) {
            super(icon);
            decorate();
        }

        public RoundedButton1(String text, Icon icon) {
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
