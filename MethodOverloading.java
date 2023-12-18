public class MethodOverloading {
    public static void main(String args[]){
        Calculator calc = new Calculator();

        // Compile Time polymorphism
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum(1.3f, 2.2f));
        System.out.println(calc.sum(1, 2, 3));
    }
    
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}
