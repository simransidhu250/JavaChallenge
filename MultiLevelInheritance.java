public class MultiLevelInheritance{
    public static void main(String [] args){
       Dog dobby = new Dog();
       dobby.eat();
       dobby.legs = 4;      // Derived class inherits all the properties and methods from the parent class
       System.out.println(dobby.legs);

    }
}

class Animals{
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathe");
    }
}

class Mammal extends Animal{
    int legs;

}

class Dog extends Mammal{
    String breed;
}
