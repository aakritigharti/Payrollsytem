  
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.Random;
import java.sql.Statement;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Aakriti
 */
public class employee extends javax.swing.JFrame {

    private String Male;
    private String Female;

    /**
     * Creates new form employee
     */
    public employee() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initializeForm();
    }

  /*public class UniqueIDGenerator { 
    private static long previousTimeMillis = System.currentTimeMillis();
    
    public static synchronized long generateUniqueID() 
    { 
        long currentTimeMillis = System.currentTimeMillis();
    
    if (currentTimeMillis == previousTimeMillis) 
    { currentTimeMillis++; } previousTimeMillis = currentTimeMillis;  
Random random = new Random(); 
return currentTimeMillis * 1000 + random.nextInt(999); 
}
}*/
  private void initializeForm() {
      try{
   long uniqueID = getNextId();
 if (jTextField1 != null) { 
     jTextField1.setText(String.valueOf(uniqueID));
}
 } catch (SQLException ex) { 
         JOptionPane.showMessageDialog( null,"SQL error: " + ex.getMessage()); 
} 
}

private long getNextId() throws SQLException { 
long nextId = 1; 
String query = "SELECT MAX(id) AS max_id FROM empregister"; 
try (
  PreparedStatement ps = db.connect().prepareStatement(query); 
ResultSet rs = ps.executeQuery()) 
{ 
if (rs.next()) {
nextId = rs.getLong("max_id") + 1; } } 
return nextId; 
} 

 
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField4 = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(1200, 570));
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel2.setText("Employee Id:");
        jInternalFrame1.getContentPane().add(jLabel2);
        jLabel2.setBounds(17, 25, 140, 40);

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel3.setText("First Name:");
        jInternalFrame1.getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 90, 130, 34);

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel4.setText("Last Name:");
        jInternalFrame1.getContentPane().add(jLabel4);
        jLabel4.setBounds(22, 155, 120, 35);

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel5.setText("Date of Birth:");
        jInternalFrame1.getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 220, 130, 35);
        jInternalFrame1.getContentPane().add(jTextField1);
        jTextField1.setBounds(160, 24, 210, 40);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jTextField2);
        jTextField2.setBounds(160, 89, 210, 40);
        jInternalFrame1.getContentPane().add(jTextField3);
        jTextField3.setBounds(160, 150, 210, 40);

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel6.setText("Gender:");
        jInternalFrame1.getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 280, 114, 33);

        jRadioButton1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(160, 280, 88, 34);

        jRadioButton2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(270, 280, 115, 34);

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel7.setText("Contact:");
        jInternalFrame1.getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 410, 100, 35);

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel8.setText("Job Title:");
        jInternalFrame1.getContentPane().add(jLabel8);
        jLabel8.setBounds(490, 90, 150, 35);

        jLabel9.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel9.setText("Basic Salary:");
        jInternalFrame1.getContentPane().add(jLabel9);
        jLabel9.setBounds(480, 220, 150, 38);

        jLabel10.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel10.setText("Department:");
        jInternalFrame1.getContentPane().add(jLabel10);
        jLabel10.setBounds(490, 30, 160, 40);
        jInternalFrame1.getContentPane().add(jLabel11);
        jLabel11.setBounds(992, 23, 0, 24);
        jInternalFrame1.getContentPane().add(jTextField5);
        jTextField5.setBounds(650, 30, 210, 40);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jTextField6);
        jTextField6.setBounds(650, 210, 210, 40);
        jInternalFrame1.getContentPane().add(jTextField7);
        jTextField7.setBounds(650, 90, 210, 40);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jTextField8);
        jTextField8.setBounds(160, 410, 220, 40);

        jLabel12.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel12.setText("Address:");
        jInternalFrame1.getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 340, 114, 34);

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jTextField9);
        jTextField9.setBounds(160, 340, 220, 40);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton1);
        jButton1.setBounds(470, 300, 160, 41);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton2);
        jButton2.setBounds(680, 300, 120, 41);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton3);
        jButton3.setBounds(610, 380, 110, 41);
        jInternalFrame1.getContentPane().add(jTextField4);
        jTextField4.setBounds(160, 210, 210, 40);

        jLabel13.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel13.setText(" Join Date:");
        jInternalFrame1.getContentPane().add(jLabel13);
        jLabel13.setBounds(480, 160, 120, 23);
        jInternalFrame1.getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(650, 152, 210, 40);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(190, 40, 1150, 590);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setText("Registration Of Employees");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 6, 261, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         jTextField1.setText("");
        jTextField2.setText("");
        jTextField4.setDate(null);
        jTextField5.setText("");
        jTextField6.setText("");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jDateChooser1.setDate(null);
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField3.setText("");
         
        
    }//GEN-LAST:event_jButton2ActionPerformed
  
 
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     new menu().setVisible(true);        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ResultSet rs; 
       long uniqueID = Long.parseLong(jTextField1.getText());
      /*  if (jTextField1 != null) {
            jTextField1.setText(String.valueOf(uniqueID));
         System.out.println("ID set in JTextField: " + jTextField1.getText()); 
} else { 
System.out.println("jTextField1 is null!");  
}*/
       String firstname = jTextField2.getText();
       String lastname = jTextField3.getText();
        Date dateofbirth = jTextField4.getDate();
       String gender = " ";
       if (jRadioButton1.isSelected()) {
    gender = Male;  
} else if (jRadioButton2.isSelected()) {
    gender = Female;  
}
       int genderValue = gender.equals("Male") ? 0 : 1;
       String contact = jTextField8.getText();
       String address = jTextField9.getText();
       String department = jTextField5.getText();
       String jobtitle = jTextField7.getText();
       Date dateofjoin = jDateChooser1.getDate();
       String salary = jTextField6.getText();
       java.sql.Date sqlDate = new java.sql.Date(dateofbirth.getTime());
       java.sql.Date sqlJoinDate = new java.sql.Date(dateofjoin.getTime());
       PreparedStatement ps;
       String query = "INSERT INTO `empregister`( `id`, `firstname`, `lastname`, `dateofbirth`, `gender`, `contact`, `address`, `department`, `jobtitle`,`datejoin`, `salary`) VALUES ( ?,?,?,?,?,?,?,?,?,?,?)";
       
        try {
            
            ps = db.connect().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, uniqueID);
            ps.setString(2,firstname );
            ps.setString(3,lastname );
            ps.setDate(4, sqlDate);
            ps.setString(5, gender);
           // ps.setString(6,contact );
            if(contact.length() != 10) 
            { 
                JOptionPane.showMessageDialog(null, "Contact length must be exactly 10 digits.");
            } else 
            { ps.setString(6, contact); 
            }
            ps.setString(7,address);
            ps.setString(8,department );
            ps.setString(9,jobtitle );
            ps.setDate(10, sqlJoinDate);
            ps.setString(11,salary );
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) { 
             try (ResultSet generatedKeys = ps.getGeneratedKeys()) { 
                 if (generatedKeys.next()) { 
                     long generatedId = generatedKeys.getLong(1); 
                     JOptionPane.showMessageDialog(null, "New User Added with ID: " + generatedId); } 
                 else { 
                    throw new SQLException("Inserting user failed, no ID obtained."); 
                 } 
             } 
            }
        } catch (SQLException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jRadioButton1.setSelected(true);
        jRadioButton2.setSelected(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
         jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(true); 
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private com.toedter.calendar.JDateChooser jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
