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
public class DoctorDirectory {

    private ArrayList<Doctor> allDoctors;

    public DoctorDirectory() {
        this.allDoctors = new ArrayList<>();
    }

//    public ArrayList<Doctor> getAllDoctors() {
//        return allDoctors;
//    }

    public Object[] getAllDoctors() {
        Object[] oConn = new Object[3];
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "Info5100");

            String sql = "select * from doctorsdirectory";

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
