import java.util.ArrayList;


public class ArrayListMaximum {
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();

        list.add(8);
        list.add(2);
        list.add(4);
        list.add(10);
        list.add(5);
        int max=Integer.MIN_VALUE;

        // Maximum in ArrayList
        for(int i=0; i<list.size(); i++){
            // if(list.get(i) > max){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }

        System.out.println(max);
    }
}
