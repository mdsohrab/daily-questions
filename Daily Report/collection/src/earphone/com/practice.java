package earphone.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class practice {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(23,423,23,4,242,24);
        List<Integer> numbersAl = new ArrayList<>(numbers);
        System.out.println("Before Sorting the ArrayList");
        System.out.println(numbersAl);
        System.out.println("After sorting the ArrayList");
        Collections.sort(numbersAl);
        System.out.println(numbersAl);

    }
}
