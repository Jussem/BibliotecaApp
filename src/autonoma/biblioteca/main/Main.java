
package autonoma.biblioteca.main;

import autonoma.biblioteca.models.Biblioteca;
import autonoma.biblioteca.models.Libro;
import java.util.ArrayList;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            System.out.println("\n--- Menu de la Biblioteca ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Buscar libro por ID");
            System.out.println("4. Eliminar libro por ID");
            System.out.println("5. Mostrar libros ordenados alfabeticamente");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del libro: ");
                    long id = scanner.nextLong();
                    scanner.nextLine();  
                    System.out.print("Ingrese el titulo del libro: ");
                    String titulo = scanner.nextLine();
                    Libro nuevoLibro = new Libro(id, titulo);
                    if (biblioteca.agregarLibro(nuevoLibro)) {
                        System.out.println("Libro agregado correctamente.");
                    } else {
                        System.out.println("Error al agregar el libro.");
                    }
                    break;

                case 2:
                    System.out.println("\nLibros en la biblioteca:");
                    System.out.println(biblioteca.mostrarLibros());
                    break;

                case 3:
                    System.out.print("Ingrese el ID del libro a buscar: ");
                    long idBuscar = scanner.nextLong();
                    scanner.nextLine();  
                    Libro libroEncontrado = biblioteca.buscarLibro(idBuscar);
                    if (libroEncontrado != null) {
                        System.out.println("Libro encontrado: " + libroEncontrado.getTitulo());
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el ID del libro a eliminar: ");
                    long idEliminar = scanner.nextLong();
                    scanner.nextLine();  
                    if (biblioteca.eliminarLibro(idEliminar)) {
                        System.out.println("Libro eliminado .");
                    } else {
                        System.out.println("Error al eliminar el libro.");
                    }
                    break;

                case 5:
                    System.out.println("\nLibros ordenados alfabeticamente:");
                    ArrayList<Libro> librosOrdenados = biblioteca.obtenerLibrosAlfabeticamente();
                    for (Libro libro : librosOrdenados) {
                        System.out.println(libro.getTitulo());
                    }
                    break;

                case 6:
                    System.out.println("Saliendo..");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opcion invalida.");
            }
        }
    }
}