package testDriven.mockito_advance;

@Test
void testMultipleReturns() {
    Repository repo = mock(Repository.class);

    when(repo.getData())
            .thenReturn("Data1")
            .thenReturn("Data2");

    assertEquals("Data1", repo.getData());
    assertEquals("Data2", repo.getData());
}
