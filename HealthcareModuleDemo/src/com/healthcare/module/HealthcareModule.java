package com.healthcare.module;

public class HealthcareModule {

	public static void main(String[] args) {
		PatientRegistration p1 = new PatientRegistration(1, "Alice", 30, "Heart Pain");
		PatientRegistration p2 = new PatientRegistration(2, "Bob", 25, "Cough");
		PatientService service = new PatientServiceImpl();
		service.registerPatient(p1);
		service.registerPatient(p2);
		service.showPatientDetails(1);
		service.showPatientDetails(2);
		// TODO Auto-generated method stub
		Doctor doc1 = new GeneralPhysician("Dr.Smith");
	    Doctor doc2 = new Cardiologist("Dr. Adamas");
	    
	    doc1.diagnose(p1);
	    doc2.diagnose(p1);
	     doc1.diagnose(p2);;
	     doc2.diagnose(p2);;
	}
		
}

	
