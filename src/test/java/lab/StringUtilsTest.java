package lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private final StringUtils stringUtils = new StringUtils();

    @Test
    void reverseShouldReturnEmptyStringWhenInputIsEmpty() {
        assertEquals("", stringUtils.reverse(""));
    }

    @Test
    void reverseShouldReturnSameTextWhenInputHasOneCharacter() {
        assertEquals("a", stringUtils.reverse("a"));
    }

    @Test
    void reverseShouldReverseAsciiText() {
        assertEquals("olleh", stringUtils.reverse("hello"));
    }

    @Test
    void reverseShouldReverseUnicodeText() {
        assertEquals("абяас", stringUtils.reverse("саяба"));
    }

    @Test
    void reverseShouldReturnNullWhenInputIsNull() {
        assertNull(stringUtils.reverse(null));
    }
}
