
package proyecto_integrador.entidades;

import java.sql.Time;
import java.util.Date;

public class Encabezado_tutoria_asignatura {
    
  private long codigo;
  private Date fecha;
  private Time hora;
  private Periodo periodo;
  private String nombre_periodo;
  private int codigo_carrera;
  private String nombre_carrera;
  private Nivel nivel;
  private String nombre_nivel;
  private int codigo_paralelo;
  private String nombre_paralelo;
  private int codigo_asignatura;
  private String nombre_asignatura;
  private int codigo_modalidad;
  private Ambito ambito;
  private String  motivo;
  private String instancia_apoyo;
  private int codigo_docente;
  private String apellidos_docente;
  private String nombre_docente;
  private String cedula_docente;
  private String observacion1;
  private String observacion2;
  private String observacion3;

    public Encabezado_tutoria_asignatura() {
    }

    public Encabezado_tutoria_asignatura(long codigo, Date fecha, Time hora, Periodo periodo, String nombre_periodo, int codigo_carrera, String nombre_carrera, Nivel nivel, String nombre_nivel, int codigo_paralelo, String nombre_paralelo, int codigo_asignatura, String nombre_asignatura, int codigo_modalidad, Ambito ambito, String motivo, String instancia_apoyo, int codigo_docente, String apellidos_docente, String nombre_docente, String cedula_docente, String observacion1, String observacion2, String observacion3) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.periodo = periodo;
        this.nombre_periodo = nombre_periodo;
        this.codigo_carrera = codigo_carrera;
        this.nombre_carrera = nombre_carrera;
        this.nivel = nivel;
        this.nombre_nivel = nombre_nivel;
        this.codigo_paralelo = codigo_paralelo;
        this.nombre_paralelo = nombre_paralelo;
        this.codigo_asignatura = codigo_asignatura;
        this.nombre_asignatura = nombre_asignatura;
        this.codigo_modalidad = codigo_modalidad;
        this.ambito = ambito;
        this.motivo = motivo;
        this.instancia_apoyo = instancia_apoyo;
        this.codigo_docente = codigo_docente;
        this.apellidos_docente = apellidos_docente;
        this.nombre_docente = nombre_docente;
        this.cedula_docente = cedula_docente;
        this.observacion1 = observacion1;
        this.observacion2 = observacion2;
        this.observacion3 = observacion3;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public String getNombre_periodo() {
        return nombre_periodo;
    }

    public void setNombre_periodo(String nombre_periodo) {
        this.nombre_periodo = nombre_periodo;
    }

    public int getCodigo_carrera() {
        return codigo_carrera;
    }

    public void setCodigo_carrera(int codigo_carrera) {
        this.codigo_carrera = codigo_carrera;
    }

    public String getNombre_carrera() {
        return nombre_carrera;
    }

    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public String getNombre_nivel() {
        return nombre_nivel;
    }

    public void setNombre_nivel(String nombre_nivel) {
        this.nombre_nivel = nombre_nivel;
    }

    public int getCodigo_paralelo() {
        return codigo_paralelo;
    }

    public void setCodigo_paralelo(int codigo_paralelo) {
        this.codigo_paralelo = codigo_paralelo;
    }

    public String getNombre_paralelo() {
        return nombre_paralelo;
    }

    public void setNombre_paralelo(String nombre_paralelo) {
        this.nombre_paralelo = nombre_paralelo;
    }

    public int getCodigo_asignatura() {
        return codigo_asignatura;
    }

    public void setCodigo_asignatura(int codigo_asignatura) {
        this.codigo_asignatura = codigo_asignatura;
    }

    public String getNombre_asignatura() {
        return nombre_asignatura;
    }

    public void setNombre_asignatura(String nombre_asignatura) {
        this.nombre_asignatura = nombre_asignatura;
    }

    public int getCodigo_modalidad() {
        return codigo_modalidad;
    }

    public void setCodigo_modalidad(int codigo_modalidad) {
        this.codigo_modalidad = codigo_modalidad;
    }

    public Ambito getAmbito() {
        return ambito;
    }

    public void setAmbito(Ambito ambito) {
        this.ambito = ambito;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getInstancia_apoyo() {
        return instancia_apoyo;
    }

    public void setInstancia_apoyo(String instancia_apoyo) {
        this.instancia_apoyo = instancia_apoyo;
    }

    public int getCodigo_docente() {
        return codigo_docente;
    }

    public void setCodigo_docente(int codigo_docente) {
        this.codigo_docente = codigo_docente;
    }

    public String getApellidos_docente() {
        return apellidos_docente;
    }

    public void setApellidos_docente(String apellidos_docente) {
        this.apellidos_docente = apellidos_docente;
    }

    public String getNombre_docente() {
        return nombre_docente;
    }

    public void setNombre_docente(String nombre_docente) {
        this.nombre_docente = nombre_docente;
    }

    public String getCedula_docente() {
        return cedula_docente;
    }

    public void setCedula_docente(String cedula_docente) {
        this.cedula_docente = cedula_docente;
    }

    public String getObservacion1() {
        return observacion1;
    }

    public void setObservacion1(String observacion1) {
        this.observacion1 = observacion1;
    }

    public String getObservacion2() {
        return observacion2;
    }

    public void setObservacion2(String observacion2) {
        this.observacion2 = observacion2;
    }

    public String getObservacion3() {
        return observacion3;
    }

    public void setObservacion3(String observacion3) {
        this.observacion3 = observacion3;
    }
  
    
}
