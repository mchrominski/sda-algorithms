package sda.algorithms;

import sda.algorithms.data.DataSet;
import sda.algorithms.data.Heap;
import sda.algorithms.data.Randomizer;
import sda.algorithms.sorters.QuickSorting;
import sda.algorithms.sorters.Sorter;

public class Main {

    public static void main(String[] args) {
        DataSet data = new Randomizer().generate(30);
        //DataSet data = new Randomizer().generateStatic();
        Heap heap = new Heap(data);
        Sorter sorter = new Sorter(data, new QuickSorting());
        sorter.execute();

    }
}
