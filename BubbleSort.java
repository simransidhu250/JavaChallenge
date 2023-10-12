public class BubbleSort {
    public static void main(String []args){
        int arr[] ={5,4,1,3,2};
        int res[]=bubbleSort(arr);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+"\t");
        }
    }

    public static int[] bubbleSort(int arr[]){
        int temp;
        for(int i =0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        return arr;
    }
    
}
