public class AbstractClasses {
    public static void main(String []args){
        Mustang m1 = new Mustang();
        m1.walk();
        Horse h1 = new Horse(); // calls constructor of all three classes one by one starting from the first most parent class
        h1.walk();  // implements the functionality of the abstract function walk
        h1.eats();  // inherits eats function from parent class Animal
        System.out.println(h1.color);   // first the constructor of the parent class is called and color is assigned brown 
    }    
}


abstract class Animal{
    String color;
    Animal(){
        color = "brown";
        System.out.println("Animal Constructor called");
    }

    void eats(){
        System.out.println("eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "dark brown";
    }

    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}
