package autonoma.bibliotecaAPP.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo que representa una biblioteca
 * @author alejandra
 * @since 2025
 * @version 1.1
 */
public class Biblioteca {
    //////////////////////////////////////////////////////////////
    /// Atributos

    /**
     * Arreglo de libros
     */
    private List<Libro> libros;
    private List<Autor> autores;

    //////////////////////////////////////////////////////////////
    /// Método Constructor

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        autores.add(new Autor("Gabriel","9832903","Gabriel@gmail.com","Times","Politologo"));
        autores.add(new Autor("Daniel","9347","Daniel@gmail.com","RRHJ","Cientifico"));
        autores.add(new Autor("Rafael","980923","Rafael@gmail.com","ROTINHAM","Medico"));
        // Agregar algunos libros de prueba SIN ID manual
        libros.add(new Libro("El principito"));
        libros.add(new Libro("Don Quijote de la mancha"));
        libros.add(new Libro("Cien años de soledad"));
    }

    //////////////////////////////////////////////////////////////
    /// Métodos de acceso

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public boolean agregarLibro(Libro libro) {
        for (Libro l : libros) {
            if (l.getId() == libro.getId()) {
                return false; // Ya existe un libro con ese ID
            }
        }
        return libros.add(libro);
    }

    public String mostrarLibros() {
        if (libros.isEmpty()) {
            return "No hay libros en la biblioteca.";
        }

        StringBuilder resultado = new StringBuilder("Libros:\n");
        for (Libro libro : libros) {
            resultado.append("ID: ").append(libro.getId())
                     .append(", Título: ").append(libro.getTitulo())
                     .append("\n");
        }
        return resultado.toString();
    }

    /**
     * Método para buscar un libro por ID
     * @param id ID del libro a buscar
     * @return el libro si se encuentra, null si no existe
     */
    public Libro buscarLibro(long id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Método para eliminar un libro por ID
     * @param id ID del libro a eliminar
     * @return true si el libro fue eliminado, false si no se encontró
     */
    public boolean eliminarLibro(long id) {
        Libro libro = buscarLibro(id);
        if (libro != null) {
            return libros.remove(libro);
        }
        return false;
    }
}
