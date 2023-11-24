import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdTask {
    public static void main(String[] args) {
        String[] numbers = {"1, 2, 0", "4, 5"};

        List<Integer> integers = Arrays.stream(numbers)
                .flatMap(s -> Arrays.stream(s.split(", "))
                        .map(str -> Integer.parseInt(str)))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(integers.stream()
                .map(s -> String.valueOf(s))
                .collect(Collectors.joining(", ")));
    }
}
