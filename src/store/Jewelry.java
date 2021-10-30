package store;

import mgr.Makable;
import java.util.Scanner;

abstract class Jewelry implements Makable{
    String id;
    String category;
    String color;
    String stone;
    int carat;
    String design;

    public void read(Scanner scan) {
        category = scan.next();
        color = scan.next();
        stone = scan.next();
        carat = scan.nextInt();
        design = scan.next();
    }
    @Override
    public boolean matches(String kwd) {
        if (category.contains(kwd))
            return true;
		/*if (kwd.length() > 2 && id.contains(kwd))
			return true;*/
        return false;
    }
    @Override
    public void print() {
        System.out.println(color + "색상" + carat + "캐럿" + stone + category + design
                + " 디자인 주문이 완료되었습니다.");
    }


}
