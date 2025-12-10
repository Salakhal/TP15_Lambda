package ma.tp.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparateurCompose {

    static class PersonneTri {
        private String nom; 
        private int age;
        
        public PersonneTri(String n, int a) { 
            this.nom = n; 
            this.age = a; 
        }
        
        public String getNom() { return nom; }
        public int getAge() { return age; }
        
        @Override
        public String toString() { return nom + " " + age; }
    }

    public static void main(String[] args) {
        List<PersonneTri> liste = Arrays.asList(
            new PersonneTri("Jean", 30),
            new PersonneTri("Ali", 20),
            new PersonneTri("Jean", 20)
        );
        
        Comparator<PersonneTri> comp = Comparator.comparing(PersonneTri::getNom)
                                                 .thenComparingInt(PersonneTri::getAge);
                                                 
        liste.stream()
             .sorted(comp)
             .forEach(System.out::println);
    }
}