import java.awt.*;
import javax.swing.*;
public class Japan extends JFrame {
    String id;
    String email;
    public Japan() {
        setUndecorated(true);
        initComponents();
        setSize(1600,900); //resize me someday
        setExtendedState(Frame.MAXIMIZED_BOTH);
	setLocationRelativeTo(null);
        setTitle("You are exploring Japan !");
        setBounds(new java.awt.Rectangle(0,0,1600,900));
    }
static String coba;
Frame_UI new1 = new Frame_UI();
Details test = new Details();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Stand1 = new javax.swing.JButton();
        Button_Next = new javax.swing.JButton();
        Button_Prev = new javax.swing.JButton();
        Button_Stand2 = new javax.swing.JButton();
        Button_Home = new javax.swing.JButton();
        Button_Stand5 = new javax.swing.JButton();
        Button_Stand4 = new javax.swing.JButton();
        Button_Stand3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().setLayout(null);

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
        Button_Stand1.setBounds(60, 250, 210, 70);

        Button_Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/E-Week-IndonesiaNext.png"))); // NOI18N
        Button_Next.setBorder(BorderFactory.createEmptyBorder());
        Button_Next.setContentAreaFilled(false);
        Button_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_NextActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Next);
        Button_Next.setBounds(1210, 800, 380, 100);

        Button_Prev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/E-Week-KoreaPrev.png"))); // NOI18N
        Button_Prev.setBorder(BorderFactory.createEmptyBorder());
        Button_Prev.setContentAreaFilled(false);
        Button_Prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PrevActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Prev);
        Button_Prev.setBounds(0, 790, 330, 110);

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
        Button_Stand2.setBounds(700, 430, 210, 70);

        Button_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/homeicon.png"))); // NOI18N
        Button_Home.setBorder(BorderFactory.createEmptyBorder());
        Button_Home.setContentAreaFilled(false);
        Button_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Home);
        Button_Home.setBounds(760, 780, 120, 120);

        Button_Stand5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/btn_detail.png"))); // NOI18N
        Button_Stand5.setBorder(BorderFactory.createEmptyBorder());
        Button_Stand5.setContentAreaFilled(false);
        Button_Stand5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Stand5ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Stand5);
        Button_Stand5.setBounds(1290, 620, 210, 70);

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
        Button_Stand4.setBounds(80, 620, 210, 70);

        Button_Stand3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/btn_detail.png"))); // NOI18N
        Button_Stand3.setBorder(BorderFactory.createEmptyBorder());
        Button_Stand3.setContentAreaFilled(false);
        Button_Stand3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Stand3ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Stand3);
        Button_Stand3.setBounds(1280, 260, 210, 70);

        jLabel1.setFont(new java.awt.Font("TeXGyreAdventor", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Itadakimasu");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 590, 160, 40);

        jLabel3.setFont(new java.awt.Font("TeXGyreAdventor", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Oishii Shokuji");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 220, 120, 40);

        jLabel4.setFont(new java.awt.Font("TeXGyreAdventor", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Happitama-go !");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(730, 400, 160, 40);

        jLabel5.setFont(new java.awt.Font("TeXGyreAdventor", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sok Rajin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1310, 220, 160, 40);

        jLabel6.setFont(new java.awt.Font("TeXGyreAdventor", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("H.O.N Tart");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1330, 590, 160, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/Backgroud/BG-02.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1600, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_PrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PrevActionPerformed
       Korea asd = new Korea();
       asd.setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_Button_PrevActionPerformed

    private void Button_Stand1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Stand1ActionPerformed
        test.getSaus("17");
       test.id = id;
       test.email = email;
       test.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_Stand1ActionPerformed

    private void Button_Stand2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Stand2ActionPerformed
        test.getSaus("18");
       test.id = id;
       test.email = email;
       test.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_Stand2ActionPerformed

    private void Button_Stand5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Stand5ActionPerformed
        test.getSaus("21");
       test.id = id;
       test.email = email;        
        test.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_Stand5ActionPerformed

    private void Button_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_HomeActionPerformed
     new1.id = id;
     new1.email = email;
      new1.setVisible(true);   
     this.dispose();
    }//GEN-LAST:event_Button_HomeActionPerformed

    private void Button_Stand4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Stand4ActionPerformed
        test.getSaus("20");
        test.id = id;
       test.email = email;
        test.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_Stand4ActionPerformed

    private void Button_Stand3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Stand3ActionPerformed
        test.getSaus("19");
       test.id = id;
       test.email = email;
        test.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_Button_Stand3ActionPerformed

    private void Button_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_NextActionPerformed
        Indo zxc = new Indo();
         zxc.id = id;
         zxc.email = email;
         zxc.setVisible(true);
    }//GEN-LAST:event_Button_NextActionPerformed

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
            java.util.logging.Logger.getLogger(Japan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Japan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Japan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Japan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Japan().setVisible(true);
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
    // End of variables declaration//GEN-END:variables
}
