package sda.algorithms.data;

import java.util.Random;

public class Randomizer {

    private Random random;

    public Randomizer() {
        this.random = new Random();
    }

    public DataSet generate() {
        return generate(10);
    }

    public DataSet generateStatic() {
        int[] input = new int[]{4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        DataSet data = new DataSet(input.length);
        int index = 0;
        for (int i : input) {
            data.set(index, input[index]);
            index++;
        }
        return data;
    }

    public DataSet generate(int n) {
        DataSet data = new DataSet(n);

        for (int i = 0; i < n; i++) {
            data.set(i, random.nextInt(100));
        }
        return data;

    }
}
