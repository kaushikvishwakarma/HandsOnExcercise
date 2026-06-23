package testDriven.mockito;

@Test
void testVoidMethod() {
    ExternalApi api = mock(ExternalApi.class);

    doNothing().when(api).clearData();

    api.clearData();

    verify(api).clearData();
}