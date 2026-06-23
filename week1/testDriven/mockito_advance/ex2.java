package testDriven.mockito_advance;

@Test
void testApiService() {
    RestClient client = mock(RestClient.class);

    when(client.getResponse())
            .thenReturn("Success");

    ApiService service = new ApiService(client);

    assertEquals("Fetched Success",
                 service.fetchData());
}
