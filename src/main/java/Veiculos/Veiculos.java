/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculos;

/**
 *
 * @author allan
 */
public class Veiculos {
    private long id;
    private String modelo;
    private String fabricante;
    private Integer ano;
    private Integer preco;
    
    public Veiculos(){
        
    }

    public Veiculos (String id, String modelo, String fabricante, String ano, String preco) {
        this.id = Long.parseLong(id);
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = Integer.valueOf(ano);
        this.preco = Integer.valueOf(preco);
    }
    
    public long getId() {
        return id;
    }

    public void setId(String id) {
        this.id = Long.parseLong(id);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = Integer.valueOf(ano);
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = Integer.valueOf(preco);
    }
    
    public String toString() {
        return "Veiculos{" +
               "id=" + id +
               ", modelo='" + modelo + '\'' +
               ", fabricante='" + fabricante + '\'' +
               ", ano='" + ano + '\'' +
               ", preco='" + preco + '\'' +
               '}';
    }
    
}
