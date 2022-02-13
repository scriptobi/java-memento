package com.scriptobi.exercices.SchoolDatabase;

import com.scriptobi.dev.classes.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainSchoolDatabase {
    private ArrayList<Student> students;

    public MainSchoolDatabase() {
        Scanner scanner = new Scanner(System.in);
        getStudentsFromScanner(scanner);
        scanner.close();
        displayStudentList();
    }

    private void getStudentsFromScanner(Scanner scan) {
        int studentId = 0;
        students = new ArrayList<>();
        boolean done = false;
        while(!done) {
            System.out.print("Nom de l'étudiant: ");
            String lastName = getEntryFromScanner(scan);
            System.out.print("Prénom de l'étudiant: ");
            String firstName = getEntryFromScanner(scan);
            System.out.print("Age: ");
            int age = Integer.parseInt(getEntryFromScanner(scan, EntryRegex.IntegerRegex));
            System.out.print("Float: ");
            float x = Float.parseFloat(getEntryFromScanner(scan, EntryRegex.FloatRegex));

            Student stud = new Student(++studentId);
            stud.setLastName(lastName);
            stud.setFirstName(firstName);
            stud.setAge(age);
            students.add(stud);

            System.out.print("Continuer (o/n) ?");
            if(!getEntryFromScanner(scan).equalsIgnoreCase("o") ) done = true;
        }
        System.out.println("Liste:");
    }

    private void displayStudentList() {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student stud = it.next();
            System.out.println(String.format("Name: %s %s | Age: %s", stud.getLastName(), stud.getFirstName(), stud.getAge()));
        }
    }

    private String getEntryFromScanner(Scanner scan) { return getEntryFromScanner(scan, EntryRegex.StringRegex); }
    private String getEntryFromScanner(Scanner scan, EntryRegex regex) {
        String entry = "";
        boolean isValidEntry = false;
        try {
            while(!isValidEntry) {
                entry = scan.nextLine();
                if(entry.matches(regex.getRegex())) isValidEntry = true;
                else System.out.println("Entrée non valide. Recommencez.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entry;
    }

    private enum EntryRegex {
        StringRegex ("[a-zA-Z]*"),
        IntegerRegex ("[0-9]*"),
        FloatRegex ("[0-9\\.]*"),
        ;

        private final String regex;
        EntryRegex(String regex) { this.regex = regex; }

        public String getRegex() { return regex; }
    }

    public static void main(String... args) {
        MainSchoolDatabase msd = new MainSchoolDatabase();
    }
}
