package testDriven.mockito_advance;

@Test
void testNetworkService() {
    NetworkClient client =
            mock(NetworkClient.class);

    when(client.connect())
            .thenReturn("Server");

    NetworkService service =
            new NetworkService(client);

    assertEquals("Connected to Server",
                 service.connectToServer());
}
