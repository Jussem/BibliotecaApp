
package autonoma.biblioteca.main;

import autonoma.biblioteca.models.Autor;
import autonoma.biblioteca.models.Biblioteca;
import autonoma.biblioteca.models.Libro;
import autonoma.biblioteca.models.Persona;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear algunos objetos de prueba
        Libro libro1 = new Libro(1, "Cien anos de soledad");
        Libro libro2 = new Libro(2, "1984");

        Persona persona1 = new Persona("Pepito Perez", "12378", "juan@example.com");
        Autor autor1 = new Autor("Gabriel Garcia Marquez", "87654321", "gabriel@example.com", "Editorial Sudamericana", "Escritor");

        // Agregar objetos a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarPersona(persona1);
        biblioteca.agregarAutor(autor1);

        // Mostrar los libros, personas y autores en la biblioteca
        System.out.println("Libros en la biblioteca:");
        for (Libro libro : biblioteca.obtenerLibros()) {
            System.out.println(libro);
        }

        System.out.println("\nPersonas en la biblioteca:");
        for (Persona persona : biblioteca.obtenerPersonas()) {
            System.out.println(persona);
        }

        System.out.println("\nAutores en la biblioteca:");
        for (Autor autor : biblioteca.obtenerAutores()) {
            System.out.println(autor);
        }

        // Buscar un libro por ID
        Libro libroEncontrado = biblioteca.buscarLibro(1);
        if (libroEncontrado != null) {
            System.out.println("\nLibro encontrado: " + libroEncontrado);
        } else {
            System.out.println("\nLibro no encontrado.");
        }

        // Eliminar un libro
        boolean eliminado = biblioteca.eliminarLibro(2);
        if (eliminado) {
            System.out.println("\nLibro eliminado correctamente.");
        } else {
            System.out.println("\nNo se pudo eliminar el libro.");
        }

        // Mostrar los libros después de eliminar
        System.out.println("\nLibros en la biblioteca después de eliminar:");
        for (Libro libro : biblioteca.obtenerLibros()) {
            System.out.println(libro);
        }
    }
}