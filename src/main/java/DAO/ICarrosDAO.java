package DAO;

import Veiculos.Carros;

import java.util.List;

public interface ICarrosDAO {
    public Integer cadastrar(Carros carros) throws Exception;

    public List<Carros> consultar () throws Exception;

    public Integer excluir (Carros carros) throws Exception;

    public Integer atualizar (Carros carros) throws Exception;
}
