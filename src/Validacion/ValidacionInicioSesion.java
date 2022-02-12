package Validacion;
public class ValidacionInicioSesion extends Validacion implements Validacion_Extra {
    
    @Override
    public boolean validarUsuario(String entrada,String usuario){
        boolean usuarioCorrecto = false;
        if(entrada.equals(usuario)){
            usuarioCorrecto = true;
        }
        return usuarioCorrecto;
    }
    
    @Override
    public boolean validarContraseña(String contraseña,String contraseñaUsuario){
        boolean contraseñaCorrecta = false;
        if(contraseña.equals(contraseñaUsuario)){
            contraseñaCorrecta = true;
        }
        return contraseñaCorrecta;
    }

    @Override
    public boolean validarSiContenidoDeTextoSonLetras(String entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validarSiCaracterEsLetra(char caracter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validarSiEsNumero(String entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validarPrimerCaracterEnMayuscula(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
