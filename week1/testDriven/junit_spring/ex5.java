package testDriven.junit_spring;

@Test
void testCreateUser() throws Exception {

    mockMvc.perform(post("/users")
            .contentType("application/json")
            .content("{\"name\":\"Rahul\"}"))
            .andExpect(status().isOk());
}