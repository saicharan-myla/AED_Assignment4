/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Code.Person;
import Code.Person_Directory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saich
 */
public class AddPatient extends javax.swing.JPanel {

    /**
     * Creates new form AddPatient
     */
int xc ;
Person_Directory P_d = new Person_Directory();
String alphaNumericRegex = "^[a-zA-Z0-9]*$";   
String alphaRegex = "^[a-zA-Z]*$";
String yearRegex = "^(19|20)\\d{2}$";
int row1;
    public AddPatient(Person_Directory P_d) {
        initComponents();
this.P_d = P_d;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblName = new javax.swing.JLabel();
        jlblAge = new javax.swing.JLabel();
        JlblDOB = new javax.swing.JLabel();
        jLblPatient_Id = new javax.swing.JLabel();
        jTxtName = new javax.swing.JTextField();
        jTxtAge = new javax.swing.JTextField();
        jTxtDOB = new javax.swing.JTextField();
        jTxtPatient_Id = new javax.swing.JTextField();
        jBtnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTxtCommuntyNumber = new javax.swing.JTextField();
        jtxtPhone = new javax.swing.JTextField();
        jlblphn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTxteditName = new javax.swing.JTextField();
        jTexteditAge = new javax.swing.JTextField();
        jTexteditComm_Id = new javax.swing.JTextField();
        jTexteditDob = new javax.swing.JTextField();
        jTexteditId = new javax.swing.JTextField();
        jTexteditPhone = new javax.swing.JTextField();
        jBtnUpdate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblName.setText("Name:");
        add(jlblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 92, -1));

        jlblAge.setText("Age:");
        add(jlblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        JlblDOB.setText("Date_of_Birth:");
        add(JlblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        jLblPatient_Id.setText("Id:");
        add(jLblPatient_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 40, -1));
        add(jTxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 108, -1));
        add(jTxtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 120, -1));
        add(jTxtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 120, -1));
        add(jTxtPatient_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 120, -1));

        jBtnSave.setText("Save");
        jBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveActionPerformed(evt);
            }
        });
        add(jBtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "DOB", "Id", "Comm_id", "Phone"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 670, 100));

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 255, 255));
        jLabel3.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        jLabel3.setText("Add Pateint Details");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel1.setText("Community id:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));
        add(jTxtCommuntyNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, -1));
        add(jtxtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 120, -1));

        jlblphn.setText("Phone Number:");
        add(jlblphn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jLabel4.setText("Age");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        jLabel5.setText("Comm_id");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, -1, -1));

        jLabel6.setText("Dob");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, -1, -1));

        jLabel7.setText("Id:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, -1, -1));

        jLabel8.setText("Phone:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, -1, -1));

        jTxteditName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxteditNameActionPerformed(evt);
            }
        });
        add(jTxteditName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 100, -1));
        add(jTexteditAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 100, -1));

        jTexteditComm_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexteditComm_IdActionPerformed(evt);
            }
        });
        add(jTexteditComm_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 100, -1));
        add(jTexteditDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 130, -1));
        add(jTexteditId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 130, -1));

        jTexteditPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexteditPhoneActionPerformed(evt);
            }
        });
        add(jTexteditPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, 100, -1));

        jBtnUpdate.setText("Update");
        jBtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateActionPerformed(evt);
            }
        });
        add(jBtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));

        jLabel9.setText("City");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 140, -1));

        jLabel10.setText("Hno");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        // TODO add your handling code here:
   String Name = jTxtName.getText();
        if (Name == null || Name.equals("")|| !Name.matches(alphaRegex)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid name");
            return;
        }

        String Phone_number = jtxtPhone.getText();
        if ( Phone_number.length() != 10 || Phone_number == null || Phone_number.equals("") || !Phone_number.matches(alphaNumericRegex) ) {
            JOptionPane.showMessageDialog(null, "Please enter a valid phone number");
            return;
        }

        String Dob = jTxtDOB.getText();
        if (Dob == null || Dob.equals("")|| !Dob.matches(alphaNumericRegex) ) {
            JOptionPane.showMessageDialog(null, "Please enter a valid dob");
            return;
        }

        

       String id = jTxtPatient_Id.getText();
        try {
            xc = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, " Please type a valid id ");
            return;
        }

String age = jTxtAge.getText();
        try {
            Integer.parseInt(age);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, " Please type a valid  number ");
            return;
}

String comm_id = jTxtCommuntyNumber.getText();
        try {
            xc = Integer.parseInt(comm_id);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, " Please type a valid  number ");
            return;
}

  String city = jTextField1.getText();
if (city == null || city.equals("")|| !city.matches(alphaNumericRegex) ) {
            JOptionPane.showMessageDialog(null, "Please enter a valid dob");
            return;
        }


String hno = jTextField2.getText();
 try {
            int var = Integer.parseInt(hno);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, " Please type a valid  number ");
            return;
}


Person p = P_d.addPerson();


p.setAge(Integer.parseInt(age));
p.setPhone_number(Phone_number);
p.setName(Name);
p.setDOB(Dob);
p.setId(Integer.parseInt(id));
p.setCommunity_Id(Integer.parseInt(comm_id));
p.setCity(city);
p.setHno1(Integer.parseInt(hno));







/*JOptionPane.showMessageDialog(this,"Car Info Saved");

JtxtDate.setText("");
JtxtLocation.setText("");
JtxtManufactureYear.setText("");
JtxtModelNo.setText("");
JtxtSeats_No.setText("");
JtxtSerailNo.setText("");
jTxtBrand.setText("");
JCheckboxYes.setSelected(false);
jTxtMiles.setText("");
*/

populateTable();


jTxtAge.setText("");
jTxtCommuntyNumber.setText("");
jTxtDOB.setText("");
jtxtPhone.setText("");
jTxtName.setText("");
jTxtPatient_Id.setText("");










    }//GEN-LAST:event_jBtnSaveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       int selected_row = jTable1.getSelectedRow();
if (selected_row<0){
JOptionPane.showMessageDialog(this, "Please select a row to delete");
return;

}
DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
Person selectedPerson = (Person)model.getValueAt(selected_row, 0);
P_d.deletePerson(selectedPerson);
JOptionPane.showMessageDialog(this, "Values deleted");
populateTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
row1 = jTable1.getSelectedRow();


if (row1 >= 0){
    

    jTexteditAge.setText(jTable1.getValueAt(row1,1).toString());
    jTexteditComm_Id.setText(jTable1.getValueAt(row1,4).toString());
    jTexteditDob.setText(jTable1.getValueAt(row1, 2).toString());
    jTexteditId.setText(jTable1.getValueAt(row1, 3).toString());
    jTexteditPhone.setText(jTable1.getValueAt(row1,5).toString());
    jTxteditName.setText(jTable1.getValueAt(row1, 0).toString());


   
   

   

}
else {
JOptionPane.showMessageDialog(this, "Please select a row");
   
}

/*jTexteditAge.setText("");
jTexteditComm_Id.setText("");
jTexteditDob.setText("");
jTexteditId.setText("");
jTexteditPhone.setText("");
jTxteditName.setText("");*/

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTxteditNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxteditNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxteditNameActionPerformed

    private void jTexteditPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexteditPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexteditPhoneActionPerformed

    private void jTexteditComm_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexteditComm_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexteditComm_IdActionPerformed

    private void jBtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateActionPerformed
        // TODO add your handling code here:
    int s_id = Integer.parseInt(jTable1.getValueAt(row1, 3).toString());

   for (Person p : Person_Directory.person_list){


 if (s_id == p.getId()){
    p.setAge(Integer.parseInt(jTexteditAge.getText()));
    p.setCommunity_Id(Integer.parseInt(jTexteditComm_Id.getText()));
p.setId(Integer.parseInt(jTexteditId.getText()));
p.setDOB(jTexteditDob.getText());
p.setName(jTxteditName.getText());
p.setPhone_number(jTexteditPhone.getText());
populateEditTbale();



   
}

}
     
    }//GEN-LAST:event_jBtnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlblDOB;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JButton jBtnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblPatient_Id;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTexteditAge;
    private javax.swing.JTextField jTexteditComm_Id;
    private javax.swing.JTextField jTexteditDob;
    private javax.swing.JTextField jTexteditId;
    private javax.swing.JTextField jTexteditPhone;
    private javax.swing.JTextField jTxtAge;
    private javax.swing.JTextField jTxtCommuntyNumber;
    private javax.swing.JTextField jTxtDOB;
    private javax.swing.JTextField jTxtName;
    private javax.swing.JTextField jTxtPatient_Id;
    private javax.swing.JTextField jTxteditName;
    private javax.swing.JLabel jlblAge;
    private javax.swing.JLabel jlblName;
    private javax.swing.JLabel jlblphn;
    private javax.swing.JTextField jtxtPhone;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);

for(Person p : P_d.getPerson_list()){

Object [] row =new Object[6];
row[0]= p;
row[1]= p.getAge();
row[2]= p.getDOB();
row[3]= p.getId();
row[4]= p.getCommunity_Id();
row[5]= p.getPhone_number();

model.addRow(row);

    }
}

    private void populateEditTbale() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

   
DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);

for(Person p : P_d.getPerson_list()){

Object [] row =new Object[6];
row[0]= p;
row[1]= p.getAge();
row[2]= p.getDOB();
row[3]= p.getId();
row[4]= p.getCommunity_Id();
row[5]= p.getPhone_number();

model.addRow(row);

    }



jTexteditAge.setText("");
jTxteditName.setText("");
jTexteditComm_Id.setText("");
jTexteditDob.setText("");
jTexteditId.setText("");
jTexteditPhone.setText("");


    }


}
