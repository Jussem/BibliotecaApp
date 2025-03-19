package autonoma.biblioteca.models;

/**
 * modelo que representa una persona
 * @author Alejandra
 * since 20250315
 * @version 1.0
 */
public class Persona {
    /////// Atributos
    
    /**
     * Nombre de la persona
     */
    private String nombre;

    /**
     * Documento de identidad de la persona
     */
    private String documentoIdentidad;

    /**
     * Correo electronico de la persona
     */
    private String correoElectronico;

    
    
    //////metodo constructor
    public Persona(String nombre, String documentoIdentidad, String correoElectronico) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.correoElectronico = correoElectronico;
    }

    public Persona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    //////metodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
