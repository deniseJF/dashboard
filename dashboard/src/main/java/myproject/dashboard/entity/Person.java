package myproject.dashboard.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.LocalDate;
import org.joda.time.Years;

public class Person {

	public enum Gender {
		MALE,FEMALE;
	}
	
	private Gender gender;
	
	private Date birthDate;
	
	private EducationalStage education;
	
	public static Person createPersonFromCsvLine(String csvLine) throws ParseException{
		
		Person person = new Person();
		String[] attrs = csvLine.split(",");
		person.setGender(Gender.valueOf(attrs[0]));
		person.setBirthDate(new SimpleDateFormat("ddmmyyyy").parse(attrs[1]));	
		person.setEducation(EducationalStage.valueOf(attrs[2]));
		return person;
	}
	
	public Integer getAge(){
		return Years.yearsBetween(new LocalDate(this.birthDate), new LocalDate()).getYears();
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public EducationalStage getEducation() {
		return education;
	}

	public void setEducation(EducationalStage education) {
		this.education = education;
	}
	
	
}
