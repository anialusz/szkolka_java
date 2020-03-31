package pl.accenture.szkolka.todo2;

public class Lambda2 {

    public static void learningLambda() {
        MyInterface2 myInterface2 = new MyInterface2() {
            @Override
            public String go() {
                return "Anonimowa implementacja";
            }
        };

        MyInterface2 lambda = () -> "Lambda";
    }
}
