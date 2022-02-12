package Clases;
import java.util.ArrayList;
public class SubTotal{
    protected ArrayList<Producto> lista_pedido = new ArrayList<Producto>();
    private int cantidadSolicitadaEnPedido;
    private double subTotal;
    
    public ArrayList<Producto> getLista_pedido() {
        return lista_pedido;
    }
    public int getCantidadSolicitadaEnPedido() {
        return cantidadSolicitadaEnPedido;
    }

    public void setCantidadSolicitadaEnPedido(int cantidadSolicitadaEnPedido) {
        this.cantidadSolicitadaEnPedido = cantidadSolicitadaEnPedido;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
    public double calcularSubTotal(ArrayList<Producto> productos) {
        for (Producto producto : productos) {
            this.subTotal += (producto.preciounitario * this.cantidadSolicitadaEnPedido);
        }
        return this.subTotal;
    }
}
