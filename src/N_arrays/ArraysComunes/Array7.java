package N_arrays.ArraysComunes;

import java.util.ArrayList;
import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        ArrayList<String> listaDeCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a la aplicación de lista de compras!");

        while (true) {
            System.out.print("Ingrese un artículo para agregar a la lista (o 'fin' para salir): ");
            String articulo = scanner.nextLine();

            if (articulo.equalsIgnoreCase("fin")) {
                break; // Salir del bucle si se ingresa 'fin'
            }

            listaDeCompras.add(articulo); // Agregar el artículo a la lista
        }

        // Mostrar la lista de compras
        System.out.println("Lista de compras:");
        for (String item : listaDeCompras) {
            System.out.println("- " + item);
        }

        scanner.close();
    }
}
