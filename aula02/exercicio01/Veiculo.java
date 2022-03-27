package exercicio01;

public class Veiculo {

    public String modelo;
    public String marca;
    public double consumo;
    
    public Veiculo(String modelo, String marca, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }
    
    public void visualizar() {
        System.out.println("Modelo = " + modelo);
        System.out.println("Marcar = " + marca);
        System.out.println("Consumo = " + consumo);
    }
    
    public double getConsumo() {
        return consumo;
    }
    
    public void setConsumo(double novoConsumo) {
        if(novoConsumo > 0) {
            consumo = novoConsumo;
        }
    }
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}

