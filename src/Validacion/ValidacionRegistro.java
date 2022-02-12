package Validacion;
public class ValidacionRegistro extends Validacion {

    @Override
    public boolean validarSiContenidoDeTextoSonLetras(String entrada) {
        boolean textoconLetras = true;
        if (entrada.length() == 0) {
            textoconLetras = false;
        } else {
            for (int i = 0; i < entrada.length(); i++) {
                char caracter = entrada.toUpperCase().charAt(i);
                textoconLetras = validarSiCaracterEsLetra(caracter);
                if (!textoconLetras) {
                    break;
                }
            }
            if (textoconLetras) {
                if (!this.validarPrimerCaracterEnMayuscula(entrada)) {
                    textoconLetras = false;
                }
                //this.validarPrimerCaracterEnMayuscula(entrada);
            }
        }
        return textoconLetras;
    }

    @Override
    public boolean validarSiCaracterEsLetra(char caracter) {
        boolean esLetra = true;
        int valorASCII = (int) caracter;
        if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90)) {
            esLetra = false; //Se ha encontrado un caracter que no es letra
        }
        return esLetra;
    }

    public boolean validarLongitudDNI(String dni) {
        if (validarSiEsNumero(dni) && !validarSiContenidoDeTextoSonLetras(dni) && dni.length() == 8) {
            return true;
        }
        return false;
    }

    @Override
    public boolean validarSiEsNumero(String dni) {
        boolean esNumero = true;
        for (int i = 0; i < dni.length(); i++) {
            if (!Character.isDigit(dni.charAt(i))) {
                esNumero = false;
            }
        }
        return esNumero;
    }

    ;
     
    public boolean validarLongitudTelefono(String telefono) {
        if (validarSiEsNumero(telefono) && !validarSiContenidoDeTextoSonLetras(telefono) && telefono.length() == 9) {
            return true;
        }
        return false;
    }

    /*
    @Override
     public void validarPrimerCaracterEnMayuscula(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (i == 0) {
                if ((int) texto.charAt(i) == (int) texto.toUpperCase().charAt(i)) {
                    System.out.println("La primera es mayúscula");
                }
            }
        }
    }*/

    @Override
    public boolean validarPrimerCaracterEnMayuscula(String texto) {
        boolean mayuscula = true;
        for (int i = 0; i < texto.length(); i++) {
            if (i == 0) {
                if ((int) texto.charAt(i) == (int) texto.toUpperCase().charAt(i)) {
                    System.out.println("La primera es mayúscula");
                    mayuscula = true;
                } else {
                    mayuscula = false;
                }
            }
        }
        return mayuscula;
    }

    public boolean validarConfirmacionContraseña(String contraseña, String confirmacionContraseña) {
        if (contraseña.equals(confirmacionContraseña)) {
            return true;
        }
        return false;
    }

}
