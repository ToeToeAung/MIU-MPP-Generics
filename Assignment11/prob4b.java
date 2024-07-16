package Generics.Assignment11;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;;
public class prob4b {

    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>();
        objs.add(1);
        objs.add("two");
        List<? super Integer> ints = objs;
        ints.add(3);
     //   double dbl = sum(ints); // Compiler Error

    }

    public static double sum(Collection<? extends Number> nums){
        double s = 0.0;
        for(Number num : nums) s += num.doubleValue();
        return s;
    }

}
