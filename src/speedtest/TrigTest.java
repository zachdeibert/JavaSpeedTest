package speedtest;

public class TrigTest extends Test {
    private final float nums[] = randomize(ITERATIONS / 2);
    
    @Override
    public void run() {
        try {
            for ( int i = 0; i < nums.length; i++ ) {
                final float a = nums[i];
                cli.System.Math.Sin(a);
                cli.System.Math.Cos(a);
            }
        } catch ( final Throwable t ) {
            for ( int i = 0; i < nums.length; i++ ) {
                final float a = nums[i];
                Math.sin(a);
                Math.cos(a);
            }
        }
    }
}
