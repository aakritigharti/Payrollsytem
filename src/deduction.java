
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Aakriti
 */
public class deduction extends javax.swing.JFrame {

    /**
     * Creates new form deduction
     */
    public deduction() {
        initComponents();
        Toolkit toolkit =getToolkit();
        Dimension size = toolkit.getScreenSize();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        r_percentage = new javax.swing.JRadioButton();
        r_amount = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txt_percentage = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_deduction = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setText("First Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 190, 120, 37);

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel2.setText("Last Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(257, 253, 120, 36);

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel3.setText("Date of Birth:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(257, 327, 130, 31);

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel4.setText("Department:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(787, 119, 130, 38);

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel5.setText("Job Title:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(810, 190, 120, 37);

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel6.setText(" Basic Salary:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(790, 260, 140, 34);

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel7.setText("Employee ID:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(257, 119, 130, 38);

        jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldActionPerformed(evt);
            }
        });
        jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldKeyReleased(evt);
            }
        });
        getContentPane().add(jTextField);
        jTextField.setBounds(405, 116, 240, 40);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(405, 180, 240, 40);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(410, 250, 240, 40);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(410, 320, 240, 40);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(920, 120, 250, 40);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(920, 180, 260, 40);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(925, 250, 270, 40);

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel8.setText("Deducted by:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(257, 397, 136, 31);

        r_percentage.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        r_percentage.setText("Percentage(%)");
        r_percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_percentageActionPerformed(evt);
            }
        });
        getContentPane().add(r_percentage);
        r_percentage.setBounds(405, 397, 170, 30);

        r_amount.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        r_amount.setText("Amount");
        r_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_amountActionPerformed(evt);
            }
        });
        getContentPane().add(r_amount);
        r_amount.setBounds(581, 397, 130, 31);

        jLabel9.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel9.setText("Percentage:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(257, 471, 130, 32);
        getContentPane().add(txt_percentage);
        txt_percentage.setBounds(820, 460, 160, 38);

        jLabel10.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel10.setText("Amount:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(720, 470, 89, 30);
        getContentPane().add(txt_deduction);
        txt_deduction.setBounds(405, 465, 180, 40);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Total Deduction:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(770, 380, 160, 31);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("0.00");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(1000, 330, 90, 31);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Salary After Deduction:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(770, 330, 210, 32);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("0.00");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(1000, 380, 56, 32);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(257, 550, 110, 39);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(513, 550, 150, 39);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(810, 550, 100, 39);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1042, 550, 101, 39);

        jLabel15.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel15.setText("Employee ID:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(260, 50, 130, 34);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(405, 43, 710, 40);

        jLabel17.setBackground(new java.awt.Color(204, 204, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kdjhgjhsg.png"))); // NOI18N
        jLabel17.setOpaque(true);
        getContentPane().add(jLabel17);
        jLabel17.setBounds(1060, 220, 2180, 970);

        jLabel16.setBackground(new java.awt.Color(204, 204, 255));
        jLabel16.setOpaque(true);
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 1510, 840);

        jLabel18.setBackground(new java.awt.Color(204, 204, 255));
        jLabel18.setOpaque(true);
        getContentPane().add(jLabel18);
        jLabel18.setBounds(740, 0, 790, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_amountActionPerformed
         r_percentage.setSelected(false);
        r_amount.setSelected(true);
        txt_percentage.setEditable(true);
        txt_deduction.setEnabled(false);
        txt_percentage.setEnabled(true);
        txt_deduction.setText("");
    }//GEN-LAST:event_r_amountActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            PreparedStatement ps = null;
             ResultSet rs = null;
        int p= JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?", "Add Record", JOptionPane.YES_NO_OPTION);
        if (p==0){
            try {
    String updateDeductionQuery = "UPDATE deductions SET deduction_amount = deduction_amount + ? WHERE id = ? AND deduction_id = ?";
    ps = db.connect().prepareStatement(updateDeductionQuery);
    ps.setDouble(1, Double.parseDouble(jLabel14.getText())); // Add new deduction amount
    ps.setInt(2, Integer.parseInt(jTextField.getText()));    // Employee ID
    ps.setInt(3, Integer.parseInt(jTextField.getText()));    // Deduction ID
    int rowsUpdated = ps.executeUpdate();

    if (rowsUpdated == 0) {
        String insertQuery = "INSERT INTO deductions (deduction_id, first_name, surname, salary, deduction_amount, id) VALUES (?, ?, ?, ?, ?, ?)";
        ps = db.connect().prepareStatement(insertQuery);
        ps.setInt(1, Integer.parseInt(jTextField.getText())); 
        ps.setString(2, jTextField2.getText()); 
        ps.setString(3, jTextField3.getText()); 
        ps.setDouble(4, Double.parseDouble(jTextField7.getText())); 
        ps.setDouble(5, Double.parseDouble(jLabel14.getText())); 
        ps.setInt(6, Integer.parseInt(jTextField.getText())); 
        ps.executeUpdate();
    }

    // Update the salary in `empregister`
    String salaryQuery = "SELECT salary FROM empregister WHERE id = ?";
    ps = db.connect().prepareStatement(salaryQuery);
    ps.setInt(1, Integer.parseInt(jTextField.getText())); 
    rs = ps.executeQuery();

    if (rs.next()) {
        double currentSalary = rs.getDouble("salary");
        double deductionAmount = Double.parseDouble(jLabel14.getText()); 
        double updatedSalary = currentSalary - deductionAmount;

        String updateSalaryQuery = "UPDATE empregister SET salary = ? WHERE id = ?";
        ps = db.connect().prepareStatement(updateSalaryQuery);
        ps.setDouble(1, updatedSalary); 
        ps.setInt(2, Integer.parseInt(jTextField.getText())); 
        ps.executeUpdate();
    }

    JOptionPane.showMessageDialog(null, "Salary updated successfully!");

} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
} finally {
    try {
        if (rs != null) rs.close();
        if (ps != null) ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error closing resources: " + ex.getMessage());
    }
}

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       new menu().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        // TODO add your handling code here:
         PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        String query = "SELECT * FROM empregister  WHERE id = ?";
        ps = db.connect().prepareStatement(query);
        ps.setString(1, jTextField8.getText());
        rs = ps.executeQuery();

        if (rs.next()) {
            jTextField.setText(rs.getString("id"));
            jTextField2.setText(rs.getString("firstname"));
            jTextField3.setText(rs.getString("lastname"));
            jTextField4.setText(rs.getString("dateofbirth"));
            jTextField6.setText(rs.getString("jobtitle"));
            jTextField7.setText(rs.getString("salary"));
            jTextField5.setText(rs.getString("department"));
        } else {
            JOptionPane.showMessageDialog(null, "No record found");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error fetch TextField2ing employee details: " + ex.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error closing resources: " + ex.getMessage());
        } 
}  
    }//GEN-LAST:event_jTextField8KeyReleased

    private void r_percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_percentageActionPerformed
        // TODO add your handling code here:
        r_amount.setSelected(false);
        r_percentage.setSelected(true);
        txt_deduction.setEditable(true);
        txt_percentage.setEnabled(false);
        txt_deduction.setEnabled(true);
        txt_percentage.setText("");
    }//GEN-LAST:event_r_percentageActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
PreparedStatement ps = null;
        int salary = Integer.parseInt(jTextField7.getText()); 
            if(r_percentage.isSelected() == true ){ 
        int percent = Integer.parseInt(txt_deduction.getText());
        int calcpercent = salary/100 * percent;
        String xp = String.valueOf(calcpercent);
        int sal = salary - calcpercent;
        jLabel14.setText(xp);
        jLabel12.setText(String.valueOf(sal));
            }
             if(r_amount.isSelected() == true ){    
        int getamt = Integer.parseInt(txt_percentage.getText());
         String xa = String.valueOf(getamt);
         int calcamt = salary - getamt;
         jLabel14.setText(xa);
        jLabel12.setText(String.valueOf(calcamt));
        }
        try{
            String value1 = jTextField.getText();
             String value2 = jTextField7.getText();
             String query = "UPDATE empregister SET salary = ? WHERE id = ?";
             ps =db.connect().prepareStatement(query);
             ps.setString(1, value2); 
             ps.setString(2, value1);
               ps = db.connect().prepareStatement(query);
               ps.setString(1, value2);  // Set the salary
               ps.setString(2, value1);  // Set the id
    
    // Execute the update query
    int rowsUpdated = ps.executeUpdate();  // executeUpdate for update operations
    
    if (rowsUpdated > 0) {
        JOptionPane.showMessageDialog(null, "Record Updated");
    } else  {
        JOptionPane.showMessageDialog(null, "No record found to update");
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, ex.getMessage());
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTextField.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        r_percentage.setSelected(false);
        r_amount.setSelected(false);
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        txt_deduction.setText("");
        jLabel14.setText("0.00");
        jLabel12.setText("0.00");
        txt_percentage.setText("");
        
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deduction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JRadioButton r_amount;
    private javax.swing.JRadioButton r_percentage;
    private javax.swing.JTextField txt_deduction;
    private javax.swing.JTextField txt_percentage;
    // End of variables declaration//GEN-END:variables
}
