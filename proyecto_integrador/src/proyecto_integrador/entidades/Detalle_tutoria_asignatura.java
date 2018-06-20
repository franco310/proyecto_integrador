/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_integrador.entidades;

/**
 *
 * @author pc
 */
public class Detalle_tutoria_asignatura {
  private long codigo;
  private Estudiante estudiante ;
  private String apellidos_estudiante;
  private String  nombre_estudiante;
  private String cedula_estudiante;
  private String observacion1;
  private String observacion2;
  private String observacion3;
  private Encabezado_tutoria_asignatura encabezado_tutoria_asignatura;  

    public Detalle_tutoria_asignatura() {
    }

    public Detalle_tutoria_asignatura(long codigo, Estudiante estudiante, String apellidos_estudiante, String nombre_estudiante, String cedula_estudiante, String observacion1, String observacion2, String observacion3, Encabezado_tutoria_asignatura encabezado_tutoria_asignatura) {
        this.codigo = codigo;
        this.estudiante = estudiante;
        this.apellidos_estudiante = apellidos_estudiante;
        this.nombre_estudiante = nombre_estudiante;
        this.cedula_estudiante = cedula_estudiante;
        this.observacion1 = observacion1;
        this.observacion2 = observacion2;
        this.observacion3 = observacion3;
        this.encabezado_tutoria_asignatura = encabezado_tutoria_asignatura;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getApellidos_estudiante() {
        return apellidos_estudiante;
    }

    public void setApellidos_estudiante(String apellidos_estudiante) {
        this.apellidos_estudiante = apellidos_estudiante;
    }

    public String getNombre_estudiante() {
        return nombre_estudiante;
    }

    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    public String getCedula_estudiante() {
        return cedula_estudiante;
    }

    public void setCedula_estudiante(String cedula_estudiante) {
        this.cedula_estudiante = cedula_estudiante;
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

    public Encabezado_tutoria_asignatura getEncabezado_tutoria_asignatura() {
        return encabezado_tutoria_asignatura;
    }

    public void setEncabezado_tutoria_asignatura(Encabezado_tutoria_asignatura encabezado_tutoria_asignatura) {
        this.encabezado_tutoria_asignatura = encabezado_tutoria_asignatura;
    }
      @Override
    public String toString() {
        return apellidos_estudiante; 
    } 

}
