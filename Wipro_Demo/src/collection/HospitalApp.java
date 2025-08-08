package collection;
import java.util.*;
class Appt {
    private int patientId;
    private String name;
    private String time;

    public Appt(int patientId, String name, String time) {
        this.patientId = patientId;
        this.name = name;
        this.time = time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPatientId() {
        return patientId;
    }

    public String toString() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Time: " + time;
    }
}

public class HospitalApp {
 public static void main(String[] args) {
  TreeMap<Integer, Appt> appointments = new TreeMap<>();
  Scanner sc = new Scanner(System.in);
  int choice;

    do {
          System.out.println("\nHospital Appointment System ");
          System.out.println("1. Add Appointment");
          System.out.println("2. View All Appointments");
          System.out.println("3. Remove Appointment");
          System.out.println("4. Reschedule Appointment");
          System.out.println("5. Show Next and Last Appointment");
          System.out.println("6. Exit");
          System.out.print("Enter your choice: ");
          choice = sc.nextInt();

          switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Appointment Time: ");
                    String time = sc.nextLine();
                    appointments.put(id, new Appt(id, name, time));
                    System.out.println("Appointment added.");
                    break;

                case 2:
                    if (appointments.isEmpty()) {
                        System.out.println(" No appointments found.");
                    } else {
                        System.out.println("All Appointments (sorted by Patient ID):");
                        for (Map.Entry<Integer, Appt> entry : appointments.entrySet()) {
                            System.out.println(entry.getValue());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Patient ID to remove: ");
                    int removeId = sc.nextInt();
                    if (appointments.containsKey(removeId)) {
                        appointments.remove(removeId);
                        System.out.println("Appointment removed.");
                    } else {
                        System.out.println("Patient ID not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Patient ID to reschedule: ");
                    int resId = sc.nextInt();
                    sc.nextLine(); 
                    if (appointments.containsKey(resId)) {
                        System.out.print("Enter new time: ");
                        String newTime = sc.nextLine();
                        appointments.get(resId).setTime(newTime);
                        System.out.println("Appointment rescheduled.");
                    } else {
                        System.out.println("Patient ID not found.");
                    }
                    break;

                case 5:
                    if (!appointments.isEmpty()) {
                        System.out.println("Next Appointment: " + appointments.firstEntry().getValue());
                        System.out.println("Last Appointment: " + appointments.lastEntry().getValue());
                    } else {
                        System.out.println("No appointments scheduled.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println(" Invalid choice. Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}

