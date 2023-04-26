/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

//    public ArrayList<Patient> getAllPatients() {
//        return allPatients;
//    }
    
    public Object[] getAllPatients() {
        Object[] oConn = new Object[3];
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "Info5100");

            String sql = "select * from patientsdirectory";

            PreparedStatement ptst = conn.prepareStatement(sql);
            ResultSet rs = ptst.executeQuery();
            oConn[0] = rs;
            oConn[1] = conn;
//            conn.close();

        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e, "sjkd", HEIGHT);
            System.out.println(e);

        }
        return oConn;
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
