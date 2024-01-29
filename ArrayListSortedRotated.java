// import ArrayList

import java.util.ArrayList;

public class ArrayListSortedRotated {

    public static void main(String args[]){

        // Create an ArrayList

        ArrayList <Integer> list = new ArrayList<>();

        // add elements to the ArrayList

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        // Printing the list

        System.out.println(list);

        int target = 16;

        // Brute Force

        // bruteForce(list, target);

        // Optimized approach - 2 pointer - O(n)

        optimized(list, target);
    }


    // Brute force approach - O(n^2)

    static void bruteForce(ArrayList <Integer> list, int target){


        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j)== target){
                    System.out.println("Pairs are: "+i+ " and "+j);
                }
            }
        }

    }

    // 2 Pointer approach - O(n)
    static void optimized(ArrayList <Integer> list, int target){
        int leftPt=0, rightPt=0;

        // to find the pivot

        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)>list.get(i+1)){
                leftPt = i+1;
                rightPt = i;
            }
        }

        while (leftPt!=rightPt) {
            // if current pair sum is target

            if(list.get(leftPt)+list.get(rightPt)== target){
                System.out.println("Pairs are: "+leftPt+" and "+rightPt);
                return;
            }

            // case 1

            if(list.get(leftPt)+list.get(rightPt)<target){
                leftPt= (leftPt+1)%list.size();
            }

            //  case 2
            else{
                rightPt= (rightPt-1+list.size())%list.size();
            }

        }
    }

}
