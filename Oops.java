public class Oops {
    public static void main(String [] args){
        Pen p1 = new Pen();
        p1.setColour("blue");
        System.out.println(p1.colour);
        p1.setTip(5);       // accessing the value using function
        System.out.println(p1.tip);
        p1.colour = "Yellow";   // accessing the value using property 
        System.out.println(p1.colour);

        // Private access modifier
        BankAccount b1 = new BankAccount();
        // b1.pwd;  // gives error because password attribute is private
        b1.setPassword("fadfdafa"); // can change password

    }
}

class Pen{
    String colour;
    int tip;

    void setColour(String newcolour) {
        colour = newcolour;
    }

    void setTip(int tip ){
        this.tip =tip;      // indicates the tip property of the class
    }
}

class Student{
    int  age;
    String name;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
    }
}

class BankAccount{
    public String username;
    private String pwd; // property cannot be accessed outside of the class

    void setPassword(String newPwd){
        pwd = newPwd;
        System.out.println(pwd);

    }
}
