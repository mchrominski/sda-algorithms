package sda.algorithms.data;

public class Heap extends DataSet {

    private int heapSize;

    public Heap(DataSet proxy) {
        super(proxy);

        heapSize = proxy.getSize();
        for (int i = proxy.getSize() - 1; i >= 0; i--) {
            heapify(i);
        }

    }

    public int parent(int i) {
        return (int) (Math.ceil((double) i / 2) - 1);
    }

    public int left(int i) {
        return i * 2 + 1;
    }

    public int right(int i) {
        return i * 2 + 2;
    }

    public void heapify(int i) {
        int left = left(i);
        int right = right(i);
        int largest;

        if (left < heapSize && this.get(left) > this.get(i)) {
            largest = left;
        } else {
            largest = i;
        }

        if (right < heapSize && this.get(right) > this.get(largest)) {
            largest = right;
        }

        if (largest != i) {
            this.swap(i, largest);
            heapify(largest);
        }

    }

    public void decrease() {
        heapSize--;
    }

    @Override
    public int getSize() {
        return heapSize;
    }
}
