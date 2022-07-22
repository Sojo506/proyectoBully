
package code;

/**
 *
 * @author andres
 */
public class Curso {
    private String nombreCurso;
    private String horario;
    private String modalidad;
    private int cantidad;
    private int cantidadEstudiantes;

    public Curso() {
        
    }
    
    public Curso(String nombreCurso, String horario, String modalidad, int cantidad, int cantidadEstudiantes) {
        this.nombreCurso = nombreCurso;
        this.horario = horario;
        this.modalidad = modalidad;
        this.cantidad = cantidad;
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }
    
    
}
