package store;

import jewely_demo.OrderList;
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

    void mymain() {
        RingMgr engine = new RingMgr();
        engine.readAll("order.txt");
        OrderList.startGUI(engine);
    }
    public static void main(String[] args) {
        JewelryStore a = new JewelryStore();
        a.mymain();
    }

}
