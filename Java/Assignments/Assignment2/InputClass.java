package Java.Assignments.Assignment2;

import java.util.Scanner;

public class InputClass {
    
    public int intInput(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // sc.close();

        return num;
    }
    
    public double doubleInput(){
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        // sc.close();

        return num;
    }

    public String strInput(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // sc.close();

        return str;
    }
}
