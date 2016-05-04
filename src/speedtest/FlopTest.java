package speedtest;

public class FlopTest extends Test {
    private final float nums[] = randomize(ITERATIONS / 2);
    
    @Override
    public void run() {
        for ( int i = 0; i < nums.length; i += 2 ) {
            final float a = nums[i];
            final float b = nums[i + 1];
            @SuppressWarnings("unused")
            float c;
            c = a + b;
            c = a - b;
            c = a * b;
            c = a / b;
        }
    }
}
