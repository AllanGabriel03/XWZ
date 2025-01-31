/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Veiculos.Carros;
import Veiculos.Motos;
import Veiculos.Veiculos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author allan
 */
public class VeiculosDAO implements IVeiculosDAO{
    
    public List<Veiculos> buscarTodos() throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Veiculos> list = new ArrayList<>();
        Carros carros = null;
        Motos motos = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelectAllTb();
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();

            while (rs.next()) {
                Veiculos veiculo = new Veiculos();
                veiculo.setId(rs.getString("ID"));
                veiculo.setModelo(rs.getString("MODELO"));
                veiculo.setFabricante(rs.getString("FABRICANTE"));
                veiculo.setAno(rs.getString("ANO"));
                veiculo.setPreco(rs.getString("PRECO"));
                list.add(veiculo);
                
            }
        } catch(Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return list;
    }
    
    private String getSqlSelectAllTb() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ID, MODELO, FABRICANTE, ANO, PRECO, QUANTIDADEDEPORTAS, TIPOCOMBUSTIVEL FROM TB_CARROS "
                + "UNION"
                + " SELECT ID, MODELO, FABRICANTE, ANO, PRECO, CILINDRADA, NULL FROM TB_MOTOS");
        return sb.toString();
    }
    
    private void closeConnection(Connection connection, PreparedStatement stm, ResultSet rs) {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }
}
