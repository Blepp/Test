
/**
 *
 * @author AgumonPC
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Details extends JFrame {
String email,id;
String qwe;
int angka;
      Frame_UI asd = new Frame_UI();
    public Details() {
        setUndecorated(true);
        initComponents();
        setSize(1600,900); //resize me someday
        setExtendedState(Frame.MAXIMIZED_BOTH);
	setLocationRelativeTo(null);
        setTitle("tes");
        setBounds(new java.awt.Rectangle(0,0,1600,900));        
    }

    public void getSaus(String source)
  {
    qwe = source;
    switch (source) {
            //indo  
            case "1" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/1.jpg")));//waroengjajan
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);    
                       break;
            case "2" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/2.jpg")));//innez
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);    
                       break;
            case "3" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/3.jpg")));//mepu
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);    
                       break;
            case "4" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/4.jpg")));//mabun
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);    
                       break;
            case "5" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/5.jpg")));//oelcof
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);    
                       break;
             //china
            case "6" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/6.jpg")));//ahpui
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);    
                       break;

            case "7" : jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/7.jpg")));//mic 
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);    
                       break;
            case "8" : jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/8.jpg")));//xmm
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);            
                break;
            case "9" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/9.jpg")));//ccs
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);
                       break;
                //thai
            case "10" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/10.jpg")));//thaitas
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);
                       break;
            case "11" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/11.jpg")));//imaroi
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);
                       break;
  

            case "12" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/12.jpg"))); //krub 
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);
                       break;
                //korea
            case "13" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/13.jpg"))); //moomoo
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);
                       break;
            case "14" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/14.jpg")));//junet21
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);
                       break;
            case "15" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/15.jpg")));//omo
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);
                    break;
            case "16" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/16.jpg")));//kimbap
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);
                break;
                //japan
            case "17" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/17.jpg"))); //oishii
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);            
                break;
            case "18" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/18.jpg")));//happitama
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900); 
            break;
            case "19" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/19.jpg")));//sokrajin
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);
            break;
            case "20" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/20.jpg")));//itadaki
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);
            break;
            case "21" :jLabel1.setIcon(new ImageIcon(getClass().getResource("/Label_Page3/21.jpg")));//hontart
                       getContentPane().add(jLabel1);
                       jLabel1.setBounds(0, 0, 1600, 900);            
            break;     
         //    re-do japan image.

    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Prev = new javax.swing.JButton();
        Button_Next = new javax.swing.JButton();
        Button_Vote = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Button_Prev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imported/prev-button.png"))); // NOI18N
        Button_Prev.setBorder(BorderFactory.createEmptyBorder());
        Button_Prev.setContentAreaFilled(false);
        Button_Prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PrevActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Prev);
        Button_Prev.setBounds(0, 790, 120, 110);

        Button_Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imported/next-button.png"))); // NOI18N
        Button_Next.setBorder(BorderFactory.createEmptyBorder());
        Button_Next.setContentAreaFilled(false);
        Button_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_NextActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Next);
        Button_Next.setBounds(1460, 780, 140, 120);

        Button_Vote.setText("Vote");
        Button_Vote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_VoteActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Vote);
        Button_Vote.setBounds(660, 760, 180, 140);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1530, 0, 55, 23);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1600, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_NextActionPerformed
        angka = Integer.parseInt(qwe);
        angka = angka + 1;
        if(angka == 22 ){
            angka = 0;
        }
        qwe = Integer.toString(angka);
        getSaus(qwe);
    }//GEN-LAST:event_Button_NextActionPerformed

    private void Button_VoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_VoteActionPerformed
       Connection conn = null;
       Statement stmt;
       PreparedStatement pstmt;
       try{
          Class.forName("com.mysql.jdbc.Driver");
          conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eweek","root","1234");
          String sql = "select * from Data";
          stmt = conn.createStatement();
          stmt.executeQuery(sql);
          ResultSet rs =  stmt.executeQuery(sql);
        
            while(rs.next()){ //pengecekan database
                String idc = rs.getString("Nama_Pengunjung");
                String email = rs.getString("Email_Pengunjung");
               if(id.equals(idc) && email.equals(email)) //check id;
               { String hehe = rs.getString("Voting1");
                 String hoho = rs.getString("Voting2");
                 String haha = rs.getString("Voting3");
                   if (hehe.equals("0")){
                        sql = "update Data set Voting1 = '"+angka+"',Voting2 = '0', where Nama_Pengunjung = '"+id+"' and Email_Pengunjung = '"+email+"' ";
                                  stmt = conn.createStatement();
                                  stmt.executeUpdate(sql);
                                  JOptionPane.showMessageDialog(null, "You have casted your first vote !");
                                  Frame_UI asd = new Frame_UI();
                                  asd.id = id;
                                  asd.email = email;
                                  asd.setVisible(true);
                                  this.dispose();
                   }
                   else if (hoho.equals("0") && (!qwe.equals(hehe))){
                        sql = "update Data set Voting2 = '"+angka+"',Voting3 = '"+0+"', where Nama_Pengunjung = '"+id+"' and Email_Pengunjung = '"+email+"' ";
                        stmt = conn.createStatement();
                        stmt.executeUpdate(sql);           
                        JOptionPane.showMessageDialog(null, "You have casted your second vote !");
                                  Frame_UI asd = new Frame_UI();
                                  asd.id = id;
                                  asd.email = email;
                                  asd.setVisible(true);
                                  this.dispose();
                   }
                   else if(haha.equals("0")&& (!qwe.equals(hehe))){
                        sql = "update Data set Voting3 = '"+angka+"',where Nama_Pengunjung = '"+id+"' and Email_Pengunjung = '"+email+"' ";
                        stmt = conn.createStatement();
                        stmt.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "You have casted your third vote !");
                                  Frame_UI asd = new Frame_UI();
                                  asd.id = id;
                                  asd.email = email;
                                  asd.setVisible(true);
                                  this.dispose();
               }
                   else
                   {
                       JOptionPane.showMessageDialog(null, "You can only vote maxinum 3 times,sorry","Attention",JOptionPane.ERROR_MESSAGE);
                   }
               }
            }
       }catch(ClassNotFoundException | SQLException e){
       e.printStackTrace();
       }
    }//GEN-LAST:event_Button_VoteActionPerformed

    private void Button_PrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PrevActionPerformed
        angka = Integer.parseInt(qwe);
        angka = angka - 1;
        if(angka == 0 ){
            angka = 21;
        }
         qwe = Integer.toString(angka);
        getSaus(qwe);
    }//GEN-LAST:event_Button_PrevActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       asd.email = email;
       asd.id = id;
       asd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Next;
    private javax.swing.JButton Button_Prev;
    private javax.swing.JButton Button_Vote;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
