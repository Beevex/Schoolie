package com.beevex;

public class menu {
    public static void menuChoices(String whatToDo){
        switch(whatToDo){
            case("maths"):
                mathio.mathematics();
                break;
                //more cases will be created for different menu options
        }
    }
}
