*/
package calculadora;

import java.util.Scanner;

/**
 *
 * @author ZURIEL ALI SAMPE SANCHEZ
 */
public class Calculadora {
    private static Object scanner;
    private double num1,num2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese dos números
        try ( // Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese dos números
            System.out.print("Ingrese el primer número: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();
            
            System.out.println("\nElije operacion");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
             System.out.println("3.Multiplicar");
              System.out.println("4.Dividir");
               System.out.println("5.Modulo");
               
           char opcion = scanner.next().charAt(0);
            
            switch (opcion){
                
                case '1':
            int suma = num1 + num2;
            
            System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
            break;
            
            /*Solicitar al usuario que ingrese dos números
            System.out.print("Ingrese el primer número: ");
            int num3 = scanner.nextInt();
                   
            System.out.print("Ingrese el segundo número: ");
            int num4 = scanner.nextInt();*/
            
                case '2':
            int resta = num1 - num2;
                        
            System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
            
            break;
            
            /*
            //Solicitar al usuario que ingrese dos números
            System.out.print("Ingrese el primer número:");
            int num5 = scanner.nextInt();
            
            System.out.print("Ingrese el segundo número:");
            int num6 = scanner.nextInt();
            */

                case '3':
            int multiplicación = num1 * num2;
            
            System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicación);
            
            break;
            /*
            //Solicitar al usuario que ingrese dos números
            System.out.print("Ingrese el primer número:");
            int num7 = scanner.nextInt();
            
            System.out.print("Ingrese el segundo número:");
            int num8 = scanner.nextInt();
            */
                case '4':
            int división = num1 / num2;
            
            System.out.println("La division de " + num1 + " y " + num2 + " es: " + división);
            break;
            
            /*
            //Solicitar al usuario que ingrese dos números
            System.out.print("Ingrese el primer número:");
            int num9 = scanner.nextInt();
            
            System.out.print("Ingrese el segundo número:");
            int num10 = scanner.nextInt();
            */
            
                case '5':
            int porcentaje = num1% num2;
            
            System.out.println("La porcentaje de " + num1 + " y " + num2 + " es: " + porcentaje);
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            // Cerrar el scanner
        }
        }
    }