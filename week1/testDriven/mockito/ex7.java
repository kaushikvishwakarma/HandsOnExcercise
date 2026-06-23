package testDriven.mockito;

@Test
void testException() {
    ExternalApi api = mock(ExternalApi.class);

    doThrow(new RuntimeException())
            .when(api).deleteData();

    assertThrows(RuntimeException.class,
            () -> api.deleteData());
}
