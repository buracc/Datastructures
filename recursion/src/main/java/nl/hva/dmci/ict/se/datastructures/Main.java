package nl.hva.dmci.ict.se.datastructures;

public class Main {

    public static void main (String[] args) {

        //Stijgend (Opdracht 1)
        Recursion r = new Recursion();

        //Yololian (Opdracht 2)
        Yolo y = new Yolo();
        int n = 2;

        for (String s : y.yololian(n)) {
            System.out.println(s);
        }
    }
}
