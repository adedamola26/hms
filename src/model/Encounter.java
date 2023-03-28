/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import data.*;
import java.util.Date;

/**
 *
 * @author adeda
 */
public class Encounter {

    private Date visitDate;
    private String complaint;
    private String diagnosis;
    private String prescription;
    private String attendingDoc;
    private VitalSign vitalSign;

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setVitalSigns(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getAttendingDoc() {
        return attendingDoc;
    }

    public void setAttendingDoc(String attendingDoc) {
        this.attendingDoc = attendingDoc;
    }

    
}
