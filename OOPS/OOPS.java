package OOPS;

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Gopal";
        s1.rollNo = 21;
        s1.password = "Gopal23";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // copy
        s1.marks[1] = 95;
        s2.password = "Goopal23l";
        for (int s : s2.marks) {
            System.out.println(s);
        }

    }
}

class Student {
    String name;
    int rollNo;
    String password;
    int marks[] = new int[3];

    Student() {
        System.out.println("Constructor is called...");
    }

    // shallow copy constructor (marks)
    // Student(Student s1) {
    // this.name = s1.name;
    // this.rollNo = s1.rollNo;
    // this.marks = s1.marks;
    // }

    // deep copy constructor (marks)
    Student(Student s1) {
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        for(int i=0; i<marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

}

class BankAccount {
    public String username;
    private String password;

    public void setPass(String pwd) {
        this.password = pwd;
    }

    public String getPass() {
        return password;
    }
}

class Pen {
    private int tip;
    private String color;

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }

    int getTip() {
        return this.tip;
    }
}
