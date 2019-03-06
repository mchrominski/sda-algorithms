package sda.algorithms.sorters;

import sda.algorithms.data.DataSet;

import java.time.Duration;
import java.time.Instant;

public class Sorter {

    private final DataSet data;

    private final SortingStrategy strategy;

    public Sorter(DataSet data, SortingStrategy strategy) {
        this.data = data;
        this.strategy = strategy;
    }

    public void execute() {
        data.print();
        Instant start = Instant.now();

        DataSet sorted = strategy.sort(data);


        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println(duration);
        sorted.print();
    }
}
