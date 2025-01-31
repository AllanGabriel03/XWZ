/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Veiculos.Veiculos;
import java.util.List;

/**
 *
 * @author allan
 */
public interface IVeiculosDAO {
    
    public List<Veiculos> buscarTodos() throws Exception;
    
}
