
package autonoma.biblioteca.main;

import autonoma.biblioteca.models.Biblioteca;
import autonoma.biblioteca.models.Libro;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro(1, "Cien años de soledad");
        Libro libro2 = new Libro(2, "1984");
        Libro libro3 = new Libro(3, "El Principito");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println("Libros en la biblioteca:");
        System.out.println(biblioteca.mostrarLibros());

        System.out.println("Buscando libro con ID 2:");
        Libro libroEncontrado = biblioteca.buscarLibro(2);
        if (libroEncontrado != null) {
            System.out.println(libroEncontrado.getTitulo());
        }

        System.out.println("Eliminando libro con ID 1:");
        biblioteca.eliminarLibro(1);
        System.out.println(biblioteca.mostrarLibros());

        System.out.println("Libros ordenados alfabéticamente:");
        ArrayList<Libro> librosOrdenados = biblioteca.obtenerLibrosAlfabeticamente();
        for (Libro libro : librosOrdenados) {
            System.out.println(libro.getTitulo());
        }
    }
}