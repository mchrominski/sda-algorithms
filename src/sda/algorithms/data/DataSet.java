package sda.algorithms.data;

import java.util.Arrays;

public class DataSet {

    private int[] data;

    public DataSet(int n) {
        data = new int[n];
    }

    public DataSet(DataSet proxy) {
        this.data = proxy.data;
    }

    public void set(int i, int value) {
        data[i] = value;
    }

    public void print() {
        System.out.println(Arrays.toString(data));
    }

    public int getSize() {
        return data.length;
    }

    public int get(int i) {
        return data[i];
    }

    public void swap(int j, int i) {
        int tmp = data[j];
        data[j] = data[i];
        data[i] = tmp;
    }

    // unsafe as exposes internal implementation
    public int[] getRawData() {
        return data;
    }
}
