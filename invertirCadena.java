
public class invertirCadena {
    public String invertirCadenaString(String cadena) {

        cadena = cadena.toLowerCase();
        String cadenaInvertida = "";

        // Invertimos la cadena
        char caracter;
        for (int i = cadena.length() - 1; i >= 0; i--) {
            caracter = cadena.charAt(i);
            cadenaInvertida += caracter;
        }

        return cadenaInvertida;
    }
}