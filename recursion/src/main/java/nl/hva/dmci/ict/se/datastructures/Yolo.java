package nl.hva.dmci.ict.se.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Yolo implements DictionaryGenerator {

    @Override
    public String[] yololian(int n){

        String yo = "yo";
        String lo = "lo";

        if (n == 1) {
            return new String[] {yo, lo};
        }

        List<String> list = new ArrayList<String>();

        for (String s : yololian(n - 1)){
            list.add(s + yo);
            list.add(s + lo);
        }

        return list.toArray(new String[list.size()]);
    }

    @Override
    public String[] language(int n, String[] syllables) {
        return new String[0];
    }
}
