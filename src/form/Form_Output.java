/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author Embun Duta Laksmana
 */
public class Form_Output extends javax.swing.JFrame {

    /**
     * Creates new form Form_Output
     */
    public Form_Output(String Nama,String NIM,String JKelamin,
            String Angkatan,String Jurusan) {
        initComponents();
        jTextField_Nama.setText(Nama);
        jTextField_NIM.setText(NIM);
        jTextField_JK.setText(JKelamin);
        jTextField_Angkatan.setText(Angkatan);
        jTextField_Jurusan.setText(Jurusan);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Banner = new javax.swing.JLabel();
        Nama = new javax.swing.JLabel();
        NIM = new javax.swing.JLabel();
        Jenis_Kelamin = new javax.swing.JLabel();
        Angkatan = new javax.swing.JLabel();
        Jurusan = new javax.swing.JLabel();
        jTextField_Nama = new javax.swing.JTextField();
        jTextField_Angkatan = new javax.swing.JTextField();
        jTextField_NIM = new javax.swing.JTextField();
        jTextField_Jurusan = new javax.swing.JTextField();
        jTextField_JK = new javax.swing.JTextField();
        Kembali = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();

        jLabel3.setText("Nama :");

        jLabel4.setText("NIM :");

        jLabel5.setText("Jenis Kelamin:");

        jLabel6.setText("Angkatan :");

        jLabel7.setText("Jurusan :");

        jLabel10.setText("Jenis Kelamin:");

        jTextField3.setEditable(false);
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField7.setEditable(false);
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton2.setForeground(java.awt.Color.red);
        jButton2.setText("Keluar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Banner.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Banner.setText("TERIMA KASIH");

        Nama.setText("Nama :");

        NIM.setText("NIM :");

        Jenis_Kelamin.setText("Jenis Kelamin:");

        Angkatan.setText("Angkatan :");

        Jurusan.setText("Jurusan :");

        jTextField_Nama.setEditable(false);
        jTextField_Nama.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NamaActionPerformed(evt);
            }
        });

        jTextField_Angkatan.setEditable(false);
        jTextField_Angkatan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Angkatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AngkatanActionPerformed(evt);
            }
        });

        jTextField_NIM.setEditable(false);
        jTextField_NIM.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_NIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NIMActionPerformed(evt);
            }
        });

        jTextField_Jurusan.setEditable(false);
        jTextField_Jurusan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_JurusanActionPerformed(evt);
            }
        });

        jTextField_JK.setEditable(false);
        jTextField_JK.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_JK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_JKActionPerformed(evt);
            }
        });

        Kembali.setText("<- Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        Keluar.setForeground(java.awt.Color.red);
        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Banner, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Jurusan)
                    .addComponent(Angkatan)
                    .addComponent(Jenis_Kelamin)
                    .addComponent(NIM)
                    .addComponent(Nama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField_Nama, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jTextField_NIM)
                    .addComponent(jTextField_JK)
                    .addComponent(jTextField_Angkatan)
                    .addComponent(jTextField_Jurusan))
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Banner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama)
                    .addComponent(jTextField_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIM)
                    .addComponent(jTextField_NIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jenis_Kelamin)
                    .addComponent(jTextField_JK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Angkatan)
                    .addComponent(jTextField_Angkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jurusan)
                    .addComponent(jTextField_Jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField_NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NamaActionPerformed

    }//GEN-LAST:event_jTextField_NamaActionPerformed

    private void jTextField_AngkatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AngkatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AngkatanActionPerformed

    private void jTextField_NIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NIMActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField_JurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_JurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_JurusanActionPerformed

    private void jTextField_JKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_JKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_JKActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        Form_Input FI= new Form_Input();
        FI.setVisible(true);
    }//GEN-LAST:event_KembaliActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Output().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Angkatan;
    private javax.swing.JLabel Banner;
    private javax.swing.JLabel Jenis_Kelamin;
    private javax.swing.JLabel Jurusan;
    private javax.swing.JButton Keluar;
    private javax.swing.JButton Kembali;
    private javax.swing.JLabel NIM;
    private javax.swing.JLabel Nama;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField_Angkatan;
    private javax.swing.JTextField jTextField_JK;
    private javax.swing.JTextField jTextField_Jurusan;
    private javax.swing.JTextField jTextField_NIM;
    private javax.swing.JTextField jTextField_Nama;
    // End of variables declaration//GEN-END:variables
}
