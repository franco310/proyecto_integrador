
package proyecto_integrador.dao;

 import java.util.List;
import proyecto_integrador.entidades.Usuario;

public interface IUsuario {
    public int insertar(Usuario usuario) throws Exception;
    public int modificar(Usuario usuario) throws Exception;
    public int eliminar(Usuario usuario) throws Exception;
    public Usuario obtener(int codigo) throws Exception;
    public List<Usuario> obtener() throws Exception; 
    
}
