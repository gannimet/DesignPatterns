package org.roleobject;

public class Main {

	public static void main(String[] args) {
		Person richard = new PersonCore("Richard");
		TutoringAgency agency = new TutoringAgency();
		University uni = new University();
		
		agency.employTutor(richard);
		uni.provideLectureFor(richard);
		richard.speak();
		richard.prepare();
	}
	
}