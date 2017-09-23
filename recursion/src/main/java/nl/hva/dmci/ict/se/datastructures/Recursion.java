package nl.hva.dmci.ict.se.datastructures;

import java.util.List;

public class Recursion implements RijtjesControle {

    @Override
    public <T extends Comparable<T>> boolean isDalend(List<T> rijtje) {
        return false;
    }

    @Override
    public <T extends Comparable<T>> boolean isStijgend(List<T> rijtje) {
        {
            if (rijtje.size() < 2) {
                return false;
            }

            int count = 0;
            int last = (Integer)rijtje.get(count);
            int next = (Integer)rijtje.get(count + 1);

            if (next < last) {
                return false;
            } else if (next > last){
                rijtje.remove(0);
                return isStijgend(rijtje);
            }
            return true;
        }
    }

    @Override
    public <T extends Comparable<T>> boolean isGelijk(List<T> rijtje) {
        return false;
    }
}
