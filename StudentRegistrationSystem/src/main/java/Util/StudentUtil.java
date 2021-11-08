package Util;

import beans.Config;
import beans.Student;

public class StudentUtil {

    public static Student fillStudent() {
        String name = Util.InputUtil.requireText("Enter Name");
        String surname = Util.InputUtil.requireText("Enter SurName");
        int age = Util.InputUtil.requireNum("Enter Age");
        String className = Util.InputUtil.requireText("Enter className");

        Student st = new Student(name, surname, age, className);
        return st;
    }

    public static void showAllStudents() {
        if (Config.student == null) {//NullPointerException
            return;
        }
        for (int i = 0; i < Config.student.length; i++) {
            Student st = Config.student[i];
            System.out.println((i + 1) + "." + st.infoStudents());
        }
    }

    public static void registerStudents() {
        System.out.println("Register Student");
        int count = Util.InputUtil.requireNum("How many want to register Student?");
        Config.student = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ".Student Info");
            Config.student[i] = StudentUtil.fillStudent();
        }
        System.out.println("\n*****************  Successfully Completed!  *****************");

    }

    public static void updateInfo() {
        showAllStudents();
        int i = InputUtil.requireNum("Which one information  do you wanna change ?");
        Student st = Config.student[i - 1];
        String name = InputUtil.requireText("Name");
        st.setName(name);
        String surname = InputUtil.requireText("SurName");
        st.setSurname(surname);
        int age = InputUtil.requireNum("Age");
        st.setAge(age);
        String classname = InputUtil.requireText("ClassName");
        st.setClassName(classname);

        System.out.println("\n*****************  Successfully Completed!  *****************");
        System.out.println(st.infoStudents());
    }
}
