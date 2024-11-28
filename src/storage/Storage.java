package storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Storage {
    public static Storage instance;
    public List<Row> rows;

    private Storage() {
        rows = new ArrayList<>();
    }

    public static Storage getInstance() {
        if (instance == null)
        {
            instance = new Storage();
        }
        return instance;
    }

    public List<Row> get() {
        return rows;
    }

    public void add(Row row) {
        rows.add(row);
    }

    public void update(Row row) {
        rows.removeIf(x -> x.key == row.key);
        rows.add(row);
    }
}
