package store;

import javax.swing.*;
import java.awt.*;import java.awt.event.ActionEvent;import java.awt.event.ActionListener;


public class Recommend extends JFrame {
    JFrame mainFrame;
    JPanel mainPanel;

    Image lookImage;
    Image changeLookImage;
    ImageIcon afterLookImage;

    JLabel lookLabel = new JLabel();
    JLabel masegeLabel1;
    JLabel masegeLabel2;
    JLabel commonLabel1;
    JLabel commonLabel2;

    String stones[] = {"가넷(1월)", "자수정(2월)", "아쿠아마린(3월)", "다이아몬드(4월)", "에메랄드(5월)", "진주(6월)", "루비(7월)",
            "페리도트(8월)", "사파이어(9월)", "오팔(10월)", "토파즈(11월)", "터키석(12월)"};
    ImageIcon[] beforeLookImage = {new ImageIcon("RecommendLookImage/1월.jpg"),
            new ImageIcon("RecommendLookImage/2월.jpg"), new ImageIcon("RecommendLookImage/3월.jpg"),
            new ImageIcon("RecommendLookImage/4월.jpg"), new ImageIcon("RecommendLookImage/5월.jpg"),
            new ImageIcon("RecommendLookImage/6월.jpg"), new ImageIcon("RecommendLookImage/7월.jpg"),
            new ImageIcon("RecommendLookImage/8월.jpg"), new ImageIcon("RecommendLookImage/9월.jpg"),
            new ImageIcon("RecommendLookImage/10월.jpg"), new ImageIcon("RecommendLookImage/11월.jpg"),
            new ImageIcon("RecommendLookImage/12월.jpg")};


    public Recommend(String Arr) {
        mainFrame = new JFrame("결제완료_추천");
        mainFrame.setSize(1920, 1280);
        mainPanel = new JPanel();
       /* Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2, (windowSize.height - frameSize.height) / 2);*/
        mainFrame.setBackground(Color.WHITE);
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(null);


        //공통으로 출력되는 글
        commonLabel1 = new JLabel("< 주문 완료 >");
        commonLabel1.setFont(new Font("돋움", Font.BOLD, 22));
        commonLabel1.setForeground(Color.black);
        commonLabel1.setBounds(180, 200, 400, 200);
        mainPanel.add(commonLabel1);

        /*commonLabel2 = new JLabel("고객님의 주문이 완료되었습니다.");
        commonLabel2.setFont(new Font("돋움", Font.PLAIN, 20));
        commonLabel2.setForeground(Color.black);
        commonLabel2.setBounds(200, 260, 1000, 200);
        mainPanel.add(commonLabel2);   */


        //선택한 월에 따라 변경되는 메세지
        if (stones[0].equals(Arr)) {
            masegeLabel1 = new JLabel("<html>한 해를 여는 1월의 탄생석 '가넷'은 진실한 우정과 충성, 불현, 진리 등을 상징하는 보석입니다." +
                    "<br>가넷은 붉은색 이외에도 노랑, 주황, 초록, 자주, 검정색 등 다양한 색감을 자랑하는 아름다운 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>White, Black, Rose pink, Burgundy color와 잘 어우러지며<br>" +
                    "세련되고 우아한 무드를 주는 office look, feminine look에<br>Cobjet을 함께 매치해 보세요. :)</html>");

            //JLabel stonetxtLabel = new JLabel("<html>4월 다이아몬드<br>순결,고귀,용기,신념<p>120000원</html>",SwingConstants.CENTER);
        }
        if (stones[1].equals(Arr)) {
            masegeLabel1 = new JLabel("<html>보랏빛의 맑고 투명한 2월 탄생석 '자수정'은 세계 5대 보석 중 하나로써 " +
                    "품위 있는 보석으로 인정받고 있습니다.<br>성실과 평화를 상징하는 청색과 붉은색 띄는 자수정은 '하늘과 인간을 이어주는 보석'으로 상징되기도 했습니다.</html>");
            masegeLabel2 = new JLabel("<html>클래식한 무드로 고급스러움이 돋보이는 Gray, Skin, Black color와<br>매치함으로써" +
                    "Cobjet과 함께 세련된 무드를 연출해 보세요. :)</html>");
        }
        if (stones[2].equals(Arr)) {
            masegeLabel1 = new JLabel("<html>'아쿠아(Aqua, 물), 마린(Marine, 바다)'<br>" +
                    "아쿠아마린은 어두운 바다의 등불 같이 빛이나 '밤의 보석 중의 여왕'이라 불리웁니다.<br>아쿠아마린은 예부터 영원한 젊음과 행복을 상징하는 돌로," +
                    "희망과 건강을 갖게 하는 돌이라고 알려져 있습니다.</html>");
            masegeLabel2 = new JLabel("<html>유행 없이 언제 꺼내 착용해도 멋스러워 매 시즌 즐겨 찾는 Cobjet의 아쿠아마린을<br>" +
                    "daily look, vacance look과 함께 매치해 보세요. :)</html>");
        }
        if (stones[3].equals(Arr)) {
            masegeLabel1 = new JLabel("선택하신 4월 탄생석인 다이아몬드는");
            masegeLabel2 = new JLabel("Black, Rose pink, Burgundy color와 함께 매치해보세요.");
        }
        if (stones[4].equals(Arr)) {
            masegeLabel1 = new JLabel("<html>5월의 탄생석 '에메랄드'는 진실한 우정과 충성, 불현, 진리 등을 상징하는 보석입니다." +
                    "<br>가넷은 붉은색 이외에도 노랑, 주황, 초록, 자주, 검정색 등 다양한 색감을 자랑하는 아름다운 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>White, Black, Rose pink, Burgundy color와 잘 어우러지며<br>" +
                    "세련되고 우아한 무드를 주는 office look, feminine look에<br>Cobjet을 함께 매치해 보세요. :)</html>");
        }
        if (stones[5].equals(Arr)){
            masegeLabel1 = new JLabel("<html>6월의 탄생석 '진주'는 진실한 우정과 충성, 불현, 진리 등을 상징하는 보석입니다." +
                    "<br>가넷은 붉은색 이외에도 노랑, 주황, 초록, 자주, 검정색 등 다양한 색감을 자랑하는 아름다운 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>White, Black, Rose pink, Burgundy color와 잘 어우러지며<br>" +
                    "세련되고 우아한 무드를 주는 office look, feminine look에<br>Cobjet을 함께 매치해 보세요. :)</html>");
        }
        if (stones[6].equals(Arr)) {
            masegeLabel1 = new JLabel("<html>7월의 탄생석 '루비'는 진실한 우정과 충성, 불현, 진리 등을 상징하는 보석입니다." +
                    "<br>가넷은 붉은색 이외에도 노랑, 주황, 초록, 자주, 검정색 등 다양한 색감을 자랑하는 아름다운 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>White, Black, Rose pink, Burgundy color와 잘 어우러지며<br>" +
                    "세련되고 우아한 무드를 주는 office look, feminine look에<br>Cobjet을 함께 매치해 보세요. :)</html>");
        }
        if (stones[7].equals(Arr)) {
            masegeLabel1 = new JLabel("<html>8월의 탄생석 '페리도트'는 진실한 우정과 충성, 불현, 진리 등을 상징하는 보석입니다." +
                    "<br>가넷은 붉은색 이외에도 노랑, 주황, 초록, 자주, 검정색 등 다양한 색감을 자랑하는 아름다운 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>White, Black, Rose pink, Burgundy color와 잘 어우러지며<br>" +
                    "세련되고 우아한 무드를 주는 office look, feminine look에<br>Cobjet을 함께 매치해 보세요. :)</html>");
        }
        if (stones[8].equals(Arr)) {
            masegeLabel1 = new JLabel("<html>9월의 탄생석 '사파이어'는 진실한 우정과 충성, 불현, 진리 등을 상징하는 보석입니다." +
                    "<br>가넷은 붉은색 이외에도 노랑, 주황, 초록, 자주, 검정색 등 다양한 색감을 자랑하는 아름다운 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>White, Black, Rose pink, Burgundy color와 잘 어우러지며<br>" +
                    "세련되고 우아한 무드를 주는 office look, feminine look에<br>Cobjet을 함께 매치해 보세요. :)</html>");
        }
        if (stones[9].equals(Arr)) {
            masegeLabel1 = new JLabel("<html>10월의 탄생석 '오팔'은 진실한 우정과 충성, 불현, 진리 등을 상징하는 보석입니다." +
                    "<br>가넷은 붉은색 이외에도 노랑, 주황, 초록, 자주, 검정색 등 다양한 색감을 자랑하는 아름다운 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>White, Black, Rose pink, Burgundy color와 잘 어우러지며<br>" +
                    "세련되고 우아한 무드를 주는 office look, feminine look에<br>Cobjet을 함께 매치해 보세요. :)</html>");
        }
        if (stones[10].equals(Arr)) {
            masegeLabel1 = new JLabel("<html>11월의 탄생석 '토파즈'는 진실한 우정과 충성, 불현, 진리 등을 상징하는 보석입니다." +
                    "<br>가넷은 붉은색 이외에도 노랑, 주황, 초록, 자주, 검정색 등 다양한 색감을 자랑하는 아름다운 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>White, Black, Rose pink, Burgundy color와 잘 어우러지며<br>" +
                    "세련되고 우아한 무드를 주는 office look, feminine look에<br>Cobjet을 함께 매치해 보세요. :)</html>");
        }
        if (stones[11].equals(Arr)) {
            masegeLabel1 = new JLabel("<html>12월의 탄생석 '터키석'은 진실한 우정과 충성, 불현, 진리 등을 상징하는 보석입니다." +
                    "<br>가넷은 붉은색 이외에도 노랑, 주황, 초록, 자주, 검정색 등 다양한 색감을 자랑하는 아름다운 보석입니다.</html>");
            masegeLabel2 = new JLabel("<html>White, Black, Rose pink, Burgundy color와 잘 어우러지며<br>" +
                    "세련되고 우아한 무드를 주는 office look, feminine look에<br>Cobjet을 함께 매치해 보세요. :)</html>");
        }

        masegeLabel1.setFont(new Font("돋움", Font.PLAIN, 13));
        masegeLabel1.setForeground(Color.DARK_GRAY);
        masegeLabel1.setBounds(180, 250, 1000, 200);
        mainPanel.add(masegeLabel1);

        masegeLabel2.setFont(new Font("돋움", Font.ITALIC, 18));
        masegeLabel2.setForeground(Color.black);
        masegeLabel2.setBounds(180, 310, 1000, 200);
        mainPanel.add(masegeLabel2);


        //선택한 월에 따라 변경되는 추천 사진
        for(int i=0; i<12; i++) {
            if (stones[i].equals(Arr)) lookImage = beforeLookImage[i].getImage();
        }

        //이미지 배율 강제 조정
        changeLookImage = lookImage.getScaledInstance(450, 675, Image.SCALE_SMOOTH);
        afterLookImage = new ImageIcon(changeLookImage);
        lookLabel = new JLabel(afterLookImage);
        lookLabel.setBounds(780, 110, 450, 675);
        mainPanel.add(lookLabel);

        mainFrame.add(mainPanel);
        setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);


    }
}