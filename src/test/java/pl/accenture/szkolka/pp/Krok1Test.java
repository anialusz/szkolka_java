package pl.accenture.szkolka.pp;

import io.github.netmikey.logunit.api.LogCapturer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.*;

class Krok1Test {

    @RegisterExtension
    LogCapturer logs = LogCapturer.create().captureForType(Krok1.class);

    @Test
    @DisplayName("Ania -> Hello, Ania!")
    void hello() {
        var name  = "Ania";

        Krok1.hello(name);

        logs.assertContains("Hello, Ania!");

    }
}