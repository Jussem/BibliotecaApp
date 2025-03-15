
package autonoma.biblioteca.models;


import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    // Constructor
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Métodos
    public String mostrarLibros() {
        StringBuilder sb = new StringBuilder();
        for (Libro libro : libros) {
            sb.append(libro.getTitulo()).append("\n");
        }
        return sb.toString();
    }

    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    public Libro buscarLibro(long id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    public boolean actualizarLibro(long id, Libro nuevoLibro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == id) {
                libros.set(i, nuevoLibro);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarLibro(long id) {
        return libros.removeIf(libro -> libro.getId() == id);
    }

    public ArrayList<Libro> obtenerLibrosAlfabeticamente() {
        libros.sort((l1, l2) -> l1.getTitulo().compareToIgnoreCase(l2.getTitulo()));
        return libros;
    }
}