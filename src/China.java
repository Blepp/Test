
import java.awt.Frame;
import javax.swing.*;


public class China extends JFrame {
Details test = new Details();
    String id;
    String email;
    Indo qwe = new Indo();
    Thailand qwr = new Thailand();
    public China() {
        setUndecorated(true);
        initComponents();
        setSize(1600,900); //resize me someday
        setExtendedState(Frame.MAXIMIZED_BOTH);
	setLocationRelativeTo(null);
        setTitle("You are exploring China");
        setBounds(new java.awt.Rectangle(0,0,1600,900));           
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Prev = new javax.swing.JButton();
        Button_Next = new javax.swing.JButton();
        Button_Home = new javax.swing.JButton();
        Button_Stand1 = new javax.swing.JButton();
        Button_Stand2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Button_Stand3 = new javax.swing.JButton();
        Button_Stand4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Button_Prev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/E-Week-IndonesiaPrev.png"))); // NOI18N
        Button_Prev.setBorder(BorderFactory.createEmptyBorder());
        Button_Prev.setContentAreaFilled(false);
        Button_Prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PrevActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Prev);
        Button_Prev.setBounds(0, 810, 380, 110);

        Button_Next.setBorder(BorderFactory.createEmptyBorder());
        Button_Next.setContentAreaFilled(false);
        Button_Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/E-Week-Thainext.png"))); // NOI18N
        Button_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_NextActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Next);
        Button_Next.setBounds(1250, 810, 350, 110);

        Button_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/homeicon.png"))); // NOI18N
        Button_Home.setBorder(BorderFactory.createEmptyBorder());
        Button_Home.setContentAreaFilled(false);
        Button_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Home);
        Button_Home.setBounds(790, 790, 130, 130);

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
        Button_Stand1.setBounds(80, 510, 210, 60);

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
        Button_Stand2.setBounds(400, 510, 210, 60);

        jLabel2.setFont(new java.awt.Font("Mistral", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ah Pui ~");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 470, 140, 40);

        jLabel4.setFont(new java.awt.Font("Myriad Pro Light", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Made in China");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 470, 220, 30);

        jLabel3.setFont(new java.awt.Font("Myriad Pro Light", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CiCi Snacks");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1290, 470, 210, 30);

        Button_Stand3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/btn_detail.png"))); // NOI18N
        Button_Stand3.setBorderPainted(false);
        Button_Stand3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Stand2.setBorder(BorderFactory.createEmptyBorder());
        Button_Stand2.setContentAreaFilled(false);
        Button_Stand3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Stand3ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Stand3);
        Button_Stand3.setBounds(900, 510, 210, 60);

        Button_Stand4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/btn_detail.png"))); // NOI18N
        Button_Stand4.setBorderPainted(false);
        Button_Stand4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Stand2.setBorder(BorderFactory.createEmptyBorder());
        Button_Stand2.setContentAreaFilled(false);
        Button_Stand4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Stand4ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Stand4);
        Button_Stand4.setBounds(1290, 510, 210, 60);

        jLabel5.setFont(new java.awt.Font("Myriad Pro Light", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Xiao Mei Mei");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(900, 470, 210, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Import_Insider/Backgroud/China_Bg.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 0, 1690, 920);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_PrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PrevActionPerformed
        qwe.id = id;
        qwe.email = email;
        qwe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_PrevActionPerformed

    private void Button_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_NextActionPerformed
       qwr.id = id;
       qwr.email = email;
        qwr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_NextActionPerformed

    private void Button_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_HomeActionPerformed
         Frame_UI zxc = new Frame_UI();
         zxc.id = id;
         zxc.email = email;
         zxc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_HomeActionPerformed

    private void Button_Stand1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Stand1ActionPerformed
        test.getSaus("6"); //ahpui
       test.id = id;
       test.email = email;        
        test.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_Stand1ActionPerformed

    private void Button_Stand2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Stand2ActionPerformed
        test.getSaus("7"); //mic
       test.id = id;
       test.email = email;        
        test.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_Button_Stand2ActionPerformed

    private void Button_Stand3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Stand3ActionPerformed
        test.getSaus("8"); //xmm
       test.id = id;
       test.email = email;        
        test.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_Button_Stand3ActionPerformed

    private void Button_Stand4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Stand4ActionPerformed
        test.getSaus("9"); //CiCi Snacks
       test.id = id;
       test.email = email;        
        test.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_Button_Stand4ActionPerformed

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
            java.util.logging.Logger.getLogger(China.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(China.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(China.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(China.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new China().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
