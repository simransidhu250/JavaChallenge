public class SortMergeInversionCount {
    public static void main(String args[]){
        int arr[] ={2,6,4,1,3,5};
        // printArray(arr);    //array before sorting
        System.out.println(mergeSort(arr, 0,arr.length-1)) ;  // performing sort
        // printArray(arr);    // array afer sorting
    }
    // printing array
    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
   
    static int mergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return 0;
        }
        int mid = si+(ei-si)/2;
        int ans = 0;
        // inversion count is sum of all the inversion pairs in partition and pairs formed upon merging partitions
        ans+=mergeSort(arr, si, mid);    //left part
        ans+=mergeSort(arr, mid+1, ei);  // right part
        ans+=merge(arr,si,mid,ei);   // merging
        return ans;
    }

    static int merge(int arr[], int si,int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i,j,k;
        i=si;   // iterator for left part
        k =0;   // iterator for temp array
        j=mid+1;   // iterator for right part  
        int count = 0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++; 
            }
            else{
                count+=mid-i+1;         // inversion part count while merging
                temp[k] = arr[j];
                j++; 
            }
            k++;
        }

        // left part
        while(i<=mid){
            temp[k++]= arr[i++];
        }

        // right part
        while(j<=ei){
            temp[k++]= arr[j++];
        }

        // copy values from temp array to original array
        for(k=0, i=si;k<temp.length; k++, i++ ){
            arr[i] = temp[k];
        }
        return count;

    }
}

