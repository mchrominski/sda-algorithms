package sda.algorithms.sorters;

import sda.algorithms.data.DataSet;
import sda.algorithms.data.Heap;

public class CountingSorter implements SortingStrategy {

    private int[] counter;

    public CountingSorter(int cap) {
        counter = new int[cap];
    }

    @Override
    public DataSet sort(DataSet data) {
        for (int i = 0; i < data.getSize(); i++) {
            int value = data.get(i);
            counter[value]++;
        }

        int index = 0;
        for (int i = 0; i < counter.length; i++) {
            for (int j = 0; j < counter[i]; j++) {
                data.set(index, i);
                index++;
            }
        }
        return data;
    }
}
