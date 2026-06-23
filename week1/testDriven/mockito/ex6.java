package testDriven.mockito;

@Test
void testOrder() {
    ExternalApi api = mock(ExternalApi.class);

    api.login();
    api.logout();

    InOrder order = inOrder(api);

    order.verify(api).login();
    order.verify(api).logout();
}
