package com.healthcare.module;
class  PatientRegistration {
	private int Id;
	private String Name;
	private int Age;
	private String Illness;
	
	public PatientRegistration(int id, String name, int age, String illness) {
		this.Id = id;
		this.Name = name;
		this.Age = age;
		this.Illness = illness;
	}
	public int getId() {
		return Id;
	}
	public String getName() {
		return Name;
	}
	public int getAge() {
		return Age;
	}
	public String getIllness() {
		return Illness;
	}
	public void displayInfo() {
		System.out.println("Patient ID: " + Id);
		System.out.println("Name: " + Name);
		System.out.println("Age: " + Age);
		System.out.println("Illness: " + Illness);
	}



	
}


	



	


		// TODO Auto-generated method stub

	
