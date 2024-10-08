/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ucr.maria.matrizenteros;

/**
 *
 * @author maria
 */
import java.util.Random;

// punto 1) Definimos la clase MatrizEnteros
public class MatrizEnteros {

    // punto 1.a) Atributos privados, arreglo bidimensional de enteros
    private int[][] matriz;

    /* Ingresan por parámetros la cantidad de filas y columnas, 
       por lo cual es importante crear atributos para manejarlos */
    private int filas;
    private int columnas;

    // Usamos la clase Random para generar números aleatorios
    private Random random = new Random();

    // punto 1.b) Constructor para una matriz de 4x4
    public MatrizEnteros() {
        this.filas = 4;
        this.columnas = 4;
        // Inicializamos la matriz con el tamaño 4x4
        this.matriz = new int[filas][columnas];
    }

    // punto 1.c) Constructor con filas y columnas específicas
    public MatrizEnteros(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        // Inicializamos la matriz con las dimensiones específicas
        this.matriz = new int[filas][columnas];
    }

    // punto 1.d) Método para llenar la matriz con números aleatorios
    public void llenarArreglo() {
        for (int i = 0; i < filas; i++) {   // Recorremos cada fila
            for (int j = 0; j < columnas; j++) {   // Luego recorremos cada columna
                // Asignamos un número aleatorio entre 1 y 100 a cada posición
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }
    }

    // punto 1.e) Método para representar la matriz como cadena
    @Override
    public String toString() {
        StringBuilder stBuilder = new StringBuilder();  // Usamos StringBuilder para construir la cadena
        for (int i = 0; i < filas; i++) {   // Recorremos las filas
            for (int j = 0; j < columnas; j++) {   // Y luego las columnas
                stBuilder.append(matriz[i][j]).append("\t");  // Agregamos cada valor seguido de un tabulador
            }
            stBuilder.append("\n");  // Añadimos un salto de línea después de cada fila
        }
        return stBuilder.toString();
    }

    // punto 1.f) Método para agregar un valor en una posición específica de la matriz
    public void agregarValor(int fila, int columna, int valor) {
        // Verificamos que la fila y columna estén dentro de los límites de la matriz
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            matriz[fila][columna] = valor;  // Asignamos el valor en la posición especificada
        }
    }

    // punto 1.g) Método para obtener una fila específica como cadena
    public String getFila(int fila) {
        if (fila >= 0 && fila < filas) {  // Verificamos que la fila esté dentro de los límites
            StringBuilder stBuilder = new StringBuilder();  // Usamos StringBuilder para construir la cadena
            for (int j = 0; j < columnas; j++) {   // Recorremos las columnas de esa fila
                stBuilder.append(matriz[fila][j]).append(" ");  // Agregamos los valores separados por un espacio
            }
            return stBuilder.toString();  // Devolvemos la fila como cadena
        }
        return "Fila fuera de rango";  // Mensaje de error si la fila no es válida
    }

    // punto 1.h) Método para obtener una columna específica como cadena
    public String getColumna(int columna) {
        if (columna >= 0 && columna < columnas) {  // Verificamos que la columna esté dentro de los límites
            StringBuilder stBuilder = new StringBuilder();  // Usamos StringBuilder para construir la cadena
            for (int i = 0; i < filas; i++) {   // Recorremos las filas de esa columna
                stBuilder.append(matriz[i][columna]).append(" ");  // Agregamos los valores separados por un espacio
            }
            return stBuilder.toString();  // Devolvemos la columna como cadena
        }
        return "Columna fuera de rango";  // Mensaje de error si la columna no es válida
    }

    // punto 1.i) Método para obtener la suma de una fila específica
    public int getSumaFila(int fila) {
        if (fila >= 0 && fila < filas) {  // Verificamos que la fila esté dentro de los límites
            int suma = 0;
            for (int j = 0; j < columnas; j++) {  // Sumamos los valores de la fila
                suma += matriz[fila][j];
            }
            return suma;  // Devolvemos la suma de la fila
        }
        return -1;  // Indicador de error si la fila no es válida
    }

    // punto 1.j) Método para obtener la suma de una columna específica
    public int getSumaColumna(int columna) {
        if (columna >= 0 && columna < columnas) {  // Verificamos que la columna esté dentro de los límites
            int suma = 0;
            for (int i = 0; i < filas; i++) {  // Sumamos los valores de la columna
                suma += matriz[i][columna];
            }
            return suma;  // Devolvemos la suma de la columna
        }
        return -1;  // Indicador de error si la columna no es válida
    }

    // punto 1.k) Método para obtener el promedio de una fila específica
    public double getPromedioFila(int fila) {
        int suma = getSumaFila(fila);  // Obtenemos la suma de la fila
        return (suma != -1) ? (double) suma / columnas : -1;  // Calculamos el promedio
    }

    // punto 1.l) Método para obtener el promedio de una columna específica
    public double getPromedioColumna(int columna) {
        int suma = getSumaColumna(columna);  // Obtenemos la suma de la columna
        return (suma != -1) ? (double) suma / filas : -1;  // Calculamos el promedio
    }

    // punto 1.m) Método para obtener la suma de todos los elementos de la matriz
    public int getSuma() {
        int suma = 0;
        for (int i = 0; i < filas; i++) {   // Recorremos todas las filas
            for (int j = 0; j < columnas; j++) {   // Y todas las columnas
                suma += matriz[i][j];  // Sumamos cada elemento
            }
        }
        return suma;  // Devolvemos la suma total de la matriz
    }

    // punto 1.n) Método para obtener el promedio de todos los elementos de la matriz
    public double getPromedio() {
        int suma = getSuma();  // Obtenemos la suma de la matriz
        return (double) suma / (filas * columnas);  // Calculamos el promedio
    }

    // punto 1.ñ) Método para obtener la diagonal principal de izquierda a derecha
    public String getDiagonalPrincipalIzquierdaDerecha() {
        StringBuilder stBuilder = new StringBuilder();
        for (int i = 0; i < Math.min(filas, columnas); i++) {
            stBuilder.append(matriz[i][i]).append(" ");  // Agregamos los elementos de la diagonal principal
        }
        return stBuilder.toString();
    }

    // punto 1.o) Método para obtener la diagonal secundaria de derecha a izquierda
    public String getDiagonalSecundariaDerechaIzquierda() {
        StringBuilder stBuilder = new StringBuilder();
        for (int i = 0; i < Math.min(filas, columnas); i++) {
            stBuilder.append(matriz[i][columnas - 1 - i]).append(" ");  // Agregamos los elementos de la diagonal secundaria
        }
        return stBuilder.toString();
    }

    // punto 1.p) Método para obtener la diagonal secundaria de izquierda a derecha
    public String getDiagonalSecundariaIzquierdaDerecha() {
        StringBuilder stBuilder = new StringBuilder();
        for (int i = 0; i < Math.min(filas, columnas); i++) {
            stBuilder.append(matriz[filas - 1 - i][i]).append(" ");  // Agregamos los elementos de la diagonal secundaria inversa
        }
        return stBuilder.toString();
    }

    // punto 1.q) Método para obtener la diagonal principal de derecha a izquierda
    public String getDiagonalPrincipalDerechaIzquierda() {
        StringBuilder stBuilder = new StringBuilder();
        for (int i = 0; i < Math.min(filas, columnas); i++) {
            stBuilder.append(matriz[filas - 1 - i][columnas - 1 - i]).append(" ");  // Agregamos los elementos de la diagonal principal inversa
        }
        return stBuilder.toString();
    }
}
