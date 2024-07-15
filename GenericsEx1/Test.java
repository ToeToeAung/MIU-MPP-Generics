package Generics.GenericsEx1;

class Test<T> {
    T obj;
    Test(T obj) { this.obj = obj; }
    public T getObject() { return this.obj; }
}