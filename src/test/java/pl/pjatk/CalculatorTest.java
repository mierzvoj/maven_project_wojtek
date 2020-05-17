package pl.pjatk;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Main calculator = new Main();

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(3, calculator.add(1,2));
    }
}