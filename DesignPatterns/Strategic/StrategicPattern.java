package DesignPatterns.Strategic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Strategy interface
interface FilterStrategy {
    List<Integer> filter(List<Integer> input);
}

// Concrete strategy: PositiveFilter
class PositiveFilter implements FilterStrategy {
    @Override
    public List<Integer> filter(List<Integer> input) {
        List<Integer> result = new ArrayList<>();
        for (int num : input) {
            if (num > 0) {
                result.add(num);
            }
        }
        return result;
    }
}

// Concrete strategy: OddFilter
class OddFilter implements FilterStrategy {
    @Override
    public List<Integer> filter(List<Integer> input) {
        List<Integer> result = new ArrayList<>();
        for (int num : input) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }
        return result;
    }
}

// Context class
class ArrayFilter {
    private FilterStrategy filterStrategy;

    public ArrayFilter(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public void setFilterStrategy(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public List<Integer> filterArray(List<Integer> input) {
        return filterStrategy.filter(input);
    }
}

public class StrategicPattern {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-3, 5, 1, -8, 10, 7);

        // PositiveFilter strategy
        ArrayFilter positiveFilter = new ArrayFilter(new PositiveFilter());
        List<Integer> positiveNumbers = positiveFilter.filterArray(numbers);
        System.out.println("Positive Numbers: " + positiveNumbers);

        // OddFilter strategy
        ArrayFilter oddFilter = new ArrayFilter(new OddFilter());
        List<Integer> oddNumbers = oddFilter.filterArray(numbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }
}
