package store;

import javax.swing.*;
import java.awt.*;import java.awt.event.ActionEvent;import java.awt.event.ActionListener;


public class Recommend extends JFrame {
    String stones[] = {"가넷(1월)", "자수정(2월)", "아쿠아마린(3월)", "다이아몬드(4월)", "에메랄드(5월)", "진주(6월)", "루비(7월)",
            "페리도트(8월)", "사파이어(9월)", "오팔(10월)", "토파즈(11월)", "터키석(12월)"};
    ImageIcon[] beforeLookImage = {new ImageIcon("RecommendLookImage/1월.jpg"),
            new ImageIcon("RecommendLookImage/2월.jpg"), new ImageIcon("RecommendLookImage/3월.jpg"),
            new ImageIcon("RecommendLookImage/4월.jpg"), new ImageIcon("RecommendLookImage/5월.jpg"),
            new ImageIcon("RecommendLookImage/6월.jpg"), new ImageIcon("RecommendLookImage/7월.jpg"),
            new ImageIcon("RecommendLookImage/8월.jpg"), new ImageIcon("RecommendLookImage/9월.jpg"),
            new ImageIcon("RecommendLookImage/10월.jpg"), new ImageIcon("RecommendLookImage/11월.jpg"),
            new ImageIcon("RecommendLookImage/12월.jpg")};

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
        commonLabel1.setFont(new Font("돋움", Font.BOLD, 23));
        commonLabel1.setForeground(Color.black);
        commonLabel1.setBounds(180, 200, 400, 200);
        mainPanel.add(commonLabel1);

        commonLabel2 = new JLabel("고객님의 주문이 완료되었습니다.");
        commonLabel2.setFont(new Font("돋움", Font.PLAIN, 20));
        commonLabel2.setForeground(Color.black);
        commonLabel2.setBounds(200, 260, 1000, 200);
        mainPanel.add(commonLabel2);


        //선택한 월에 따라 변경되는 메세지
        if (stones[0].equals(Arr)) {
            masegeLabel1 = new JLabel("선택하신 1월 탄생석인 가넷은");
            masegeLabel2 = new JLabel("Black, Rose pink, Burgundy color와 함께 매치해보세요.");
        }
        if (stones[1].equals(Arr)) {
            masegeLabel1 = new JLabel("선택하신 2월 탄생석인 자수정은");
            masegeLabel2 = new JLabel("Black, Rose pink, Burgundy color와 함께 매치해보세요.");
        }
        if (stones[2].equals(Arr)) {
            masegeLabel1 = new JLabel("선택하신 3월 탄생석인 아쿠아마린은");
            masegeLabel2 = new JLabel("Black, Rose pink, Burgundy color와 함께 매치해보세요.");
        }
        if (stones[3].equals(Arr)) {
            masegeLabel1 = new JLabel("선택하신 4월 탄생석인 다이아몬드는");
            masegeLabel2 = new JLabel("Black, Rose pink, Burgundy color와 함께 매치해보세요.");
        }
        if (stones[4].equals(Arr)) masegeLabel1 = new JLabel("선택하신 5월 탄생석인 에메랄드는");
        if (stones[5].equals(Arr)) masegeLabel1 = new JLabel("선택하신 6월 탄생석인 진주는");
        if (stones[6].equals(Arr)) masegeLabel1 = new JLabel("선택하신 7월 탄생석인 루비는");
        if (stones[7].equals(Arr)) masegeLabel1 = new JLabel("선택하신 8월 탄생석인 페리도트는");
        if (stones[8].equals(Arr)) masegeLabel1 = new JLabel("선택하신 9월 탄생석인 사파이어는");
        if (stones[9].equals(Arr)) masegeLabel1 = new JLabel("선택하신 10월 탄생석인 오팔은");
        if (stones[10].equals(Arr)) masegeLabel1 = new JLabel("선택하신 11월 탄생석인 토파즈는");
        if (stones[11].equals(Arr)) masegeLabel1 = new JLabel("선택하신 12월 탄생석인 터키석은");

        masegeLabel1.setFont(new Font("돋움", Font.PLAIN, 20));
        masegeLabel1.setForeground(Color.black);
        masegeLabel1.setBounds(200, 320, 1000, 200);
        mainPanel.add(masegeLabel1);

        masegeLabel2.setFont(new Font("돋움", Font.PLAIN, 20));
        masegeLabel2.setForeground(Color.black);
        masegeLabel2.setBounds(200, 380, 1000, 200);
        mainPanel.add(masegeLabel2);


        //선택한 월에 따라 변경되는 추천 사진
        for(int i=0; i<12; i++) {
            if (stones[i].equals(Arr)) lookImage = beforeLookImage[i].getImage();
        }

        //이미지 배율 강제 조정
        changeLookImage = lookImage.getScaledInstance(500, 750, Image.SCALE_SMOOTH);
        afterLookImage = new ImageIcon(changeLookImage);
        lookLabel = new JLabel(afterLookImage);
        lookLabel.setBounds(750, 100, 500, 750);
        mainPanel.add(lookLabel);

        mainFrame.add(mainPanel);
        setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);


    }
}



