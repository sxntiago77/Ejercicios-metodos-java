import java.util.Scanner;

public class Celsius_Fahrenheit {

    public static float convertir(float celsius) {
        float fahrenheit = celsius * 9 / 5 + 32;
        return fahrenheit;
    }

    public static void mensaje(){
        System.out.println("Error, intentelo de nuevo.");
    }

    public static void main(String[] args) {
        
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese la temperatura en grados Celsius: ");
            float celsius = entrada.nextFloat();
            float resultado = convertir(celsius);

            System.out.println("La temperatura " + celsius + " en grados Fahrenheit es: " + resultado);

        } catch (Exception e) {
            mensaje();
        }
    }
}