/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.admin;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JPanel;
import model.MainSystem;
import view.doctor.DoctorLogin;

/**
 *
 * @author adeda
 */
public class SystemAdminDashboard extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminDashboard
     */
    private MainSystem mainSystem;
    private JPanel aPanel;

    public SystemAdminDashboard(MainSystem mainSystem) {
        initComponents();
        this.mainSystem = mainSystem;
        this.aPanel = mainSystem.getaPanel();
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
        communityButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        patientButton = new javax.swing.JButton();
        hospitalButton = new javax.swing.JButton();

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Welcome");

        communityButton.setText("Community");
        communityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityButtonActionPerformed(evt);
            }
        });

        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        patientButton.setText("Patient");
        patientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientButtonActionPerformed(evt);
            }
        });

        hospitalButton.setText("Hospital");
        hospitalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(logOutButton)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(communityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(patientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(hospitalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOutButton))
                .addGap(165, 165, 165)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(communityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(308, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void communityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityButtonActionPerformed
        // TODO add your handling code here:

        ViewCommunity viewCommunity = new ViewCommunity(mainSystem);
        aPanel.add(viewCommunity);
        CardLayout layout = (CardLayout) aPanel.getLayout();
        layout.next(aPanel);
    }//GEN-LAST:event_communityButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        AdminLogin adminPanel = new AdminLogin(mainSystem);
        aPanel.add(adminPanel);
        CardLayout layout = (CardLayout) aPanel.getLayout();
        layout.next(aPanel);
        enableRelevantButtons();
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void patientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientButtonActionPerformed
        // TODO add your handling code here:
        CRUDPatient crudPatient = new CRUDPatient(mainSystem);
        aPanel.add(crudPatient);
        CardLayout layout = (CardLayout) aPanel.getLayout();
        layout.next(aPanel);
    }//GEN-LAST:event_patientButtonActionPerformed

    private void hospitalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalButtonActionPerformed
        // TODO add your handling code here:
        ViewHospital viewHospital = new ViewHospital(mainSystem);
        aPanel.add(viewHospital);
        CardLayout layout = (CardLayout) aPanel.getLayout();
        layout.next(aPanel);
    }//GEN-LAST:event_hospitalButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton communityButton;
    private javax.swing.JButton hospitalButton;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton patientButton;
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
