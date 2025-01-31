/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfacejava;

import DAO.CarrosDAO;
import DAO.VeiculosDAO;
import Veiculos.Carros;
import Veiculos.Veiculos;
import java.sql.Connection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author allan
 */
public class TelaCarros extends javax.swing.JFrame {

    /**
     * Creates new form TelaCarros
     */
    public TelaCarros() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblFabricante = new javax.swing.JLabel();
        txtFabricante = new javax.swing.JTextField();
        lblAno = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tbtnCadastrar = new javax.swing.JToggleButton();
        tbtnConsultar = new javax.swing.JToggleButton();
        tbtnExcluir = new javax.swing.JToggleButton();
        tbtnAtualizar = new javax.swing.JToggleButton();
        tbtnListarTodos = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPortas = new javax.swing.JTextField();
        lblCombustivel = new javax.swing.JLabel();
        txtCombustivel = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabeladeCarros = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblModelo.setText("Modelo:");

        lblFabricante.setText("Fabricante:");

        lblAno.setText("Ano:");

        lblPreco.setText("Preço:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Carros");

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

        jLabel2.setText("ID:");

        jLabel3.setText("Portas:");

        txtPortas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPortasActionPerformed(evt);
            }
        });

        lblCombustivel.setText("Combustível: ");

        tabeladeCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Modelo", "Fabricante", "Ano", "Preço", "Portas", "Combustível"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabeladeCarros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeladeCarrosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabeladeCarros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbtnCadastrar)
                .addGap(12, 12, 12)
                .addComponent(tbtnConsultar)
                .addGap(18, 18, 18)
                .addComponent(tbtnExcluir)
                .addGap(18, 18, 18)
                .addComponent(tbtnAtualizar)
                .addGap(18, 18, 18)
                .addComponent(tbtnListarTodos)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblAno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPortas, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCombustivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFabricante)
                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAno)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lblCombustivel)
                    .addComponent(txtCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtnCadastrar)
                    .addComponent(tbtnConsultar)
                    .addComponent(tbtnExcluir)
                    .addComponent(tbtnAtualizar)
                    .addComponent(tbtnListarTodos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnCadastrarActionPerformed
        CarrosDAO carrosdao = new CarrosDAO();
        Carros carros = new Carros();
        
        carros.setModelo(txtModelo.getText());
        carros.setFabricante(txtFabricante.getText());
        carros.setAno(txtAno.getText());
        carros.setPreco(txtPreco.getText());
        carros.setQuantidadeDePortas(txtPortas.getText());
        carros.setTipoCombustivel(txtCombustivel.getText());
        
       try {
            carrosdao.cadastrar(carros);
        } catch (Exception ex) {
            Logger.getLogger(TelaCarros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tbtnCadastrarActionPerformed

    private void tbtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnConsultarActionPerformed
        CarrosDAO carrosDAO = new CarrosDAO();
        try {
            List<Carros> list = carrosDAO.consultar();
            DefaultTableModel tabela = (DefaultTableModel) tabeladeCarros.getModel();
            tabela.setRowCount(0);
            //int i = 0; i < list.size(); i++
            for(Carros carro : list){
                tabela.addRow(new Object[]{
                carro.getId(),
                carro.getModelo(),
                carro.getFabricante(),
                carro.getAno(),
                carro.getPreco(),
                carro.getQuantidadeDePortas(),
                carro.getTipoCombustivel()
                });
                //System.out.println(list.get(i));
            }
            
        } catch (Exception ex) {
            Logger.getLogger(TelaCarros.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_tbtnConsultarActionPerformed

    private void tbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnExcluirActionPerformed
        CarrosDAO carrosDAO = new CarrosDAO();
        
        try {
            //String id = txtID.getText();
            Carros carros = carrosDAO.buscar(txtID.getText());
            carrosDAO.excluir(carros);
        } catch (Exception ex) {
            Logger.getLogger(TelaCarros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbtnExcluirActionPerformed

    private void tbtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnAtualizarActionPerformed
       CarrosDAO carrosDAO = new CarrosDAO();
       
        try {
            String id = txtID.getText();
            Carros carros = carrosDAO.buscar(id);
            carros.setModelo(txtModelo.getText());
            carros.setFabricante(txtFabricante.getText());
            carros.setAno(txtAno.getText());
            carros.setPreco(txtPreco.getText());
            carros.setQuantidadeDePortas(txtPortas.getText());
            carros.setTipoCombustivel(txtCombustivel.getText());
            carrosDAO.atualizar(carros);
            
            
        } catch (Exception ex) {
            Logger.getLogger(TelaCarros.class.getName()).log(Level.SEVERE, null, ex);
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

    private void txtPortasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPortasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPortasActionPerformed

    private void tabeladeCarrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeladeCarrosMouseClicked
        int linhaSelecionada = tabeladeCarros.getSelectedRow();
        
        if(linhaSelecionada != -1){
            txtID.setText(tabeladeCarros.getValueAt(linhaSelecionada, 0).toString());
            txtModelo.setText(tabeladeCarros.getValueAt(linhaSelecionada, 1).toString());
            txtFabricante.setText(tabeladeCarros.getValueAt(linhaSelecionada, 2).toString());
            txtAno.setText(tabeladeCarros.getValueAt(linhaSelecionada, 3).toString());
            txtPreco.setText(tabeladeCarros.getValueAt(linhaSelecionada, 4).toString());
            txtPortas.setText(tabeladeCarros.getValueAt(linhaSelecionada, 5).toString());
            txtCombustivel.setText(tabeladeCarros.getValueAt(linhaSelecionada, 6).toString());
        }
    }//GEN-LAST:event_tabeladeCarrosMouseClicked

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
            java.util.logging.Logger.getLogger(TelaCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCarros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCombustivel;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JTable tabeladeCarros;
    private javax.swing.JToggleButton tbtnAtualizar;
    private javax.swing.JToggleButton tbtnCadastrar;
    private javax.swing.JToggleButton tbtnConsultar;
    private javax.swing.JToggleButton tbtnExcluir;
    private javax.swing.JToggleButton tbtnListarTodos;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCombustivel;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPortas;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
