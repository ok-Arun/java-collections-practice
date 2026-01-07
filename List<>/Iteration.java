import java.util.*;

class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,5,6,7,5,1};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list); //[1, 2, 3, 5, 6, 7, 5, 1]
        
        for(int i =0; i<list.size(); i++){ //traditional Iteration
            int value = list.get(i);
            System.out.print(value+" "); //1 2 3 5 6 7 5 1 
        }
        System.out.print("\n");
        
        for(Integer value1 : list){ //Enhanced iteration
            System.out.print(value1+" "); //1 2 3 5 6 7 5 1 
        }
        
        System.out.print("\n");
        for(int i =0; i<list.size(); i++){
            int value2 = list.get(i);
            if(value2 == 3)
            list.remove((Integer) value2);
            System.out.print(value2+" ");//1 2 3 6 7 5 1  (It removed 3 but value2 has 3 stored so it printed 3 since one element is removed so other right value will shift to left 5 is now at 3s place and its index already printed so the next inddex will hold 6 value)
        }
        System.out.println("\n"+list); //[1, 2, 5, 6, 7, 5, 1]
        
        Iterator<Integer> it = list.iterator();// better version
        while (it.hasNext()) {
            if (it.next() == 5) {
                it.remove();
            }
        }
        System.out.println(list);//[1, 2, 6, 7, 1]
    }
}
