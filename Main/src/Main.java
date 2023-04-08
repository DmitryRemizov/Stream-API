import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveIntList = new ArrayList<>();
        List<Integer> evenIntList = new ArrayList<>();

        for (Integer number : intList) {
            if (number > 0) {
                positiveIntList.add(number);
            }
        }

        for (Integer number : positiveIntList) {
            if (number % 2 == 0) {
                evenIntList.add(number);
            }
        }

        Collections.sort(evenIntList);

        for (Integer number : evenIntList) {
            System.out.println(number);
        }
    }
}