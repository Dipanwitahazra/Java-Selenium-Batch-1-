package input_output;

import java.io.*;
import java.util.*;

class Patient implements Serializable {
    int id;
    String name;
    int age;
    String disease;

    public Patient(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Disease: " + disease;
    }
}

public class PatientApp {
    static final String FILE_NAME = "patients.dat";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Patient> patients = loadPatientsFromFile();

        System.out.println("...Patient File System...");
        System.out.println("1. Add New Patient(s)");
        System.out.println("2. Show All Saved Patients");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("How many patients do you want to add? ");
                int count = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < count; i++) {
                    System.out.println("\nEnter details for Patient " + (i + 1));

                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();

                    Patient p = new Patient(id, name, age, disease);
                    patients.add(p);
                }

                savePatientsToFile(patients);
                System.out.println("\nPatients saved successfully to file.");
                break;

            case 2:
                if (patients.isEmpty()) {
                    System.out.println("No patients found in file.");
                } else {
                    System.out.println("\nSaved Patients:");
                    for (Patient p : patients) {
                        System.out.println(p);
                    }
                }
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }

        sc.close();
    }

    
    private static void savePatientsToFile(ArrayList<Patient> patients) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(patients);
        } catch (IOException e) {
            System.out.println("Error saving patients: " + e.getMessage());
        }
    }

   
    
    private static ArrayList<Patient> loadPatientsFromFile() {
        ArrayList<Patient> patients = new ArrayList<>();
        File file = new File(FILE_NAME);

        if (file.exists()) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                patients = (ArrayList<Patient>) in.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error loading patients: " + e.getMessage());
            }
        }

        return patients;
    }
}
