package pl.accenture.szkolka.todo3;

public class KlasycznaImplementacja3 implements MyInterface3 {

    @Override
    public String go(String name) {
        return "Klasyczna implementacja, " + name;
    }

}
