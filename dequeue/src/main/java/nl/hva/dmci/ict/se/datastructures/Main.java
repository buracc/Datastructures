package nl.hva.dmci.ict.se.datastructures;

public class Main {

    public static void main(String[] args) {

        Deque<String> words = new Deque<String>();
        words.pushLeft("Datastructuren");
        words.pushLeft("is");
        words.pushRight("heel");
        words.pushRight("leuk");
        words.pushLeft("of");
        words.pushRight("niet?");
        words.changeLeft(3, "test");
        words.changeRight(3, "een");
        words.changeLeft(5, "Dit");
        words.changeLeft(0, words.popRight());
        words.popRight();
        for (String e : words) {
            System.out.println(e);
        }

        System.out.println("----------------------");
        Deque<Integer> numbers = new Deque<>();
        numbers.pushLeft(1);
        numbers.pushRight(2);
        numbers.pushLeft(3);
        numbers.pushLeft(numbers.popLeft() - numbers.popRight());
        numbers.pushRight(2);
        numbers.pushLeft(5);
        numbers.pushLeft(5);
        numbers.pushRight(8);
        numbers.pushRight(numbers.popRight() - numbers.popLeft());
        numbers.pushRight(3);
        numbers.pushRight(9);
        numbers.pushRight(13);
        numbers.pushRight(7 * numbers.changeLeft(4, numbers.popLeft()));
        numbers.changeRight(2, 8);
        numbers.changeLeft(6, numbers.changeRight(1, 0));
        for (Integer e : numbers) {
            System.out.println(e);
        }
    }
}
