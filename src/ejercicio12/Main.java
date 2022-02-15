
package ejercicio12;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Main {


    public static void main(String[] args) {
   Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Persona persona = new Persona();
        int op;
        boolean edad;
        persona.crearPersona();
        do {
            System.out.println("-------MENU-------");
            System.out.println("1-Calcular edad de la persona");
            System.out.println("2-Ingrese edad para comparar");
            System.out.println("3-Mostrar persona");
            System.out.println("4-SALIR");
            op = read.nextInt();
            switch (op) {
                case 1:
                    persona.calcularEdad();
                    break;
                case 2:
                    System.out.println("Ingrese edad para comparar");
                    edad = persona.menorQue(read.nextInt());
                    if (edad) {
                        System.out.println("La edad ingresada Es menor que la persona");
                    } else {
                        System.out.println("La edad ingresada Es mayor que la persona");
                    }
                    break;
                case 3:
                    persona.mostrarPersona();
                    break;
                case 4:
                    System.out.println("SALIENDO");
                    break;
                default:
                    System.out.println("ingrese opcion correcta");
            }
        } while (op != 4);
    }
    
}
