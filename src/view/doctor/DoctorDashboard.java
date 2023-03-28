/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.doctor;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.CityDirectory;
import model.Doctor;
import model.MainSystem;

/**
 *
 * @author adeda
 */
public class DoctorDashboard extends javax.swing.JPanel {

    /**
     * Creates new form DoctorDashboard
     */
    JPanel aPanel;
    CityDirectory allCities;
    Doctor attendingDoctor;
    private MainSystem mainSystem;
    private JFrame aFrame;

    public DoctorDashboard(MainSystem mainSystem) {
        initComponents();
        this.mainSystem = mainSystem;
        this.aPanel = mainSystem.getaPanel();
        this.allCities = mainSystem.getAllCities();
        this.attendingDoctor = mainSystem.getADoctor();
        titleLabel.setText("Welcome Dr. " + attendingDoctor.getFirstName());
        this.aFrame = mainSystem.getaFrame();
        disableIrrelevantButtons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        newPatientButton = new javax.swing.JButton();
        oldPatientButton = new javax.swing.JButton();
        choiceLabel = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Welcome");

        newPatientButton.setText("New Patient");
        newPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPatientButtonActionPerformed(evt);
            }
        });

        oldPatientButton.setText("Existing Patient");
        oldPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldPatientButtonActionPerformed(evt);
            }
        });

        choiceLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        choiceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        choiceLabel.setText("Who do you want to attend to?");

        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(newPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261)
                        .addComponent(oldPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(choiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(295, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutButton)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115)
                .addComponent(choiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(278, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void newPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPatientButtonActionPerformed
        // TODO add your handling code here:
        AddPatient addPatient = new AddPatient(mainSystem);
        aPanel.add(addPatient);
        CardLayout layout = (CardLayout) aPanel.getLayout();
        layout.next(aPanel);
    }//GEN-LAST:event_newPatientButtonActionPerformed

    private void oldPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldPatientButtonActionPerformed
        // TODO add your handling code here:
        ViewPatients viewPatients = new ViewPatients(mainSystem);
        aPanel.add(viewPatients);
        CardLayout layout = (CardLayout) aPanel.getLayout();
        layout.next(aPanel);
    }//GEN-LAST:event_oldPatientButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        DoctorLogin doctorLogin = new DoctorLogin(mainSystem);
        aPanel.add(doctorLogin);
        CardLayout layout = (CardLayout) aPanel.getLayout();
        layout.next(aPanel);
        enableRelevantButtons();
    }//GEN-LAST:event_logOutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel choiceLabel;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton newPatientButton;
    private javax.swing.JButton oldPatientButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    private void disableIrrelevantButtons() {

        JPanel freeLayoutPanel = mainSystem.getFreePanel();
        Component[] components = freeLayoutPanel.getComponents();
        for (Component component : components) {
            if (component.getName().equals("doctorButton") | component.getName().equals("adminButton") | component.getName().equals("patientButton")) {
                JButton myButton = (JButton) component;
                myButton.setEnabled(false);
            }
        }
    }

    private void enableRelevantButtons() {
        JPanel freeLayoutPanel = mainSystem.getFreePanel();
        Component[] components = freeLayoutPanel.getComponents();
        for (Component component : components) {
            if (component.getName().equals("doctorButton") | component.getName().equals("adminButton") | component.getName().equals("patientButton")) {
                JButton myButton = (JButton) component;
                myButton.setEnabled(true);
            }
        }
    }
}
