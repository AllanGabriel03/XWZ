package Veiculos;

public class Motos extends Veiculos{
   
    private Integer cilindrada;
    
    public Motos(){
    }
    public Motos (String id, String modelo, String fabricante, String ano, String preco, String cilindrada) {
       super(id, modelo, fabricante, ano, preco);
       this.cilindrada = Integer.valueOf(cilindrada);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = Integer.valueOf(cilindrada);
    }
    
    
    
}
