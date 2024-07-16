package Generics.Assignment11;

import java.util.ArrayList;
import java.util.List;

public class prob1b {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
     //   nums.add(3.14); // Compiler Error
    }
}
