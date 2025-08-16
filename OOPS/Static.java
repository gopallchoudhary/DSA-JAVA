package OOPS;

public class Static {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "SSMS";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "DPS";

        System.out.println(s2.schoolName);

        System.out.println(s1.schoolName);
    }
}

class Student {
    String name;
    int rollNo;

    static String schoolName; // all the instances of this class will have the same reference (i.e. schoolName)

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}