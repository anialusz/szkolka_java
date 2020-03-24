package pl.accenture.szkolka.pp;

import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class ZadaniaIndywidualne {
    // TODO 1 zadeklaruj zmienne z typami prostymi występującymi z Javie
    // TODO 2 zadeklaruj metody zwracające te zmienne
    // TODO 3 utwórz testy dla metod z punktu 2
    // TODO 4 utwórz metodę void wypisującą do loggera "Hello"
    // TODO 5 utwórz metodę void wypisującą do loggera "Hello " + przekazany do metody argument
    // TODO 6 utwórz metodę zwracającą  "Hello " + przekazany do metody argument
    /*
            TODO 7 utwórz testy dla metod z punktów 4-6 dla testowania logowanych wartości, użyj
            https://github.com/netmikey/logunit
     */


    static boolean booleanEx = true;
    static int intNumber = 10;
    static short shortNumber = 64;
    static byte byteNumber = 8;
    static long longNumber = 2323;
    static double doubleNumber = 3.3;
    static float floatNumber =  4.6f;
    static char charExample = 'a';

    private static final Logger LOG = getLogger("pl.accenture.szkolka.pp.ZadaniaIndywidualne");

    public static String getHelloPlusArgument(String whatToAdd) {
        return String.format("Hello %s", whatToAdd);
    }

    public static void displayHelloPlusSomething(String whatToDisplay) {
        LOG.log(Level.INFO, String.format("Hello %s", whatToDisplay));
    }

    public static void displayHello() {
        LOG.log(Level.INFO, "Hello");
    }

    public static boolean getBooleanEx() {
        return booleanEx;
    }

    public static int getIntNumber() {
        return intNumber;
    }

    public static short getShortNumber() {
        return shortNumber;
    }

    public static byte getByteNumber() {
        return byteNumber;
    }

    public static long getLongNumber() {
        return longNumber;
    }

    public static double getDoubleNumber() {
        return doubleNumber;
    }

    public static float getFloatNumber() {
        return floatNumber;
    }

    public static char getCharExample() {
        return charExample;
    }
}
