package com.healthcare.module;
import java.util.HashMap;
import java.util.Map;

public class PatientServiceImpl implements PatientService{
	private Map<Integer, PatientRegistration> PatientMap = new HashMap<>();
	
	public void registerPatient(PatientRegistration patient) {
		PatientMap.put(patient.getId(), patient);
		System.out.println("Patient " +  patient.getName()  + " registered");
		
	}
	public void showPatientDetails(int patientId) {
		PatientRegistration p = PatientMap.get(patientId);
		if (p!=null) {
		System.out.println("ID: " + p.getId());
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());
		System.out.println("Illness: " + p.getIllness());
	}
	else
	{
		System.out.println("Patient not found.");
		
		
		
	}
	
	 
	

	
		// TODO Auto-generated method stub

	}
}



