package org.example.factory;

import org.example.domain.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonFactoryTest {

    @Test
    public void buildPerson() {
        Person person = PersonFactory.buildPerson("Opatile", "Kelobang");
        System.out.println(person);
    }
}