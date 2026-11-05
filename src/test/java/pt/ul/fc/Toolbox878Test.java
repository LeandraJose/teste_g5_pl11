package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox878Test {

    @Test
    void absoluteWorks() {
        assertEquals(5, Toolbox878.absolute(5));
        assertEquals(5, Toolbox878.absolute(-5));
    }

    @Test
    void isPositiveWorks() {
        assertTrue(Toolbox878.isPositive(3));
        assertFalse(Toolbox878.isPositive(-3));
        assertFalse(Toolbox878.isPositive(0));
    }

    @Test
    void amplifyWorks() {
        assertEquals(5 * 5, Toolbox878.amplify(5));
        assertEquals(0, Toolbox878.amplify(0));
    }
}
