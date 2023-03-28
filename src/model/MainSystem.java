/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JPanel;

/**
 *
 * @author adeda
 */
public class MainSystem {

    JPanel aPanel;
    CityDirectory allCities;
    Doctor aDoctor;
    Patient aPatient;
    PatientDirectory allPatients;

    public MainSystem() {
        this.aPanel = new JPanel();
        this.allCities = new CityDirectory();
        this.aDoctor = new Doctor();
        this.aPatient = new Patient();
        this.allPatients = new PatientDirectory();

    }

    public PatientDirectory getAllPatients() {
        return allPatients;
    }

    public void setAllPatients(PatientDirectory allPatients) {
        this.allPatients = allPatients;
    }

    public JPanel getaPanel() {
        return aPanel;
    }

    public void setaPanel(JPanel aPanel) {
        this.aPanel = aPanel;
    }

    public CityDirectory getAllCities() {
        return allCities;
    }

    public void setAllCities(CityDirectory allCities) {
        this.allCities = allCities;
    }

    public Doctor getADoctor() {
        return aDoctor;
    }

    public void setADoctor(Doctor aDoctor) {
        this.aDoctor = aDoctor;
    }

    public Patient getaPatient() {
        return aPatient;
    }

    public void setaPatient(Patient aPatient) {
        this.aPatient = aPatient;
    }

}
