


 class Student{
    String name;
    int age;
    float marks;

    Student(){

    }
    Student(String name, int age, float marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    void greet(){
        System.out.println("Hello my name is " + name);
    }
    Student(Student other){
        this.name = other.name;
        this.age = other.age;
        this.marks = other.marks;
    }
    void namechanged(String newname){
        this.name = newname;
    }

 }
public class test7 {
    public static void main(String[] args) {
        Student kuswaha = new Student();
        kuswaha.name = "Debang Kuswaha";
        kuswaha.age = 20;
        kuswaha.marks = 95.5f;
        Student random = new Student(kuswaha);
        random.greet();
        System.out.println("Name: " + random.name);
        random.namechanged("Debang Chowdhury");
        System.out.println("Updated Name: " + random.name);

    }

    
}
