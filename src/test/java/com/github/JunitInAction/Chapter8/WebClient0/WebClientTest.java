package com.github.JunitInAction.Chapter8.WebClient0;

import org.junit.jupiter.api.Test;


class WebClientTest {
    @Test
    public void testGetContentOk() throws Exception {
        MockHttpURLConnection mockConnection = new MockHttpURLConnection();  //#A
//        mockConnection.setupGetInputStream(                                  //#A
//        new ByteArrayInputStream("It works".getBytes()));  //#A
//        MockURL mockURL = new MockURL();                                     //#B
//        mockURL.setupOpenConnection(mockConnection);                        // #B
//        WebClient client = new WebClient();
//        String workingContent = client.getContent(mockURL);                  //#C
//        assertEquals("It works", workingContent);                            //#D
    }

}
