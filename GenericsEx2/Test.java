package Generics.GenericsEx2;

public class Test <T,U>{
    T obj1;
    U obj2;

    public Test(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void printData(){
        System.out.println(obj1);
        System.out.println(obj2);
    }

}
