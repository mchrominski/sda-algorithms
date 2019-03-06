package sda.algorithms.sorters;

import sda.algorithms.data.DataSet;

public class BubbleSorter implements SortingStrategy {

    @Override
    public DataSet sort(DataSet data) {
        int n = data.getSize();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int v1 = data.get(i);
                int v2 = data.get(j);

                if (data.get(i) > data.get(j)) {
                    data.swap(i, j);
                }
            }
        }
        return data;
    }
}
