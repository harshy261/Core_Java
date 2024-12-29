// Creating a class in Java
class Student {
    String name;
    int age;
    int rollNo;
}
public class Class {
    public static void main(String[] args) {
        // Creating object of class
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 25;
        s1.rollNo = 101;
        System.out.println("Name: " + s1.name + ", Age: " + s1.age + ", Roll No: " + s1.rollNo);
    }
}
