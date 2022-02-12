package Clases;

public class Producto {

    protected int codigo;
    protected String nombre;
    protected double precioVenta;
    protected double precioCompra;
    protected String descripcion;
    protected int tipo;
    protected int cantidadDisponible;
    protected double preciounitario;
    protected String estadoProducto;

    public Producto(int codigo, String nombre, double precioVenta, double precioCompra, String descripcion, int tipo, int cantidadDisponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.cantidadDisponible = cantidadDisponible;
    }
    
    public Producto(){
        
    }
    
    public Producto(int codigo) {
        this.codigo = codigo;
    }
    public Producto(String nombre, double precioVenta, double precioCompra, String descripcion, int tipo, int cantidadDisponible) {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public String getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(String estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public int calcularStockDisponible() {
        Pedido pedido = new Pedido();
        this.cantidadDisponible -= pedido.getCantidadSolicitadaEnPedido();
        return this.cantidadDisponible;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    

}
