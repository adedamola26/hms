/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.doctor;

import java.awt.CardLayout;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.Encounter;
import model.EncounterHistory;
import model.MainSystem;
import model.PatientDirectory;
import model.VitalSign;

/**
 *
 * @author adeda
 */
public class ViewEncounters extends javax.swing.JPanel {

    /**
     * Creates new form ViewEncounters
     */
    private MainSystem mainSystem;
    JPanel aPanel;

    public ViewEncounters(MainSystem mainSystem) {
        initComponents();
        this.mainSystem = mainSystem;
        this.aPanel = mainSystem.getaPanel();
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        encounterTable = new javax.swing.JTable();
        viewButton = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        temperatureLabel = new javax.swing.JLabel();
        pulseLabel = new javax.swing.JLabel();
        complaintLabel = new javax.swing.JLabel();
        diagnosisLabel = new javax.swing.JLabel();
        prescriptionLabel = new javax.swing.JLabel();
        dateField = new javax.swing.JLabel();
        temperatureField = new javax.swing.JLabel();
        pulseField = new javax.swing.JLabel();
        complaintField = new javax.swing.JLabel();
        diagnosisField = new javax.swing.JLabel();
        prescriptionField = new javax.swing.JLabel();
        doctorLabel = new javax.swing.JLabel();
        doctorField = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("View Encounter History");

        encounterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Temperature", "Pulse Rate", "Attending Doctor", "Complaint", "Diagnosis", "Prescription"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(encounterTable);
        if (encounterTable.getColumnModel().getColumnCount() > 0) {
            encounterTable.getColumnModel().getColumn(0).setResizable(false);
            encounterTable.getColumnModel().getColumn(1).setResizable(false);
            encounterTable.getColumnModel().getColumn(2).setResizable(false);
            encounterTable.getColumnModel().getColumn(3).setResizable(false);
            encounterTable.getColumnModel().getColumn(4).setResizable(false);
            encounterTable.getColumnModel().getColumn(5).setResizable(false);
            encounterTable.getColumnModel().getColumn(6).setResizable(false);
        }

        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        dateLabel.setText("Date");

        temperatureLabel.setText("Temperature");

        pulseLabel.setText("Pulse Rate");

        complaintLabel.setText("Complaint");

        diagnosisLabel.setText("Diagnosis");

        prescriptionLabel.setText("Prescription");

        dateField.setText("(Date)");

        temperatureField.setText("(Temperature)");

        pulseField.setText("(Pulse Rate)");

        complaintField.setText("(Complaint)");

        diagnosisField.setText("(Diagnosis)");

        prescriptionField.setText("(Prescription)");

        doctorLabel.setText("Attending Doctor");

        doctorField.setText("(Attending Doctor)");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("°C");

        jLabel2.setText("bpm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(doctorLabel)
                        .addGap(70, 70, 70)
                        .addComponent(doctorField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(updateButton)
                        .addGap(206, 206, 206)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(temperatureLabel)
                    .addComponent(pulseLabel))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(temperatureField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diagnosisLabel)
                        .addGap(97, 97, 97)
                        .addComponent(diagnosisField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(complaintLabel)
                        .addGap(95, 95, 95)
                        .addComponent(complaintField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pulseField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prescriptionLabel)
                        .addGap(86, 86, 86)
                        .addComponent(prescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(complaintLabel)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(complaintField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temperatureLabel)
                    .addComponent(diagnosisLabel)
                    .addComponent(temperatureField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diagnosisField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pulseLabel)
                    .addComponent(prescriptionLabel)
                    .addComponent(pulseField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorLabel))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = encounterTable.getSelectedRow();
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(aPanel, "Please select encounter to view.", "Error", HEIGHT);
        } else {
//            Encounter selectedEncounter = (Encounter) encounterTable.getValueAt(selectedIndex, 2);
//            DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
//            String visitDate = fmt.format(selectedEncounter.getVisitDate());
//            VitalSign vitalSign = selectedEncounter.getVitalSign();

//            dateField.setText(visitDate);
//            temperatureField.setText(String.valueOf(vitalSign.getTemperature()));
//            pulseField.setText(String.valueOf(vitalSign.getPulseRate()));
//            complaintField.setText(selectedEncounter.getComplaint());
//            diagnosisField.setText(selectedEncounter.getDiagnosis());
//            prescriptionField.setText(selectedEncounter.getPrescription());
//            doctorField.setText(selectedEncounter.getAttendingDoc());
            
            dateField.setText(String.valueOf(encounterTable.getValueAt(selectedIndex, 0)));
            temperatureField.setText(String.valueOf(encounterTable.getValueAt(selectedIndex, 1)));
            pulseField.setText(String.valueOf(encounterTable.getValueAt(selectedIndex, 2)));
            complaintField.setText(String.valueOf(encounterTable.getValueAt(selectedIndex, 4)));
            diagnosisField.setText(String.valueOf(encounterTable.getValueAt(selectedIndex, 5)));
            prescriptionField.setText(String.valueOf(encounterTable.getValueAt(selectedIndex, 6)));
            doctorField.setText(String.valueOf(encounterTable.getValueAt(selectedIndex, 3)));
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        RecordEncounter recordEncounter = new RecordEncounter(mainSystem);
        aPanel.add(recordEncounter);
        CardLayout layout = (CardLayout) aPanel.getLayout();
        layout.next(aPanel);
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:

//        PatientDirectory allPatients = mainSystem.getAllPatients();
//        allPatients.addPatient(mainSystem.getaPatient());
//        mainSystem.setAllPatients(allPatients);
        JOptionPane.showMessageDialog(aPanel, "Patient's details updated successfully.", "Success", HEIGHT);
        ViewPatients viewPatients = new ViewPatients(mainSystem);
        aPanel.add(viewPatients);
        CardLayout layout = (CardLayout) aPanel.getLayout();
        layout.next(aPanel);
//        int selectedIndex = patientsTable.getSelectedRow();
//        if (validateUpdate()) {
//            Patient selectedPatient = mainSystem.getaPatient();
//            PatientDirectory allPatients = mainSystem.getAllPatients();
//
//            selectedPatient.setFirstName(firstNameField.getText());
//            selectedPatient.setLastName(lastNameField.getText());
//            selectedPatient.setGender(String.valueOf(genderMenu.getSelectedItem()));
//            selectedPatient.setBloodGroup(String.valueOf(bloodMenu.getSelectedItem()));
//            allPatients.addPatient(selectedPatient);
//            mainSystem.setAllPatients(allPatients);
//            JOptionPane.showMessageDialog(aPanel, "Patient's details updated successfully.", "Success", HEIGHT);
//            populateTable();
//            updateButton.setEnabled(false);
//            viewEncountersButton.setEnabled(false);
//            patientsTable.setRowSelectionAllowed(true);
//            clearFields();
//        }
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel complaintField;
    private javax.swing.JLabel complaintLabel;
    private javax.swing.JLabel dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel diagnosisField;
    private javax.swing.JLabel diagnosisLabel;
    private javax.swing.JLabel doctorField;
    private javax.swing.JLabel doctorLabel;
    private javax.swing.JTable encounterTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel prescriptionField;
    private javax.swing.JLabel prescriptionLabel;
    private javax.swing.JLabel pulseField;
    private javax.swing.JLabel pulseLabel;
    private javax.swing.JLabel temperatureField;
    private javax.swing.JLabel temperatureLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

//        DefaultTableModel model = (DefaultTableModel) encounterTable.getModel();
//        model.setRowCount(0);
//        EncounterHistory allEncounters = mainSystem.getaPatient().getAllEncounter();
//        try {
//            for (Encounter e : allEncounters.getAllEncounters()) {
//                Object[] rows = new Object[5];
//                DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
//                String visitDate = fmt.format(e.getVisitDate());
//
//                rows[0] = visitDate;
//                rows[1] = e.getAttendingDoc();
//                rows[2] = e;
//                rows[3] = e.getDiagnosis();
//                rows[4] = e.getPrescription();
//
//                model.addRow(rows);
////            clearFields();
//            }
//        } catch (NullPointerException e) {
//
//        }
        EncounterHistory allE = new EncounterHistory();
        try {
            Object[] oConn = allE.getAllEncounters(mainSystem.getPatientID());
            ResultSet rs = (ResultSet) oConn[0];
            Connection conn = (Connection) oConn[1];

            DefaultTableModel model = (DefaultTableModel) encounterTable.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Object o[] = {rs.getString("Date"),
                    rs.getString("Temperature"),
                        rs.getString("PulseRate"),
                    rs.getString("AttendingDoctor"),
                    rs.getString("Complaint"),
                    rs.getString("Diagnosis"),
                    rs.getString("Prescription"),};
                model.addRow(o);
            }
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
