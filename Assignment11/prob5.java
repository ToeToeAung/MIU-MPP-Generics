package Generics.Assignment11;

import java.util.*;

public class prob5 {
    public static <T extends Comparable<? super T>> T getsecondSmallest(List<T> list) {
        if (list == null || list.size() < 2) {
            throw new IllegalArgumentException("List must contain at least two elements.");
        }

        T smallest = null;
        T secondSmallest = null;

        for (T element : list) {
            if (smallest == null || element.compareTo(smallest) < 0) {
                secondSmallest = smallest;
                smallest = element;
            } else if (secondSmallest == null || element.compareTo(secondSmallest) < 0) {
                if (element.compareTo(smallest) != 0) { // Ensure it's not a duplicate of the smallest element
                    secondSmallest = element;
                }
            }
        }

        if (secondSmallest == null) {
            throw new NoSuchElementException("No second smallest element found.");
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(6, 6,8, 9, 5, 1);
        System.out.println("Second smallest in the List : " + getsecondSmallest(intList));

        List<String> strList = Arrays.asList("lamp", "monitor", "vga cable", "laptop", "phone");
        System.out.println("Second smallest in the List : " + getsecondSmallest(strList));
    }
}
