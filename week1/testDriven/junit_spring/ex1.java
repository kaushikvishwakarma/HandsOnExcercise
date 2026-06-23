package testDriven.junit_spring;

@SpringBootTest
class CalculatorServiceTest {

    @Autowired
    CalculatorService service;

    @Test
    void testAdd() {
        assertEquals(10, service.add(4, 6));
    }
}