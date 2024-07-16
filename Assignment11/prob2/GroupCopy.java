package Generics.Assignment11.prob2;

public class GroupCopy {

    public static <T> Group<T> copyGroup(Group<? extends T> originalGroup) {
       T specialElement = originalGroup.getSpecialElement();
        Group<T> copy = new Group<>(specialElement);
        copy.elements.addAll(originalGroup.getElements());

        return copy;
    }

    public static void main(String[] args) {

        Group<Number> originalGroup = new Group<>(56);
        originalGroup.getElements().add(21);
        originalGroup.getElements().add(10.4);

        Group<Number> copiedGroup = copyGroup(originalGroup);

        System.out.println("Special element: " + copiedGroup.getSpecialElement());
        System.out.println("Elements: " + copiedGroup.getElements());
    }
}