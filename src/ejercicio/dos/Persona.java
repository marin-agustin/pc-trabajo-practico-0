package ejercicio.dos;

import java.time.*;

/*******************************************************
 * 
 * Nombre de la Clase: [Persona]
 * 
 * Autor: Agustín Marín
 * Fecha: [13/8/2024]
 * 
 *******************************************************/
public class Persona {

    //atributos
    private String nombre;
    private long dni;
    private String direccion;
    private LocalDate fechaDeNacimiento;
    private String sexo;

    //constructor
    public Persona(String nombre, long dni, String direccion, LocalDate fechaDeNacimiento, String sexo) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
    }

}
