/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Franklin
 */
public class Reserva extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Reserva() {
        initComponents();
        
        setSize(660, 499);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void cadastrar() {
        JOptionPane.showMessageDialog(null, "Sua Reserva foi registrada com sucesso!");
        
        
                this.dispose();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        reserva = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(23, 21, 21));

        jPanel1.setBackground(new java.awt.Color(23, 21, 21));
        jPanel1.setForeground(new java.awt.Color(23, 21, 21));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reserva de Mesas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 70, 230, 52);

        jCheckBox8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setText("MESA 8");
        jPanel1.add(jCheckBox8);
        jCheckBox8.setBounds(270, 260, 85, 20);

        jCheckBox9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox9.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setText("MESA 9");
        jPanel1.add(jCheckBox9);
        jCheckBox9.setBounds(270, 300, 85, 20);

        jCheckBox10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox10.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setText("MESA 10");
        jPanel1.add(jCheckBox10);
        jCheckBox10.setBounds(270, 340, 85, 20);

        jCheckBox11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox11.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox11.setText("MESA 11");
        jPanel1.add(jCheckBox11);
        jCheckBox11.setBounds(490, 190, 85, 20);

        jCheckBox12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox12.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox12.setText("MESA 12");
        jPanel1.add(jCheckBox12);
        jCheckBox12.setBounds(490, 220, 85, 20);

        jCheckBox13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox13.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox13.setText("MESA 13");
        jPanel1.add(jCheckBox13);
        jCheckBox13.setBounds(490, 260, 85, 20);

        jCheckBox14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox14.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox14.setText("MESA 14");
        jPanel1.add(jCheckBox14);
        jCheckBox14.setBounds(490, 300, 85, 20);

        jCheckBox15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox15.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox15.setText("MESA 15");
        jPanel1.add(jCheckBox15);
        jCheckBox15.setBounds(490, 340, 85, 20);

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("MESA 1 ");
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(50, 190, 85, 20);

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("MESA 2");
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(50, 220, 85, 20);

        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("MESA 3");
        jPanel1.add(jCheckBox3);
        jCheckBox3.setBounds(50, 260, 85, 20);

        jCheckBox4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("MESA 4");
        jPanel1.add(jCheckBox4);
        jCheckBox4.setBounds(50, 300, 85, 20);

        jCheckBox5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("MESA 5");
        jPanel1.add(jCheckBox5);
        jCheckBox5.setBounds(50, 340, 85, 20);

        jCheckBox6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("MESA 6");
        jPanel1.add(jCheckBox6);
        jCheckBox6.setBounds(270, 190, 85, 20);

        jCheckBox7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("MESA 7");
        jPanel1.add(jCheckBox7);
        jCheckBox7.setBounds(270, 220, 85, 20);

        reserva.setText("Realizar reserva");
        reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservaActionPerformed(evt);
            }
        });
        jPanel1.add(reserva);
        reserva.setBounds(260, 400, 130, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservaActionPerformed
        cadastrar();
    }//GEN-LAST:event_reservaActionPerformed

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
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton reserva;
    // End of variables declaration//GEN-END:variables
}
