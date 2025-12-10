package ma.tp.lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class CompositionFonctions {
    public static void main(String[] args) {
        Function<String, Integer> longueur = String::length;
        Function<Integer, Boolean> estPair = n -> n % 2 == 0;
        
        Function<String, Boolean> longueurEstPaire = longueur.andThen(estPair);
        System.out.println("'Bonjour' paire? " + longueurEstPaire.apply("Bonjour"));
        
        Predicate<String> commenceParA = s -> s.startsWith("A");
        Predicate<String> longueurSup5 = s -> s.length() > 5;
        
        System.out.println("A et Long: " + commenceParA.and(longueurSup5).test("Alphabet"));
    }
}