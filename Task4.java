import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {

        long a = 25214903917L;
        long c = 11L;
        long m = 2^48L;

        Stream<Long> generator = Stream.iterate(1L, x -> (a * x * c) % m);
        generator.forEach(System.out::println);

    }
}
