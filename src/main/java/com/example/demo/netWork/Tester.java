package com.example.demo.netWork;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://odws.hccg.gov.tw/001/Upload/25/opendataback/9059/27/385f68c2-95e6-48cd-a9f8-0d3ffa35554b.json");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader br= new BufferedReader(new InputStreamReader(is));
            String line = br.readLine();
            StringBuffer json = new StringBuffer();
            while(line != null){
                json.append(line);
                line = br.readLine();
            }
            System.out.println(json.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
