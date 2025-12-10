package ma.tp.lambda;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TraitementAsynchrone {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        CompletableFuture.supplyAsync(() -> {
            try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) {}
            return "Données";
        }, executor)
        .thenApply(s -> s.toUpperCase())
        .thenAccept(s -> System.out.println("Reçu: " + s))
        .join();
        
        executor.shutdown();
    }
}