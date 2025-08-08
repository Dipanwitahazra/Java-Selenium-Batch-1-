package com.healthcare.module;

public class GeneralPhysician extends Doctor{
	public GeneralPhysician(String name) {
		super(name, "General Physician");
	}
	public void diagnose(PatientRegistration patient) {
		System.out.println("General Physician " + name + " diagnosing patient: "+ patient.getName());
			System.out.println("Diagnosis: " + patient.getIllness());	
	}

	
		// TODO Auto-generated method stub

	}


