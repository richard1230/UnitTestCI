package com.github.JunitInAction.Chapter8.WebClientRefactor;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionFactory {
    private URL url;
    public HttpURLConnectionFactory(URL url) {
        this.url = url;
    }
    public InputStream getData() throws Exception {
        HttpURLConnection connection =
                (HttpURLConnection) this.url.openConnection();
        return connection.getInputStream();
    }
}
