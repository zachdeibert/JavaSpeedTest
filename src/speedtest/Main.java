package speedtest;

public class Main {
    public static final Test TESTS[] = new Test[] {
        new FlopTest(),
        new TrigTest(),
        new ExpTest(),
        new RandomTest(),
        new CrashTest()
                                     };
    
    public static void main(final String args[]) {
        for ( final Test test : TESTS ) {
            final long start = System.currentTimeMillis();
            try {
                test.run();
            } catch ( final Throwable t ) {
                new Exception("Test Failure", t).printStackTrace();
            }
            final long end = System.currentTimeMillis();
            System.out.printf("Test %s: %dms\n", test.getClass().getName(), end - start);
        }
    }
}
