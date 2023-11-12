public class StaticKeyword {
    public static void main(String args[]){
        Student s1 = new Student();
        // static keywords declare property for all objects of class
        s1.setSchoolName("LFCS"); 
        Student s2 = new Student();
        System.out.println(s2. getSchoolName());
        s2.setSchoolName("JMVC");
        System.out.println(s1. getSchoolName());
    }
}

class Student{
    String name;
    static String schoolName;
    String getSchoolName(){
        return this.schoolName;
    }

    void setSchoolName(String name){
        this.schoolName = schoolName;
    }
}
