public class RecursionPrintNumbers {
    public static void main(String args[]){
        decreasingOrder(10); 
        System.out.println();
        increasingOrder(10);
        
    }

    public static void decreasingOrder(int num){
        if(num == 1){       //exit condition from recursive function
            System.out.print(num);
            return;
        }
        System.out.print(num+"\t");
        decreasingOrder(num-1);
    }

    public static void increasingOrder(int num){
        if(num == 1){       //exit condition from recursive function
            System.out.print(num+"\t");
            return;
        }
        increasingOrder(num-1);
        System.out.print(num+"\t");
    }
}

