public class AbstractClasses {
    public static void main(String []args){
        Horse h1 = new Horse();
        h1.walk();  // implements the functionality of the abstract function walk
        h1.eats();  // inherits eats function from parent class Animal
        System.out.println(h1.color);   // first the constructor of the parent class is called and color is assigned brown 
    }    
}


abstract class Animal{
    String color;
    Animal(){
        color = "brown";
    }

    void eats(){
        System.out.println("eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    void changeColor(){
        color = "dark brown";
    }

    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
