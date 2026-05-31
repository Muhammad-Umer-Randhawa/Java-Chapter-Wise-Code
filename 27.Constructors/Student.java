public class Student{
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    //constructor
    Student(String n, int a, double g){
        name = n;
        age = a;
        gpa = g;
    }
    public static void main(String[] args) {
        Student s1 = new Student("John", 20, 3.5);
        Student s2 = new Student("Bob", 22, 3.8);
        System.out.println(s1.name + " " + s1.age + " " + s1.gpa);
        System.out.println(s2.name + " " + s2.age + " " + s2.gpa);
    }
}