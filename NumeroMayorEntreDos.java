import java.util.Scanner;

public class NumeroMayorEntreDos {

    public static int numeroMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }

        }
        public static void mensaje(){
            System.out.println("Ingrese solo numeros.");
    }

    public static void main(String[] args) {
        try {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = entrada.nextInt();
        int mayor = numeroMayor(numero1, numero2);
        System.out.println("El número mayor es: " + mayor);

        } catch (Exception e) {
            mensaje();
        }

    }
}