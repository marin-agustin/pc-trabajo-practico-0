package ejercicio.dos;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

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
    private final long salario;
    private final String legajo;
    private final long porcentajeAntiguedad;
    private final LocalDate fechaIngreso;

    //constructor
    public Empleado(String nombre, long dni, String direccion, LocalDate fechaDeNacimiento, String sexo, long salario, String legajo, long porcentajeAntiguedad, LocalDate fechaIngreso) {
        super(nombre, dni, direccion, fechaDeNacimiento, sexo);
        this.salario = salario;
        this.legajo = legajo;
        this.porcentajeAntiguedad = porcentajeAntiguedad;
        this.fechaIngreso = fechaIngreso;
    }

    //metodos
    public boolean verificarAntiguedad(int antiguedad) {
        boolean verificado;
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaIngreso, fechaActual);

        verificado = periodo.getYears() > antiguedad;

        return verificado;
    }

    @Override
    public String getDatos() {
        String datos = super.getDatos();
        DateTimeFormatter fomartoFechaIngreso = DateTimeFormatter.ofPattern("dd/MM/yyy");

        return datos += ", salario: " + String.valueOf(salario) + ", legajo: " + legajo + ", porcentaje de antiguedad: " + String.valueOf(porcentajeAntiguedad) + ", fecha de ingreso: " + fechaIngreso.format(fomartoFechaIngreso);
    }

    public long obtenerSalario() {
        long salarioMensual = salario * porcentajeAntiguedad;

        return salarioMensual;
    }
}
