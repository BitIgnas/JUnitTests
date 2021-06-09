package example1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrenheitCelsiusConverterTest {

    private static FahrenheitCelsiusConverter fahrenheitCelsiusConverter;

    @BeforeAll
    public static void setUp() {
        fahrenheitCelsiusConverter = new FahrenheitCelsiusConverter();
    }

    @Test
    void shouldConvertFahrenheitToCelsius() {
        assertEquals(0, fahrenheitCelsiusConverter.toCelsius(32));
        assertEquals(37, fahrenheitCelsiusConverter.toCelsius(100));
        assertEquals(100, fahrenheitCelsiusConverter.toCelsius(212));
    }

    @Test
    void shouldConvertCelsiusToFahrenheit() {
        assertEquals(32, fahrenheitCelsiusConverter.toFahrenheit(0));
        assertEquals(98, fahrenheitCelsiusConverter.toFahrenheit(37));
        assertEquals(212, fahrenheitCelsiusConverter.toFahrenheit(100));
    }
}