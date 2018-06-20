
package proyecto_integrador.entidades;

public class Ambito {
    private int codigo;
    private String nombre;
    private String observacion;
    private int estado;
    
    public Ambito() {
    }

    public Ambito(int codigo, String nombre, String observacion, int estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.observacion = observacion;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        return nombre; 
    }
}
