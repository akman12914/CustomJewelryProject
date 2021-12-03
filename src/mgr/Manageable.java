package mgr;

import java.util.Scanner;

public interface Manageable {
    void read(Scanner scan);
    boolean matches(String kwd);
    void print();
}
