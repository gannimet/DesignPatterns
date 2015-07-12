package org.roleobject;

public class University {

	public void provideLectureFor(Person who) {
		who.addRole("STUDENT");
		
		System.out.println(who.getName() + " besucht jetzt" +
			" diese Vorlesung.");
		
		StudentRole student = (StudentRole) who.getRole("STUDENT");
		student.study();
	}
	
}