package pl.accenture.szkolka.todo1;

public class Lambda {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void go() {
                System.out.println("Anonimowa Implementacja");
            }
        };

        MyInterface lambda = () -> System.out.println("Lambda");


    }
}
