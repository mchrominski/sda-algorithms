package sda.algorithms;

import sda.algorithms.data.DataSet;
import sda.algorithms.data.Randomizer;
import sda.algorithms.sorters.BubbleSorter;
import sda.algorithms.sorters.Sorter;

public class Main {

    public static void main(String[] args) {
        DataSet data = new Randomizer().generate(20);
        Sorter sorter = new Sorter(data, new BubbleSorter());
        sorter.execute();
    }
}
