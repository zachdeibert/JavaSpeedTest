package speedtest;

import java.util.ArrayList;
import java.util.List;

public class CrashTest extends Test {
    @Override
    public void run() {
        final List<Object> a = new ArrayList<Object>();
        final List<Object> b = new ArrayList<Object>();
        a.add(b);
        b.add(a);
        a.toString();
    }
}
