package xmlconverter.generator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CSVDataTest {

    private final String[] expectedCategories =  new String[] {"Category1", "Category2", "Category3_x0028__x0029_", "Category4"};

    @Test
    public void getCategories() {
        String categories = "Category1,\"Category2,Category3(),#Category4?";
        assertArrayEquals(CSVData.formatCategories(categories), expectedCategories);
    }

    @Test
    public void getCategories_EmptyCategories() {
        String categories = "Category1,\"Category2,Category3(),#Category4?,,,,,,,,";
        assertArrayEquals(CSVData.formatCategories(categories), expectedCategories);
    }
}
