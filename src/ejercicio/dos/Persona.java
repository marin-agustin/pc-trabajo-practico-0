package ejercicio.dos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * *****************************************************
 *
 * Nombre de la Clase: [Persona]
 *
 * Autor: Agustín Marín Fecha: [13/8/2024]
 *
 ******************************************************
 */
public class Persona {

    //atributos
    private final String nombre;
    private final long dni;
    private final String direccion;
    private final LocalDate fechaNacimiento;
    private final String sexo;

    //constructor
    public Persona(String nombre, long dni, String direccion, LocalDate fechaNacimiento, String sexo) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public String getDatos() {
        DateTimeFormatter fomartoFechaNacimiento = DateTimeFormatter.ofPattern("dd/MM/yyy");

        return "nombre: " + nombre + ", dni: " + String.valueOf(dni) + ", direccion: " + direccion + ", fecha de nacimiento: " + fechaNacimiento.format(fomartoFechaNacimiento) + ", sexo: " + sexo;
    }

}
