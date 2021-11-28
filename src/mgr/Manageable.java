package mgr;

import java.util.Scanner;

public interface Manageable {
    void read(Scanner scan);
    /*void read();*/
    boolean matches(String kwd);
    void print();
}
