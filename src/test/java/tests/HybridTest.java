package tests;

import org.testng.annotations.Test;

public class HybridTest {

    @Test
    public void apiToUIFlow() {

        // Step 1: API call (simulate user creation)
        String userName = "morpheus";

        // Step 2: UI validation (example flow)
        System.out.println("User created via API: " + userName);

        // Later we can extend:
        // - create user via API
        // - login via UI
        // - validate data
    }
}
