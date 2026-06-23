package testDriven.mockito;

@Test
void testFetchData() {
    ExternalApi api = mock(ExternalApi.class);

    when(api.getData()).thenReturn("Hello");

    MyService service = new MyService(api);

    assertEquals("Hello", service.fetchData());
}
