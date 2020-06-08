/*
*  Factory method example
*
* */

package org.example.factory;

import org.example.domain.Person;

public class PersonFactory {

    public static Person buildPerson(String firstname, String lastname) {
        int defaultAge = 18;
        String defaultTitle = "";
        return new Person.Builder()
                .setAge(defaultAge)
                .setFirstname(firstname)
                .setLastname(lastname)
                .setTitle(defaultTitle)
                .build();
    }
}
