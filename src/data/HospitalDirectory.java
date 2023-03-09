/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author adeda
 */
public class HospitalDirectory {
    
    private ArrayList<Hospital> allHospitals;

    public HospitalDirectory() {
        this.allHospitals = new ArrayList<>();
    }

    public ArrayList<Hospital> getAllHospitals() {
        return allHospitals;
    }

    public void setAllHospitals(ArrayList<Hospital> allHospitals) {
        this.allHospitals = allHospitals;
    }

    public void addHospital(Hospital aHospital) {
        this.allHospitals.add(aHospital);
    }

    public void removeHospital(Hospital aHospital) {
        this.allHospitals.remove(aHospital);
    }
}
