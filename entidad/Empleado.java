package entidad;
/**
 * Clase abstracta que representa a un empleado en el sistema
 * Extiende de {@link Persona} e implementa la interfaz {@link Trabajador}
 * Proporciona la estructura base para el calculo de salarios de empleados
 *
 * @author Marta y Maria
 * @version 1.0
 * @see Persona
 * @see Trabajador
 */
public abstract class Empleado extends Persona implements Trabajador {
    protected double salario;
    /**
     * Cosntructor para inicializar un empleado con nombre, edad y salario base
     *
     * @param nombre Nombre del empleado
     * @param edad Edad del empleado
     * @param salario Salario base del empleado
     */
    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }
    /**
     * Metodo abstracto para cslcular el salario del empleado
     * Las clases concretas deben implementar este metodo segun su logica especifica
     */
    public abstract void calcularSalario();
}