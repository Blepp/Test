
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Frame_UI extends JFrame {
    String id;
    String email;
    public Frame_UI() {
        setUndecorated(true);
        initComponents();
        setSize(1600,900); //resize me someday
        setBounds(0,0,1600,900);
        setLocationRelativeTo(null);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("E-week System Information by HMJSI UPH Medan"); 
        //ImageIcon img = new ImageIcon(path);
        //myFrame.setIconImage(img.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Destination = new javax.swing.JLabel();
        Button_China = new javax.swing.JButton();
        Button_Indo = new javax.swing.JButton();
        Button_Korea = new javax.swing.JButton();
        Button_Thailand = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Button_Japan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wow");
        setBounds(new java.awt.Rectangle(0, 0, 1600, 900));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setFocusable(false);
        setFocusableWindowState(false);
        setLocationByPlatform(true);
        getContentPane().setLayout(null);

        Label_Destination.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imported/1-01.png"))); // NOI18N
        getContentPane().add(Label_Destination);
        Label_Destination.setBounds(490, 60, 550, 70);

        Button_China.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imported/3-01.png"))); // NOI18N
        Button_China.setBorder(BorderFactory.createEmptyBorder());
        Button_China.setContentAreaFilled(false);
        Button_China.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ChinaActionPerformed(evt);
            }
        });
        getContentPane().add(Button_China);
        Button_China.setBounds(570, 190, 370, 250);

        Button_Indo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imported/2-01.png"))); // NOI18N
        Button_Indo.setBorder(BorderFactory.createEmptyBorder());
        Button_Indo.setBorderPainted(true);
        Button_Indo.setContentAreaFilled(false);
        Button_Indo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Indo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Indo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Button_Indo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_IndoActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Indo);
        Button_Indo.setBounds(60, 190, 370, 250);

        Button_Korea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imported/5-01.png"))); // NOI18N
        Button_Korea.setBorder(BorderFactory.createEmptyBorder());
        Button_Korea.setContentAreaFilled(false);
        Button_Korea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_KoreaActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Korea);
        Button_Korea.setBounds(290, 530, 380, 250);

        Button_Thailand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imported/4-01.png"))); // NOI18N
        Button_Thailand.setBorder(BorderFactory.createEmptyBorder());
        Button_Thailand.setContentAreaFilled(false);
        Button_Thailand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ThailandActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Thailand);
        Button_Thailand.setBounds(1040, 190, 370, 250);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imported/2_Name.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 450, 170, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imported/6_Name.png"))); // NOI18N
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1030, 780, 110, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imported/4_Name.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1130, 450, 180, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imported/5_Name.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, 780, 120, 30);

        Button_Japan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imported/6-01.png"))); // NOI18N
        Button_Japan.setBorder(BorderFactory.createEmptyBorder());
        Button_Japan.setContentAreaFilled(false);
        Button_Japan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_JapanActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Japan);
        Button_Japan.setBounds(900, 530, 370, 250);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imported/exploreasia1_1.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 20, 300, 130);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imported/bg-01.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, -50, 1650, 960);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   static Indo wtf = new Indo();
   static China what = new China();
   static Thailand wot = new Thailand();
   static Japan whot = new Japan();
   static Korea whet = new Korea(); 
    private void Button_IndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_IndoActionPerformed
        wtf.email = email;
        wtf.id = id;
        wtf.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Button_IndoActionPerformed

    private void Button_ThailandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ThailandActionPerformed
        wot.email = email;
        wot.id = id;
        wot.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Button_ThailandActionPerformed

    private void Button_ChinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ChinaActionPerformed
        what.email = email;
        what.id = id;
        what.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Button_ChinaActionPerformed

    private void Button_JapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_JapanActionPerformed
        whot.email = email;
        whot.id = id;
        whot.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Button_JapanActionPerformed

    private void Button_KoreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_KoreaActionPerformed
        whet.email = email;
        whet.id = id;
        whet.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_Button_KoreaActionPerformed

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_China;
    private javax.swing.JButton Button_Indo;
    private javax.swing.JButton Button_Japan;
    private javax.swing.JButton Button_Korea;
    private javax.swing.JButton Button_Thailand;
    private javax.swing.JLabel Label_Destination;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
