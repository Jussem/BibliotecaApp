/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

/**
 *
 * @author valej
 */
public class Autor {
    private String editorial;
    private String profesion;

    public Autor(String editorial, String profesion) {
        this.editorial = editorial;
        this.profesion = profesion;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
}
