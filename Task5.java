import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());

        long n = Math.min(firstList.size(), secondList.size());

        Stream<T> bigStream = Stream.concat(firstList.stream().limit(n), secondList.stream().limit(n)) ;
        return bigStream;
    }

    public static void main(String[] args) {
        Stream<Integer> first = Arrays.asList(1,2,3,4,5).stream();
        Stream<Integer> second = Arrays.asList(6,7).stream();
        zip(first, second).forEach(System.out::println);
    }
}
