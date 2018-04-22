package app;

import java.util.Random;

/**
 * AleatoireHerite
 */
public class AleatoireHerite extends Random {
    public AleatoireHerite(long semense) {
        super(semense);
    }

    public int unEntier(int min, int max) throws Exception {
        if (min < 0 || min >= min) {
            throw new Exception();
        }
        int val = nextInt(max + 1 - min);
        return val + min;
    }
}