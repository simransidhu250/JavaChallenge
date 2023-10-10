public class LinearSearch{
    public static void main(String [] args){
        int numbers[] ={2,4,6,8,10,12,14,16 };
        String menu[] = {"Gol-Gappe", "Dosa","Paneer-Tikka"};
        int key =9;
        int index = linearSearch(numbers,key);
        String str="Dosab";
        int result = linearSearch(menu, str);
        if(result==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key is at index: "+ result);
        }
    }

    public static int linearSearch(int numbers[],int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){ // Iterating over whole array to find the key
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(String menu[], String key){
        for(int i=0; i<menu.length; i++){
            if(menu[i]==key){ // Iterating over whole array to find the key
                return i;
            }
        }
        return -1;
    }
}