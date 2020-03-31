package pl.accenture.szkolka.lambda;

import java.util.List;

import static pl.accenture.szkolka.lambda.Person.*;

public class Lambda {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Ania", "Luszczkiewicz", 25),
                new Person("Ala", "Nowak", 18),
                new Person("Agata", "Kowalska", 80),
                new Person("Piotr", "Burak", 35),
                new Person("Aneta", "Bajka", 12),
                new Person("Antek", "Biegly", 65),
                new Person("Franek", "Bak", 13),
                new Person("Ada", "Brawurka", 22)
        );

        list
                .stream()
                .filter(nameStartsWithA.and(lastNameStartsWithB).and(ageOver20))
                .forEach(System.out::println);
    }
}
