
package autonoma.biblioteca.models;


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
