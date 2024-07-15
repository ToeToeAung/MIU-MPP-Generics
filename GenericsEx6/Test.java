package Generics.GenericsEx6;

import java.util.*;

class Test {
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();

        al.add("Sachin");
        al.add("Rahul");

      //Typecasting is not needed
        String s1 = al.get(0);
        String s2 = al.get(1);
    }
}