import java.util.Scanner;

public class CalificacionInteractiva {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Profesor Raúl, ingrese la nota del trabajo: ");
        double profesorRaul = entrada.nextDouble();

        System.out.println("El profesor Raúl nos puso la nota: " + profesorRaul);

        if (profesorRaul >= 4){
            System.out.println(" :) ¡Carita feliz! Vamos bien" );
        } else {
            System.out.println(" :( Carita triste...");
        }

        entrada.close();
    }
}