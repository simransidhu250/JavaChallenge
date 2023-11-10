public class MethodOverriding {
    public static void main(String args []){
    Deer danny = new Deer();
    danny.eats();
    }
}


class Animal{
    void eats(){
        System.out.println("eats");
    }
}

class Deer{
    void eats(){
        System.out.println("eats grass");   // overrides the function call of parent class during runtime
    }
}
