import java.util.List;

public class RowComparator implements Comparator {
    private List<Row> rowList;

    public RowComparator(List<Row> rowList) {
        this.rowList = rowList;
    }

    @Override
    public boolean compare() {
        return rowList.stream().allMatch(rowList.get(0)::equals);
    }

}
