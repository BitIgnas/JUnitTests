package example2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private static CalculatorService calculatorService;

    @BeforeAll
    public static void setup() {
        calculatorService = new CalculatorService();
    }

    @Test
    void shouldAdd() {
        assertEquals(13, calculatorService.add(5, 8));
    }

    @Test
    void shouldSubtract() {
        assertEquals(-3, calculatorService.subtract(2, 5));
    }

    @Test
    void shouldMultiple() {
        assertEquals(10, calculatorService.multiply(5, 2));
    }

    @Test
    void shouldDivide() {
        assertEquals(2, calculatorService.divide(6, 3));
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        assertThrows(ArithmeticException.class, () -> calculatorService.divide(5, 0));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
        // six numbers
    void isOdd_ShouldReturnTrueForOddNumbers(int number) {
        assertTrue(calculatorService.isOdd(number));
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void add(int first, int second, int expectedResult) {
        assertEquals(expectedResult, calculatorService.add(first, second));
    }

    @ParameterizedTest
    @MethodSource("getParameters")
    void shouldReturnReverseSign(double a) {
        assertEquals(-1 * a, calculatorService.reverseSign(a));
    }

    //Allows to pass stream of different, complex arguments. Value Source allows same type
    static Stream<Arguments> getParameters() {
        return Stream.of(Arguments.of(1.0),
                Arguments.of(-231.0),
                Arguments.of(26.0),
                Arguments.of(-98.0));
    }

    @ParameterizedTest
    @ValueSource(doubles = {10.0, -23.0, 12.0, -2.0})
    void shouldReturnReversedSign(double a) {
        assertEquals(-1 * a, calculatorService.reverseSign(a));
    }
}