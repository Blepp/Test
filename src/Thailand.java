import java.awt.Frame;
import javax.swing.*;

public class Thailand extends JFrame {
Details test = new Details();
    String id;
    String email;
    public Thailand() {
        setUndecorated(true);        
        initComponents();
        setSize(1600,900); //resize me someday
        setExtendedState(Frame.MAXIMIZED_BOTH);
	setLocationRelativeTo(null);
        setTitle("You are exploring Thailand");
        setBounds(new java.awt.Rectangle(0,0,1600,900));       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Home = new javax.swing.JButton();
        Button_Prev = new javax.swing.JButton();
        Button_Next = new javax.swing.JButton();
        Button_Stand1 = new javax.swing.JButton();
        Button_Stand2 = new javax.swing.JButton();
        Button_Stand3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        Button_Home.setBounds(780, 770, 120, 130);

        Button_Prev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/E-Week-ChinaPrev.png"))); // NOI18N
        Button_Prev.setBorder(BorderFactory.createEmptyBorder());
        Button_Prev.setContentAreaFilled(false);
        Button_Prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PrevActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Prev);
        Button_Prev.setBounds(0, 800, 280, 100);

        Button_Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/E-Week-KoreaNext.png"))); // NOI18N
        Button_Next.setBorder(BorderFactory.createEmptyBorder());
        Button_Next.setContentAreaFilled(false);
        Button_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_NextActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Next);
        Button_Next.setBounds(1290, 800, 310, 100);

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
        Button_Stand1.setBounds(80, 480, 210, 70);

        Button_Stand2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/btn_detail.png"))); // NOI18N
        Button_Stand2.setBorderPainted(false);
        Button_Stand2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Stand2.setBorder(BorderFactory.createEmptyBorder());
        Button_Stand2.setContentAreaFilled(false);
        Button_Stand2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Stand2ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Stand2);
        Button_Stand2.setBounds(720, 490, 210, 60);

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
        Button_Stand3.setBounds(1330, 500, 210, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/Backgroud/thai_sth.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1600, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_HomeActionPerformed
         Frame_UI zxc = new Frame_UI();
         zxc.id = id;
         zxc.email = email;
         zxc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_HomeActionPerformed

    private void Button_PrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PrevActionPerformed
         China zxc = new China();
         zxc.id = id;
         zxc.email = email;
         zxc.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_Button_PrevActionPerformed

    private void Button_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_NextActionPerformed
        Korea zxc = new Korea();
         zxc.id = id;
         zxc.email = email;
         zxc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_NextActionPerformed

    private void Button_Stand1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Stand1ActionPerformed
        test.getSaus("12");
       test.id = id;
       test.email = email;        
        test.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_Stand1ActionPerformed

    private void Button_Stand2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Stand2ActionPerformed
       test.getSaus("13");
       test.id = id;
       test.email = email;        
        test.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_Button_Stand2ActionPerformed

    private void Button_Stand3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Stand3ActionPerformed
        test.getSaus("14");
       test.id = id;
       test.email = email;        
        test.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_Stand3ActionPerformed

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
            java.util.logging.Logger.getLogger(Thailand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Thailand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Thailand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Thailand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Thailand().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
