import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstSecondTask {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Carl", "Peter", "Alice", "Zack", "Tom", "Jey");

//        Завдання 1
        Stream<String> filtered =
                names
                        .stream()
                        .filter(number -> names.indexOf(number)%2 == 0)
                        .map((name) -> (names.indexOf(name)+1)+". "+ name);
        System.out.println(filtered.collect(Collectors.joining(", ")));


//        Завдання 2
        Stream<String> sorted =
                names
                        .stream()
                        .map(name -> name.toUpperCase())
                        .sorted();
        List<String> sortedList = sorted.collect(Collectors.toList());
        Collections.reverse(sortedList);
        System.out.println(sortedList);

    }
}
