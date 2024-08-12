package ejercicio.uno;

import java.time.*;

/**
 * *********** Autor ************* Agustin Marin, Legajo FAI-3975
 ********************************
 */
public class Cliente {
    
    //atributos
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private int edad;
    private String direccion;
    private String telefono;

    //constructor
    public Cliente(String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        Period edad = Period.between(fechaNacimiento, LocalDate.now());
        this.edad = edad.getYears();
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
}
