/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author adeda
 */
public class MainSystem {

    private JPanel aPanel;
    private CityDirectory allCities;
    private Doctor aDoctor;
    private Patient aPatient;
    private PatientDirectory allPatients;
    private JPanel freePanel;
    private Community aCommunity;
    private City aCity;
    private Hospital aHospital;

    public MainSystem() {
        this.aPanel = new JPanel();
        this.allCities = new CityDirectory();
        this.aDoctor = new Doctor();
        this.aPatient = new Patient();
        this.allPatients = new PatientDirectory();
        this.freePanel = new JPanel();
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

    public JPanel getFreePanel() {
        return freePanel;
    }

    public void setFreePanel(JPanel freePanel) {
        this.freePanel = freePanel;
    }

    public Community getaCommunity() {
        return aCommunity;
    }

    public void setaCommunity(Community aCommunity) {
        this.aCommunity = aCommunity;
    }

    public City getaCity() {
        return aCity;
    }

    public void setaCity(City aCity) {
        this.aCity = aCity;
    }

    public Hospital getaHospital() {
        return aHospital;
    }

    public void setaHospital(Hospital aHospital) {
        this.aHospital = aHospital;
    }

}
