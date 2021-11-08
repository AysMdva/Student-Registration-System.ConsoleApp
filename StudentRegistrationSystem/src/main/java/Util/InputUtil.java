package Util;

import java.util.Scanner;

public class InputUtil {
    public static String requireText(String title){
        System.out.println(title+": ");
        Scanner sc=new Scanner (System.in);
        String answ=sc.nextLine();
        return answ;
    }
    
    public static int requireNum(String title){
        System.out.println(title);
        Scanner sc=new Scanner (System.in);
        int answ=sc.nextInt();
        return answ;
    }
}
