package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testCreate() {
        Person person = new Person.Builder().setFirstname("Opatile").setLastname("Kelobang").setAge(99).build();
        System.out.println(person);
    }

}