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
public class DoctorDirectory {
    
    private ArrayList<Doctor> allDoctors;

    public DoctorDirectory() {
        this.allDoctors = new ArrayList<>();
    }

    public ArrayList<Doctor> getAllDoctors() {
        return allDoctors;
    }

    public void setAllDoctors(ArrayList<Doctor> allDoctors) {
        this.allDoctors = allDoctors;
    }

    public void addDoctor(Doctor aDoctor) {
        this.allDoctors.add(aDoctor);
    }

    public void removeDoctor(Doctor aDoctor) {
        this.allDoctors.remove(aDoctor);
    }
}
