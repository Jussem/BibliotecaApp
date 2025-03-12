/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

/**
 *
 * @author juanb
 */
public class Persona {
    ///////////////////////////////////////////////////////////////////////////////////
    ///Atributos
    
    private String nombre;
    private String documentoIdentidad;
    private String correoElectronico;

    public Persona(String nombre, String documentoIdentidad, String correoElectronico) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.correoElectronico = correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
