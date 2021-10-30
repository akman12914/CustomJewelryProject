package store;

import java.util.Scanner;

public class Ring extends Jewelry{
    int size;
    public void read(Scanner scan) {
        super.read(scan);
        size = scan.nextInt();
    }
    @Override
    public boolean matches(String kwd) {
        return super.matches(kwd);
    }
    @Override
    public void print() {
        System.out.println("호수는" + size + "호입니다.");
    }
}
