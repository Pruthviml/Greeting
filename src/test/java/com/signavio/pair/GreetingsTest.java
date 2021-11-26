package com.signavio.pair;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetingsTest {

    @Test
    public void testGreeting_greeting1_NameDisplayed()
    {
        String name = "Bob";

        String result = Greetings.greet(name);

        Assertions.assertEquals("Hello, Bob.", result);
    }


}
