
import javax.swing.*;
import java.awt.*;

public class Indo extends JFrame {

    Details test = new Details();
    String id;
    String email;
    public Indo() {
        setUndecorated(true);
        initComponents();
        setSize(1600,900); //resize me someday
        setExtendedState(Frame.MAXIMIZED_BOTH);
	setLocationRelativeTo(null);
        setTitle("You are exploring Indonesia");
        setBounds(new java.awt.Rectangle(0,0,1600,900));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Home = new javax.swing.JButton();
        Button_Prev = new javax.swing.JButton();
        Button_Next = new javax.swing.JButton();
        Button_Stand2 = new javax.swing.JButton();
        Button_Stand1 = new javax.swing.JButton();
        Button_Stand3 = new javax.swing.JButton();
        Button_Stand5 = new javax.swing.JButton();
        Button_Stand4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().setLayout(null);

        Button_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/homeicon.png"))); // NOI18N
        Button_Home.setBorder(BorderFactory.createEmptyBorder());
        Button_Home.setContentAreaFilled(false);
        Button_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Home);
        Button_Home.setBounds(740, 760, 120, 130);

        Button_Prev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/E-Week-JapanPrev.png"))); // NOI18N
        Button_Prev.setBorder(BorderFactory.createEmptyBorder());
        Button_Prev.setContentAreaFilled(false);
        Button_Prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PrevActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Prev);
        Button_Prev.setBounds(0, 790, 230, 100);

        Button_Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/E-Week-ChinaNext.png"))); // NOI18N
        Button_Next.setBorder(BorderFactory.createEmptyBorder());
        Button_Next.setContentAreaFilled(false);
        Button_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_NextActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Next);
        Button_Next.setBounds(1320, 800, 280, 90);

        Button_Stand2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/btn_detail.png"))); // NOI18N
        Button_Stand2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Stand2.setBorder(BorderFactory.createEmptyBorder());
        Button_Stand2.setContentAreaFilled(false);
        Button_Stand2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Stand2ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Stand2);
        Button_Stand2.setBounds(730, 390, 210, 70);

        Button_Stand1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/btn_detail.png"))); // NOI18N
        Button_Stand1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Stand1.setBorder(BorderFactory.createEmptyBorder());
        Button_Stand1.setContentAreaFilled(false);
        Button_Stand1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Stand1ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Stand1);
        Button_Stand1.setBounds(50, 290, 210, 70);

        Button_Stand3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/btn_detail.png"))); // NOI18N
        Button_Stand3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Stand3.setBorder(BorderFactory.createEmptyBorder());
        Button_Stand3.setContentAreaFilled(false);
        Button_Stand3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Stand3ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Stand3);
        Button_Stand3.setBounds(1320, 320, 210, 70);

        Button_Stand5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/btn_detail.png"))); // NOI18N
        Button_Stand5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Stand5.setBorder(BorderFactory.createEmptyBorder());
        Button_Stand5.setContentAreaFilled(false);
        Button_Stand5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Stand5ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Stand5);
        Button_Stand5.setBounds(1320, 660, 210, 70);

        Button_Stand4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/btn_detail.png"))); // NOI18N
        Button_Stand4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Stand4.setBorder(BorderFactory.createEmptyBorder());
        Button_Stand4.setContentAreaFilled(false);
        Button_Stand4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Stand4ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Stand4);
        Button_Stand4.setBounds(40, 650, 210, 70);

        jLabel1.setFont(new java.awt.Font("TeXGyreAdventor", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Merah");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1360, 270, 80, 50);

        jLabel3.setFont(new java.awt.Font("TeXGyreAdventor", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Waroeng Jajan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 230, 180, 50);

        jLabel5.setFont(new java.awt.Font("TeXGyreAdventor", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Putih");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1440, 270, 90, 50);

        jLabel4.setFont(new java.awt.Font("TeXGyreAdventor", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("OEL Coffee House");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1320, 610, 210, 40);

        jLabel6.setFont(new java.awt.Font("TeXGyreAdventor", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Innez");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(800, 350, 80, 40);

        jLabel7.setFont(new java.awt.Font("TeXGyreAdventor", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Masakan Bunda");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 610, 200, 40);

        jLabel2.setFont(new java.awt.Font("TeXGyreAdventor", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/Backgroud/Indo_bg.PNG"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, -10, 1590, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_HomeActionPerformed
        Frame_UI cincai = new Frame_UI();
        cincai.id = id;
        cincai.email = email;
        cincai.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_HomeActionPerformed

    private void Button_PrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PrevActionPerformed
         Japan zxc = new Japan();
         zxc.id = id;
         zxc.email = email;
         zxc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_PrevActionPerformed

    private void Button_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_NextActionPerformed
         China zxc = new China();
         zxc.id = id;
         zxc.email = email;
         zxc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_NextActionPerformed

    private void Button_Stand1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Stand1ActionPerformed
       test.getSaus("1");
       test.id = id;
       test.email = email;
       test.setVisible(true);//waroeng jajan;
        this.dispose();
    }//GEN-LAST:event_Button_Stand1ActionPerformed

    private void Button_Stand2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Stand2ActionPerformed
        test.getSaus("2");
        test.id = id;
        test.email = email;
        test.setVisible(true);//innez
      
        this.dispose();
    }//GEN-LAST:event_Button_Stand2ActionPerformed

    private void Button_Stand3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Stand3ActionPerformed
       test.getSaus("3");
       test.id = id;
       test.email = email;
       test.setVisible(true);//mepu
       this.dispose();        
    }//GEN-LAST:event_Button_Stand3ActionPerformed

    private void Button_Stand5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Stand5ActionPerformed
        test.getSaus("5");
        test.id = id;
        test.email = email;
        test.setVisible(true);//oelcoffee
        this.dispose();       
    }//GEN-LAST:event_Button_Stand5ActionPerformed

    private void Button_Stand4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Stand4ActionPerformed
        test.getSaus("4");
        test.id = id;
        test.email = email;
        test.setVisible(true);//masakanbunda
        this.dispose();       
    }//GEN-LAST:event_Button_Stand4ActionPerformed

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
            java.util.logging.Logger.getLogger(Indo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Indo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Indo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Indo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Indo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Home;
    private javax.swing.JButton Button_Next;
    private javax.swing.JButton Button_Prev;
    private javax.swing.JButton Button_Stand1;
    private javax.swing.JButton Button_Stand2;
    private javax.swing.JButton Button_Stand3;
    private javax.swing.JButton Button_Stand4;
    private javax.swing.JButton Button_Stand5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
