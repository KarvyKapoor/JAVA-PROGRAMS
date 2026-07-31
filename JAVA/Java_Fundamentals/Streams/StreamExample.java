import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Alice",
                "Bob",
                "Charlie",
                "David"
        );

        names.stream()
             .filter(name -> name.length() > 3)
             .forEach(System.out::println);
    }
}