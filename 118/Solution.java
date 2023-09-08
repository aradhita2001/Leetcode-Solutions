import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        ArrayList<List<Integer>> triangle = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                triangle.add(new ArrayList<Integer>());
                triangle.get(i).add(1);
                continue;
            }

            List<Integer> lastRow = triangle.get(i - 1);
            List<Integer> currRow = new ArrayList<Integer>();

            for (int j = 0; j < lastRow.size(); j++) {
                if (j == 0)
                    currRow.add(lastRow.get(j));
                else
                    currRow.add(lastRow.get(j) + lastRow.get(j - 1));
            }
            currRow.add(lastRow.get(lastRow.size() - 1));

            triangle.add(currRow);
        }

        return triangle;
    }
}