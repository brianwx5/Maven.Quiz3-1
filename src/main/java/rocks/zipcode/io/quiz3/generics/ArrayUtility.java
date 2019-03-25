package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for (SomeType value: array) {
            if(getNumberOfOccurrences(value) % 2 != 0) {
                return value;
            }
        } return null;
    }

    public SomeType findEvenOccurringValue() {
        for (SomeType value: array) {
            if(getNumberOfOccurrences(value) % 2 == 0) {
                return value;
            }
        } return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer counter = 0;
        for (SomeType value: array) {
            if(value.equals(valueToEvaluate)) {
                counter++;
            }
        } return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> someTypeOfList = new ArrayList<>();
        for (SomeType value: array) {
            if(predicate.apply(value)) {
                someTypeOfList.add(value);
            }
        }

        SomeType[] filteredArray = Arrays.copyOf(array,someTypeOfList.size());
        return someTypeOfList.toArray(filteredArray);
    }
}
