import java.util.Scanner;
public class MultiploDe5 {
    
    public static int miltiploDe5(int numero) {
        if (numero % 5 == 0) {
            System.out.println("El numero es multiplo de 5");
        } else {
            System.out.println("El numero no es multiplo de 5");
        }
        return numero;
    }

    public static void mensaje() {
        System.out.println("Error: Ingrese un numero valido");
    }

    public static void main(String[] args){
        try {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un numero: ");
            int numero = scanner.nextInt();
            miltiploDe5(numero);

        } catch (Exception e) {
            mensaje();
        }
}
}