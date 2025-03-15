
package autonoma.biblioteca.models;


public class Autor extends Persona {
    private String editorial;
    private String profesion;

    // Constructor
    public Autor(String nombre, String documentoIdentidad, String correoElectronico, String editorial, String profesion) {
        super(nombre, documentoIdentidad, correoElectronico);
        this.editorial = editorial;
        this.profesion = profesion;
    }

    // Getters y Setters
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}