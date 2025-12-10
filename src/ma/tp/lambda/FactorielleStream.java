package ma.tp.lambda;

import java.util.stream.IntStream;

public class FactorielleStream {
    public static void main(String[] args) {
        int n = 5;
        long fact = IntStream.rangeClosed(2, n)
                             .mapToLong(Long::valueOf)
                             .reduce(1, (a, b) -> a * b);
        System.out.println(n + "! = " + fact);
    }
}