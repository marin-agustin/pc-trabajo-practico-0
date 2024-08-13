package ejercicio.dos;

import java.time.LocalDate;

/**
 * *****************************************************
 *
 * Nombre de la Clase: [Empleado]
 *
 * Autor: Agustín Marín Fecha: [13/8/2024]
 *
 ******************************************************
 */
public class Empleado extends Persona {

    //atributos
    private long salario;
    private String legajo;
    private long porcentajeAntiguedad;
    private LocalDate fechaIngreso;

    //constructor
    public Empleado(String nombre, long dni, String direccion, LocalDate fechaDeNacimiento, String sexo, long salario, String legajo, long porcentajeAntiguedad, LocalDate fechaIngreso) {
        super(nombre, dni, direccion, fechaDeNacimiento, sexo);
        this.salario = salario;
        this.legajo = legajo;
        this.porcentajeAntiguedad = porcentajeAntiguedad;
        this.fechaIngreso = fechaIngreso;
    }
}
