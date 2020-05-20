import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        palindromo p = new palindromo();
        Scanner teclado = new Scanner(System.in);
        int respuesta = 1;
        while (respuesta != 2) {
            System.out.print("Ingrese una palabra: ");

            String s = teclado.next();

            if (p.esPalindromo(s)) {
                System.out.println("La palabra ingresada es un palíndromo");
            } else {
                System.out.println("La palabra ingresada no es un palíndromo");
            }
            System.out.println("¿quieres probar otra palabra?");
            System.out.println("[1] Si, [2] No");
            respuesta=respuesta();

        }
        if (respuesta == 2) {
            System.out.println("Gracias por usar nuestro palindromo");

        } }
    private static int respuesta() {
        System.out.println("");
        Scanner leer = new Scanner(System.in);
        try{
            return leer.nextInt();
        }catch (Exception e){
            System.out.println("Error al introducir numero, [1] para continuar , [2] para salir");
        }
        return respuesta();
    }
}
