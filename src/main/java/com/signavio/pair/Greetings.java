package com.signavio.pair;

public class Greetings {

    public static String greet(String name)
    {
        if (name == null || name.isEmpty()) {
            name = "my friend";
        }

        return "Hello, " + name +".";
    }


}
