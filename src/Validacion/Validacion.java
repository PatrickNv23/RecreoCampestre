package Validacion;
public abstract class Validacion {
    public abstract boolean validarSiContenidoDeTextoSonLetras(String entrada);
    public abstract boolean validarSiCaracterEsLetra(char caracter);
    public abstract boolean validarSiEsNumero(String entrada);   
    public abstract boolean validarPrimerCaracterEnMayuscula(String texto);
}
