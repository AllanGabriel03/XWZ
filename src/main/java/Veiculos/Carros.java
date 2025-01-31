package Veiculos;

public class Carros extends Veiculos{
    
    private int quantidadeDePortas;
    
    private String tipoCombustivel;

    public Carros(){
        
    }
    public Carros(String id, String modelo, String fabricante, String ano, String preco, String quantidadeDePortas, String tipoCombustivel) {
        super(id, modelo, fabricante, ano, preco);
        this.quantidadeDePortas = Integer.valueOf(quantidadeDePortas);
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(String quantidadeDePortas) {
        this.quantidadeDePortas = Integer.valueOf(quantidadeDePortas);
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

   
}
