package collection;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

class Apt {
    private String patientName;
    private String doctorName;
    private String time;

    public Apt(String patientName, String doctorName, String time) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.time = time;
    }

    public void setTime(String newTime) {
        this.time = newTime;
    }

    
    public String toString() {
        return "Time: " + time + ", Patient: " + patientName + ", Doctor: " + doctorName;
    }
}

public class Hospital_Apt {

    public static void main(String[] args) {
        TreeMap<String, Apt> appointments = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        int choice;

        do {
            System.out.println("\n... Hospital Appointment System ...");
            System.out.println("1. Add Appointment");
            System.out.println("2. View All Appointments");
            System.out.println("3. Remove Appointment");
            System.out.println("4. Reschedule Appointment");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            while (!sc.hasNextInt()) {
                System.out.print("Enter a valid choice: ");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Appointment Time (dd-MM-yyyy HH:mm): ");
                        String timeInput = sc.nextLine();
                        LocalDateTime dateTime = LocalDateTime.parse(timeInput, formatter);
                        String key = dateTime.format(formatter);

                        if (appointments.containsKey(key)) {
                            System.out.println("Appointment already exists at this time.");
                        } else {
                            System.out.print("Enter Patient Name: ");
                            String patient = sc.nextLine();
                            System.out.print("Enter Doctor Name: ");
                            String doctor = sc.nextLine();
                            Apt appt = new Apt(patient, doctor, key);
                            appointments.put(key, appt);
                            System.out.println("Appointment added successfully.");
                        }
                    } catch (DateTimeParseException e) {
                        System.out.println("Invalid date/time format. Please use dd-MM-yyyy HH:mm");
                    }
                    break;

                case 2:
                    if (appointments.isEmpty()) {
                        System.out.println("No appointments found.");
                    } else {
                        System.out.println("All Appointments:");
                        for (Apt appt : appointments.values()) {
                            System.out.println(appt);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Appointment Time to Remove (dd-MM-yyyy HH:mm): ");
                    String removeTime = sc.nextLine();
                    if (appointments.remove(removeTime) != null) {
                        System.out.println("Appointment removed successfully.");
                    } else {
                        System.out.println("No appointment found at that time.");
                    }
                    break;

                case 4:
                    try {
                        System.out.print("Enter Current Appointment Time (dd-MM-yyyy HH:mm): ");
                        String currentTime = sc.nextLine();
                        Apt appt = appointments.get(currentTime);
                        if (appt == null) {
                            System.out.println("No appointment found at that time.");
                            break;
                        }

                        System.out.print("Enter New Appointment Time (dd-MM-yyyy HH:mm): ");
                        String newTime = sc.nextLine();
                        LocalDateTime newDateTime = LocalDateTime.parse(newTime, formatter);
                        String newKey = newDateTime.format(formatter);

                        if (appointments.containsKey(newKey)) {
                            System.out.println("An appointment already exists at the new time.");
                        } else {
                            appointments.remove(currentTime);
                            appt.setTime(newKey);
                            appointments.put(newKey, appt);
                            System.out.println("Appointment rescheduled successfully.");
                        }
                    } catch (DateTimeParseException e) {
                        System.out.println("Invalid date/time format. Please use dd-MM-yyyy HH:mm");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the appointment system.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select from 1 to 5.");
            }

        } while (choice != 5);

        sc.close();
    }
}
