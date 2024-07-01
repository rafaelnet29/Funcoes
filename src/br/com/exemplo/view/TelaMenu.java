/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.exemplo.view;

import br.com.exemplo.funcoes.Funcoes;
import java.text.MessageFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class TelaMenu extends javax.swing.JFrame {

    private int num;
  
    //construtor
    public TelaMenu() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnFatorial = new javax.swing.JButton();
        btnPar_Impar = new javax.swing.JButton();
        btnDesconto = new javax.swing.JButton();
        btnJuros_Simples = new javax.swing.JButton();
        btnPalindromo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnFatorial.setBackground(new java.awt.Color(0, 0, 0));
        btnFatorial.setForeground(new java.awt.Color(255, 255, 255));
        btnFatorial.setText("FATORIAL");
        btnFatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFatorialActionPerformed(evt);
            }
        });

        btnPar_Impar.setBackground(new java.awt.Color(0, 0, 0));
        btnPar_Impar.setForeground(new java.awt.Color(255, 255, 255));
        btnPar_Impar.setText("PAR OU ÍMPAR");
        btnPar_Impar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPar_ImparActionPerformed(evt);
            }
        });

        btnDesconto.setBackground(new java.awt.Color(0, 0, 0));
        btnDesconto.setForeground(new java.awt.Color(255, 255, 255));
        btnDesconto.setText("DESCONTO");
        btnDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescontoActionPerformed(evt);
            }
        });

        btnJuros_Simples.setBackground(new java.awt.Color(0, 0, 0));
        btnJuros_Simples.setForeground(new java.awt.Color(255, 255, 255));
        btnJuros_Simples.setText("JUROS SIMPLES");
        btnJuros_Simples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuros_SimplesActionPerformed(evt);
            }
        });

        btnPalindromo.setBackground(new java.awt.Color(0, 0, 0));
        btnPalindromo.setForeground(new java.awt.Color(255, 255, 255));
        btnPalindromo.setText("PALÍNDROMO");
        btnPalindromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalindromoActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FUNÇÕES ÚTEIS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPalindromo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnJuros_Simples, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnDesconto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPar_Impar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFatorial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPar_Impar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnJuros_Simples, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPalindromo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFatorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFatorialActionPerformed
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um Número:", "FATORIAL", 1));
        JOptionPane.showMessageDialog(null, MessageFormat.format("O Fatorial de {0} é: {1}", num, new Funcoes(num).RecursivaFatorial()), "FATORIAL", 1);
    }//GEN-LAST:event_btnFatorialActionPerformed

    private void btnPar_ImparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPar_ImparActionPerformed
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um Número:", "PAR ou IMPAR", 1));
        new Funcoes(num).FuncaoParOuImpar();
    }//GEN-LAST:event_btnPar_ImparActionPerformed

    private void btnDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescontoActionPerformed
        new Funcoes(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preço do produto:", "DESCONTO", 1)),
                Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a porcentagen de desconto:", "DESCONTO", 1))).aplicarDesconto();
    }//GEN-LAST:event_btnDescontoActionPerformed

    private void btnJuros_SimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuros_SimplesActionPerformed
        new Funcoes(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o capital aplicado:", "JUROS SIMPLES", 1)),
                Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a taxa de juros:", "JUROS SIMPLES", 1)),
                Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tempo:", "JUROS SIMPLES", 1))).juroSimples();
    }//GEN-LAST:event_btnJuros_SimplesActionPerformed

    private void btnPalindromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalindromoActionPerformed
        //palavra = JOptionPane.showInputDialog(null, "Informe uma palavra para verificar se é ou não Palimdromo(a):", "Palíndroma", 1);
        new Funcoes(JOptionPane.showInputDialog(null, "Informe uma palavra para verificar se é ou não Palimdromo(a):", "Palíndroma", 1)).palindroma();
    }//GEN-LAST:event_btnPalindromoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesconto;
    private javax.swing.JButton btnFatorial;
    private javax.swing.JButton btnJuros_Simples;
    private javax.swing.JButton btnPalindromo;
    private javax.swing.JButton btnPar_Impar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}