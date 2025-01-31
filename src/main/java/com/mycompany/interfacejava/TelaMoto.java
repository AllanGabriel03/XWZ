/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfacejava;

import DAO.MotosDAO;
import DAO.VeiculosDAO;
import Veiculos.Motos;
import Veiculos.Veiculos;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author allan
 */
public class TelaMoto extends javax.swing.JFrame {

    /**
     * Creates new form TelaMoto
     */
    public TelaMoto() {
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

        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblAno = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        lblFabricante = new javax.swing.JLabel();
        txtFabricante = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        tbtnCadastrar = new javax.swing.JToggleButton();
        tbtnConsultar = new javax.swing.JToggleButton();
        tbtnExcluir = new javax.swing.JToggleButton();
        tbtnAtualizar = new javax.swing.JToggleButton();
        tbtnListarTodos = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        txtCilindrada = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbMotos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblModelo.setText("Modelo:");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        lblAno.setText("Ano:");

        lblFabricante.setText("Fabricante:");

        lblPreco.setText("Preço:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Motos");

        jLabel2.setText("ID:");

        tbtnCadastrar.setText("Cadastrar");
        tbtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnCadastrarActionPerformed(evt);
            }
        });

        tbtnConsultar.setText("Consultar");
        tbtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnConsultarActionPerformed(evt);
            }
        });

        tbtnExcluir.setText("Excluir");
        tbtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnExcluirActionPerformed(evt);
            }
        });

        tbtnAtualizar.setText("Atualizar");
        tbtnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnAtualizarActionPerformed(evt);
            }
        });

        tbtnListarTodos.setText("ListarTodos");
        tbtnListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnListarTodosActionPerformed(evt);
            }
        });

        jLabel3.setText("Cilindrada: ");

        jtbMotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Modelo", "Fabricante", "Ano", "Preço", "Cilindrada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtbMotos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbMotosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbMotos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(218, 218, 218)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tbtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tbtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tbtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tbtnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tbtnListarTodos))))
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCilindrada))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAno, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(lblFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 88, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFabricante)
                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAno)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtnCadastrar)
                    .addComponent(tbtnConsultar)
                    .addComponent(tbtnExcluir)
                    .addComponent(tbtnAtualizar)
                    .addComponent(tbtnListarTodos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnCadastrarActionPerformed
        MotosDAO motosDAO = new MotosDAO();
        Motos motos = new Motos();
        
        motos.setModelo(txtModelo.getText());
        motos.setFabricante(txtFabricante.getText());
        motos.setAno(txtAno.getText());
        motos.setPreco(txtPreco.getText());
        motos.setCilindrada(txtCilindrada.getText());

        try {
            motosDAO.cadastrar(motos);
        } catch (Exception ex) {
            Logger.getLogger(TelaMoto.class.getName()).log(Level.SEVERE, null, ex);
        }
    
                                               
    }//GEN-LAST:event_tbtnCadastrarActionPerformed

    private void tbtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnConsultarActionPerformed
        MotosDAO motosDAO = new MotosDAO();
        
        try {
            List<Motos> list = motosDAO.consultar();
            DefaultTableModel tabela = (DefaultTableModel) jtbMotos.getModel();
            tabela.setRowCount(0);
            for(Motos moto : list){
                tabela.addRow(new Object[]{
                moto.getId(),
                moto.getModelo(),
                moto.getFabricante(),
                moto.getAno(),
                moto.getPreco(),
                moto.getCilindrada()
                });
                //System.out.println(list.get(i));
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaMoto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbtnConsultarActionPerformed

    private void tbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnExcluirActionPerformed
        MotosDAO motosDAO = new MotosDAO();
        Motos motos;
        
        try {
            motos = motosDAO.buscar(txtID.getText());
            motosDAO.excluir(motos);
        } catch (Exception ex) {
            Logger.getLogger(TelaMoto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tbtnExcluirActionPerformed

    private void tbtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnAtualizarActionPerformed
        MotosDAO motosDAO = new MotosDAO();
       
        try {
            String id = txtID.getText();
            Motos motos = motosDAO.buscar(id);
            motos.setModelo(txtModelo.getText());
            motos.setFabricante(txtFabricante.getText());
            motos.setAno(txtAno.getText());
            motos.setPreco(txtPreco.getText());
            motos.setCilindrada(txtCilindrada.getText());
            motosDAO.atualizar(motos);
            JOptionPane.showMessageDialog(this, "Moto atualizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(TelaMoto.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_tbtnAtualizarActionPerformed

    private void tbtnListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnListarTodosActionPerformed
        VeiculosDAO veiculosDAO = new VeiculosDAO();
        List<Veiculos> list;
        
        try {
            list = veiculosDAO.buscarTodos();
            for (Veiculos veiculo : list) {
               System.out.println(veiculo);
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaCarros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbtnListarTodosActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void jtbMotosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbMotosMouseClicked
        int linhaSelecionada = jtbMotos.getSelectedRow();
        
        if(linhaSelecionada != -1){
            txtID.setText(jtbMotos.getValueAt(linhaSelecionada, 0).toString());
            txtModelo.setText(jtbMotos.getValueAt(linhaSelecionada, 1).toString());
            txtFabricante.setText(jtbMotos.getValueAt(linhaSelecionada, 2).toString());
            txtAno.setText(jtbMotos.getValueAt(linhaSelecionada, 3).toString());
            txtPreco.setText(jtbMotos.getValueAt(linhaSelecionada, 4).toString());
            txtCilindrada.setText(jtbMotos.getValueAt(linhaSelecionada, 5).toString());
        }
    }//GEN-LAST:event_jtbMotosMouseClicked

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
            java.util.logging.Logger.getLogger(TelaMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMoto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbMotos;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JToggleButton tbtnAtualizar;
    private javax.swing.JToggleButton tbtnCadastrar;
    private javax.swing.JToggleButton tbtnConsultar;
    private javax.swing.JToggleButton tbtnExcluir;
    private javax.swing.JToggleButton tbtnListarTodos;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCilindrada;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
