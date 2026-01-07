import java.util.*;
class Main {
    public static void main(String[] args) {
        Integer arr[]= {1,2,3,4,1,2,3};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list+"\n");
        list.add(12);
        list.remove(1); // removes index 1 element
        list.remove((Integer) 1); // removes value equals to 1
        System.out.println(list);
        list.set(5, 10);
        System.out.println(list);
        list.add(5, 9);
        System.out.println(list);
        System.out.println("Index of value 1: "+list.indexOf(1)); // index of value 1
        System.out.println("Value of index 1: "+list.get(1)+"\n"); // value of index 1
        
        
        
        List<Integer> list1 = Arrays.asList(1,2,3,4,1,2,3); //immutable- cant add or remove element 
        System.out.println(list1+"\n");
        //list1.add(12); // gives error
        
        List <Integer> list2 = new ArrayList<>();
        list2.add(5);
        System.out.println(list2);
    }
}
