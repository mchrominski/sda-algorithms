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

    public DataSet generate(int n) {
        DataSet data = new DataSet(n);

        for (int i = 0; i < n; i++) {
            data.set(i, random.nextInt(100));
        }
        return data;

    }
}
