package autonoma.bibliotecaAPP.models;

/**
 * Modelo que representa un libro
 * @author alejandra
 * @since 2025
 * @version 1.0
 */
public class Libro {
    /////// Atributos

    /**
     * Contador estático para generar IDs únicos automáticamente
     */
    private static long contadorId = 1;

    /**
     * id del libro
     */
    private final long id; // ahora es final porque nunca cambiará después de creado

    /**
     * Título del libro
     */
    private String titulo;

    ////// Método Constructor 

    /**
     * Constructor que asigna automáticamente el ID usando el contador
     * @param titulo Título del libro
     */
    public Libro(String titulo) {
        this.id = contadorId++; // asigna el valor actual del contador y luego lo incrementa
        this.titulo = titulo;
    }

    ///// Métodos de Acceso

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
