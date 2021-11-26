package com.signavio.pair;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetingsTest {

    @Test
    public void testGreeting_NameGiven_NameDisplay()
    {
        String name = "Bob";

        String result = Greetings.greet(name);

        Assertions.assertEquals("Hello, Bob.", result);
    }

    @Test
    public void testGreeting_NullName_MyFriend()
    {
        String name = null;

        String result = Greetings.greet(name);

        Assertions.assertEquals("Hello, my friend.", result);
    }

    @Test
    public void testGreeting_EmptyName_MyFriend()
    {
        String name = "";

        String result = Greetings.greet(name);

        Assertions.assertEquals("Hello, my friend.", result);
    }


}
