package com.github.JunitInAction.Chapter8.WebClientRefactor;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class WebClientTest {
    @Test
    public void testGetContentOk() throws Exception {
        MockConnectionFactory mockConnectionFactory =
                new MockConnectionFactory();
        mockConnectionFactory.setData(
                new ByteArrayInputStream("It works".getBytes()));

        WebClient client = new WebClient();
        String workingContent = client.getContent(mockConnectionFactory);
        assertEquals("It works", workingContent);
    }
}
