package pl.accenture.szkolka.comparatorToDos;

import java.util.List;

import static pl.accenture.szkolka.comparatorToDos.Person.*;

public class Lambda {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Ania", "Luszczkiewicz", new School("Liceum")),
                new Person("Ala", "Nowak", new School("Gimnazjum")),
                new Person("Ala", "Kowalska", new School("Liceum")),
                new Person("Ala", "Kowalska", new School("Gimnazjum")),
                new Person("Agata", "Kowalska", new School("Techikum")),
                new Person("Piotr", "Burak", new School("Liceum")),
                new Person("Piotrek", "Bajka", new School("Liceum")),
                new Person("Franek", "Biegly", new School("Studia")),
                new Person("Franek", "Bak", new School("Podstawowka")),
                new Person("Ada", "Brawurka", new School("Gimnazjum"))
        );

        System.out.println("SORT BY NAME:");
        people
                .stream()
                .sorted(sortByName)
                .forEach(System.out::println);

        System.out.println("\nSORT BY NAME + LASTNAME:");
        people
                .stream()
                .sorted(sortByName.thenComparing(sortByLastName))
                .forEach(System.out::println);

        System.out.println("\nSORT BY NAME + LASTNAME + SCHOOL Type:");
        people
                .stream()
                .sorted(sortByName.thenComparing(sortByLastName).thenComparing(sortBySchoolType))
                .forEach(System.out::println);

        System.out.println("\nSORT BY NAME + LASTNAME REVERSED:");
        people
                .stream()
                .sorted(sortByName.thenComparing(sortByLastName).reversed())
                .forEach(System.out::println);
    }
}
