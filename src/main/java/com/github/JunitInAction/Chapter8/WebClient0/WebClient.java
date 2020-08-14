package com.github.JunitInAction.Chapter8.WebClient0;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebClient {
    public String getContent(URL url) {
        StringBuffer content = new StringBuffer();
        try {
            HttpURLConnection connection =                                 //#A
                    (HttpURLConnection) url.openConnection();                   //#A
            connection.setDoInput(true);
            InputStream is = connection.getInputStream();                  //#A
            int count;                                                     //#A
            while (-1 != (count = is.read())) {                            //#B
                content.append( new String( Character.toChars( count ) ) ); //#B
            }                                                              //#B
        } catch (IOException e) {
            return null;                                                   //#C
        }
        return content.toString();
    }
}
