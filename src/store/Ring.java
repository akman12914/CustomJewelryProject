package store;

import facade.UIData;
import mgr.Manageable;

import java.util.Scanner;

public class Ring implements Manageable, UIData {
    // 010-6307-9287 디자인 골드 다이아 3
    String orderid;
    String design;
    String color;
    String stone;
    int size;
    int time;
    public void set(Object[] row) {
        orderid = (String)row[0];
        design = (String)row[1];
        color = (String)row[2];
        stone = (String)row[3];
        size = Integer.parseInt((String)row[4]);
    }
    @Override
    public void read(Scanner scan) {
        orderid = scan.next();
        design = scan.next();
        color = scan.next();
        stone = scan.next();
        size = scan.nextInt();
    }
    @Override
    public void print() {
        System.out.printf("[반지 색상: %s] [탄생석: %s] [사이즈: %s호]\n", color, stone, size);
    }

    @Override
    public boolean matches(String n) {
        if (orderid.equals(n))
            return true;
        if (color.contains(n))
            return true;
        return stone.equals(n);

    }
    @Override
    public String toString() {
        return String.format("%s(%s)", orderid, stone);
    }
    @Override
    public String[] getUiTexts() {
        return new String[] {""+orderid, design, color, stone, ""+size};
    }
}
