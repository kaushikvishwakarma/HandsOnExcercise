package testDriven.junit_spring;

@Test
void testExceptionHandler() {

    assertEquals("User not found",
            new GlobalExceptionHandler()
            .handleNotFound(
            new NoSuchElementException())
            .getBody());
}
