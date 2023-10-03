/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package br.unidf.UI;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author profe
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        mnuAplicativoIpil = new javax.swing.JMenu();
        itmSairIpil = new javax.swing.JMenuItem();
        mnuCadastrosIpil = new javax.swing.JMenu();
        itmCadCidades = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Imaginária Produtos de Informática Ltda - IPIL");
        setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        setResizable(false);

        mnuAplicativoIpil.setMnemonic('f');
        mnuAplicativoIpil.setText("Aplicativo PROVA A2");

        itmSairIpil.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmSairIpil.setMnemonic('x');
        itmSairIpil.setText("Sair");
        itmSairIpil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSairIpilActionPerformed(evt);
            }
        });
        mnuAplicativoIpil.add(itmSairIpil);

        menuBar.add(mnuAplicativoIpil);

        mnuCadastrosIpil.setText("Cadastros");
        mnuCadastrosIpil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrosIpilActionPerformed(evt);
            }
        });

        itmCadCidades.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadCidades.setText("Cidades");
        itmCadCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadCidadesActionPerformed(evt);
            }
        });
        mnuCadastrosIpil.add(itmCadCidades);

        menuBar.add(mnuCadastrosIpil);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmSairIpilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSairIpilActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja Sair do Sistema? ", "Aplicativo ProvaA2", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            this.dispose();
        }
    }//GEN-LAST:event_itmSairIpilActionPerformed

    private void itmCadCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadCidadesActionPerformed
        // TODO add your handling code here:
        if ((frmCidades == null) || (!frmCidades.isVisible()))
        {
            frmCidades = new frmCidades();
            //jdpCadCli.add(frmCidades);
            frmCidades.setVisible(true);
        }

    }//GEN-LAST:event_itmCadCidadesActionPerformed

    private void mnuCadastrosIpilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrosIpilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuCadastrosIpilActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmCadCidades;
    private javax.swing.JMenuItem itmSairIpil;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuAplicativoIpil;
    private javax.swing.JMenu mnuCadastrosIpil;
    // End of variables declaration//GEN-END:variables

    private void inserirIcone() {
    }
    private frmCidades frmCidades;    


}