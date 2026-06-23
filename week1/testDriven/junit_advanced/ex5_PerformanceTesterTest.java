package testDriven.junit_advanced;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.Duration;

public class ex5_PerformanceTesterTest {

    @Test
    void testTimeout() {
        assertTimeout(Duration.ofSeconds(1),
                () -> new PerformanceTester().performTask());
    }
}
