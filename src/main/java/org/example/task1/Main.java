package org.example.task1;

import java.util.ArrayList;
import java.util.List;

class HeavyBox {
    int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox = " + weight;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<HeavyBox> heavyBoxList = new ArrayList<>();

        HeavyBox h1 = new HeavyBox(1);
        HeavyBox h2 = new HeavyBox(2);
        HeavyBox h3 = new HeavyBox(3);
        HeavyBox h4 = new HeavyBox(4);
        HeavyBox h5 = new HeavyBox(5);
        HeavyBox h6 = new HeavyBox(6);

        heavyBoxList.add(h1);
        heavyBoxList.add(h2);
        heavyBoxList.add(h3);
        heavyBoxList.add(h4);
        heavyBoxList.add(h5);
        heavyBoxList.add(h6);

//        for (HeavyBox hb : heavyBoxList) {
//            System.out.println(hb);
//        }
//
        heavyBoxList.get(0).weight = 22;
//        System.out.println(heavyBoxList.get(0));

//        heavyBoxList.remove(5);
//        for (HeavyBox hb : heavyBoxList) {
//            System.out.println(hb);
//        }

        HeavyBox[] hb1 = (HeavyBox[]) (heavyBoxList.toArray(new HeavyBox[heavyBoxList.size()]));
        HeavyBox[] hb2 = new HeavyBox[heavyBoxList.size()];
        heavyBoxList.toArray(hb2);
        HeavyBox[] hb3 = new HeavyBox[heavyBoxList.size()];
        int i = 0;
        for (HeavyBox hb : heavyBoxList) {
            hb3[i++] = hb;
        }

        for (HeavyBox h : hb1) {
            System.out.println(h);
        }
    }
}
