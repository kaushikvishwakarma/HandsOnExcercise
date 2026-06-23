package testDriven.mockito_advance;

@Test
void testFileService() {
    FileReader reader = mock(FileReader.class);
    FileWriter writer = mock(FileWriter.class);

    when(reader.read())
            .thenReturn("File Content");

    FileService service =
            new FileService(reader, writer);

    assertEquals("Processed File Content",
                 service.processFile());
}
