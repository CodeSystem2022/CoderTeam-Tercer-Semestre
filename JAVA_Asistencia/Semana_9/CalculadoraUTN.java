import java.util.Scanner;

public class CalculadoraUTN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {//ciclo infinito que solo sale con el break
            System.out.println("********APLICACION CALCULADORA");
            //Mostramos el menú
            System.out.println("""
                        1. SUMA
                        2. RESTA
                        3. MULTIPLICACION
                        4. DIVISION
                        5. SALIR
                        """);
            System.out.println("Ingrese una opcion: ");
            var operacion = Integer.parseInt(sc.nextLine());
            if (operacion >= 1 && operacion <= 4) {
                System.out.println("Digite el valor para el primer operando: ");
                var operando1 = Integer.parseInt(sc.nextLine());
                System.out.println("Digite el valor para el segundo operando: ");
                var operando2 = Integer.parseInt(sc.nextLine());
                int resultado;
                switch (operacion) {
                    case 1: {
                        resultado = operando1 + operando2;
                        System.out.println("El resultado de la suma es: " + resultado);
                        break;
                    }
                    case 2: {
                        resultado = operando1 - operando2;
                        System.out.println("El resultado de la resta es: " + resultado);
                        break;
                    }
                    case 3: {
                        resultado = operando1 * operando2;
                        System.out.println("El resultado de la multiplicacion es: " + resultado);
                        break;
                    }
                    case 4: {
                        resultado = operando1 / operando2;
                        System.out.println("El resultado de la division es: " + resultado);
                        break;
                    }
                    default: {
                        System.out.println("la opción no es válida");
                    }
                }//fin switch
            } // fin del if
            else if (operacion == 5) {
                System.out.println("Hasta pronto....");
                break;
            }
            else {
                System.out.println("Opcion erronea: " + operacion);
            }
            //imprimimos un salto de linea antes de volver a repetir el menu
            System.out.println();
        }// fin while
    } //main
} //cierre class