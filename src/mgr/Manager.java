package mgr;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager<T extends Makable>{
    ArrayList<T> mList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void readAll(String filename, Factory<T> fac) {
        Scanner filein = openFile(filename);
        T m = null;
        while (filein.hasNext()) {
            m = (T) fac.create();
            m.read(filein);
            mList.add(m);
        }
        filein.close();
    }

    public T find(String kwd) {
        for (T m : mList) {
            if (m.matches(kwd))
                return m;
        }
        return null;
    }

    public void printAll() {
        for (T m : mList) {
            m.print();
        }
    }

    public List<T> findAll(String kwd) {
        List<T> results = new ArrayList<>();
        for (T m: mList)
            if (m.matches(kwd))
                results.add(m);
        return results;
    }
    public void search(Scanner keyScanner) {
        String kwd = null;
        while (true) {
            System.out.print(">> ");
            kwd = keyScanner.next();
            if (kwd.equals("end"))
                break;
            for (T m : mList) {
                if (m.matches(kwd))
                    m.print();
            }
        }
    }


    static Scanner openFile(String filename) {
        Scanner filein = null;
        try {
            filein = new Scanner(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("파일 입력 오류");
            System.exit(0);
        }
        return filein;
    }




}
