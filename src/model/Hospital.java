/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author adeda
 */
public class Hospital {

    private String name;
    private String address;
    private Long cellNum;
    private DoctorDirectory allDoctors;

    public DoctorDirectory getAllDoctors() {
        return allDoctors;
    }

    public void setAllDoctors(DoctorDirectory allDoctors) {
        this.allDoctors = allDoctors;
    }

    public Long getCellNum() {
        return cellNum;
    }

    public void setCellNum(Long cellNum) {
        this.cellNum = cellNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
