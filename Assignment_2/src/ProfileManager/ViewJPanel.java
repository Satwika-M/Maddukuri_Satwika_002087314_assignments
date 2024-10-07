/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ProfileManager;

import Model.Person;
import Model.PersonDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Satwika
 */
public class ViewJPanel extends javax.swing.JPanel {
    private JPanel Area;
    private PersonDirectory personDirectory;
    private Person person;
    

    /**
     * Creates new form ListJPanel
     */
    public ViewJPanel(JPanel Area, PersonDirectory directory, Person person) {
        initComponents();
        
        this.Area = Area;
        this.person = person;
        
        refreshTextFields();
        setViewMode();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtLastName = new javax.swing.JTextField();
        lblSSN = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblAGE = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAGE = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        txtAddress3 = new javax.swing.JTextField();
        lblZipCode4 = new javax.swing.JLabel();
        lblDeptNumber3 = new javax.swing.JLabel();
        txtZipCode4 = new javax.swing.JTextField();
        txtDeptNumber3 = new javax.swing.JTextField();
        lblStreetAddress4 = new javax.swing.JLabel();
        txtStreetAddress4 = new javax.swing.JTextField();
        lblCity4 = new javax.swing.JLabel();
        txtCity4 = new javax.swing.JTextField();
        lblState4 = new javax.swing.JLabel();
        txtState4 = new javax.swing.JTextField();
        lblAddress3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTitle = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCurrentAddress = new javax.swing.JLabel();
        txtCurrentAddress = new javax.swing.JTextField();
        lblUnitNumber = new javax.swing.JLabel();
        txtUnitNumber = new javax.swing.JTextField();
        lblStreetAddress = new javax.swing.JLabel();
        txtStreetAddress = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblZipCode = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnSave = new javax.swing.JButton();
        brnUpdate = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lblSSN.setText("Social Security Number");

        lblAGE.setText("Age");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Enter Work Address");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lblZipCode4.setText("Zip code");

        lblDeptNumber3.setText("Dept Name");

        lblStreetAddress4.setText("Street Address");

        lblCity4.setText("City");

        lblState4.setText("State");

        lblAddress3.setText("Address");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblZipCode4)
                    .addComponent(lblState4)
                    .addComponent(lblCity4)
                    .addComponent(lblStreetAddress4)
                    .addComponent(lblDeptNumber3)
                    .addComponent(lblAddress3))
                .addGap(75, 75, 75)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDeptNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStreetAddress4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtState4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZipCode4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAddress3, txtCity4, txtDeptNumber3, txtState4, txtStreetAddress4, txtZipCode4});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress3))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDeptNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeptNumber3))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreetAddress4)
                    .addComponent(txtStreetAddress4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity4)
                    .addComponent(txtCity4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtState4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZipCode4)
                    .addComponent(txtZipCode4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Person Details");

        lblFirstName.setText("First Name");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblCurrentAddress.setText("Current Address");

        lblUnitNumber.setText("Unit Number");

        lblStreetAddress.setText("Street Address");

        lblCity.setText("City");

        lblState.setText("State");

        lblZipCode.setText("Zip code");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblCurrentAddress))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblUnitNumber))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStreetAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblState, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblZipCode, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurrentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCity, txtCurrentAddress, txtState, txtStreetAddress, txtUnitNumber, txtZipCode});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrentAddress)
                    .addComponent(txtCurrentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnitNumber))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStreetAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZipCode)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Home Address");

        lblLastName.setText("Last Name");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        brnUpdate.setText("Update");
        brnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstName)
                                    .addComponent(lblLastName))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblAGE)
                                        .addComponent(lblSSN))
                                    .addGap(1, 1, 1)))
                            .addGap(56, 56, 56)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(btnSave)
                .addGap(60, 60, 60)
                .addComponent(brnUpdate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAGE, txtFirstName, txtLastName, txtSSN});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSSN)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAGE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(brnUpdate))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAGE, txtFirstName, txtLastName, txtSSN});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAGE, lblFirstName, lblLastName, lblSSN, lblTitle});

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText(); 
        String socialsecurityNumber = txtSSN.getText();
        String age = txtAGE.getText();
        String HomeCurrentAddress = txtCurrentAddress.getText();
        String unitNumber = txtUnitNumber.getText();
        String HomeStreet = txtStreetAddress.getText();
        String HomeCity = txtCity.getText();
        String HomeState = txtState.getText();
        String Homezipcode  = txtZipCode.getText();
        String WorkAddress = txtAddress3.getText();
        String DeptNumber = txtDeptNumber3.getText();
        String WorkStreet = txtStreetAddress4.getText();
        String WorkCity = txtCity4.getText();
        String WorkState = txtState4.getText();
        String Workzipcode= txtZipCode4.getText();
        
        if (firstName.isBlank() || lastName.isBlank() || socialsecurityNumber.isBlank() || age.isBlank() || HomeCurrentAddress.isBlank() || unitNumber.isBlank() || HomeStreet.isBlank() || HomeCity.isBlank() || Homezipcode.isBlank() || WorkAddress.isBlank() || DeptNumber.isBlank() || WorkStreet.isBlank() || WorkCity.isBlank() || Workzipcode.isBlank())
        {
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
            return;
        }
        
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setSocialSecurityNumber(socialsecurityNumber);
        person.setAge(age);
        person.setCurrentAddress(HomeCurrentAddress);
        person.setUnitNumber(unitNumber);
        person.setStreet(HomeStreet);
        person.setCity(HomeCity);
        person.setState(HomeState);
        person.setZipCode(Homezipcode);
        person.setAddress(WorkAddress);
        person.setDeptNumber(DeptNumber);
        person.setWorkstreet(WorkStreet);
        person.setWorkcity(WorkCity);
        person.setWorkState(WorkState);
        person.setZipCode(Workzipcode);
        
        
        JOptionPane.showMessageDialog(null,"Account successfully updated", "Successful", JOptionPane.INFORMATION_MESSAGE);
        
        setViewMode();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void brnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnUpdateActionPerformed
        // TODO add your handling code here:
        setEditMode();
    }//GEN-LAST:event_brnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnUpdate;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAGE;
    private javax.swing.JLabel lblAddress3;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCity4;
    private javax.swing.JLabel lblCurrentAddress;
    private javax.swing.JLabel lblDeptNumber3;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblState4;
    private javax.swing.JLabel lblStreetAddress;
    private javax.swing.JLabel lblStreetAddress4;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUnitNumber;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JLabel lblZipCode4;
    private javax.swing.JTextField txtAGE;
    private javax.swing.JTextField txtAddress3;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCity4;
    private javax.swing.JTextField txtCurrentAddress;
    private javax.swing.JTextField txtDeptNumber3;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtState4;
    private javax.swing.JTextField txtStreetAddress;
    private javax.swing.JTextField txtStreetAddress4;
    private javax.swing.JTextField txtUnitNumber;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JTextField txtZipCode4;
    // End of variables declaration//GEN-END:variables

    private void refreshTextFields() {
        txtFirstName.setText(person.getFirstName());
        txtLastName.setText(person.getLastName()); 
        txtSSN.setText(person.getSocialSecurityNumber());
        txtAGE.setText(person.getAge());
        txtCurrentAddress.setText(person.getCurrentAddress());
        txtUnitNumber.setText(person.getUnitNumber());
        txtStreetAddress.setText(person.getStreet());
        txtCity.setText(person.getCity());
        txtState.setText(person.getState());
        txtZipCode.setText(person.getZipCode());
        txtAddress3.setText(person.getAddress());
        txtDeptNumber3.setText(person.getDeptNumber());
        txtStreetAddress4.setText(person.getWorkstreet());
        txtCity4.setText(person.getWorkcity());
        txtState4.setText(person.getWorkState());
        txtZipCode4.setText(person.getWorkzipCode());
        
    }

    private void setViewMode() {
    
        txtFirstName.setEnabled(false);
        txtLastName.setEnabled(false); 
        txtSSN.setEnabled(false);
        txtAGE.setEnabled(false);
        txtCurrentAddress.setEnabled(false);
        txtUnitNumber.setEnabled(false);
        txtStreetAddress.setEnabled(false);
        txtCity.setEnabled(false);
        txtState.setEnabled(false);
        txtZipCode.setEnabled(false);
        txtAddress3.setEnabled(false);
        txtDeptNumber3.setEnabled(false);
        txtStreetAddress4.setEnabled(false);
        txtCity4.setEnabled(false);
        txtState4.setEnabled(false);
        txtZipCode4.setEnabled(false);
        
        btnSave.setEnabled(false);
        brnUpdate.setEnabled(true);
    
    }

    private void setEditMode() {
        txtFirstName.setEnabled(true);
        txtLastName.setEnabled(true); 
        txtSSN.setEnabled(true);
        txtAGE.setEnabled(true);
        txtCurrentAddress.setEnabled(true);
        txtUnitNumber.setEnabled(true);
        txtStreetAddress.setEnabled(true);
        txtCity.setEnabled(true);
        txtState.setEnabled(true);
        txtZipCode.setEnabled(true);
        txtAddress3.setEnabled(true);
        txtDeptNumber3.setEnabled(true);
        txtStreetAddress4.setEnabled(true);
        txtCity4.setEnabled(true);
        txtState4.setEnabled(true);
        txtZipCode4.setEnabled(true);
    
        btnSave.setEnabled(true);
        brnUpdate.setEnabled(false);
    }
}
