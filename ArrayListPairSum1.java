// import ArrayList

import java.util.ArrayList;

public class ArrayListPairSum1 {
    public static void main(String args[]){

        // Create an ArrayList

        ArrayList <Integer>  list= new ArrayList<>();

        // Add elements to the list

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // Print the list

        System.out.println(list);

        int target =5;

        // bruteForce(list, target);

        optimzed(list, target);
    }


    static void bruteForce(ArrayList <Integer> list, int target){


        // Brute force approcach - O(n^2)

        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j)== target){
                    System.out.println("Pairs are "+i+" and "+j);
                }
            }
        }

    }


        // 2 pointer approach - O(n)
    static void optimzed(ArrayList <Integer> list, int target){

        int leftPt = 0;
        int rightPt = list.size()-1;

        // 2 pointer approach

        while(leftPt<rightPt){
            if((list.get(leftPt)+list.get(rightPt))==target){
                System.out.println("Pairs are "+leftPt+" and "+rightPt);

            }


            if(list.get(leftPt)+list.get(rightPt)<target){
                leftPt++;
            }
            else{
                rightPt--;
            }
        }
    }
}
