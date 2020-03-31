package pl.accenture.szkolka.todo3;

public class Lambda {

    MyInterface3 myInterface3 = new MyInterface3() {
        @Override
        public String go(String name) {
            return "Anonimowa implementacja " + name;
        }
    };

    MyInterface3 lambda = name -> "Lambda " + name;
}
