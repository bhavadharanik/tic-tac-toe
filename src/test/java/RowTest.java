import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RowTest {
    @Test
    void testShouldReturnTrueIfTwoRowsAreEqual() {
        Row row1 = new Row(0);
        Row row2 = new Row(0);
        List<Row> rowList = new ArrayList<>(Arrays.asList(row1, row2));
        Comparator rowComparator = new RowComparator(rowList);
        boolean actual = rowComparator.compare();

        assertTrue(actual);
    }

    @Test
    void estShouldReturnTrueIfThreeRowsAreEqual() {
        Row row1 = new Row(0);
        Row row2 = new Row(0);
        Row row3 = new Row(0);
        List<Row> rowList = new ArrayList<>(Arrays.asList(row1, row2, row3));
        Comparator rowComparator = new RowComparator(rowList);

        boolean actual = rowComparator.compare();

        assertTrue(actual);
    }
}