package Clases;


public class Pedido {

    private int cantidadSolicitadaEnPedido;
    private int codigoPedido;
    private String estadoPedido;

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
    
    public String cambiarEstadoP(String estado) {
        return this.estadoPedido = estado;
    }

    public void cancelarPedido() {
        this.estadoPedido = "Pedido cancelado";
    }

     public int getCantidadSolicitadaEnPedido() {
        return cantidadSolicitadaEnPedido;
    }

    public void setCantidadSolicitadaEnPedido(int cantidadSolicitadaEnPedido) {
        this.cantidadSolicitadaEnPedido = cantidadSolicitadaEnPedido;
    }

    
}
