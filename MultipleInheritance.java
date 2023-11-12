class MultipleInheritance {
    public static void main(String args[]){
        // Bear class implements two interfaces
        Bear b = new Bear();
        b.eatsGrass();
        b.eatsMeat();
    }
}


interface Carnivore {
    public void eatsMeat();
    
}


interface Herbivore {
    public void eatsGrass();
    
}


// The properties of Herbivore and Carnivore interfaces are implemented 
// in this class which enables multiple inheritance

class Bear implements Herbivore, Carnivore{
    public void eatsMeat(){
        System.out.println("Eats Meat");
    }

    public void eatsGrass(){
        System.out.println("Eats Grass");
    }
}


