public class StringCompare {
    public static void main(String []args){
        String s1 = "Tony";         // when new is not used it points to some string that was declared with same value previously
        String s2 = "Tony"; 
        String s3 = new String("Tony");

        if(s1 == s2){
            System.out.println("s1=s2");
        }
        if(s1==s3){         // compares on object level
            System.out.println("s2==s3");
        }
        if(s1.equals(s3)){      // compares just the value
            System.out.println("s1 equals s3");
        }

    }
    
}
