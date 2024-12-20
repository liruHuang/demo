package com.example.demo.netWork;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://odws.hccg.gov.tw/001/Upload/25/opendataback/9059/27/385f68c2-95e6-48cd-a9f8-0d3ffa35554b.json");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = br.readLine();
            StringBuffer json = new StringBuffer();
            while (line != null) {
                line = br.readLine();
                json.append(line);
            }
            System.out.println(json.toString());

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}