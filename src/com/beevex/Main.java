//This is the main page/boot page

package com.beevex;
import java.util.Scanner;

public class Main {
     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Schoolie!!! your all in one personal school helper");
        System.out.print("\n     Please tell me what you want to do today > ");
        String whatToDo = scanner.next().toLowerCase();
        menu.menuChoices(whatToDo);
    }
}
