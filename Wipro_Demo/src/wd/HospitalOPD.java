package wd;
import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    private String name;
    private int age;
    private String disease;

    public Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}

public class HospitalOPD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Patient> patientList = new ArrayList<>();
        int choice;

        do {
            System.out.println("\nHospital OPD Menu:");
            System.out.println("1. Register New Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. View Patient by Index");
            System.out.println("4. Update Patient Disease");
            System.out.println("5. Remove Patient by Index");
            System.out.println("6. Remove Patient by Name");
            System.out.println("7. Check if Patient Exists");
            System.out.println("8. Show Total Patients");
            System.out.println("9. Clear All Records");
            System.out.println("10. Find First/Last Index of a Patient");
            System.out.println("11. Check if List is Empty");
            System.out.println("12. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter patient age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter disease: ");
                    String disease = scanner.nextLine();
                    patientList.add(new Patient(name, age, disease));
                    System.out.println("Patient added successfully!");
                    break;

                case 2:
                    if (patientList.isEmpty()) {
                        System.out.println("No patients registered.");
                    } else {
                        for (Patient p : patientList) {
                            System.out.println("Name: " + p.getName() + ", Age: " + p.getAge() + ", Disease: " + p.getDisease());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter index: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < patientList.size()) {
                        Patient p = patientList.get(index);
                        System.out.println("Name: " + p.getName() + ", Age: " + p.getAge() + ", Disease: " + p.getDisease());
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 4:
                    System.out.print("Enter patient name to update disease: ");
                    String updateName = scanner.nextLine();
                    boolean updated = false;
                    for (Patient p1 : patientList) {
                        if (p1.getName().equalsIgnoreCase(updateName)) {
                            System.out.print("Enter new disease: ");
                            String newDisease = scanner.nextLine();
                            p1.setDisease(newDisease);
                            updated = true;
                            System.out.println("Updated successfully.");
                            break;
                        }
                    }
                    if (!updated) System.out.println("Patient not found.");
                    break;

                case 5:
                    System.out.print("Enter index to remove: ");
                    int removeIdx = scanner.nextInt();
                    if (removeIdx >= 0 && removeIdx < patientList.size()) {
                        patientList.remove(removeIdx);
                        System.out.println("Patient removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 6:
                    System.out.print("Enter name to remove: ");
                    String removeName = scanner.nextLine();
                    boolean removed = false;
                    for (int i = 0; i < patientList.size(); i++) {
                        if (patientList.get(i).getName().equalsIgnoreCase(removeName)) {
                            patientList.remove(i);
                            System.out.println("Patient removed.");
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) System.out.println("Patient not found.");
                    break;

                case 7:
                    System.out.print("Enter name to check: ");
                    String checkName = scanner.nextLine();
                    boolean exists = false;
                    for (Patient p2 : patientList) {
                        if (p2.getName().equalsIgnoreCase(checkName)) {
                            exists = true;
                            break;
                        }
                    }
                    System.out.println(exists ? "Patient exists." : "Patient not found.");
                    break;

                case 8:
                    System.out.println("Total patients: " + patientList.size());
                    break;

                case 9:
                    patientList.clear();
                    System.out.println("All records cleared.");
                    break;

                case 10:
                    System.out.print("Enter name to find index: ");
                    String searchName = scanner.nextLine();
                    int first = -1, last = -1;
                    for (int i = 0; i < patientList.size(); i++) {
                        if (patientList.get(i).getName().equalsIgnoreCase(searchName)) {
                            if (first == -1) first = i;
                            last = i;
                        }
                    }
                    if (first != -1) {
                        System.out.println("First index: " + first);
                        System.out.println("Last index: " + last);
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 11:
                    System.out.println(patientList.isEmpty() ? "Patient list is empty." : "Patient list is not empty.");
                    break;

                case 12:
                    System.out.println("Exiting program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 12);

        scanner.close();
    }
}
			