package com.mhutshow.daktarlagbe.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
                                                                                                                                            User newUser=new User("Mahedi Hasan", "Mymensingh","01303312747", "mahedi.hasan@g.bracu.ac.bd", "user");

    @Test
    public void getTypeTest() {
        String actual=newUser.getType();
        assertEquals("user", actual);
    }

    @Test
    public void getNameTest() {
        String actual=newUser.getName();
        assertEquals("Scholarstica", actual);
    }

    @Test
    public void getAdresseTest() {
        String actual=newUser.getAdresse();
        assertEquals("Hanifa", actual);
    }

    @Test
    public void getTelTest() {
        String actual=newUser.getTel();
        assertEquals("0721646227", actual);
    }

    @Test
    public void getEmailTest() {
        String actual=newUser.getEmail();
        assertEquals("Dylan@gmail.com", actual);
    }
}