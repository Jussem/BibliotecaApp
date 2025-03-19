package autonoma.biblioteca.models;

/**
 * Modelo que representa un libro
 * @author Alejandra
 * @since 20250315
 * @version 1.1
 */
public class Libro {
    /////// Atributos

    /**
     * Contador estático para generar IDs automáticos
     */
    private static long contadorId = 1;

    /**
     * ID del libro (único y autogenerado)
     */
    private long id;

    /**
     * Título del libro
     */
    private String titulo;

    ////// Constructor

    /**
     * Constructor que genera automáticamente el ID del libro
     * @param titulo Título del libro
     */
    public Libro(String titulo) {
        this.id = contadorId++;
        this.titulo = titulo;
    }

    ////// Métodos de acceso

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
