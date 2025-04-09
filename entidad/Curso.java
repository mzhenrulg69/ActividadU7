package entidad;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un curso educativo con estudiantes inscritos,
 * permite agregar estudiantes y mostrar la lista de los mismos.
 *
 * @author [Marta y Maria]
 * @version 1.0
 */
public class Curso {
    private String nombre;
    private List<Estudiante> estudiantes;
/**
 * Constructor que inicializa un curso con un nombre específico.
 * La lista de estudiantes se inicializa como una lista vacia.
 *
 * @param nombre Dam1a*/
    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }
 /**
  * Agrega un estudiante a la lista del curso
  *
  */
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    /**
     * Obtiene el nombre del curso
     *
     * @return El nombre del curso*/
    public String getNombre() {
        return nombre;
    }
   /**
    * Muestra por consola la lista de estudiantes inscritos en el curso
    * El formato de salida incluye el nombre del curso seguido de los nombres de los
    * estudiantes, cada uno con un guion*/
    public void mostrarEstudiantes() {
        System.out.println("Estudiantes en el curso " + nombre + ":");
        for (Estudiante e : estudiantes) {
            System.out.println("- " + e.nombre);
        }
    }
}