import java.util.Scanner;

public class PositivoNegativoCero {

    public static int signo (int numero) {
        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es neutro");
        }
        return numero;
    }

    public static void mensaje(){
        System.out.println("Error, Ingrese solo numeros");
    }

    public static void main(String [] args) {
        try {

        Scanner Entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero:" );
        int numero = Entrada.nextInt();
        signo(numero);

        } catch (Exception e) {
            mensaje();
        }
        
    }
}