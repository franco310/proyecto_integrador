package proyecto_integrador.impl;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import proyecto_integrador.accesodatos.Conexion;
import proyecto_integrador.accesodatos.Parametro;
import proyecto_integrador.dao.IUsuario;
import proyecto_integrador.entidades.Usuario;

public class UsuarioImpl implements IUsuario{
    
    @Override
    public int insertar(Usuario usuario) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "insert into estudiante  values "
                +"(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, usuario.getCodigo()));
        lstPar.add(new Parametro(2, usuario.getApellidos()));
        lstPar.add(new Parametro(3, usuario.getNombres()));
        lstPar.add(new Parametro(4, usuario.getIdentificacion()));
        lstPar.add(new Parametro(5, usuario.getNombre_corto()));
        lstPar.add(new Parametro(6, usuario.getClave()));
        lstPar.add(new Parametro(7, usuario.getClave_pregunta()));
        lstPar.add(new Parametro(8, usuario.getClave_respuesta()));
        lstPar.add(new Parametro(9, usuario.getMail()));
        lstPar.add(new Parametro(10, usuario.getEstado()));
        lstPar.add(new Parametro(11, usuario.getPrimer_acceso()));
        lstPar.add(new Parametro(12, usuario.getUtimo_acceso()));
        lstPar.add(new Parametro(13, usuario.getUltima_ip()));
        lstPar.add(new Parametro(14, usuario.getFecha_modificacion()));
        lstPar.add(new Parametro(15, usuario.getCodigo_salt()));
        lstPar.add(new Parametro(16, usuario.getRuta_firma()));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilasAfectadas = con.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilasAfectadas;
    }

    @Override
    public int modificar(Usuario usuario) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "UPDATE usuariio"
                + "   SET codigo=?, apellidos=?, nombres=?, identificacion=?, nombre_corto=?, \n" +
"       clave=?, clave_pregunta=?, clave_respuesta=?, mail=?, estado=?, \n" +
"       primer_acceso=?, utimo_acceso=?, ultima_ip=?, fecha_modificacion=?, \n" +
"       codigo_salt=?, ruta_firma=?";
        List<Parametro> lstPar = new ArrayList<>();
       lstPar.add(new Parametro(1, usuario.getCodigo()));
        lstPar.add(new Parametro(2, usuario.getApellidos()));
        lstPar.add(new Parametro(3, usuario.getNombres()));
        lstPar.add(new Parametro(4, usuario.getIdentificacion()));
        lstPar.add(new Parametro(5, usuario.getNombre_corto()));
        lstPar.add(new Parametro(6, usuario.getClave()));
        lstPar.add(new Parametro(7, usuario.getClave_pregunta()));
        lstPar.add(new Parametro(8, usuario.getClave_respuesta()));
        lstPar.add(new Parametro(9, usuario.getMail()));
        lstPar.add(new Parametro(10, usuario.getEstado()));
        lstPar.add(new Parametro(11, usuario.getPrimer_acceso()));
        lstPar.add(new Parametro(12, usuario.getUtimo_acceso()));
        lstPar.add(new Parametro(13, usuario.getUltima_ip()));
        lstPar.add(new Parametro(14, usuario.getFecha_modificacion()));
        lstPar.add(new Parametro(15, usuario.getCodigo_salt()));
        lstPar.add(new Parametro(16, usuario.getRuta_firma()));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilasAfectadas = con.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilasAfectadas;
    }

    @Override
    public int eliminar(Usuario usuario) throws Exception {
        int numFilasAfectadas = 0;
         String sql = "DELETE FROM usuario  where codigo=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, usuario.getCodigo()));       
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilasAfectadas = con.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilasAfectadas;
    }

    @Override
    public Usuario obtener(long codigo) throws Exception {
        Usuario usuario = null;
        String sql = "SELECT  codigo, apellidos, nombres, identificacion, nombre_corto, clave, \n" +
"       clave_pregunta, clave_respuesta, mail, estado, primer_acceso, \n" +
"       utimo_acceso, ultima_ip, fecha_modificacion, codigo_salt, ruta_firma\n" +
"  FROM actividades.usuario where codigo=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()) {
                usuario = new Usuario();
                usuario.setCodigo(rst.getLong(1));
                usuario.setApellidos(rst.getString(2));
                usuario.setNombres(rst.getString(3));
                usuario.setIdentificacion(rst.getString(4));
                usuario.setNombre_corto(rst.getString(5));
                usuario.setClave(rst.getString(6));
                usuario.setClave_pregunta(rst.getString(7));
                usuario.setClave_respuesta(rst.getString(8));
                usuario.setMail(rst.getString(9));
                usuario.setEstado(rst.getInt(10));
                usuario.setPrimer_acceso(rst.getTimestamp(11));
                usuario.setUtimo_acceso(rst.getTimestamp(12));
                usuario.setUltima_ip(rst.getString(13));
                usuario.setFecha_modificacion(rst.getTimestamp(14));
                usuario.setCodigo_salt(rst.getString(15));
                usuario.setRuta_firma(rst.getString(16));
              
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return usuario;
    }

    @Override
    public List<Usuario> obtener() throws Exception {
        List<Usuario> lista = new ArrayList<>();
         String sql = "SELECT codigo, apellidos, nombres, identificacion, nombre_corto, clave, \n" +
"       clave_pregunta, clave_respuesta, mail, estado, primer_acceso, \n" +
"       utimo_acceso, ultima_ip, fecha_modificacion, codigo_salt, ruta_firma\n" +
"  FROM actividades.usuario ";        
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            Usuario usuario=null;
            while (rst.next()) {
                usuario = new Usuario();
                usuario.setCodigo(rst.getLong(1));
                usuario.setApellidos(rst.getString(2));
                usuario.setNombres(rst.getString(3));
                usuario.setIdentificacion(rst.getString(4));
                usuario.setNombre_corto(rst.getString(5));
                usuario.setClave(rst.getString(6));
                usuario.setClave_pregunta(rst.getString(7));
                usuario.setClave_respuesta(rst.getString(8));
                usuario.setMail(rst.getString(9));
                usuario.setEstado(rst.getInt(10));
                usuario.setPrimer_acceso(rst.getTimestamp(11));
                usuario.setUtimo_acceso(rst.getTimestamp(12));
                usuario.setUltima_ip(rst.getString(13));
                usuario.setFecha_modificacion(rst.getTimestamp(14));
                usuario.setCodigo_salt(rst.getString(15));
                usuario.setRuta_firma(rst.getString(16));
                lista.add(usuario);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return lista;
    }
}
