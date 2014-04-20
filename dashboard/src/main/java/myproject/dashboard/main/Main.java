package myproject.dashboard.main;

import myproject.dashboard.entity.Person;
import myproject.dashboard.entity.Statistics;
import myproject.dashboard.service.DataDownloader;

public class Main {
	public static void main(String[] args) throws Throwable{
		Statistics st = new Statistics();
		DataDownloader.download(st);
		
		for(Person p:st.getPersonList()){
			System.out.println(p.getGender().name());
			System.out.println(p.getBirthDate().toString());
			System.out.println(p.getEducation().name());
		}
	}
}
