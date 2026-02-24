import java.util.Scanner;
public class NombrePersonalizado {

    public static String saludo (String nombre){
        return "Hola " + nombre + " Como estas ?";
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre:");
        String nombre = entrada.nextLine();
        String resultado = saludo(nombre);
        System.out.println(resultado);
        
    }
}