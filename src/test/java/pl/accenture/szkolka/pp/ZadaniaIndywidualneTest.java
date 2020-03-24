package pl.accenture.szkolka.pp;

import io.github.netmikey.logunit.api.LogCapturer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZadaniaIndywidualneTest {

    @RegisterExtension
    LogCapturer logs = LogCapturer.create().captureForType(ZadaniaIndywidualne.class);

    @Test
    @DisplayName("Returns: data -> Hello + data")
    void getHelloPlusArgument() {
        //given
        String whatToAdd = "Aniu, Olu, Alu.";

        //when
        String stringResultVal = ZadaniaIndywidualne.getHelloPlusArgument(whatToAdd);

        //then
        assertEquals("Hello Aniu, Olu, Alu.", stringResultVal);
    }

    @Test
    @DisplayName("data -> Hello + data")
    void displayHelloPlusSomething() {
        //given
        String whatToAdd = "Aniu, Olu, Alu.";

        //when
        ZadaniaIndywidualne.displayHelloPlusSomething(whatToAdd);

        //then
        logs.assertContains("Hello Aniu, Olu, Alu.");
    }

    @Test
    @DisplayName("() -> Hello")
    void displayHello() {

        //when
        ZadaniaIndywidualne.displayHello();

        //then
        logs.assertContains("Hello");
    }

    @Test
    @DisplayName("return boolean variable")
    void getBooleanEx() {
        //given
        // take static field from ZadaniaIndywidualne class

        //when
        boolean booleanReturnedVal = ZadaniaIndywidualne.getBooleanEx();

        //then
        assertEquals(ZadaniaIndywidualne.booleanEx, booleanReturnedVal);
    }

    @Test
    @DisplayName("return int variable")
    void getIntNumber() {
        //given
        // take static field from ZadaniaIndywidualne class

        //when
        int intReturnedVal = ZadaniaIndywidualne.getIntNumber();

        //then
        assertEquals(ZadaniaIndywidualne.intNumber, intReturnedVal);
    }

    @Test
    @DisplayName("return short variable")
    void getShortNumber() {
        //given
        // take static field from ZadaniaIndywidualne class

        //when
        short shortReturnedVal = ZadaniaIndywidualne.getShortNumber();

        //then
        assertEquals(ZadaniaIndywidualne.shortNumber, shortReturnedVal);
    }

    @Test
    @DisplayName("return byte variable")
    void getByteNumber() {
        //given
        // take static field from ZadaniaIndywidualne class

        //when
        byte byteReturnedVal = ZadaniaIndywidualne.getByteNumber();

        //then
        assertEquals(ZadaniaIndywidualne.byteNumber, byteReturnedVal);
    }

    @Test
    @DisplayName("return long variable")
    void getLongNumber() {
        //given
        // take static field from ZadaniaIndywidualne class

        //when
        long longReturnedVal = ZadaniaIndywidualne.getLongNumber();

        //then
        assertEquals(ZadaniaIndywidualne.longNumber, longReturnedVal);
    }

    @Test
    @DisplayName("return double variable")
    void getDoubleNumber() {
        //given
        // take static field from ZadaniaIndywidualne class

        //when
        double doubleReturnedVal = ZadaniaIndywidualne.getDoubleNumber();

        //then
        assertEquals(ZadaniaIndywidualne.doubleNumber, doubleReturnedVal);
    }

    @Test
    @DisplayName("return float variable")
    void getFloatNumber() {
        //given
        // take static field from ZadaniaIndywidualne class

        //when
        float floatReturnedVal  = ZadaniaIndywidualne.getFloatNumber();

        //then
        assertEquals(ZadaniaIndywidualne.floatNumber, floatReturnedVal);
    }

    @Test
    @DisplayName("return char variable")
    void getCharExample() {
        //given
        // take static field from ZadaniaIndywidualne class

        //when
        char charReturnedVal = ZadaniaIndywidualne.getCharExample();

        //then
        assertEquals(ZadaniaIndywidualne.charExample, charReturnedVal);
    }




}
