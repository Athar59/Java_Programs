/*
Using loops in lambda expressions (Java 8+)

Iterating over collections using lambda expressions and the Stream API.

In this example, we use lambda expressions to filter and modify a list.
*/
import java.util.List;
import java.util.stream.Collectors;

public class LoopsUsingLambdas {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenSquares = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .map(n -> n * n)
                                           .collect(Collectors.toList());
                                           
        System.out.println(evenSquares);
    }
}

//OUTPUT******************

// [4, 16, 36, 64, 100]