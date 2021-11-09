package Util;

import beans.Config;
import beans.Student;

public class StudentUtil {
    public static void registerStudent() {
        System.out.println("**************************  Registration System   **************************");
        int count = InputUtil.requireNum("How many students do u wanna register? ");

        Config.student = new Student[count];

        for (int i = 0; i < Config.student.length; i++) {
            System.out.println((i + 1) + ".Student");
            Config.student[i] = fillStudents();
        }
        System.out.println("**************************  SUCCESSFULLY COMPLETED!!! **************************");
    }

    public static Student fillStudents() {
        String name = InputUtil.requireTxt("Enter Name:");
        String surname = InputUtil.requireTxt("Enter SurName:");
        int age = InputUtil.requireNum("Enter Age:");
        String className = InputUtil.requireTxt("Enter ClassName:");

        Student student = new Student(name, surname, age, className);
        return student;
    }

    public static void showAllRegistred() {
        System.out.println("REGISTRED STUDENTS:\n");
        for (int i = 0; i < Config.student.length; i++) {
            Student student = Config.student[i];
            System.out.println((i + 1) + "." + student.showRegistred());
        }
    }

    public static void updateInfo() {
        showAllRegistred();
        int n = InputUtil.requireNum("Which one do u wanna change?");
        Config.student[n - 1] = fillStudents();
        Student student = Config.student[n - 1];
        System.out.println("**************************  SUCCESSFULLY COMPLETED!!! **************************");
    }

    public static void outputOfFounded() {
        String txt = InputUtil.requireTxt("Type name,surname or className for find");
        Student[] founded = findInfo(txt);
        for (int i = 0; i < founded.length; i++) {
            System.out.println(founded[i].showRegistred());
        }
    }

    public static Student[] findInfo(String txt) {
        int count = 0;
        for (int i = 0; i < Config.student.length; i++) {
            Student student = Config.student[i];
            if (student.getClassName().contains(txt) || student.getName().contains(txt) || student.getSurname().contains(txt)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("NO INFORMATION");
        }
            Student[] student = new Student[count];
            int found = 0;
            for (int i = 0; i < Config.student.length; i++) {
                Student st = Config.student[i];
                if (st.getClassName().contains(txt) || st.getName().contains(txt) || st.getSurname().contains(txt)) {
                    student[found++] = st;
                }
            }

        return student;
    }
}

