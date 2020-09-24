package xmlconverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTest {

    private final String[] lines = new String[] {"Zero", "One", "Two", "Three", "Four"};

    @Test
    public void getValue_ValidIndex_ReturnsValidAnswer() {
        final String value = Utils.getValue(lines, 2);
        assertEquals(value, "Two");
    }

    @Test
    public void getValue_IndexTooHigh_ReturnsEmptyString() {
        final String value = Utils.getValue(lines, 6);
        assertEquals(value, "");
    }

    @Test
    public void getValue_NegativeIndex_ReturnsEmptyString() {
        final String value = Utils.getValue(lines, -1);
        assertEquals(value, "");
    }
}
