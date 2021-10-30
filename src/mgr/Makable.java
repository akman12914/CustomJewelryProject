package mgr;

import java.util.Scanner;

public interface Makable {
    void read(Scanner scan);
    /*void read();*/
    boolean matches(String kwd);
    void print();
}
