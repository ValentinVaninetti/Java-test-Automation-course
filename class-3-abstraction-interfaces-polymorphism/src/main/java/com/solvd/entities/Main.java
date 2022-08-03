package com.solvd.entities;

import com.solvd.entities.library.Book;
import com.solvd.entities.library.Library;
import com.solvd.entities.person.Employee;
import com.solvd.entities.person.Student;
import com.solvd.entities.person.Teacher;
import com.solvd.entities.scholarships.Scholarship;
import com.solvd.entities.university.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        //********************************************** PERSONS *******************************************************//
        Student john = new Student("john Johnson", "Biology", "Active");
        Student andrew = new Student("Andrew Lopez", "System Engineer", "Active");
        Student charles = new Student("Charles Chaplin", "Mathematics", "Active");
        Student juan = new Student("Juan Zappa", "Physics", "Inactive");
        Student steve = new Student("Steve Stevenson", "System Engineer", "Inactive");
        Student chad = new Student("Chad Chadson", "Football", "Active");

        Teacher josh = new Teacher("Josh", 10);
        Teacher greg = new Teacher("Greg", 12);
        Teacher gandalf = new Teacher("Gandalf", 4);

        Employee dave = new Employee("dave");
        Employee martha = new Employee("martha");

        //-------------- FILLING STUDENT LIST ------------------------//
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

        List<Student> marineBiologyStudents = new ArrayList<>();
        marineBiologyStudents.add(juan);
        marineBiologyStudents.add(chad);

        List<Student> economyStudents = new ArrayList<>();
        economyStudents.add(charles);
        economyStudents.add(john);

        //--------------- FILLING TEACHER LIST ----------------------//

        List<Teacher> marinebiologyTeachers = new ArrayList<>();
        marinebiologyTeachers.add(josh);
        marinebiologyTeachers.add(gandalf);

        List<Teacher> engineeringTeachers = new ArrayList();
        engineeringTeachers.add(gandalf);

        List<Teacher> economyTeachers = new ArrayList<>();
        economyTeachers.add(greg);


        //********************************************** UNIVERSITY *******************************************************//

        //--------------- CREATING MAJOR ---------//
        Major systemEngineer = new Major("System Engineering", engineeringStudents, engineeringTeachers);
        Major marineBiology = new Major("Marine Biology", marineBiologyStudents, marinebiologyTeachers);
        Major accountant = new Major("Certified Public Accountant", economyStudents, economyTeachers);

        //--------------- FILLING MAJORS LISTS -----------------------//
        List<Major> scienceMajors = new ArrayList<>();
        scienceMajors.add(marineBiology);
        scienceMajors.add(systemEngineer);

        List<Major> accountantMajors = new ArrayList<>();
        accountantMajors.add(accountant);

        //--------------- CREATING DEPARTMENT ----------//
        Department science = new Department("Mathematics", scienceMajors);
        Department economy = new Department("Economy", accountantMajors);

        //--------------- FILLING DEPARTMENTS LISTS ----------------//
        List<Department> unicenDepartments = new ArrayList<>();
        unicenDepartments.add(science);

        List<Department> fastaDepartments = new ArrayList<>();
        fastaDepartments.add(economy);

        //--------------- FILLING BENEFITS LIST ----------------//
        List<String> benefits = new ArrayList<>();
        benefits.add("something");

        // --------------- CREATING UNIVERSITY ---------------------//
        PublicUniversity unicen = new PublicUniversity("UNICEN", "TANDIL", unicenDepartments, benefits);
        PrivateUniversity fasta = new PrivateUniversity("FASTA", "BUENOS AIRES", fastaDepartments, 1500, "USD");

        //********************************************* LIBRARY *******************************************************//

        //------------ CREATING BOOKS -----------------//
        Book book1 = new Book("Java for Dummies", false, "Programming");
        Book book2 = new Book("The importance of having a liver", true, "Science");
        Book book3 = new Book("How to get to the end of the month", false, "Economics");

        //------------ FILLING BOOK LIST -------------//
        List<Book> bookList = new ArrayList<>();
        bookList.add(book2);
        bookList.add(book3);

        List<Book> booklist2 = new ArrayList<>();
        booklist2.add(book1);

        //-------------- CREATING LIBRARIES --------------//
        Library library = new Library(bookList, "Fasta");
        Library library2 = new Library(booklist2, "Unicen");

        //********************************************** SCHOLARSHIPS *****************************************************//
        Scholarship scholarship = new Scholarship();
        //should check if student is available to get a scholarship, but i will need some grades class, student wage
        //

        //*************************** EXECUTION ***********************//
        System.out.println("There is this number of inactive students: " + systemEngineer.countStudentsByStatus("Inactive"));
        System.out.println(science.getDepartmentTotalStudents());
        System.out.println(unicen.countAllStudents());
        System.out.println(fasta.countAllStudents());

        library.withdrawBook(book1);
        library.returnBook(book2);
        System.out.println("there is this amount of total books in the " + library + " library : " + library.getTotalBooks());

    }

}
