package sda.algorithms.sorters;

import sda.algorithms.data.DataSet;
import sda.algorithms.data.Heap;
import sda.algorithms.sorters.SortingStrategy;

public class HeapSorter implements SortingStrategy {

    private final Heap heap;

    public HeapSorter(Heap heap) {
        this.heap = heap;
    }

    @Override
    public DataSet sort(DataSet ignored) {
        for (int i = heap.getSize() - 1; i > 0; i--) {
            heap.swap(0, i);
            heap.decrease();
            heap.heapify(0);
        }
        return heap;
    }
}
