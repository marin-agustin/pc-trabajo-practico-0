package ejercicio.dos;

import java.time.LocalDate;

/**
 * *****************************************************
 *
 * Nombre de la Clase: [Administrativo]
 *
 * Autor: Agustín Marín Fecha: [13/8/2024]
 *
 ******************************************************
 */
public class Administrativo extends Empleado {

    //atributos
    private long adicionalCategoria;
    private long adicionalAsistencia;

    //constructor
    public Administrativo(String nombre, long dni, String direccion, LocalDate fechaDeNacimiento, String sexo, long salario, String legajo, long porcentajeAntiguedad, LocalDate fechaIngreso, long adicionalCategoria, long adicionalAsistencia) {
        super(nombre, dni, direccion, fechaDeNacimiento, sexo, salario, legajo, porcentajeAntiguedad, fechaIngreso);
        this.adicionalCategoria = adicionalCategoria;
        this.adicionalAsistencia = adicionalAsistencia;
    }

}
