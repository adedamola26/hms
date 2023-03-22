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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
        Object[] oConn = new Object[3];
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
//        this.allDoctors.add(aDoctor);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "root");

            String sql = "insert into doctorsdirectory "
                    + "(FirstName,LastName,Employer,Age,Gender,CellNumber,"
                    + "Email,BloodGroup,StartDate,Address,City,Specialization,"
                    + "Username,Password)"
                    + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ptst = conn.prepareStatement(sql);

            DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
            String dt = fmt.format(aDoctor.getStartDate());
                    
            ptst.setString(1, aDoctor.getFirstName());
            ptst.setString(2, aDoctor.getLastName());
            ptst.setString(3, aDoctor.getEmployer());
            ptst.setString(4, String.valueOf(aDoctor.getAge()));
            ptst.setString(5, aDoctor.getGender());
            ptst.setString(6, String.valueOf(aDoctor.getCellNum()));
            ptst.setString(7, aDoctor.getEmail());
            ptst.setString(8, aDoctor.getBloodGroup());
            ptst.setString(9, dt);
            ptst.setString(10, aDoctor.getAddress());
            ptst.setString(11, aDoctor.getCity());
            ptst.setString(12, aDoctor.getSpecialization());
            ptst.setString(13, aDoctor.getUsername());
            ptst.setString(14, aDoctor.getPassword());

            ptst.executeUpdate();

            String sql3 = "select ID from doctorsdirectory ORDER BY ID DESC LIMIT 1";
            PreparedStatement ptst3 = conn.prepareStatement(sql3);
            ResultSet rs = ptst3.executeQuery();
            rs.next();
            String id = rs.getString("ID");

            String sql2 = "insert into " + aDoctor.getEmployer().replace(' ', '_') + "_doctors values (?,?,?)";
            PreparedStatement ptst2 = conn.prepareStatement(sql2);

            ptst2.setString(1, id);

            ptst2.setString(2, aDoctor.getFirstName());
            ptst2.setString(3, aDoctor.getLastName());

            ptst2.executeUpdate();

            conn.close();

        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e, "sjkd", HEIGHT);
            System.out.println(e);
        }
    }

    public void removeDoctor(String id, String emp) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "root");

            String sql = "delete from doctorsdirectory where ID= '" + id + "'";
            PreparedStatement ptst = conn.prepareStatement(sql);
            ptst.executeUpdate();

            String sql2 = "delete from " + emp.replace(' ', '_') + "_doctors where ID= '" + id + "'";
            PreparedStatement ptst2 = conn.prepareStatement(sql2);
            ptst2.executeUpdate();
            conn.close();

        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e, "sjkd", HEIGHT);
        }
    }
}
