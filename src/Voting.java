
import javax.swing.JOptionPane;
import java.awt.*;

public class Voting extends javax.swing.JFrame {

static String nomor,buka;



    public Voting() {
        
        initComponents();
        setSize(420,420);
	setLocationRelativeTo(null);
        setTitle("tes");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nama");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 70, 70, 20);

        jLabel2.setText("Usia");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 100, 60, 20);

        jLabel3.setText("No. HP");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 130, 60, 20);

        jLabel5.setText("Email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 160, 50, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 70, 160, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(170, 100, 160, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(170, 130, 160, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(170, 160, 160, 20);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 330, 73, 23);

        jButton2.setText("Vote !");
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 250, 61, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //buka koneksi
        //cek data pengunjung (vote sudah 3x ?)
        //bila ya tampilkan maaf vote limit sudah lewat
       // kalau belum tampilkan bwh
       // kalau tidak ada data tambahkan data baru.
       JOptionPane.showMessageDialog(null, "THANKYOU! PLACEHOLDER");
       if (true){
           this.dispose();
       }
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
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
