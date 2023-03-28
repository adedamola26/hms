/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author adeda
 */
public class PatientDirectory {

    private ArrayList<Patient> allPatients;

    public PatientDirectory() {
        this.allPatients = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getAllPatients() {
        return allPatients;
    }

    public void setAllPatients(ArrayList<Patient> allPatients) {
        this.allPatients = allPatients;
    }

    public void addPatient(Patient aPatient) {
        this.allPatients.add(aPatient);
    }

    public void removePatient(Patient aPatient) {
        this.allPatients.remove(aPatient);
    }
}
