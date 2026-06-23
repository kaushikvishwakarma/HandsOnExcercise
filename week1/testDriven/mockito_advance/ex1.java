package testDriven.mockito_advance;

@Test
void testRepository() {
    Repository repo = mock(Repository.class);

    when(repo.getData()).thenReturn("Student Data");

    Service service = new Service(repo);

    assertEquals("Processed Student Data",
                 service.processData());
}
