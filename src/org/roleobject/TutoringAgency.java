package org.roleobject;

public class TutoringAgency {

	public void employTutor(Person person) {
		person.addRole("TUTOR");
		
		System.out.println("Wir freuen uns, " + person.getName() +
			" als neuen Lehrer begrüßen zu dürfen.");
		
		TutorRole tutor = (TutorRole) person.getRole("TUTOR");
		tutor.teach();
	}
	
}