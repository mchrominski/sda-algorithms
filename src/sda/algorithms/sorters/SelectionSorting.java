package sda.algorithms.sorters;

import sda.algorithms.data.DataSet;

public class SelectionSorting implements SortingStrategy {

    @Override
    public DataSet sort(DataSet data) {
        for (int i = 0; i < data.getSize() - 1; i++) {
            int minIndex = getMinIndex(data, i);
            if (minIndex != i) {
                data.swap(minIndex, i);
            }
        }
        return data;
    }

    private int getMinIndex(DataSet data, int start) {
        int minValue = data.get(start);
        int minIndex = start;
        for (int i = start + 1; i < data.getSize(); i++) {
            if (data.get(i) < minValue) {
                minValue = data.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }
}
