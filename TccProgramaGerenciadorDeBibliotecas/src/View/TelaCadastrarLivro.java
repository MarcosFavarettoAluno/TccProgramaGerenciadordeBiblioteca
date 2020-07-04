/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LivroClass;
import javax.swing.JOptionPane;

/**
 *
 * @author T-Gamer
 */
public class TelaCadastrarLivro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastrarLivro
     */
    public TelaCadastrarLivro() {
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

        jBtnCancelar = new javax.swing.JButton();
        jBtnPaginaInicial = new javax.swing.JButton();
        jBtnSalvar = new javax.swing.JButton();
        jTxtQuantidade = new javax.swing.JFormattedTextField();
        jTxtData = new javax.swing.JFormattedTextField();
        jTxtEditora = new javax.swing.JTextField();
        jTxtAutor = new javax.swing.JTextField();
        jTxtNomeLivro = new javax.swing.JTextField();
        jFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnCancelar.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 14)); // NOI18N
        jBtnCancelar.setText("CANCELAR");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 510, 270, 70));

        jBtnPaginaInicial.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 14)); // NOI18N
        jBtnPaginaInicial.setText("PÁGINA INICIAL");
        jBtnPaginaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPaginaInicialActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnPaginaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 270, 70));

        jBtnSalvar.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 14)); // NOI18N
        jBtnSalvar.setText("SALVAR");
        jBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 270, 70));

        jTxtQuantidade.setBorder(null);
        try {
            jTxtQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtQuantidade.setText("99");
        jTxtQuantidade.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 36)); // NOI18N
        jTxtQuantidade.setOpaque(false);
        getContentPane().add(jTxtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 420, 50, 50));

        jTxtData.setBorder(null);
        try {
            jTxtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtData.setText("30/06/2020");
        jTxtData.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 36)); // NOI18N
        jTxtData.setOpaque(false);
        getContentPane().add(jTxtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 416, 160, 50));

        jTxtEditora.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 36)); // NOI18N
        jTxtEditora.setText("As Crônicas de Nárnia");
        jTxtEditora.setBorder(null);
        jTxtEditora.setOpaque(false);
        jTxtEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEditoraActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 110, 50));

        jTxtAutor.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 36)); // NOI18N
        jTxtAutor.setText("As Crônicas de Nárnia");
        jTxtAutor.setBorder(null);
        jTxtAutor.setOpaque(false);
        jTxtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAutorActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 720, 50));

        jTxtNomeLivro.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 36)); // NOI18N
        jTxtNomeLivro.setText("As Crônicas de Nárnia");
        jTxtNomeLivro.setBorder(null);
        jTxtNomeLivro.setOpaque(false);
        jTxtNomeLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeLivroActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtNomeLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 710, 40));

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/TelaCadastrarLivro.png"))); // NOI18N
        getContentPane().add(jFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNomeLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeLivroActionPerformed

    private void jTxtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtAutorActionPerformed

    private void jTxtEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEditoraActionPerformed

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
        // CÓDIGO DO BOTÃO "SALVAR":
        String data_emprestimo = "xxxxxxxx";
        String data_devolucao = "xxxxxxxx";
        if (!jTxtNomeLivro.getText().equals("") || jTxtAutor.getText().equals("") || jTxtEditora.getText().equals("") || jTxtData.getText().equals("") || jTxtQuantidade.getText().equals("")) {
            LivroClass livroclass_objeto = new LivroClass();
            if (livroclass_objeto.cadastrarLivro(jTxtNomeLivro.getText(), jTxtAutor.getText(), jTxtEditora.getText(), jTxtData.getText(), jTxtQuantidade.getText())) {
                JOptionPane.showMessageDialog(this, "Livro cadastrado com sucesso!");
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Livro NÃO foi cadastrado, tente novamente!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos!");
        }
    }//GEN-LAST:event_jBtnSalvarActionPerformed

    private void jBtnPaginaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPaginaInicialActionPerformed
        // CÓDIGO DO BOTÃO "PÁGINA INICIAL"
        TelaPrincipal telaprincipal_objeto = new TelaPrincipal();
        telaprincipal_objeto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnPaginaInicialActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // CÓDIGO DO BOTÃO "CANCELAR":
        limparCampos();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void limparCampos() {
        jTxtNomeLivro.setText("");
        jTxtAutor.setText("");
        jTxtEditora.setText("");
        jTxtData.setText("");
        jTxtQuantidade.setText("");
    }

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
            java.util.logging.Logger.getLogger(TelaCadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnPaginaInicial;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JLabel jFundo;
    private javax.swing.JTextField jTxtAutor;
    private javax.swing.JFormattedTextField jTxtData;
    private javax.swing.JTextField jTxtEditora;
    private javax.swing.JTextField jTxtNomeLivro;
    private javax.swing.JFormattedTextField jTxtQuantidade;
    // End of variables declaration//GEN-END:variables
}
