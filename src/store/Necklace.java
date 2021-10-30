package store;

import java.util.Scanner;

public class Necklace extends Jewelry{
    String chain;
    public void read(Scanner scan) {
        super.read(scan);
        System.out.print("체인 옵션을 선택하세요.");
        System.out.print("도금/도은/써지컬");
        chain = scan.next();
    }
    @Override
    public boolean matches(String kwd) {
        return super.matches(kwd);
    }
    @Override
    public void print() {
        super.print();
        System.out.print("[옵션]체인 : " + chain);
    }
}
