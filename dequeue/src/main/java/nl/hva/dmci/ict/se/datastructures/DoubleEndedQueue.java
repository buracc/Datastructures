package nl.hva.dmci.ict.se.datastructures;

/**
 * Double Ended Queue zoals beschreven op pagina 167 van het boek van Sedgewick en Wayne. <br>
 * <br>
 * <b>Tip:</b> implementeer eerste de methodes die beschreven zijn in het boek van Sedgewick en
 * Wayne en daarna pas de extra methodes <code>changeLeft</code> en <code>changeRight</code>.
 */
public interface DoubleEndedQueue<T> {
    /**
     * Zie Sedgewick en Wayne.
     */
    boolean isEmpty();

    /**
     * Zie Sedgewick en Wayne.
     */
    int size();

    /**
     * Zie Sedgewick en Wayne.
     */
    void pushLeft(T item);

    /**
     * Zie Sedgewick en Wayne.
     */
    void pushRight(T item);

    /**
     * Zie Sedgewick en Wayne.
     */
    T popLeft();

    /**
     * Zie Sedgewick en Wayne.
     */
    T popRight();

    /**
     * Vervangt het element op de <code>n</code>de plaats van links met de waarde van
     * <code>item</code> en geeft de oorspronkelijke waarde van het element terug.
     * 
     * @param n
     *            de plaats van het element geteld vanaf links dat vervangen moet worden.
     * @param newItem
     *            de nieuwe waarde voor het element.
     * @return de oude waarde van het element op plaats <code>n</code>.
     */
    T changeLeft(int n, T newItem);

    /**
     * Vervangt het element op de <code>n</code>de plaats van rechts met de waarde van
     * <code>item</code> en geeft de oorspronkelijke waarde van het element terug.
     * 
     * @param n
     *            de plaats van het element geteld vanaf rechts dat vervangen moet worden.
     * @param newItem
     *            de nieuwe waarde voor het element.
     * @return de oude waarde van het element op plaats <code>n</code>.
     */
    T changeRight(int n, T newItem);
}
