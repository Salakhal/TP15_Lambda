package ma.tp.lambda;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class Memoizer {
    public static <T, R> Function<T, R> memoize(Function<T, R> func) {
        Map<T, R> cache = new ConcurrentHashMap<>();
        return input -> cache.computeIfAbsent(input, func);
    }

    public static void main(String[] args) {
        Function<Integer, Integer> carre = memoize(x -> {
            System.out.println("Calcul pour " + x);
            return x * x;
        });
        
        System.out.println(carre.apply(5)); 
        System.out.println(carre.apply(5)); 
    }
}