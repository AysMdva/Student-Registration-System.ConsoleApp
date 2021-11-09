package Main;

import Util.StudentUtil;

public class Main {

    public static void main(String[] args) {
        while(true){


        int menu=Util.InputUtil.requireNum("\n\rWhat do you want to do?\n"+
                "1.Register Student\n"+
                "2.Show All Students\n"+
                "3.Find Student Info\n"+
                "4.Uptade Student Info\n");
            switch (menu){
                case 1-> StudentUtil.registerStudent();
                case 2-> StudentUtil.showAllRegistred();
                case 3-> StudentUtil.outputOfFounded();
                case 4-> StudentUtil.updateInfo();
            }
        }
    }
}