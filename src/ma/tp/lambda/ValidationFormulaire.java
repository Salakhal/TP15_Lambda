package ma.tp.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Validateur<T> {
    private final List<Regle<T>> regles = new ArrayList<>();
    
    public Validateur<T> ajouterRegle(Predicate<T> test, String message) {
        regles.add(new Regle<>(test, message));
        return this;
    }
    
    public List<String> valider(T valeur) {
        List<String> erreurs = new ArrayList<>();
        for (Regle<T> r : regles) {
            if (!r.test.test(valeur)) erreurs.add(r.message);
        }
        return erreurs;
    }
    
    private static class Regle<T> {
        Predicate<T> test; String message;
        Regle(Predicate<T> t, String m) { test = t; message = m; }
    }
}

public class ValidationFormulaire {
    public static void main(String[] args) {
        Validateur<String> valEmail = new Validateur<String>()
            .ajouterRegle(s -> s.contains("@"), "Pas de @");
            
        System.out.println("Erreurs 'test': " + valEmail.valider("test"));
        System.out.println("Erreurs 'a@b': " + valEmail.valider("a@b"));
    }
}