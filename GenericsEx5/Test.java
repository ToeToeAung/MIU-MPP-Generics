package Generics.GenericsEx5;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        //Compiler doesn't allow this.
      //  list.add(10);
        String st1=list.get(0);
        String st2=list.get(1);

        System.out.println(st2);

    }
}
