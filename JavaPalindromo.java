import java.util.Scanner;

public class JavaPalindromo{

    /**
     * @param args
     */
    public static void main(String[] args) {
         
        try (Scanner sn = new Scanner(System.in)) {
            sn.useDelimiter("\n");
             
            // Pedimos una cadena
            System.out.println("Escribe una cadena");



            String cadena = sn.next();
             invertirCadena Cadenas = new invertirCadena(); 
             String invertirCadena;
            Cadenas.invertirCadenaString(invertirCadena);



            if(esPalindromo(cadena)){
                System.out.println("Es palindromo");
            } else {
                System.out.println("No es palindromo");
            }
        }
         
    }

    private static boolean esPalindromo(String cadena) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esPalindromo'");
    }
}