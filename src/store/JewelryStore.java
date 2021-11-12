package store;

import mgr.Manager;

public class JewelryStore extends OrderManager {
    private static JewelryStore store = null;
    private JewelryStore(){};
    public static JewelryStore getInstance(){
        if(store ==null)
            store = new JewelryStore();
        return store;
    }
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
