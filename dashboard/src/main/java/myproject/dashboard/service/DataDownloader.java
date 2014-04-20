package myproject.dashboard.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import myproject.dashboard.entity.Person;
import myproject.dashboard.entity.Statistics;

public class DataDownloader {
	
	   public static void download(Statistics st) throws Throwable
	   {
		   System.setProperty("jsse.enableSNIExtension", "false"); //web xml
		   
	      String link = "https://raw.githubusercontent.com/deniseJF/dashboard/master/shell/dados.csv";
	      URL url  = new URL( link );
	      HttpURLConnection http = (HttpURLConnection)url.openConnection();
	      
	      InputStream  is  = http.getInputStream();
	      BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	      String line = "";
	      while((line=br.readLine())!=null){
	    	  st.addPerson(Person.createPersonFromCsvLine(line));
	      }
	   }
}
