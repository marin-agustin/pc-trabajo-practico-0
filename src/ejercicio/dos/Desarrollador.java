package ejercicio.dos;

import java.time.LocalDate;

/**
 * *****************************************************
 *
 * Nombre de la Clase: [Desarrollador]
 *
 * Autor: Agustín Marín Fecha: [13/8/2024]
 *
 ******************************************************
 */
public class Desarrollador extends Empleado {

    //atributos
    private long numeroTituto;
    private long adicionalRol;

    public Desarrollador(String nombre, long dni, String direccion, LocalDate fechaDeNacimiento, String sexo, long salario, String legajo, long porcentajeAntiguedad, LocalDate fechaIngreso, long numeroTitulo, long adicionalRol) {
        super(nombre, dni, direccion, fechaDeNacimiento, sexo, salario, legajo, porcentajeAntiguedad, fechaIngreso);
        this.numeroTituto = numeroTitulo;
        this.adicionalRol = adicionalRol;
    }

}
