import java.util.Scanner;

public class AreaCuadarado {
    
    public static double area(double lado){
        return lado * lado;
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = entrada.nextDouble();
        double resultado = area(lado);
        System.out.println("El área del cuadrado es: " + resultado);
    }
}