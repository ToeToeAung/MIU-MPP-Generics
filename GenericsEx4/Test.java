package Generics.GenericsEx4;

import java.util.*;
//Not using Generics can cause runtime exception
class Test
{
    public static void main(String[] args)
    {
        // Creatinga an ArrayList without any type specified
        ArrayList al = new ArrayList();

        al.add("Sachin");
        al.add("Rahul");
        al.add(10); // Compiler allows this with integer

        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);

        String s3 = (String)al.get(2); // This causes runtime exception
    }
}