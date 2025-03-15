
package autonoma.biblioteca.models;

public class Libro {
    private long id;
    private String titulo;

    // Constructor
    public Libro(long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    // Getters y Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}