/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.unidf.UI;

import br.unidf.DAL.CidadeDAL;
import br.unidf.DTO.CidadeDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author profe
 */
public class frmCidades extends javax.swing.JFrame {

    /**
     * Creates new form frmCidades
     */
    public frmCidades() {
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

        btnIncluirCid = new javax.swing.JButton();
        btnAlterarCid = new javax.swing.JButton();
        btnExcluirCid = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMostrarTodosCid = new javax.swing.JButton();
        txtCodigoCidID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgvCidades = new javax.swing.JTable();
        btnLimparCid = new javax.swing.JButton();
        btnPesquisarCidID = new javax.swing.JButton();
        btnSairCid = new javax.swing.JButton();
        txtNomeCid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCepCid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de Cidades");
        setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        setMinimumSize(new java.awt.Dimension(577, 564));
        setResizable(false);
        getContentPane().setLayout(null);

        btnIncluirCid.setMnemonic('I');
        btnIncluirCid.setText("Incluir");
        btnIncluirCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirCidActionPerformed(evt);
            }
        });
        getContentPane().add(btnIncluirCid);
        btnIncluirCid.setBounds(10, 220, 72, 23);

        btnAlterarCid.setMnemonic('A');
        btnAlterarCid.setText("Alterar");
        btnAlterarCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCidActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterarCid);
        btnAlterarCid.setBounds(80, 220, 72, 23);

        btnExcluirCid.setMnemonic('E');
        btnExcluirCid.setText("Excluir");
        btnExcluirCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCidActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluirCid);
        btnExcluirCid.setBounds(150, 220, 72, 23);

        jLabel2.setText("Código(ID)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(6, 47, 170, 16);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Cadastro de CIDADES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(571, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 6, 921, 29);

        btnMostrarTodosCid.setMnemonic('M');
        btnMostrarTodosCid.setText("Mostrar Todos");
        btnMostrarTodosCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosCidActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarTodosCid);
        btnMostrarTodosCid.setBounds(220, 220, 140, 23);

        txtCodigoCidID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCidIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoCidID);
        txtCodigoCidID.setBounds(6, 69, 58, 22);

        jLabel3.setText("Nome/Cidade");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(6, 103, 180, 16);

        dgvCidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código (ID)", "Nome", "CEP"
            }
        ));
        dgvCidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgvCidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgvCidades);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 260, 580, 274);

        btnLimparCid.setMnemonic('L');
        btnLimparCid.setText("Limpar");
        btnLimparCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCidActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimparCid);
        btnLimparCid.setBounds(360, 220, 72, 23);

        btnPesquisarCidID.setMnemonic('P');
        btnPesquisarCidID.setText("Pesquisar");
        btnPesquisarCidID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCidIDActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisarCidID);
        btnPesquisarCidID.setBounds(70, 69, 200, 23);

        btnSairCid.setMnemonic('S');
        btnSairCid.setText("Sair");
        btnSairCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairCidActionPerformed(evt);
            }
        });
        getContentPane().add(btnSairCid);
        btnSairCid.setBounds(430, 220, 72, 23);
        getContentPane().add(txtNomeCid);
        txtNomeCid.setBounds(6, 125, 430, 22);

        jLabel5.setText("CEP");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(6, 159, 140, 16);
        getContentPane().add(txtCepCid);
        txtCepCid.setBounds(6, 181, 430, 22);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirCidActionPerformed
        // TODO add your handling code here:
        CidadeDAL dal = new CidadeDAL();
        try
        {
            dal.abrirBD();
        }
        catch (Exception ex)
        {
            Logger.getLogger(frmCidades.class.getName()).log(Level.SEVERE, null, ex);
        }

        CidadeDTO cidade = new CidadeDTO();
        
        cidade.setCidNome(txtNomeCid.getText());
        cidade.setCidCep(txtCepCid.getText());
        // fazendo a validação dos dados
        if ((txtNomeCid.getText().isEmpty()) || txtCepCid.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Os campos não podem estar vazios !!!!");
            txtNomeCid.requestFocus();
        } else {
            try {
                dal.incluirCidade(cidade);
                JOptionPane.showMessageDialog(null, "Cidade " + txtNomeCid.getText() + " incluído com sucesso! ");
                dal.fecharBD();
                txtNomeCid.requestFocus();
                btnMostrarTodosCid.setEnabled(true);
                
            } catch (Exception ex) {
                Logger.getLogger(frmCidades.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        txtNomeCid.setText("");
        txtCepCid.setText("");

    }//GEN-LAST:event_btnIncluirCidActionPerformed

    private void btnPesquisarCidIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCidIDActionPerformed
            if ("".equals(txtCodigoCidID.getText()))
        {
            JOptionPane.showMessageDialog(null, "Código da Cidade não pode ser vazio, favor digite um código válido !!!!");
            txtCodigoCidID.requestFocus();
        }
        else
        {
            try
            {
                CidadeDTO cidade = new CidadeDTO();
                CidadeDAL dal = new CidadeDAL();
                
                cidade = dal.selecionarCidadePorID(Integer.valueOf(txtCodigoCidID.getText()));
                btnIncluirCid.setEnabled(false);
                btnAlterarCid.setEnabled(true);
                btnExcluirCid.setEnabled(true);
                btnMostrarTodosCid.setEnabled(true);
                txtNomeCid.setText(cidade.getCidNome());
                txtCepCid.setText(cidade.getCidCep());
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Cidade Não Encontrado. Favor Tente Novamente !!!!");
                txtCodigoCidID.setText(null);
                txtCodigoCidID.requestFocus();
            }
        }


    }//GEN-LAST:event_btnPesquisarCidIDActionPerformed

    private void txtCodigoCidIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCidIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCidIDActionPerformed

    private void btnAlterarCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCidActionPerformed
        // TODO add your handling code here:
        
        if ((txtNomeCid.getText().isEmpty()) || (txtCepCid.getText().isEmpty()) || (txtCodigoCidID.getText().isEmpty()) )
        {
            JOptionPane.showMessageDialog(null, "Verifique Se Tem Algum Campo Vazio !!!!");
            txtCodigoCidID.requestFocus();
        }
        else 
        {
            CidadeDTO cidade = new CidadeDTO();
            CidadeDAL dal = new CidadeDAL();
            
            cidade.setCidID(Long.parseLong(txtCodigoCidID.getText()));
            cidade.setCidNome(txtNomeCid.getText());
            cidade.setCidCep(txtCepCid.getText());
            try
            {
                dal.alterarCidade(cidade);
            }
            catch (Exception ex)
            {
                Logger.getLogger(frmCidades.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Cidade " + cidade.getCidNome() + " Alterado Com Sucesso !!!!");
            txtNomeCid.setText("");
            txtCepCid.setText("");
        }

    }//GEN-LAST:event_btnAlterarCidActionPerformed

    private void btnExcluirCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCidActionPerformed
        // TODO add your handling code here:
        if ((txtNomeCid.getText().isEmpty()) || (txtCepCid.getText().isEmpty()) || (txtCodigoCidID.getText().isEmpty()) ) {
            JOptionPane.showMessageDialog(null, "Verifique Se Tem Algum Campo Vazio !!!!");
            txtCodigoCidID.requestFocus();
        }
        else
        {
            CidadeDTO cidade = new CidadeDTO();
            cidade.setCidID(Long.parseLong(txtCodigoCidID.getText()));
            Object[] opcoes = {"Sim", "Não"};
            int contador = JOptionPane.showOptionDialog(null, "Deseja Excluir Esta Cidade: " + txtNomeCid.getText() + "?",
                    "Exclusão", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            if (contador == JOptionPane.YES_OPTION) {
                try
                {
                    CidadeDAL dal = new CidadeDAL();
                    dal.excluirCidade(Integer.valueOf(txtCodigoCidID.getText()));
                    JOptionPane.showMessageDialog(null, "Cidade Excluído com Sucesso !!!!");

                    txtNomeCid.setText("");
                    txtCepCid.setText("");
                    txtCodigoCidID.requestFocus();
                }
                catch (Exception ex)
                {
                    Logger.getLogger(frmCidades.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_btnExcluirCidActionPerformed

    private void btnMostrarTodosCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosCidActionPerformed
        // TODO add your handling code here:
        txtNomeCid.setText("");
        txtCepCid.setText("");
        txtCodigoCidID.setText(null);
        
        CidadeDAL cidade = new CidadeDAL();
        //Cria a lista de todos os clientes dentro da tabela Clientes
        List<CidadeDTO> selecionaTodasCidades = new ArrayList<>();
        try
        {
            selecionaTodasCidades = cidade.selecionarListaCidades();
        }
        catch (Exception ex)
        {
            Logger.getLogger(frmCidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Prepara a tabela para receber os dados da busca(Lista)
        DefaultTableModel tabm = (DefaultTableModel)dgvCidades.getModel();
        for(int contador = tabm.getRowCount()-1; contador >=0; contador--)
        {
            tabm.removeRow(contador);
        }
        int contador = 0;
        for(CidadeDTO cidades : selecionaTodasCidades)
        {
            //Mostra as informações dentro da Tabela
            tabm.addRow(new String[1]);
            dgvCidades.setValueAt(cidades.getCidID(), contador, 0);
            dgvCidades.setValueAt(cidades.getCidNome(),contador, 1);  
            dgvCidades.setValueAt(cidades.getCidCep(),contador, 2);       

            contador++;
        }
        //Limpa o campo Código do Cliente
        txtCodigoCidID.setText(null);
        //Posiciona o cursor do mouse no campo Nome do cliente
        txtNomeCid.requestFocus();

    }//GEN-LAST:event_btnMostrarTodosCidActionPerformed

    private void btnLimparCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCidActionPerformed
        // TODO add your handling code here:
        btnIncluirCid.setEnabled(true);
        btnAlterarCid.setEnabled(false);
        btnExcluirCid.setEnabled(false);
        btnMostrarTodosCid.setEnabled(true);
        txtNomeCid.setText("");
        txtCepCid.setText("");
        txtNomeCid.requestFocus();
        DefaultTableModel tabm = (DefaultTableModel)dgvCidades.getModel();
        for (int contador = tabm.getRowCount() -1; contador >= 0; contador--)
        {
            tabm.removeRow(contador);
        }

    }//GEN-LAST:event_btnLimparCidActionPerformed

    private void btnSairCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairCidActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSairCidActionPerformed

    private void dgvCidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgvCidadesMouseClicked
        // TODO add your handling code here:
        int linhaSelecionada = dgvCidades.getSelectedRow();
        txtCodigoCidID.setText(dgvCidades.getValueAt(linhaSelecionada, 0).toString());
        txtNomeCid.setText(dgvCidades.getValueAt(linhaSelecionada, 1).toString());
        txtCepCid.setText(dgvCidades.getValueAt(linhaSelecionada, 2).toString());
        btnIncluirCid.setEnabled(false);
        btnAlterarCid.setEnabled(true);
        btnExcluirCid.setEnabled(true);

    }//GEN-LAST:event_dgvCidadesMouseClicked

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
            java.util.logging.Logger.getLogger(frmCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCid;
    private javax.swing.JButton btnExcluirCid;
    private javax.swing.JButton btnIncluirCid;
    private javax.swing.JButton btnLimparCid;
    private javax.swing.JButton btnMostrarTodosCid;
    private javax.swing.JButton btnPesquisarCidID;
    private javax.swing.JButton btnSairCid;
    private javax.swing.JTable dgvCidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCepCid;
    private javax.swing.JTextField txtCodigoCidID;
    private javax.swing.JTextField txtNomeCid;
    // End of variables declaration//GEN-END:variables
}
