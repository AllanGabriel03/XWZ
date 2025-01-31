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

public class CarrosDAO implements ICarrosDAO{
    @Override
    public Integer cadastrar(Carros carros) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try{
            connection = ConnectionFactory.getConnection();
            String sql = getSqlInsert();
            stm = connection.prepareStatement(sql);
            adicionarParametrosInsert(stm, carros);
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally {
            closeConnection(connection, stm, null);
        }
    }

    @Override
    public List<Carros> consultar() throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Carros> list = new ArrayList<>();
        Carros carros = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelectAll();
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();

            while (rs.next()) {
                carros = new Carros();
                String id = rs.getString("ID");
                String modelo = rs.getString("MODELO");
                String fabricante = rs.getString("FABRICANTE");
                String ano = rs.getString("ANO");
                String preco = rs.getString("PRECO");
                String quantidadeDePortas = rs.getString("QuantidadedePortas");
                String tipoCombustivel = rs.getString("tipoCombustivel");
                carros.setId(id);
                carros.setModelo(modelo);
                carros.setFabricante(fabricante);
                carros.setAno(ano);
                carros.setPreco(preco);
                carros.setQuantidadeDePortas(quantidadeDePortas);
                carros.setTipoCombustivel(tipoCombustivel);
                list.add(carros);
            }
        } catch(Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return list;
    }
    
    
     public Carros buscar(String id) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Carros carros = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelect();
            stm = connection.prepareStatement(sql);
            adicionarParametrosSelect(stm, id);
            rs = stm.executeQuery();

            if (rs.next()) {
                carros = new Carros();
                id = rs.getString("ID");
                String modelo = rs.getString("MODELO");
                String fabricante = rs.getString("FABRICANTE");
                String ano = rs.getString("ANO");
                String preco = rs.getString("PRECO");
                String quantidadeDePortas = rs.getString("QuantidadedePortas");
                String tipoCombustivel = rs.getString("tipoCombustivel");
                carros.setId(id);
                carros.setModelo(modelo);
                carros.setFabricante(fabricante);
                carros.setAno(ano);
                carros.setPreco(preco);
                carros.setQuantidadeDePortas(quantidadeDePortas);
                carros.setTipoCombustivel(tipoCombustivel);
            }
        } catch(Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return carros;
    }

    @Override
    public Integer excluir(Carros carros) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlDelete();
            stm = connection.prepareStatement(sql);
            adicionarParametrosDelete(stm, carros);
            return stm.executeUpdate();
        } catch(Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }

    @Override
    public Integer atualizar(Carros carros) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlUpdate();
            stm = connection.prepareStatement(sql);
            adicionarParametrosUpdate(stm, carros);
            return stm.executeUpdate();
        } catch(Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }
    
    public List<Carros> buscarTodos() throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Carros> list = new ArrayList<>();
        Carros carros = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelectAllTb();
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();

            while (rs.next()) {
                carros = new Carros();
                carros.setId(rs.getString("ID"));
                carros.setModelo(rs.getString("MODELO"));
                carros.setFabricante(rs.getString("FABRICANTE"));
                carros.setAno(rs.getString("ANO"));
                carros.setPreco(rs.getString("PRECO"));
                carros.setQuantidadeDePortas("QUANTIDADEDEPORTAS");
                carros.setTipoCombustivel("TIPOCOMBUSTIVEL");
                list.add(carros);
                
            }
        } catch(Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return list;
    }

   
    private void adicionarParametrosInsert(PreparedStatement stm, Carros carros) throws SQLException {
        stm.setString(1, carros.getModelo());
        stm.setString(2, carros.getFabricante());
        stm.setInt(3, carros.getAno());
        stm.setInt(4, carros.getPreco());
        stm.setInt(5, carros.getQuantidadeDePortas());
        stm.setString(6, carros.getTipoCombustivel());
    }

    private String getSqlInsert() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO TB_CARROS (ID, MODELO, FABRICANTE, ANO, PRECO, QUANTIDADEDEPORTAS, TIPOCOMBUSTIVEL) ");
        sb.append("VALUES (nextval('SQ_CARROS'),?,?,?,?,?,?)");
        return sb.toString();
    }

    private void adicionarParametrosUpdate(PreparedStatement stm, Carros carros) throws SQLException {
        stm.setString(1, carros.getModelo());
        stm.setString(2, carros.getFabricante());
        stm.setInt(3, carros.getAno());
        stm.setInt(4, carros.getPreco());
        stm.setInt(5, carros.getQuantidadeDePortas());
        stm.setString(6, carros.getTipoCombustivel());
        stm.setLong(7, carros.getId());
        
    }
    
    private String getSqlSelect() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM TB_CARROS ");
        sb.append("WHERE ID = CAST(? AS BIGINT)");
        return sb.toString();
    }
    
    private void adicionarParametrosSelect(PreparedStatement stm, String id) throws SQLException {
        stm.setString(1, id);
    }

    private String getSqlUpdate() {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE TB_CARROS ");
        sb.append("SET MODELO = ?, FABRICANTE = ?, ANO = ?, PRECO = ?, QUANTIDADEDEPORTAS = ?, TIPOCOMBUSTIVEL = ? ");
        sb.append("WHERE ID = CAST(? AS BIGINT) ");
        return sb.toString();
    }

    private void adicionarParametrosDelete(PreparedStatement stm, Carros carros) throws SQLException {
        stm.setLong(1, carros.getId());
    }

    private String getSqlDelete() {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM TB_CARROS ");
        sb.append("WHERE ID = ?");
        return sb.toString();
    }

    private String getSqlSelectAll() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM TB_CARROS");
        return sb.toString();
    }
    
    private String getSqlSelectAllTb() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM TB_CARROS");
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
