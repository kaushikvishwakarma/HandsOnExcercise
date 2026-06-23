package testDriven.junit_spring;

@Test
void testUserNotFound() {

    when(repository.findById(5L))
            .thenReturn(Optional.empty());

    assertNull(service.getUserById(5L));
}