package testDriven.mockito;

@Test
void testVerify() {
    ExternalApi api = mock(ExternalApi.class);

    MyService service = new MyService(api);
    service.fetchData();

    verify(api).getData();
}