package com.beevex;
import java.util.Scanner;
public class menu {
    static Scanner scanner = new Scanner(System.in);
    public static void menuChoices(String whatToDo){
        switch(whatToDo){
            case("maths"):
                mathio.mathematics();
                break;
        }
    }
}
