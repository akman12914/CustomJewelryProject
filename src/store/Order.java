package store;

import java.util.ArrayList;
import java.util.Scanner;

import mgr.Makable;
import mgr.Manager;

public class Order extends Jewelry implements Makable{

    int orderId;
    String orderDate;
    String phonenumber;
    String Lettering;
    String userId;
    boolean couple;
    boolean present;
    ArrayList<Jewelry> orderedjwelryList = new ArrayList<>();
    User user;
    String code;
    Order(int id) {
        this.orderId = id;
    }

    @Override
    public void read(Scanner scan) {
        System.out.println("회원 아이디 : ");
        userId = scan.next();
        user = (User) JewelryStore.userMgr.find(userId);
        System.out.println("주문 날짜 : ");
        orderDate = scan.next();
        System.out.println("주얼리 종류: ");
        category = scan.next();
        System.out.println("원석 : ");
        stone = scan.next();
        System.out.println("색상 : ");
        color = scan.next();
        System.out.println("캐럿 : ");
        carat = scan.nextInt();
        System.out.println("디자인 : ");
        design = scan.next();
    }

    @Override
    public boolean matches(String kwd) {
        return false;
    }

    @Override
    public void print() {
        System.out.println(userId + "님.");
        super.print();
    }

}
