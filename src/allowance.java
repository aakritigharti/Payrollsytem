

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Aakriti
 */
public class allowance extends javax.swing.JFrame {

    /**
     * Creates new form allowance
     */
    public allowance() {
        initComponents();
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

        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jLabel17.setBackground(new java.awt.Color(204, 204, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kdjhgjhsg.png"))); // NOI18N
        jLabel17.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setText("Employee ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(245, 41, 130, 24);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(387, 31, 740, 40);

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel2.setText("Empoyee Id:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 110, 120, 25);

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel3.setText("First Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 180, 120, 29);

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel4.setText("Last Name:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 240, 110, 40);

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel5.setText("Date of Birth:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(245, 306, 130, 36);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(390, 100, 200, 40);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(390, 170, 200, 40);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(390, 240, 200, 40);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(390, 300, 200, 40);

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel6.setText("Basic Salary:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(250, 370, 130, 41);

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel7.setText("Department:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(245, 449, 130, 31);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(390, 370, 200, 40);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(387, 443, 200, 40);

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel8.setText("Overtime:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(760, 100, 110, 30);

        jLabel9.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel9.setText("Bonus:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(760, 150, 130, 40);

        jLabel10.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel10.setText("Other:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(760, 220, 100, 28);

        jLabel11.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel11.setText("Total Overtime:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(750, 400, 150, 30);

        jLabel13.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel13.setText("Rate Per Hour:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(750, 460, 160, 31);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(920, 90, 210, 40);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(920, 150, 210, 40);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(920, 210, 210, 40);

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11);
        jTextField11.setBounds(920, 400, 210, 40);
        getContentPane().add(jTextField12);
        jTextField12.setBounds(920, 460, 210, 40);

        jLabel14.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel14.setText("Calculated Amount:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(340, 540, 190, 24);

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
        jButton1.setBounds(270, 590, 120, 50);

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
        jButton2.setBounds(510, 590, 140, 50);

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
        jButton3.setBounds(790, 590, 100, 50);

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
        jButton4.setBounds(1012, 585, 120, 50);

        jLabel12.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel12.setText("0.00");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(540, 540, 140, 24);

        jLabel15.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel15.setText("Total Amount:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(720, 530, 150, 30);

        jLabel16.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel16.setText("0.00");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(880, 530, 190, 30);

        jLabel19.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel19.setText("Provident Fund:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(750, 340, 170, 23);

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField13);
        jTextField13.setBounds(920, 330, 210, 40);

        jLabel18.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel18.setText("Month:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(760, 290, 120, 23);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(920, 270, 210, 40);

        jLabel21.setBackground(new java.awt.Color(204, 204, 255));
        jLabel21.setOpaque(true);
        getContentPane().add(jLabel21);
        jLabel21.setBounds(-17, -4, 1010, 810);

        jLabel22.setBackground(new java.awt.Color(204, 204, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kdjhgjhsg.png"))); // NOI18N
        jLabel22.setOpaque(true);
        getContentPane().add(jLabel22);
        jLabel22.setBounds(980, 160, 770, 740);

        jLabel20.setBackground(new java.awt.Color(204, 204, 255));
        jLabel20.setOpaque(true);
        getContentPane().add(jLabel20);
        jLabel20.setBounds(990, -10, 670, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField13.setText("");
        jDateChooser1.setDate(null);
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField1.setText("");
        jLabel12.setText("0.00");
         jLabel16.setText("0.00");
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new menu().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
         PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        String query = "SELECT * FROM empregister  WHERE id = ?";
        ps = db.connect().prepareStatement(query);
        ps.setString(1, jTextField1.getText());
        rs = ps.executeQuery();

        if (rs.next()) {
            jTextField2.setText(rs.getString("id"));
            jTextField3.setText(rs.getString("firstname"));
            jTextField4.setText(rs.getString("lastname"));
            jTextField5.setText(rs.getString("dateofbirth"));
            jTextField6.setText(rs.getString("salary"));
            jTextField7.setText(rs.getString("department"));
            
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
      
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    int p= JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?", "Add Record", JOptionPane.YES_NO_OPTION);
                    if (p==0){
                     try{   
                          java.util.Date utilDate = jDateChooser1.getDate(); 
                          /*Calendar cal = Calendar.getInstance();
cal.setTime(utilDate);

// Extract Month and Year
int selectedYear = cal.get(Calendar.YEAR);
int selectedMonth = cal.get(Calendar.MONTH) + 1; // Months are 0-based, so add 1

// Format as "YYYY-MM"
       String formattedDate = selectedYear + "-" + (selectedMonth < 10 ? "0" + selectedMonth : selectedMonth);
       java.sql.Date sqlDate = java.sql.Date.valueOf(formattedDate);*/
                        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); 
                        String updateallowanceQuery = "UPDATE allowance SET TotalAmount = TotalAmount + ? WHERE id = ? AND allowance_id = ?";
                        ps = db.connect().prepareStatement(updateallowanceQuery);
                        ps.setDouble(1, Double.parseDouble(jLabel16.getText())); 
                        ps.setInt(2, Integer.parseInt(jTextField2.getText()));    
                        ps.setInt(3, Integer.parseInt(jTextField2.getText()));    
    int rowsUpdated = ps.executeUpdate();

    if (rowsUpdated == 0) {
                          
                        String query = "INSERT INTO `allowance`(`allowance_id`, `first_name`, `last_name`, `salary`, `Department`, `Overtime`, `Bonus`, `Other`, `Month`, `TotalOvertime`, `RatePerHour`, `Calculated amt`, `TotalAmount`, `id`)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                         
                           ps = db.connect().prepareStatement(query);
                           ps.setInt(1, Integer.parseInt(jTextField2.getText())); 
                           ps.setString(2,jTextField3.getText());
                           ps.setString(3,jTextField4.getText());
                           ps.setDouble(4, Double.parseDouble(jTextField6.getText()));   
                           ps.setString(5,jTextField7.getText());
                           ps.setDouble(6, Double.parseDouble(jTextField8.getText())); 
                           ps.setDouble(7, Double.parseDouble(jTextField9.getText())); 
                           ps.setDouble(8, Double.parseDouble(jTextField10.getText())); 
                           ps.setDate(9, sqlDate);
                          // ps.setDate(9, new  java.sql.Date(jDateChooser1.getDate().getTime()));
                           ps.setDouble(10, Double.parseDouble(jTextField11.getText()));
                           ps.setDouble(11, Double.parseDouble(jTextField12.getText())); 
                           ps.setDouble(12, Double.parseDouble(jLabel12.getText())); 
                           ps.setDouble(13, Double.parseDouble(jLabel16.getText()));
                           ps.setInt(14, Integer.parseInt(jTextField2.getText())); 
                           ps.execute();
                          }
                        String salaryQuery = "SELECT salary FROM empregister WHERE id = ?";
                               ps = db.connect().prepareStatement(salaryQuery);
                               ps.setInt(1, Integer.parseInt(jTextField2.getText())); 
                               rs = ps.executeQuery();
                        String updateSalaryQuery1 = "INSERT INTO salary_records (employee_id, record_date, allowance) " +
                            "VALUES (?, ?, ?) " +
                            "ON DUPLICATE KEY UPDATE allowance = ?"; 
PreparedStatement ps2 = db.connect().prepareStatement(updateSalaryQuery1);
ps2.setInt(1, Integer.parseInt(jTextField2.getText()));
//java.sql.Date sqlDate = java.sql.Date.valueOf(formattedDate + "-01"); 
ps2.setDate(2, sqlDate);
//ps2.setString(2, formattedDate);
ps2.setDouble(3, Double.parseDouble(jLabel12.getText()));
ps2.setDouble(4, Double.parseDouble(jLabel12.getText()));
ps2.executeUpdate();
                               
                               
                               
                               
                    if (rs.next()) {
        double currentSalary = rs.getDouble("salary");
        double allowanceAmount = Double.parseDouble(jLabel16.getText()); 
        double updatedSalary = currentSalary + allowanceAmount;

        String updateSalaryQuery = "UPDATE empregister SET salary = ? WHERE id = ?";
        ps = db.connect().prepareStatement(updateSalaryQuery);
        ps.setDouble(1, updatedSalary); 
        ps.setInt(2, Integer.parseInt(jTextField2.getText())); 
        ps.executeUpdate();
    }

    JOptionPane.showMessageDialog(null, "Salary updated successfully!");
    }
 catch (SQLException ex) {
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int salary = Integer.parseInt(jTextField6.getText());
         int overtime = Integer.parseInt(jTextField8.getText());
         //int providentfund = Integer.parseInt(jTextField13.getText());
         //int cif = Integer.parseInt(jTextField14.getText());
         
         double eight = 8;
          double days = 25; 
          double dbop = 0; 
          double overtimeRate = 1.5;
          
          double Total_Overtime = overtime *overtimeRate;
          String x= String.valueOf(Total_Overtime);
          jTextField11.setText(x);
          
          double Total_pf = 0.1*salary;
          String xs= String.format("%.2f", Total_pf);
          jTextField13.setText(xs);
          
          double Total_ci =  0.11*salary;
          String xp= String.valueOf(Total_ci);
          //jTextField14.setText(xp);
          
          dbop= salary/ days/eight;
          String s= String.valueOf(dbop);
          jTextField12.setText(s);
          
          
          
          int bonus = Integer.parseInt(jTextField9.getText());
          int other = Integer.parseInt(jTextField10.getText());
          int c = bonus+other;
          double calc =Total_Overtime* dbop+c ;
          String f = String.format("%.4f", calc);
          jLabel12.setText(f);
          
          double cal = calc + salary;
          String g = String.format("%.4f", cal);
          jLabel16.setText(g);
          
          
          
          
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

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
            java.util.logging.Logger.getLogger(allowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(allowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(allowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(allowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new allowance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
