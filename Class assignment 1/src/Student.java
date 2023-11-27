// Q7
public class Student {
    private  String name ;
    private  int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("reem", 20);
        students[1] = new Student("zaynab", 26);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student name: "+students[i].getName());
            System.out.println("Student age: "+students[i].getAge());
            System.out.println("----------------------");
        }
    }
}