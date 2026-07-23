class Student {
    int id = 101;
    String name = "John";
}

public class objectandclass {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name);
    }
}