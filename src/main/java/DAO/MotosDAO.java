package DAO;


import Veiculos.Motos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MotosDAO implements IMotosDAO{
    
    @Override
    public Integer cadastrar(Motos motos) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try{
            connection = ConnectionFactory.getConnection();
            String sql = getSqlInsert();
            stm = connection.prepareStatement(sql);
            adicionarParametrosInsert(stm, motos);
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally {
            closeConnection(connection, stm, null);
        }
    }

    @Override
    public List<Motos> consultar() throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Motos> list = new ArrayList<>();
        Motos motos = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelectAll();
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();

            while (rs.next()) {
                motos = new Motos();
                String id = rs.getString("ID");
                String modelo = rs.getString("MODELO");
                String fabricante = rs.getString("FABRICANTE");
                String ano = rs.getString("ANO");
                String preco = rs.getString("PRECO");
                String cilindrada = rs.getString("CILINDRADA");
                motos.setId(id);
                motos.setModelo(modelo);
                motos.setFabricante(fabricante);
                motos.setAno(ano);
                motos.setPreco(preco);
                motos.setCilindrada(cilindrada);
                list.add(motos);
            }
        } catch(Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return list;
    }
    
    public Motos buscar(String id) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Motos motos = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelect();
            stm = connection.prepareStatement(sql);
            adicionarParametrosSelect(stm, id);
            rs = stm.executeQuery();

            if (rs.next()) {
                motos = new Motos();
                id = rs.getString("ID");
                String modelo = rs.getString("MODELO");
                String fabricante = rs.getString("FABRICANTE");
                String ano = rs.getString("ANO");
                String preco = rs.getString("PRECO");
                String cilindrada = rs.getString("CILINDRADA");
                motos.setId(id);
                motos.setModelo(modelo);
                motos.setFabricante(fabricante);
                motos.setAno(ano);
                motos.setPreco(preco);
                motos.setCilindrada(cilindrada);
            }
        } catch(Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return motos;
    }

    @Override
    public Integer excluir(Motos motos) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlDelete();
            stm = connection.prepareStatement(sql);
            adicionarParametrosDelete(stm, motos);
            return stm.executeUpdate();
        } catch(Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }

    @Override
    public Integer atualizar(Motos motos) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlUpdate();
            stm = connection.prepareStatement(sql);
            adicionarParametrosUpdate(stm, motos);
            return stm.executeUpdate();
        } catch(Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }

    @Override
    public List<Motos> buscarTodos() throws Exception {
        return List.of();
    }

    private void adicionarParametrosInsert(PreparedStatement stm, Motos motos) throws SQLException {
        stm.setString(1, motos.getModelo());
        stm.setString(2, motos.getFabricante());
        stm.setInt(3, motos.getAno());
        stm.setInt(4, motos.getPreco());
        stm.setInt(5, motos.getCilindrada());
    }
    private String getSqlInsert() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO TB_MOTOS (ID, MODELO, FABRICANTE, ANO, PRECO, CILINDRADA) ");
        sb.append("VALUES (nextval('SQ_MOTOS'),?,?,?,?,?)");
        return sb.toString();
    }

    private void adicionarParametrosUpdate(PreparedStatement stm, Motos motos) throws SQLException {
        stm.setString(1, motos.getModelo());
        stm.setString(2, motos.getFabricante());
        stm.setInt(3, motos.getAno());
        stm.setInt(4, motos.getPreco());
        stm.setInt(5, motos.getCilindrada());
        stm.setLong(6, motos.getId());
    }
    
    private String getSqlSelect() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM TB_MOTOS ");
        sb.append("WHERE ID = CAST(? AS BIGINT)");
        return sb.toString();
    }
    
    private void adicionarParametrosSelect(PreparedStatement stm, String id) throws SQLException {
        stm.setString(1, id);
    }

    private String getSqlUpdate() {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE TB_MOTOS ");
        sb.append("SET MODELO = ?, FABRICANTE = ?, ANO = ?, PRECO = ?, CILINDRADA = ? ");
        sb.append("WHERE ID = CAST(? AS BIGINT) ");
        return sb.toString();
    }

    private void adicionarParametrosDelete(PreparedStatement stm, Motos motos) throws SQLException {
        stm.setLong(1, motos.getId());
    }

    private String getSqlDelete() {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM TB_MOTOS ");
        sb.append("WHERE ID = ?");
        return sb.toString();
    }

    private String getSqlSelectAll() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM TB_MOTOS");
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
