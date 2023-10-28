public class FunctionsConstructors {
    public static void main(String []args){

    // passing values to different constructors
        
        Student s1 = new Student();
        Student s2 = new Student("simran");
        System.out.println(s2.name);    
        System.out.println(s2.age);
         Student s3 = new Student(5);
    }
    
}

class Student{
    int age;
    String name;


    // Constructor overloading

    Student(){
        System.out.println("constructor is called.....");
    }
    Student(int age){
        this.age = age;
    }
    Student(String name){
        this.name = name;
    }
}
