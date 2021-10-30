package store;

import java.util.Scanner;

public class Earring extends Jewelry{

    String earcuff;
    public void read(Scanner scan,Order order) {
        super.read(scan);
        System.out.print("귀찌로 변경하겠습니까?y/n");
        earcuff = scan.next();
    }
    @Override
    public boolean matches(String kwd) {
        return super.matches(kwd);
    }
    @Override
    public void print() {
        super.print();
        if(earcuff.contentEquals("y")) {
            System.out.println("[옵션]귀찌로 변경");
        }
    }

}
