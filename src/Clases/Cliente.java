package Clases;

public class Cliente extends Usuario {

    private double importe;

    public Cliente(int codigo) {
        super(codigo);
    }
    
    public Cliente(){
        
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
}
