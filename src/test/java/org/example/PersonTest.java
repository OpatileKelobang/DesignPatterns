package org.example;

import org.example.domain.Person;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testCreate() {
        Person person = new Person.Builder().setFirstname("Opatile").setLastname("Kelobang").setAge(99).build();
        System.out.println(person);
    }

}