package com.beevex;
import java.util.Scanner;
public class mathio {
    static Scanner scanner = new Scanner(System.in);
    public static void mathematics() {
        System.out.print("#1 > ");
        int int1 = scanner.nextInt();
        System.out.print("\n#2 > ");
        int int2 = scanner.nextInt();
        System.out.print("Please choose an operator > ");
        String operator = scanner.next().toLowerCase();
        switch(operator){
            case("addition"):
               int returned = mathops.add(int1,int2);
                System.out.println("\nThe answer is '"+returned+"'");
        }
    }
}

