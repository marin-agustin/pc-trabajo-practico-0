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
    private final long numeroTitulo;
    private final long adicionalRol;

    //constructor
    public Desarrollador(String nombre, long dni, String direccion, LocalDate fechaDeNacimiento, String sexo, long salario, String legajo, long porcentajeAntiguedad, LocalDate fechaIngreso, long numeroTitulo, long adicionalRol) {
        super(nombre, dni, direccion, fechaDeNacimiento, sexo, salario, legajo, porcentajeAntiguedad, fechaIngreso);
        this.numeroTitulo = numeroTitulo;
        this.adicionalRol = adicionalRol;
    }

    //metodos
    @Override
    public String getDatos() {
        String datos = super.getDatos();

        return datos += ", numero de titulo: " + String.valueOf(numeroTitulo) + ", adicional por rol: " + String.valueOf(adicionalRol);
    }
    
    @Override
    public long obtenerSalario() {
        long salarioMensual = super.obtenerSalario() + adicionalRol;
        
        return salarioMensual;
    }
}
