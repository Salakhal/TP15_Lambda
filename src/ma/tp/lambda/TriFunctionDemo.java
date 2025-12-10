package ma.tp.lambda;

@FunctionalInterface
interface TriFunction<A, B, C, R> {
    R apply(A a, B b, C c);
}

public class TriFunctionDemo {
    public static void main(String[] args) {
        TriFunction<Double, Double, Double, Double> volume = (l, w, h) -> l * w * h;
        System.out.println("Volume: " + volume.apply(2.0, 3.0, 4.0));
    }
}