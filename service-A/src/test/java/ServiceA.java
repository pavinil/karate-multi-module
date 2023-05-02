import com.intuit.karate.Runner;
import com.intuit.karate.junit5.Karate;

public class ServiceA {
    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }
}
