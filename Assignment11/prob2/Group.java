package Generics.Assignment11.prob2;

import java.util.ArrayList;
import java.util.List;

public class Group<T> {
    private T specialElement;
    List<T> elements;

    public Group(T specialElement) {
        this.specialElement = specialElement;
        this.elements = new ArrayList<>();
    }

    public T getSpecialElement() {
        return specialElement;
    }

    public List<T> getElements() {
        return elements;
    }
}



