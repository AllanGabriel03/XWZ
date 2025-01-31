package DAO;



import Veiculos.Motos;

import java.util.List;

public interface IMotosDAO {
    public Integer cadastrar(Motos motos) throws Exception;

    public List<Motos> consultar () throws Exception;

    public Integer excluir (Motos motos) throws Exception;

    public Integer atualizar (Motos motos) throws Exception;

    public List<Motos> buscarTodos() throws Exception;
}
