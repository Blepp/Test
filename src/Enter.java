import javax.swing.*;
import java.awt.*;
import java.sql.*;
 
public class Enter extends javax.swing.JFrame {

    
Connection conn = null;
Statement stmt = null;
int a,fail;
String Email1,nama1;
Frame_UI asd = new Frame_UI();


    public Enter() {
        setUndecorated(true);
        initComponents();
        setSize(690,380);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        field_name = new javax.swing.JTextField();
        field_hp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        field_age = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        field_email = new javax.swing.JTextField();
        Button_Submit = new javax.swing.JButton();
        logo_asia = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setText("Please Input your data before accessing");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, -10, 440, 70);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 80, 50, 22);
        getContentPane().add(field_name);
        field_name.setBounds(350, 80, 210, 30);
        getContentPane().add(field_hp);
        field_hp.setBounds(350, 230, 210, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Phone Number");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 230, 110, 22);
        getContentPane().add(field_age);
        field_age.setBounds(350, 130, 210, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 130, 50, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("E-Mail");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 180, 50, 22);
        getContentPane().add(field_email);
        field_email.setBounds(350, 180, 210, 30);

        Button_Submit.setText("Submit");
        Button_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Submit);
        Button_Submit.setBounds(590, 290, 73, 23);

        logo_asia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imported/exploreasia1_1.png"))); // NOI18N
        getContentPane().add(logo_asia);
        logo_asia.setBounds(10, 0, 240, 120);

        jLabel6.setIcon(new javax.swing.ImageIcon("G:\\PNG\\PNG EWEEK\\logoHMJ-01-01.png")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-10, 150, 180, 190);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imported/bg-01.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 690, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SubmitActionPerformed

       PreparedStatement pstmt;
       try{
          fail = 0;
          Class.forName("com.mysql.jdbc.Driver");
          conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eweek","root","1234");
          String sql = "select * from Data";
          stmt = conn.createStatement();
          stmt.executeQuery(sql);
          ResultSet rs =  stmt.executeQuery(sql);
        
            while(rs.next()){ //pengecekan database;
                a = rs.getInt("ID_Pengunjung");
                nama1 = field_name.getText();
                Email1 = field_email.getText();
               if(nama1.equals(rs.getString("Nama_Pengunjung")) && Email1.equals(rs.getString("Email_Pengunjung"))) //sudah ada idnya
               {
                  fail = 1;
                   asd.id = nama1;
                   asd.email = Email1;
                   asd.setVisible(true);
                   this.dispose();
               }
            }
            if(fail == 0){
               //belum ada data login
              a = a + 1;
              sql = "insert into Data values ('"+a+"','"+field_name.getText()+"','"+field_age.getText()+"','"+field_email.getText()+"','"+field_hp.getText()+"','0','0','0')"; //belum pernah login;
              stmt = conn.createStatement();
              stmt.executeUpdate(sql);
              asd.id = nama1;
              asd.email = Email1;
              asd.setVisible(true);
              this.dispose();
            }
       }catch(ClassNotFoundException | SQLException e){
       e.printStackTrace();
       }
    }//GEN-LAST:event_Button_SubmitActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Enter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Enter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Enter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Enter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Enter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Submit;
    private javax.swing.JTextField field_age;
    private javax.swing.JTextField field_email;
    private javax.swing.JTextField field_hp;
    private javax.swing.JTextField field_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel logo_asia;
    // End of variables declaration//GEN-END:variables
}
