package sda.algorithms.sorters;

import sda.algorithms.data.DataSet;

public class Sorter {

    private final DataSet data;

    private final SortingStrategy strategy;

    public Sorter(DataSet data, SortingStrategy strategy) {
        this.data = data;
        this.strategy = strategy;
    }

    public void execute() {
        data.print();
        DataSet sorted = strategy.sort(data);
        sorted.print();
    }
}
