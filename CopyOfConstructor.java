public class CopyOfConstructor {
    public static void main(String []args){
        Student s1 = new Student();
        s1.name = "Ravneet";
        s1.age = 26;
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 98;
        System.out.println(s1.marks[0]);



        Student s2 = new Student(s1);
        s2.marks[2] = 100;
        System.out.println("............."+s1.marks[2]);     
    

    }
    
}

class Student{
    int age;
    int marks[];
    String name;
    String pwd;

    Student(){
        System.out.println("Constructor is callled");
        marks = new int[3];
    }


    // Shallow coppy constructor

    // Student(Student s1){    //copy of the constructor
    //     this.age = s1.age;
    //     this.name = s1.name;
    //     this.marks = s1.marks; 
    //     this.pwd = s1.pwd;

    // }

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        for(int i=0 ; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }

    }


}
