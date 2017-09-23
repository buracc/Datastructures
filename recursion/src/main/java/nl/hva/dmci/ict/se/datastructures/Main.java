package nl.hva.dmci.ict.se.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main (String[] args) {

        //Stijgend (Opdracht 1)
        Recursion r = new Recursion();
        ArrayList<Integer> stijgend = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> niet_stijgend = new ArrayList<>(Arrays.asList(4,3,2,1));
        System.out.println(r.isStijgend(stijgend));
        System.out.println(r.isStijgend(niet_stijgend));

        //Yololian (Opdracht 2)
        Yolo y = new Yolo();
        int n = 1;

        for (String s : y.yololian(n)) {
            System.out.println(s);
        }
    }
}
