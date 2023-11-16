import java.io.BufferedReader;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Pedir al usuario el nombre del archivo a utilizar
            System.out.print("Ingrese el nombre del archivo: ");
            String nombreArchivo = reader.readLine();

            // Crear una instancia de la clase Files
            Files files = new Files();

            // Leer el archivo de números
            int[] numeros = files.archivoAint(nombreArchivo);

            
            // Verificar si la lista está ordenada
            boolean ordenado = files.estaOrdenado(numeros);

            if (!ordenado) {
                System.out.println("El arreglo no está ordenado. La búsqueda binaria puede no dar resultados correctos.");
                return;
            }

            // Pedir al usuario el valor a buscar
            System.out.print("Ingrese el número a buscar: ");
            int valorBuscado = Integer.parseInt(reader.readLine());

            // Realizar la búsqueda binaria
            int indiceEncontrado = busquedaBinaria(numeros, valorBuscado);

            // Mostrar el resultado de la búsqueda
            if (indiceEncontrado != -1) {
                System.out.println("El número " + valorBuscado + " se encuentra en la posición " + indiceEncontrado + ".");
            } else {
                System.out.println("El número " + valorBuscado + " no se encuentra en el archivo.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }

    // Implementación de búsqueda binaria
    private static int busquedaBinaria(int[] arreglo, int T) {
        int L = 0;
        int R = arreglo.length - 1;

        while (L <= R) {
            int m = L + (R - L) / 2;

            if (arreglo[m] == T) {
                return m;
            } else if (arreglo[m] < T) {
                L = m + 1;
            } else {
                R = m - 1;
            }
        }

        return -1; // Valor no encontrado
    }
}
