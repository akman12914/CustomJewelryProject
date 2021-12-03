
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
        commonLabel1.setBounds(350, 100, 400, 200);
        mainPanel.add(commonLabel1);

        //주문사항 확인(문구)
        commonLabel2 = new JLabel("<html>"+finalColor+", "+finalStone+", "+finalDesign+" 디자인으로 선택하셨습니다.</html>");
        commonLabel2.setFont(new Font("돋움", Font.PLAIN, 17));
        commonLabel2.setForeground(Color.black);
        commonLabel2.setBounds(360, 150, 500, 200);
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
            masegeLabel1 = new JLabel("<html>'‘여자의 수호석, 4월 다이아몬드’는 ‘정복할 수 없다’는 뜻의 그리스어 아다마스에서 유래 되었습니다. "+
                    "<br>다이아몬드 원석을 몸에 지니고 있으면 치료효과는 물론 아름다운 피부와 싱싱한 젊음도 유지할 수 있다고 합니다.<br>" +
                    "다이아몬드는 천연석 중 빛의 굴절률이 제일 높아 아름다운 광채를 발휘합니다.</html>");
            masegeLabel2 = new JLabel("<html>GREEN, PINK, GRAY, BLUE color의 style에서 더 찬란한 빛을 내는 <br>" +
                    "Cobjet 반지와 함께 봄을 가꾸어 보아요 :) </html>");
        }
        if (stones[4].equals(finalStone)) {
            masegeLabel1 = new JLabel("<html>5월의 탄생석 '에메랄드'는 고대 사람들에게 많은 믿음을 주었으며 동양에서는 미래를 예언하는 돌,<br>" +
                    "서양에서는 사랑과 부활을 상징하는 돌로 여겨졌습니다. 그리스에서는 에메랄드를 미의 여신인 비너스에게 바쳤다고 합니다.</html>");
            masegeLabel2 = new JLabel("<html>에메랄드는 DENIM, KHAKI, PEACH, GREEN, BROWN color의 style과 잘 어우러지며<br>" +
                    "때로는 office look으로 세련되게, 때로는 daily look으로<br>" +
                    "모던하게 매치하며 Cobjet와 만들어보아요:)</html>");
        }
        if (stones[5].equals(finalStone)){
            masegeLabel1 = new JLabel("<html>“누구에게나 어울리며, 모든 옷을 소화하고, 어떤 장소와도 어울리는 보석. 그것이 바로 진주다.<br>" +
                    "진짜든 모조품이든 최초의 데이트부터 최후 숨을 거둘 때까지 진주 목걸이야말로 몸단장을 하는데 빠뜨려서는 안 될 보석이다.”<br>" +
                    "– 프랑스의 평론가 다리오 부인</html>");
            masegeLabel2 = new JLabel("<html>청순, 순결, 매력을 상징하기도 하는 진주는 화이트, 블랙, 실버, 크림, 골드, 그레이 등<br>" +
                    "색이 다양하여 모든 스타일을 제 스스로 해석하며 소화하는 신기한 보석입니다. :)</html>");
        }
        if (stones[6].equals(finalStone)) {
            masegeLabel1 = new JLabel("<html>열정적인 사랑을 상징하는 루비의 어원은 라틴어의 루브럼(Rubrum), 즉 ‘빨갛다’는 의미입니다.<br>" +
                    "한 시인이 ‘사랑의 언어를 속삭이는 여인의 입술’에 비유할 정도로 루비는 아름다운 붉은색을 자랑합니다.</html>");
            masegeLabel2 = new JLabel("<html> 루비는 GREEN, BLACK, DEEP RED, DENIM의 color로 클래식하면서 세련된 office look과<br>" +
                    "모던한 무드를 주는 페미닌룩으로 Cobjet와 함께 매치해 보세요:)</html>");
        }
        if (stones[7].equals(finalStone)) {
            masegeLabel1 = new JLabel("<html>노란색과 녹색이 혼합된 듯한 미묘한 색깔을 지니고 있는 페리도트(감람석)는 달빛 아래에서 보면" +
                    "<br>에메랄드처럼 짙은 녹색이 나타나기 때문에 ‘이브닝 에메랄드’ 라는 로맨틱한 별명을 가지고 있습니다.</html>");
            masegeLabel2 = new JLabel("<html>페리도트는 YELLOW, KHAKI, PEACH, GREEN color의 style과 잘 어우러지며<br>" +
                    "때로는 office look으로 세련되게, 때로는 daily look으로<br>모던하게 매치하며 Cobjet과 함께 해보아요 :)</html>");
        }
        if (stones[8].equals(finalStone)) {
            masegeLabel1 = new JLabel("<html>‘하늘을 상징하는 돌’ 사파이어는 그리스어, 라틴어, 히브리어로 ‘파랑’을 의미합니다." +
                    "<br>덕망과 자애, 성실과 진실을 상징하는 사파이어는 치료의 힘을 가진 돌로 여겨졌으며," +
                    "<br>불길한 것으로부터 인간의 건강과 생명을 보호해주며 평화를 준다고 여겨져 왔습니다.</html>");
            masegeLabel2 = new JLabel("<html>사파이어는 DENIM, KHAKI, PEACH, GREEN, YELLOW color의 style과<br>" +
                    "잘 어우러지며 때로는 office look으로 세련되게, 때로는 daily look으로 모던하게<br>매치하며 Cobjet와 만들어보아요 :)</html>");
        }
        if (stones[9].equals(finalStone)) {
            masegeLabel1 = new JLabel("<html>‘화려한 유색 효과’를 볼 수 있는 오팔은 그리스어의 오팔리오스에서 ‘귀한 돌’이란 뜻을 가지고 있습니다. " +
                    "<br>고대 로마인은 오팔을 ‘큐피트 비데로스(사랑스러운 아이)라고 불렀으며 희망과 청순, 신과 사람의 사랑을 상징합니다.</html>");
            masegeLabel2 = new JLabel("<html>오팔은 화이트, 그린, 실버, 블루, 골드, 핑크, 옐로우 등 색이 다양하여<br>" +
                    "모든 스타일을 제 스스로 해석하며 소화하는 신기한 보석입니다.</html>");
        }
        if (stones[10].equals(finalStone)) {
            masegeLabel1 = new JLabel("<html>토파즈는 위스키 색과 같은 짙은 오렌지색이 대표적이지만 호랑이의 눈빛을 닮은 갈색도 있으며," +
                    "<br>성난 고양이의 눈동자를 연상시키는 초록색, 공작의 눈빛을 닮은 핑크빛도 있는 아주 매력적인 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>11월의 탄생석 토파즈는 GREEN, GRAY, BLUE color의 style에서 " +
                    "<br>더 아름다운 빛을 내는 Cobjet 반지와 함께 매치해 보아요 :)</html>");
        }
        if (stones[11].equals(finalStone)) {
            masegeLabel1 = new JLabel("<html>‘행운의 보석’,‘신으로부터 받은 신성한 보석’이라 불리는 터키석은<br>성공과 승리를 약속하는 12월의 탄생석입니다. " +
                    "<br>하지만 터키에는 터키석이 없습니다. 그리스어로는 ‘Callaite(아름다운 돌)’, 페르시아어로는 페로자(Ferozah)<br>" +
                    "또는 피로자(Firozah)로 승리를 의미합니다. </html>");
            masegeLabel2 = new JLabel("<html>터키석은 DENIM, KHAKI, PEACH, GREEN, YELLOW color의 style과<br>" +
                    "잘 어우러지며 때로는 office look으로 세련되게, 때로는 daily look으로 모던하게 매치하며<br>Cobjet와 만들어보아요 :)</html>");
        }

        masegeLabel1.setFont(new Font("돋움", Font.PLAIN, 13));
        masegeLabel1.setForeground(Color.DARK_GRAY);
        masegeLabel1.setBounds(360, 370, 1000, 200);
        mainPanel.add(masegeLabel1);

        masegeLabel2.setFont(new Font("돋움", Font.ITALIC, 18));
        masegeLabel2.setForeground(Color.black);
        masegeLabel2.setBounds(360, 430, 1000, 200);
        mainPanel.add(masegeLabel2);


        //선택한 월에 따라 변경되는 추천 사진
        for(int i=0; i<12; i++) {
            if (stones[i].equals(finalStone)) lookImage = beforeLookImage[i].getImage();
        }

        //추천룩 이미지 배율 강제 조정
        changeLookImage = lookImage.getScaledInstance(450, 675, Image.SCALE_SMOOTH);
        afterLookImage = new ImageIcon(changeLookImage);
        lookLabel = new JLabel(afterLookImage);
        lookLabel.setBounds(960, 110, 450, 675);
        mainPanel.add(lookLabel);

        //선택한 링 컬러 이미지 출력
        for(int i=0; i<3;i++){
            if(colors[i].equals(finalColor)) ringColorImage = beforeRingColorImage[i].getImage();
        }
        //링컬러 이미지 배율 강제 조정
        changeRingColorImage = ringColorImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        afterRingColorImage = new ImageIcon(changeRingColorImage);
        ringColorLabel = new JLabel(afterRingColorImage);
        ringColorLabel.setBounds(360, 310, 100, 100);
        mainPanel.add(ringColorLabel);

        //선택한 스톤 이미지 출력
        for(int i=0; i<12;i++){
            if(stones[i].equals(finalStone)) stoneImage = beforeStoneImage[i].getImage();
        }
        //스톤 이미지 배율 강제 조정
        changeStoneImage = stoneImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        afterStoneImage = new ImageIcon(changeStoneImage);
        stoneLabel = new JLabel(afterStoneImage);
        stoneLabel.setBounds(500, 310, 100, 100);
        mainPanel.add(stoneLabel);

        //선택한 디자인 이미지 출력
        for(int i=0; i<15;i++){
            if(design[i].equals(finalDesign)) designImage = beforeDesignImage[i].getImage();
        }
        //디자인 이미지 배율 강제 조정
        changeDesignImage = designImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        afterDesignImage = new ImageIcon(changeDesignImage);
        designLabel = new JLabel(afterDesignImage);
        designLabel.setBounds(660, 310, 100, 100);
        mainPanel.add(designLabel);

        //다음 페이지로 넘어가는 버튼
        nextPage.setBounds(640,640,250,50);
        mainPanel.add(nextPage);

        nextPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OrderBasket frame = new OrderBasket(finalDesign, finalColor, finalStone,
                        finalCarat, finalPrice);
                setVisible(false); }
        });
        
        //이전 페이지로 넘어가는 버튼
        returnPage.setBounds(360,640,250,50);
        mainPanel.add(returnPage);
        

        returnPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Decision(finalDesign);
                setVisible(false);
            }
        });

        mainFrame.add(mainPanel);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    class RoundedButton1 extends JButton {

        public RoundedButton1(String text) {
            super(text);
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
            graphics.setFont(new Font("돋움", Font.BOLD, 15));
            graphics.drawString(getText(), textX, textY);
            graphics.dispose();
            super.paintComponent(g);
        }
    }

}
