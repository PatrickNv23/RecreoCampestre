package Clases;
import java.util.ArrayList;

public class BoletaFactorizada {
    private int codigoBoleta;  
    private String estadoBoleta;
    private double precioTotal;
    private double igv = 0.18;
    private double SubtotalBoleta;
    private ArrayList<Producto> productos;
    SubTotal subtotal;
    
    public String cambiarEstado(String estado){
        return this.estadoBoleta = estado;
    }

    public int getCodigoBoleta() {
        return codigoBoleta;
    }

    public void setCodigoBoleta(int codigoBoleta) {
        this.codigoBoleta = codigoBoleta;
    }


    public String getEstadoBoleta() {
        return estadoBoleta;
    }

    public void setEstadoBoleta(String estadoBoleta) {
        this.estadoBoleta = estadoBoleta;
    }
    
     public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getSubtotalBoleta() {
        return SubtotalBoleta;
    }

    public void setSubtotalBoleta(double SubtotalBoleta) {
        this.SubtotalBoleta = SubtotalBoleta;
    }
    
    public double calcularPrecioTotal() {
        subtotal.calcularSubTotal(productos);
        precioTotal = SubtotalBoleta + (SubtotalBoleta* igv);
        return this.precioTotal;
    }  
}
