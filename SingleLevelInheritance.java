public class SingleLevelInheritance {
    public static void main(String [] args){
        Mammals m1 = new Mammals();
        m1.eat();   // The object of Mammals class inherits the methods and properties of the Animal Class (Base Class)
    }
}

class Animal{
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathe");
    }
}

class Mammals extends Animal{
    int legs;

}
