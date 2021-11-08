package main.studentregistrationsystem;

import Util.StudentUtil;

public class Main {

    public static void main(String[] args) {

        int menu = 0;
        while (true) {
            menu = Util.InputUtil.requireNum("\n\nWhat do you want to do?"
                    + "\n1.Register Student"
                    + "\n2.Show All Students"
                    + "\n3.Find Student"
                    + "\n4.Update Student\n" + "\n" + "\n");

            switch (menu) {
                case 1 ->
                    StudentUtil.registerStudents();
                case 2 ->
                    StudentUtil.showAllStudents();
                case 3 ->
                    beans.Student.outputOfFounded();
                case 4 ->
                    StudentUtil.updateInfo();
            }
        }
    }
}
