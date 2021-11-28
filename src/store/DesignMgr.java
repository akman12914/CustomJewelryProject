package store;

import mgr.Data;
import mgr.Manageable;

import java.util.List;

public class DesignMgr implements Data {
    private static DesignMgr mgr = null;
    private DesignMgr() {}
    public static DesignMgr getInstance() {
        if (mgr == null)
            mgr = new DesignMgr();
        return mgr;
    }
    public int getColumnNames() {
        return 0;
    }
    @Override
    public int getColumnCount() {
        return 0;
    }
    @Override
    public void readAll(String filename) {

    }

    @Override
    public List<Manageable> search(String kwd) {
        return null;
    }

    @Override
    public void addNewItem(String[] uiTexts) {

    }

    @Override
    public void update(String[] uiTexts) {

    }

    @Override
    public void remove(String kwd) {

    }
}
