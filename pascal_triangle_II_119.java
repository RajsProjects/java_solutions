package java_soloutions;

import java.util.ArrayList;
import java.util.List;

class pascal_triangle_II_119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long val = 1;

        for (int i = 0; i <= rowIndex; i++) {
            row.add((int) val);
            val = val * (rowIndex - i) / (i + 1);
        }

        return row;
    }
}
//C(n, k) = C(n, k-1) * (n - k + 1) / k

//Index:   0   1   2   3   4
//Values: [1,  4,  6,  4,  1]
//          ↑   ↑   ↑   ↑   ↑
//          k=0 k=1 k=2 k=3 k=4
