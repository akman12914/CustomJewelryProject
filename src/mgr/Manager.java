package mgr;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    ArrayList<Makable> mList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void readAll(String filename, Factory fac) {
        Scanner filein = openFile(filename);
        Makable m = null;
        while (filein.hasNext()) {
            m = fac.create();
            m.read(filein);
            mList.add(m);
        }
        filein.close();
    }

    public Makable find(String kwd) {
        for (Makable m : mList) {
            if (m.matches(kwd))
                return m;
        }
        return null;
    }

    public void printAll() {
        for (Makable m : mList) {
            m.print();
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
