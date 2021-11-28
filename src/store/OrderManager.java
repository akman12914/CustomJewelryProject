package store;

import java.util.ArrayList;
import java.util.Scanner;
import mgr.Manager;

public class OrderManager extends Manager{
    Scanner scan = new Scanner(System.in);
    ArrayList<Order> orderedjewelryList = new ArrayList<>();
    private static final String[] labels = {"주문자이름","디자인", "반지색", "탄생석", "캐럿", "호수", "주문시각"};

    public String[] getColumnNames() {
        return labels;
    }

    Order od = null;

    void readAll(){
        int id = 0;
        while(true) {
            System.out.println("주문하려면 숫자를 입력하세요.(0 입력시 종료)");
            id = scan.nextInt();
            if (id == 0)
                break;
            Order od = new Order(id);
            od.userRead(scan);
            od.read(scan);
            orderedjewelryList.add(od);
        }
    }

    public void searchAll() {
        String kwd = null;
        while (true) {
            System.out.print("번호: ");
            kwd = scan.next();
            if (kwd.contentEquals("end"))
                break;
            for (Order m : orderedjewelryList) {
                if (m.matches(kwd))
                    m.print();
            }
        }



    }


    public void printAll() {
        for (Order od : orderedjewelryList) {
            od.print();
        }
    }

}