package pl.accenture.szkolka.lambda;

import lombok.ToString;

import java.util.function.Predicate;

@ToString
public class Person {
    static Predicate<Person> nameStartsWithA = person -> person.name.toUpperCase().startsWith("A");
    static Predicate<Person> lastNameStartsWithB = person -> person.lastName.toUpperCase().startsWith("B");
    static Predicate<Person> ageOver20 = person -> person.age > 20;

    String name;
    String lastName;
    int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
