package ma.tp.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAvance { // <-- T2kkad an l-fichier smito StreamAvance.java

    // SOLUTION: Derna 'static' w dkhlnaha l-dakhil bach ma dirch conflit
    static class PersonneStream {
        private String nom;
        private int age;
        private String ville;
        
        public PersonneStream(String nom, int age, String ville) {
            this.nom = nom;
            this.age = age;
            this.ville = ville;
        }
        
        public String getNom() { return nom; }
        public int getAge() { return age; }
        public String getVille() { return ville; }
        
        @Override
        public String toString() {
            return nom + " (" + age + ") - " + ville;
        }
    }

    public static void main(String[] args) {
        List<PersonneStream> personnes = Arrays.asList(
            new PersonneStream("Jean", 25, "Paris"),
            new PersonneStream("Marie", 30, "Lyon"),
            new PersonneStream("Pierre", 20, "Paris"),
            new PersonneStream("Sophie", 35, "Lyon"),
            new PersonneStream("Paul", 40, "Marseille")
        );
        
        // 1. Grouper par ville
        Map<String, List<PersonneStream>> parVille = personnes.stream()
               .collect(Collectors.groupingBy(PersonneStream::getVille));
        System.out.println("Personnes par ville: " + parVille);
        
        // 2. Âge moyen
        double ageMoyen = personnes.stream()
               .mapToInt(PersonneStream::getAge)
               .average()
               .orElse(0);
        System.out.println("Âge moyen: " + ageMoyen);
        
        // 3. Personne la plus âgée
        PersonneStream plusAgee = personnes.stream()
               .max((p1, p2) -> p1.getAge() - p2.getAge())
               .orElse(null);
        System.out.println("Personne la plus âgée: " + plusAgee);
        
        // 4. Parisiens en majuscules
        List<String> parisiens = personnes.stream()
               .filter(p -> p.getVille().equals("Paris"))
               .map(PersonneStream::getNom)
               .map(String::toUpperCase)
               .collect(Collectors.toList());
        System.out.println("Parisiens: " + parisiens);
    }
}