package pl.accenture.szkolka.comparatorToDos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Comparator;

@Data
@AllArgsConstructor
@ToString
public class Person {
    private String name;
    private String lastName;
    private School school;

    static Comparator<Person> sortByName = Comparator.comparing(Person::getName);
    static Comparator<Person> sortByLastName = Comparator.comparing(Person::getLastName);
    static Comparator<Person> sortBySchoolType  = Comparator.comparing(person -> person.getSchool().getSchoolType());
}
