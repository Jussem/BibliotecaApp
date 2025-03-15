
package autonoma.biblioteca.models;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Autor> autores;
    private ArrayList<Persona> personas;

    // Constructor
    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.personas = new ArrayList<>();
    }

    // Métodos para Libros
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

    public boolean eliminarLibro(long id) {
        return libros.removeIf(libro -> libro.getId() == id);
    }

    public ArrayList<Libro> obtenerLibros() {
        return libros;
    }

    // Métodos para Autores
    public boolean agregarAutor(Autor autor) {
        return autores.add(autor);
    }

    public Autor buscarAutor(String documentoIdentidad) {
        for (Autor autor : autores) {
            if (autor.getDocumentoIdentidad().equals(documentoIdentidad)) {
                return autor;
            }
        }
        return null;
    }

    public boolean eliminarAutor(String documentoIdentidad) {
        return autores.removeIf(autor -> autor.getDocumentoIdentidad().equals(documentoIdentidad));
    }

    public ArrayList<Autor> obtenerAutores() {
        return autores;
    }

    // Métodos para Personas
    public boolean agregarPersona(Persona persona) {
        return personas.add(persona);
    }

    public Persona buscarPersona(String documentoIdentidad) {
        for (Persona persona : personas) {
            if (persona.getDocumentoIdentidad().equals(documentoIdentidad)) {
                return persona;
            }
        }
        return null;
    }

    public boolean eliminarPersona(String documentoIdentidad) {
        return personas.removeIf(persona -> persona.getDocumentoIdentidad().equals(documentoIdentidad));
    }

    public ArrayList<Persona> obtenerPersonas() {
        return personas;
    }
}