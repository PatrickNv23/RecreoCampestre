package Clases;

public class Empleado extends Usuario {
    private double sueldo;
    private int tipoEmpleado;
    private String fechaInicioContrato;
    private String fechaFinContrato;
    
    public Empleado(int codigo){
        super(codigo);
    }
    
    public Empleado(){
        
    }
    public Empleado(int codigo, String nombre, String apellido, String dni, String telefono, String usuario, String contraseña, double sueldo, int tipoEmpleado,String fechaInicioContrato, String fechaFinContrato) {
        super(codigo, nombre, apellido, dni, telefono, usuario, contraseña);
        this.sueldo = sueldo;
        this.tipoEmpleado = tipoEmpleado;
        this.fechaInicioContrato = fechaInicioContrato;
        this.fechaFinContrato = fechaFinContrato;
    }  

    public String getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(String fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public String getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(String fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(int tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
    
    
}
