package testDriven.mockito;
@Test
void testArgumentMatcher() {
    ExternalApi api = mock(ExternalApi.class);

    api.sendData("Mockito");

    verify(api).sendData(anyString());
}
