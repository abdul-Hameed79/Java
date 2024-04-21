// Write a simple Hosptal Management Code in java Using OOPS concept

package OOPS;

import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;
    private int age;
    private String gender;
    private String illness;

    public Patient(String name, int age, String gender, String illness) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.illness = illness;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    // Method to print patient details
    public void printDetails(int number) {
        System.out.println("S.NO " + number + ": " + "Name: " + name + "  " + "Age: " +
                        age + "  " + "Gender: " + gender + "  " + "Illness: " + illness); 
    }
}

class Doctor {
    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Method to print doctor details
    public void printDetails(int number) {
        System.out.println("Doctor " + number + ": " + "Name: " + name + "  " + "Specilization: " + specialization);
    }
}

class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String date;

    public Appointment(Doctor doctor, Patient patient, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    // Getters and setters
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

public class HospitalManagementSystem {
    private List<Patient> patients;
    private List<Doctor> doctors;
    private List<Appointment> appointments;

    public HospitalManagementSystem() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void scheduleAppointment(Doctor doctor, Patient patient, String date) {
        Appointment appointment = new Appointment(doctor, patient, date);
        appointments.add(appointment);
    }

    public void displayAppointments() {
        System.out.println("Scheduled Appointments:");
        int appointmentNumber = 1;
        for (Appointment appointment : appointments) {
            System.out.println("Appointment " + appointmentNumber + ": " + "Date: " + appointment.getDate() +"  " + 
                               "Patient: " + appointment.getPatient().getName() + "  " + "Doctor: " + appointment.getDoctor().getName());
            appointmentNumber++;
        }
    }

    // Method to print all patient details
    public void printAllPatients() {
        System.out.println("Patients List:");
        int patientNumber = 1;
        for (Patient patient : patients) {
            patient.printDetails(patientNumber);
            patientNumber++;
        }
    }

    // Method to print all doctor details
    public void printAllDoctors() {
        System.out.println("Doctors List:");
        int doctorNumber = 1;
        for (Doctor doctor : doctors) {
            doctor.printDetails(doctorNumber);
            doctorNumber++;
        }
    }

    public static void main(String[] args) {
        HospitalManagementSystem hospital = new HospitalManagementSystem();

        // Add patients
        hospital.addPatient(new Patient("John Doe", 35, "Male", "Fever"));
        hospital.addPatient(new Patient("Jane Smith", 25, "Female", "Fracture"));

        // Add doctors
        hospital.addDoctor(new Doctor("Dr. Smith", "Orthopedics"));
        hospital.addDoctor(new Doctor("Dr. Johnson", "Pediatrics"));

        // Schedule appointments
        hospital.scheduleAppointment(hospital.doctors.get(0), hospital.patients.get(0), "2024-04-18");
        hospital.scheduleAppointment(hospital.doctors.get(1), hospital.patients.get(1), "2024-04-19");

        System.out.println();

        // Display all patients
        hospital.printAllPatients();
        System.out.println();

        // Display all doctors
        hospital.printAllDoctors();
        System.out.println();

        // Display all appointments
        hospital.displayAppointments();
    }
}