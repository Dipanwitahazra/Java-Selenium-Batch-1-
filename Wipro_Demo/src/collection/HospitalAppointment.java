package collection;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Appointment implements Comparable<Appointment> {
    private LocalDateTime dateTime;
    private String patientName;

    public Appointment(String patientName, LocalDateTime dateTime) {
        this.patientName = patientName;
        this.dateTime = dateTime;
    }
    
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    
    public String getPatientName() {
        return patientName;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Appointment)) return false;
        Appointment other = (Appointment) obj;
        return dateTime.equals(other.dateTime) && patientName.equals(other.patientName);
    }

    public int hashCode() {
        return Objects.hash(dateTime, patientName);
    }

    public int compareTo(Appointment other) {
        return this.dateTime.compareTo(other.dateTime);
    }

    public String toString() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return format.format(dateTime) + " - " + patientName;
    }
}

public class HospitalAppointment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Appointment> appointments = new TreeSet<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        while (true) {
            System.out.println("\n Appointment Scheduler");
            System.out.println("1. Book Appointment");
            System.out.println("2. Show All Appointments");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter patient name: ");
                String name = sc.nextLine();

                System.out.print("Enter date and time (dd-MM-yyyy HH:mm): ");
                String input = sc.nextLine();

                try {
                    LocalDateTime dateTime = LocalDateTime.parse(input, formatter);
                    Appointment newAppt = new Appointment(name, dateTime);

                    if (appointments.contains(newAppt)) {
                        System.out.println(" Appointment already exists.");
                    } else {
                        appointments.add(newAppt);
                        System.out.println("Appointment added.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid date/time format. Please try again.");
                }

            } else if (choice == 2) {
                if (appointments.isEmpty()) {
                    System.out.println(" No appointments scheduled.");
                } else {
                    System.out.println("\nScheduled Appointments:");
                    for (Appointment appt : appointments) {
                        System.out.println( appt);
                    }
                }

            } else if (choice == 3) {
                System.out.println(" Exiting....");
                break;
            } else {
                System.out.println(" Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}



