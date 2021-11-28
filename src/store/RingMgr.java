package store;
import java.util.List;
import java.util.Scanner;

import facade.DataEngineInterface;
import mgr.Factory;
import mgr.Manageable;
import mgr.Manager;

public class RingMgr implements DataEngineInterface{
    // 테이블의 헤더 데이터 제공 부분
    private static final String[] labels = {"주문번호", "디자인", "반지색", "탄생석","호수",};
    @Override
    public int getColumnCount() {
        return labels.length;
    }
    // 테이블의 열 제목을 스트링 배열로 돌려줌
    public String[] getColumnNames() {
        return labels;
    }
    // GUI에서 호출할 메소드들, DataEngineInterface의 구현 메소드들
    Scanner scan = new Scanner(System.in);
    private Manager mgr = new Manager();
    @Override
    public void readAll(String filename) {
        mgr.readAll("order.txt", new Factory() {
            public Manageable create() {
                return new Ring();
            }
        });
    }
    @Override
    public List<Manageable> search(String kwd) {
        if (kwd == null)
            return mgr.mList;
        return mgr.findAll(kwd);
    }
    @Override
    public void addNewItem(String[] editTexts) {
        // TODO Auto-generated method stub
        Ring s = new Ring();
        s.set(editTexts);
        mgr.mList.add(s);
    }
    @Override
    public void update(String[] editTexts) {
        // TODO Auto-generated method stub
        Ring s = (Ring)mgr.find(editTexts[0]);
        s.set(editTexts);
    }
    @Override
    public void remove(String kwd) {
        // TODO Auto-generated method stub
        Ring s = (Ring)mgr.find(kwd);
        mgr.mList.remove(s);
    }
}
