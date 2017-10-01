package nl.hva.dmci.ict.se.datastructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements DoubleEndedQueue<Item>, Iterable<Item> {
    private int size;
    private Node first;
    private Node last;

    public Deque() {
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return (this.first == null);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void pushLeft(Item item) {
        Node newNode = new Node(item, first, null);
        if (first != null) {
            first.prev = newNode;
        }
        first = newNode;
        if (last == null) {
            last = newNode;
        }
        size++;
    }

    @Override
    public void pushRight(Item item) {
        Node newNode = new Node(item, null, last);

        if (last != null) {
            last.next = newNode;
        }
        last = newNode;
        if (first == null) {
            first = newNode;
        }
        size++;
    }

    @Override
    public Item popLeft() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        Node popped = first;
        first = first.next;
        first.prev = null;
        size--;
        return popped.element;
    }

    @Override
    public Item popRight() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        Node popped = last;
        last = last.prev;
        last.next = null;
        size--;
        return popped.element;
    }

    @Override
    public Item changeLeft(int n, Item newItem) {
        if (first != null) {
            Node current = first;
            for (int i = 0; i < n; i++) {
                if (current.next != null) {
                    current = current.next;
                } else {
                    throw new NoSuchElementException();
                }
            }
            Item old = current.element;
            current.element = newItem;
            return old;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public Item changeRight(int n, Item newItem) {
        if (last != null) {
            Node current = last;
            for (int i = 0; i < n; i++) {
                if (current.prev != null) {
                    current = current.prev;
                } else {
                    throw new NoSuchElementException();
                }
            }
            Item old = current.element;
            current.element = newItem;
            return old;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new DequeIterator();
    }


    /**
     * Inner classes
     */
    private class Node {
        public Node next;
        public Node prev;
        public Item element;

        public Node(Item element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private class DequeIterator implements Iterator<Item> {
        private Node current;

        public DequeIterator() {
            this.current = new Node(null, first, null);
        }

        @Override
        public boolean hasNext() {
            return (current.next != null);
        }

        @Override
        public Item next() {
            if (hasNext()) {
                current = current.next;
                return current.element;
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}