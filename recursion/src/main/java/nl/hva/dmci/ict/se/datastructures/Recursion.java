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
            int i = 0;
            int verschil = rijtje.get(i).compareTo(rijtje.get(i + 1));

            if (rijtje.size() < 2) {
                return false;
            }

            if (rijtje.size() == 2) {
                if (verschil == -1 || verschil == 0) {
                    return true;
                }
            }

            if (verschil == 1) {
                return false;
            }

            if (verschil == -1) {
                rijtje.remove(i);
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
