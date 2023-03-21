/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;
import data.Doctor;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adeda
 */
public class DoctorDirectory {

    private static ArrayList<Doctor> allDoctors;

    public DoctorDirectory() {
        this.allDoctors = new ArrayList<>();
    }

    public Object[] getAllDoctors() {
//        return allDoctors;
        Object[] oConn = new Object[2];
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "root");

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

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "root");

            String sql = "insert into doctorsdirectory values (?,?,?)";
            PreparedStatement ptst = conn.prepareStatement(sql);

            ptst.setString(1, aDoctor.getFirstName());
            ptst.setString(2, aDoctor.getLastName());
            ptst.setString(3, aDoctor.getId());
            ptst.executeUpdate();
            conn.close();
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e, "sjkd", HEIGHT);

        }
    }

    public void removeDoctor(String id) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "root");

            String sql = "delete from doctorsdirectory where ID= '" + id + "'";
            PreparedStatement ptst = conn.prepareStatement(sql);
            ptst.executeUpdate();

            conn.close();

        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e, "sjkd", HEIGHT);
        }
    }
}
