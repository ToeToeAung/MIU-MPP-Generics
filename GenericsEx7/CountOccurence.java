package Generics.GenericsEx7;

public class CountOccurence {


    public static void main(String[] args) {
        String[] arr = {"monitor", "lamp", "laptop", null, "monitor", null};
        int count = countOccurence(arr, "monitor");
        System.out.println("Monitor count" + count);
        int nullCount = countOccurence(arr, null);
        System.out.println("Null count" + count);
    }

    public static <T> int countOccurence(T[] arr, T target) {
        int count = 0;
        if(target == null){
            for(T item:arr){
                if(item==null){
                    count ++;
                }
            }
        }else{
            for(T item:arr){
                if(target.equals(item)){
                    count++;
                }
            }
        }
        return count;
    }

}
