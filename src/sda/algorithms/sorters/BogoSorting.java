package sda.algorithms.sorters;

import sda.algorithms.data.DataSet;

import java.util.Random;

public class BogoSorting implements SortingStrategy {

    @Override
    public DataSet sort(DataSet data) {
        boolean sorted = false;
        int shuffles = 0;
        while (!sorted) {
            shuffle(data);
            sorted = isSorted(data);
            shuffles++;
        }
        System.out.println(shuffles);
        return data;
    }

    private boolean isSorted(DataSet data) {
        boolean sorted = true;
        for (int i = 0; i < data.getSize() - 1; i++) {
            if (data.get(i) > data.get(i + 1)) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }

    private DataSet shuffle(DataSet data) {
        int index;
        Random random = new Random();
        for (int i = data.getSize() - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            if (index != i) {
                data.swap(index, i);
            }
        }
        return data;
    }

}
