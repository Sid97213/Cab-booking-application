/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cab.booking.frames;
import cab.booking.frames.Home;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import cab.booking.frames.FinishRide;
import cab.booking.frames.BkgCnf;
/**
 *
 * @author PARTH KRISHNA SHARMA
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public static String current_id;
    Connection con=null;
    Connection con1=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    PreparedStatement pst1=null;
    int flag=0;
    
    public LogIn() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Log In");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User ID");

        userid.setBackground(new java.awt.Color(255, 255, 51));
        userid.setForeground(new java.awt.Color(0, 0, 0));
        userid.setText("Type User ID");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");

        password.setBackground(new java.awt.Color(255, 255, 51));
        password.setForeground(new java.awt.Color(0, 0, 0));
        password.setText("jPasswordField1");

        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(password))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(BkgCnf.total_rides % 3 == 0)
        {
           AssignRandomLocationToDrivers.allocate(); 
        }
        String pass = password.getText();
        try
        {
            //storing current user
            con = test.connectToDB();
            current_id = userid.getText();
            //query to get userid and pasword from database
            String query = "Select * from users where userid='"+userid.getText()+"'";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            flag = rs.getInt("free_at");
            //checking if password is valid
//            JOptionPane.showMessageDialog(null, flag);
            if(pass.equals(rs.getString("pswrd")))
            {
                JOptionPane.showMessageDialog(null, "Login Successful");
                if (flag==0){
                    Home home = new Home();
                    home.setVisible(true);
                }
                else if (flag==1){
//                    JOptionPane.showMessageDialog(null, "inside else if");
                    Calendar calendar = Calendar.getInstance();  // gets a calendar using the default time zone and locale.
                    Date date=calendar.getTime();
                    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
                    String formattedDate=dateFormat.format(date);
//                    JOptionPane.showMessageDialog(null, formattedDate);
//                    JOptionPane.showMessageDialog(null, rs.getString("busy_till"));
                    if(formattedDate.compareTo(rs.getString("busy_till"))>0){
//                        JOptionPane.showMessageDialog(null, "inside fnkl");
                        con.close();
                        FinishRide fr = new FinishRide();
                        fr.setVisible(true);
                    }
                    else{
                        con.close();
                        BkgCnf bc = new BkgCnf();
                        bc.setVisible(true);
                    }
                }
                
            }
            else
            {
                LogIn lg = new LogIn();
                lg.setVisible(true);
                JOptionPane.showMessageDialog(null, "Please recheck password");
            }
            con.close();
            
    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
