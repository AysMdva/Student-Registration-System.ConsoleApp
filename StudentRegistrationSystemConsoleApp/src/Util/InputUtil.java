package Util;

import java.util.Scanner;

public class InputUtil {


    public static String requireTxt(String title){
        System.out.println(title);
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        return  text;
    }

    public static int requireNum(String title){
        System.out.println(title);
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        return  count;
    }
}
