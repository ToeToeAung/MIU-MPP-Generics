package Generics.GenericsEx3;

public class Test {
    static <T> void printData(T element){
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        printData(11);

        printData(34.0);

        printData("Hello world!");
    }
}
