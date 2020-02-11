import java.util.Objects;

public class Row {
    int index;

    public Row(int index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Row row = (Row) object;
        return index == row.index;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index);
    }
}
