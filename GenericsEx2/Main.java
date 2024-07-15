package Generics.GenericsEx2;

public class Main {
    public static void main(String[] args) {
        Test<String, Integer> obj1= new Test<String,Integer>("Test one",45);
        obj1.printData();
    }
}
