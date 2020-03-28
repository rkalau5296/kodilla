package accenture;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Exercise {
    public List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {

        List<Integer> result = integers.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == numberOfDuplicates)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        result.forEach(System.out::println);

        return  result;
    }

    public static void main(String[] args) {
        List<Integer> integerList = asList(-1, 1, 3, 2, 5, 6, -1, 3, 6);
        System.out.println(integerList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }
}
