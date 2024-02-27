public class SortMergeMajorityElement {
    public static void main(String args[]){
        int arr[] = {20,10,30,20,30,30,9,30,30};
        int element = majorityElement(arr, 0, arr.length-1);
        System.out.println("Majority element is: "+element);
    }
    
    static int majorityElement(int arr[],int si, int ei){
        if(si==ei){
            return arr[si];
        }

        int mid = si+(ei-si)/2;
        //dividing to array to single elements
        int ansA = majorityElement(arr, si, mid);
        int ansB = majorityElement(arr, mid+1, ei);

        int countA =    getCount(arr, si, mid,ansA);    //  counting the frequency in partition of left side
        int countB =    getCount(arr, mid+1, ei, ansB); // counting the frequency in partition of right side
        if(countA>countB) {
            return ansA;
        }
        else {
            return ansB;
        }
    }

    static int getCount(int arr[], int si, int ei,int target){
        // frequency count in each partition
        int count =0;
        for(int i=si; i<=ei; i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
}
