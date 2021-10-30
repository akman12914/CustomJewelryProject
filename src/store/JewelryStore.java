package store;

import mgr.Manager;

public class JewelryStore extends OrderManager {
    static Manager userMgr = new Manager();

    void run() {
        readAll();
        printAll();
    }
    public static void main(String[] args) {
        JewelryStore my = new JewelryStore();
        my.run();
    }

}
