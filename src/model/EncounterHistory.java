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
public class EncounterHistory {
    
    private ArrayList<Encounter> allEncounters;

    public EncounterHistory() {
        this.allEncounters = new ArrayList<>();
    }

//    public ArrayList<Encounter> getAllEncounters() {
//        return allEncounters;
//    }
    public Object[] getAllEncounters(String id) {
        Object[] oConn = new Object[3];
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "Info5100");

            String sql = "select * from pat_" + id + "_enchistory ";

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

    public void setAllEncounters(ArrayList<Encounter> allEncounters) {
        this.allEncounters = allEncounters;
    }
    
    public void addEncounter(Encounter anEncounter) {
        this.allEncounters.add(anEncounter);
    }

    public void removeEncounter(Encounter anEncounter) {
        this.allEncounters.remove(anEncounter);
    }
}
