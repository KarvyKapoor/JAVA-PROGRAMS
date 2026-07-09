import java.util.*;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted((a,b) -> b - a)
                .forEach(System.out::println);
    }
}