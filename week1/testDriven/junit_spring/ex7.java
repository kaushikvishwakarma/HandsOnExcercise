package testDriven.junit_spring;

@Test
void testFindByName() {

    List<User> users =
            repository.findByName("Rahul");

    assertNotNull(users);
}