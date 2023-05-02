package serviceB;

import com.intuit.karate.junit5.Karate;

public class ServiceB {
    @Karate.Test
    Karate testServiceB() {
        return Karate.run("serviceB").relativeTo(getClass());
    }
}
