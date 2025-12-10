package ma.tp.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CompteurTODO {
    public static void main(String[] args) throws IOException {
        try (Stream<Path> walk = Files.walk(Paths.get("."))) {
            long count = walk.filter(p -> p.toString().endsWith(".java"))
                             .mapToLong(p -> {
                                 try { return Files.lines(p).filter(l -> l.contains("TODO")).count(); }
                                 catch (IOException e) { return 0; }
                             }).sum();
            System.out.println("Total TODOs: " + count);
        }
    }
}