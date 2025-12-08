package java_soloutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class pascal_triangle_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // Always add 1 at start
            row.add(1);

            // Fill middle values
            for (int j = 1; j < i; j++) {
                int val = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                row.add(val);
            }

            // Add last 1 if row > 1 element
            if (i > 0) row.add(1);

            result.add(row);
        }

        return result;
    }
}

