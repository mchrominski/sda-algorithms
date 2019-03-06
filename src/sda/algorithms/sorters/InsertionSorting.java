package sda.algorithms.sorters;

import sda.algorithms.data.DataSet;

public class InsertionSorting implements SortingStrategy {

    @Override
    public DataSet sort(DataSet data) {
        for (int i = 1; i < data.getSize(); i++) {
            int j = i;
            while (j > 0 && data.get(j - 1) > data.get(j)) {
                data.swap(j, j - 1);
                j--;
            }

        }
        return data;
    }
}
