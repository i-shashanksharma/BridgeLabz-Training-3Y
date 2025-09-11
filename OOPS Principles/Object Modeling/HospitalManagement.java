import java.util.ArrayList;
import java.util.List;
class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void showDoctors() {
        System.out.println(name + " is consulting with doctors:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }
    }
}

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting with " + patient.getName());
        patients.add(patient);
        patient.addDoctor(this);
    }

    public void showPatients() {
        System.out.println("Dr. " + name + " has patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showHospitalDetails() {
        System.out.println("\nHospital: " + name);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor drSmith = new Doctor("Smith");
        Doctor drJones = new Doctor("Jones");

        Patient alice = new Patient("Alice");
        Patient bob = new Patient("Bob");

        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJones);
        hospital.addPatient(alice);
        hospital.addPatient(bob);

        hospital.showHospitalDetails();

        drSmith.consult(alice);
        drJones.consult(alice);
        drSmith.consult(bob);

        System.out.println();
        drSmith.showPatients();
        drJones.showPatients();

        System.out.println();
        alice.showDoctors();
        bob.showDoctors();
    }
}
