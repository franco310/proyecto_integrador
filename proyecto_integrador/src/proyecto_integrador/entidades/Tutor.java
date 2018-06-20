
package proyecto_integrador.entidades;

public class Tutor {
    
  private int codigo;
  private Nivel nivel;
  private Periodos periodo;
  private Usuario_rol usuario_rol;

    public Tutor() {
    }

    public Tutor(int codigo, Nivel nivel, Periodos periodo, Usuario_rol usuario_rol) {
        this.codigo = codigo;
        this.nivel = nivel;
        this.periodo = periodo;
        this.usuario_rol = usuario_rol;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Periodos getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodos periodo) {
        this.periodo = periodo;
    }

    public Usuario_rol getUsuario_rol() {
        return usuario_rol;
    }

    public void setUsuario_rol(Usuario_rol usuario_rol) {
        this.usuario_rol = usuario_rol;
    }
  
  
    
}
