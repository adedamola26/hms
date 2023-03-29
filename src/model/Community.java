/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author adeda
 */
public class Community {

    private String name;
    private String postalCode;
    private HospitalDirectory allHospitals;

    public HospitalDirectory getAllHospitals() {
        return allHospitals;
    }

    public void setAllHospitals(HospitalDirectory allHospitals) {
        this.allHospitals = allHospitals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return name;
    }

}
