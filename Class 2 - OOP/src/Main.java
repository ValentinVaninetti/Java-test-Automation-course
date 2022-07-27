import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Declaration of Students.

        Student john = new Student("john Johnson", 1123579, "Biology", "Active");
        Student andrew = new Student("Andrew Lopez", 322224, "System Engineer", "Active");
        Student charles = new Student("Charles Chaplin", 413690, "Mathematics", "Active");
        Student juan = new Student("Juan Zappa", 515806, "Physics", "Inactive");
        Student steve = new Student("Steve Stevenson", 612367, "System Engineer", "Inactive");
        Student chad = new Student("Chad Chadson",  734644,  "Football", "Active");

        //Filling the Students List for another Major

        List<Student> allStudents = new ArrayList<>();
        allStudents.add(john);
        allStudents.add(andrew);
        allStudents.add(charles);
        allStudents.add(juan);
        allStudents.add(steve);
        allStudents.add(chad);
        List<Student> engineeringStudents = new ArrayList<>();
        engineeringStudents.add(andrew);
        engineeringStudents.add(steve);

        //Declaration of Teachers.

        Teacher josh = new Teacher("Josh", 211112, 10);
        Teacher greg = new Teacher("Greg", 768578, 12);
        Teacher gandalf = new Teacher("Gandalf", 342689, 4);

        //Filling Teachers list for Major.

        List<Teacher> biologyTeachers = new ArrayList<>();
        biologyTeachers.add(josh);
        biologyTeachers.add(greg);
        biologyTeachers.add(gandalf);
        List<Teacher> engineeringTeachers = new ArrayList();
        engineeringTeachers.add(gandalf);

        //Declaration of Majors//

        Major biology = new Major ( 312315,"Biology", allStudents, biologyTeachers);
        Major engineering = new Major (5544223,"Engineering", engineeringStudents,engineeringTeachers);

        //Filling Majors List

        List<Major> majors = new ArrayList<>();
        majors.add(biology);
        majors.add(engineering);

        //Declaration of Department
        Department mathematics = new Department("Engineering", majors);

        //Filling Department List

        List<Department> departments = new ArrayList<>();
        departments.add(mathematics);

        //Declaration of University

        University unicen = new University("Unicen", "Tandil", departments );

        System.out.println(biology.countStudentsByStatus("Active"));
        System.out.println("There is: " +engineering.countStudentsByStatus("Inactive") +" Inactive Students on this Major "+ " And"+ engineering.countStudentsByStatus("Active")+ " Active students ");

        System.out.println(mathematics.toString(mathematics));
        System.out.println("There is: "+ mathematics.countStudents("Active")+ " Active Students on this Department "+ "And " + mathematics.countStudents("Inactive")+ " Inactive Students");
        System.out.println(steve.hashCode());
        System.out.println(unicen.countStudentsByStatus("Active"));



    }
}
