package nl.hva.dmci.ict.se.datastructures.fibonacci;

import edu.princeton.cs.algs4.Stopwatch;

import java.math.BigInteger;

/**
 * A small program that calculates Fibonacci numbers.
 * This program is used by students to investigate the Fibonacci algorithm.
 * 
 * @author Huub van Thienen
 * @author Nico Tromp
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final int SIZE;

        if (args.length == 0) {
            SIZE = 100;
        } else {
            SIZE = Integer.parseInt(args[0]);
        }

        Stopwatch stopwatch = new Stopwatch();

        System.out.printf(" n %15s  (  lap \t total)\n", "fib(n)");
        for (int n = 1; n <= SIZE; n++) {
            double timeStart = stopwatch.elapsedTime();
            BigInteger fiboNumber = mijnFib(n);
            double timeEnd = stopwatch.elapsedTime();
            double lapTime = timeEnd - timeStart;
            System.out.printf("%2d %15d  (%.3f \t %.3f)\n", n, fiboNumber, lapTime, timeEnd);
        }
    }

    /**
     * Berekent het n-de Fibonacci-getal.
     *
     * @param n Het hoeveelste Fibonacci-getal
     * @return De waarde van het Fibonacco-getal
     */
    public static long fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    private static long a = 0;
    private static long b = 1;
    private static BigInteger c = new BigInteger(String.valueOf(a));
    private static BigInteger d = new BigInteger(String.valueOf(b));

    public static BigInteger mijnFib(long n) {

        if (n < 2) {
            BigInteger k = new BigInteger(String.valueOf(n));
            return k;
        } else {
            BigInteger k = new BigInteger(String.valueOf(n));
            k = c.add(d);
            c = d;
            d = k;
            return k;
        }
    }
}
