package mgr;

import java.util.List;

public interface Data {
    int getColumnCount();
    int getColumnNames();
    void readAll(String filename);
    List<Makable> search(String kwd);
    void addNewItem(String[] uiTexts);
    void update(String[] uiTexts);
    void remove(String kwd);
}
