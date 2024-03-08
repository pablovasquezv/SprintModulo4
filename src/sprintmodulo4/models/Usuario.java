package sprintmodulo4.models;

import sprintmodulo4.interfaces.IAsesoria;

import java.time.LocalDate;

/**
 * @author Pablo
 */
public abstract class Usuario implements IAsesoria {
    //Definición de atributos
    protected int run;
    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaNacimiento;
    protected Integer edad;

    /**
     *
     */
    public Usuario() {

    }

    /**
     * @param run
     * @param nombre
     * @param apellidos
     * @param fechaNacimiento
     * @param edad
     */
    public Usuario(int run, String nombre, String apellidos, LocalDate fechaNacimiento, Integer edad) {
        this.run = run;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    /**
     * @return run
     */
    public int getRun() {
        return run;
    }

    /**
     * @param run
     */
    public void setRun(int run) {
        this.run = run;
    }

    /**
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "run=" + run +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + edad +
                '}';
    }

    /**
     * * Retorna un mensaje que indica la edad del usuario.
     *
     * @return Un mensaje con la edad del usuario.
     */
    public String mostrarEdad() {
        return "El usuario tiene " + edad + " años.";
    }

    /**
     * Despliega el nombre y el RUN del usuario.
     */

    @Override
    public void analizarUsuario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("RUN" + run);
    }
}
