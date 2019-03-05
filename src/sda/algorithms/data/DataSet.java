package sda.algorithms.data;

import java.util.Arrays;

public class DataSet {

    int[] data;

    public DataSet(int n) {
        data = new int[n];
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
}
