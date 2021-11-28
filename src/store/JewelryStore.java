package store;

import jewely_demo.OrderList;
import mgr.Manager;


public class JewelryStore extends OrderManager {
    private static JewelryStore store = null;
    public JewelryStore(){};
    public static JewelryStore getInstance(){
        if(store ==null)
            store = new JewelryStore();
        return store;
    }
    static Manager userMgr = new Manager();

    public void mymain() {
        RingMgr engine = new RingMgr();
        engine.readAll("order.txt");
        OrderList.startGUI(engine);
    }


}
