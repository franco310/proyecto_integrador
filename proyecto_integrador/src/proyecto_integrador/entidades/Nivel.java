
package proyecto_integrador.entidades;

public class Nivel {
    
 private int codigo;
 private int codigo_sicoa; 
 private String nombre;
 private String paralelo;
 private String modalidad;
 private Escuela escuela;

    public Nivel() {
    }

    public Nivel(int codigo, int codigo_sicoa, String nombre, String paralelo, String modalidad, Escuela escuela) {
        this.codigo = codigo;
        this.codigo_sicoa = codigo_sicoa;
        this.nombre = nombre;
        this.paralelo = paralelo;
        this.modalidad = modalidad;
        this.escuela = escuela;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo_sicoa() {
        return codigo_sicoa;
    }

    public void setCodigo_sicoa(int codigo_sicoa) {
        this.codigo_sicoa = codigo_sicoa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }
 
 
    
}
