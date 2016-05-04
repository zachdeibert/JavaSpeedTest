package speedtest;

import java.util.Random;

public abstract class Test implements Runnable {
    public static final int ITERATIONS = 1000000;
    
    public static float[] randomize(int size) {
        final float rands[] = new float[size];
        try {
            cli.System.Random rand = new cli.System.Random();
            for ( int i = 0; i < rands.length; i++ ) {
                rands[i] = (float) (rand.NextDouble() * rand.Next());
            }
        } catch ( final Throwable t ) {
            final Random rand = new Random();
            for ( int i = 0; i < rands.length; i++ ) {
                rands[i] = (float) (rand.nextDouble() * rand.nextInt());
            }
        }
        return rands;
    }
}
