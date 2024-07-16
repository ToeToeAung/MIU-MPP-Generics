package Generics.Assignment11;
import java.util.List;
import java.util.ArrayList;

public class prob1a {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
       // List<Number> nums = ints; //Compiler Error
       // nums.add(3.14);
    }
}
