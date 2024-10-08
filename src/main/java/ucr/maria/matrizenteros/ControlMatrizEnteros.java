/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.maria.matrizenteros;

/**
 *
 * @author maria
 */
import java.util.Scanner;

public class ControlMatrizEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MatrizEnteros matriz = new MatrizEnteros(); // Crear una matriz 4x4 por defecto
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Llenar el arreglo bidimensional de manera aleatoria.");
            System.out.println("2. Agregar un valor en un espacio específico del arreglo.");
            System.out.println("3. Imprimir todos los valores del arreglo bidimensional.");
            System.out.println("4. Obtener el promedio de una fila específica.");
            System.out.println("5. Obtener el promedio de una columna específica.");
            System.out.println("6. Imprimir los valores de una fila específica.");
            System.out.println("7. Imprimir los valores de una columna específica.");
            System.out.println("8. Imprimir los valores de la diagonal principal de izquierda a derecha.");
            System.out.println("9. Imprimir los valores de la diagonal principal de derecha a izquierda.");
            System.out.println("10. Imprimir los valores de la diagonal secundaria de derecha a izquierda.");
            System.out.println("11. Imprimir los valores de la diagonal secundaria de izquierda a derecha.");
            System.out.println("12. Calcular el promedio de toda la matriz.");
            System.out.println("13. Salir.");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    matriz.llenarArreglo();
                    System.out.println("Matriz llenada con valores aleatorios.");
                    break;
                case 2:
                    System.out.print("Ingrese la fila: ");
                    int fila = scanner.nextInt();
                    System.out.print("Ingrese la columna: ");
                    int columna = scanner.nextInt();
                    System.out.print("Ingrese el valor: ");
                    int valor = scanner.nextInt();
                    matriz.agregarValor(fila, columna, valor);
                    System.out.println("Valor agregado correctamente.");
                    break;
                case 3:
                    System.out.println("Valores de la matriz:");
                    System.out.println(matriz);
                    break;
                case 4:
                    System.out.print("Ingrese el número de fila: ");
                    fila = scanner.nextInt();
                    System.out.println("Promedio de la fila " + fila + ": " + matriz.getPromedioFila(fila));
                    break;
                case 5:
                    System.out.print("Ingrese el número de columna: ");
                    columna = scanner.nextInt();
                    System.out.println("Promedio de la columna " + columna + ": " + matriz.getPromedioColumna(columna));
                    break;
                case 6:
                    System.out.print("Ingrese el número de fila: ");
                    fila = scanner.nextInt();
                    System.out.println("Valores de la fila " + fila + ": " + matriz.getFila(fila));
                    break;
                case 7:
                    System.out.print("Ingrese el número de columna: ");
                    columna = scanner.nextInt();
                    System.out.println("Valores de la columna " + columna + ": " + matriz.getColumna(columna));
                    break;
                case 8:
                    System.out.println("Diagonal principal de izquierda a derecha: " + matriz.getDiagonalPrincipalIzquierdaDerecha());
                    break;
                case 9:
                    System.out.println("Diagonal principal de derecha a izquierda: " + matriz.getDiagonalPrincipalDerechaIzquierda());
                    break;
                case 10:
                    System.out.println("Diagonal secundaria de derecha a izquierda: " + matriz.getDiagonalSecundariaDerechaIzquierda());
                    break;
                case 11:
                    System.out.println("Diagonal secundaria de izquierda a derecha: " + matriz.getDiagonalSecundariaIzquierdaDerecha());
                    break;
                case 12:
                    System.out.println("Promedio de todos los valores de la matriz: " + matriz.getPromedio());
                    break;
                case 13:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 13);

        scanner.close();
    }
}

