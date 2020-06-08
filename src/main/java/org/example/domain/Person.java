package org.example.domain;

public class Person {
    private String firstname, lastname, title;
    private int age;

    private Person(Builder builder) {
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.title = builder.title;
        this.age = builder.age;
    }

    // Main Class Getters
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getTitle() {
        return title;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", title='" + title + '\'' +
                ", age=" + age +
                '}';
    }

    // Inner Class Builder
    public static class Builder {
        private String firstname, lastname, title;
        private int age;

        // Inner Class Setters
        // Return Type of setters must be set to type Builder (name of class)
        public Builder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
