public class SortMergeStrings {
    public static void main(String args[]){
        String arr[] = {"sun", "earth", "mars", "mercury"};
        printArr(arr);
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }

    static void mergeSort(String arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        System.out.println("Merge sort 1:");
        System.out.println("si: "+si+" mid: "+mid+ " ei: "+ei);
        System.out.println();
        mergeSort(arr, si, mid);
        System.out.println("Merge sort 2:");
        System.out.println("si: "+si+" mid: "+mid+ " ei: "+ei);
        System.out.println();
        mergeSort(arr, mid+1, ei);
        System.out.println("merge sort done");
        merge(arr, si,mid, ei);

    }

    static void printArr(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    static void merge(String arr[], int si,int mid, int ei){
        String temp[] = new String[ei-si+1];
        int i =si;
        int j = mid+1;
        int k =0;

        while(i<=mid && j<= ei){
            int ans = (arr[i].compareTo(arr[j]));
            if(ans<0){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=ei){
            temp[k++] = arr[j++];
        }

        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }

    }
    
}

