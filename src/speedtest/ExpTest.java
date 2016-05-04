package speedtest;

public class ExpTest extends Test {
    private final float nums[] = randomize(ITERATIONS / 3);
    
    @Override
    public void run() {
        try {
            for ( int i = 0; i < nums.length; i++ ) {
                final float a = nums[i];
                final float b = a * a;
                cli.System.Math.Sqrt(b);
                cli.System.Math.Sqrt(a);
            }
        } catch ( final Throwable t ) {
            for ( int i = 0; i < nums.length; i++ ) {
                final float a = nums[i];
                final float b = a * a;
                Math.sqrt(b);
                Math.sqrt(a);
            }
        }
    }
}
