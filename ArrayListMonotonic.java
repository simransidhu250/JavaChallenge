// import ArrayList

import java.util.ArrayList;

public class ArrayListMonotonic {
    public static void main(String args[]){

        // Create ArrayList

        ArrayList <Integer> list = new ArrayList<>();

        // add elements

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        // printing list

        System.out.println(list);

        if(monotonic(list)){
            System.out.println("Array List is monotonic");
        }
        else{
            System.out.println("Array List is not monotonic");
        }



    }

    static boolean monotonic(ArrayList <Integer> list){

        boolean inc=true,dec=true;

        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)<list.get(i+1)){
                dec = false;
            }
            if(list.get(i)>list.get(i+1)){
                inc = false;
            }
        }

        return dec||inc;
    }


}
