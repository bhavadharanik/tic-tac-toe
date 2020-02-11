import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RowTest {
    @Test
    void testShouldCheckTwoRowsAreEqual() {
        Row row1 = new Row(0);
        Row row2 = new Row(0);
        assertEquals(row1, row2);
    }

    @Test
    void testShouldCheckMorethanTwoRowsAreEqual() {
        Row row1=new Row(0);
        Row row2=new Row(0);
        Row row3=new Row(1);
        List<Row> rowList=new ArrayList<>(Arrays.asList(row1,row2,row3));
        RowComparator rowComparator=new RowComparator(rowList);

        rowComparator.compare();

    }
}