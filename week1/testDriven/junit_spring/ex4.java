package testDriven.junit_spring;

@SpringBootTest
class IntegrationTest {

    @Autowired
    UserService service;

    @Test
    void testApplicationFlow() {
        assertNotNull(service);
    }
}
