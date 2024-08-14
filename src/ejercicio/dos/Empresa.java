package ejercicio.dos;

import java.util.ArrayList;

/**
 * *****************************************************
 *
 * Nombre de la Clase: [Empresa]
 *
 * Autor: Agustín Marín Fecha: [13/8/2024]
 *
 ******************************************************
 */
public class Empresa {

    //atributos
    private ArrayList<Empleado> empleados = new ArrayList<>();

    //constructor
    public Empresa(Empleado empleado) {
        empleados.add(empleado);
    }

    //setter
    public boolean agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        return true;
    }

    //metodos
    public ArrayList obtenerEmpleadosConAntiguedad(int antiguedad) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        if (!(this.empleados.isEmpty())) {
            for (int i = 0; i < this.empleados.size(); i++) {
                if (this.empleados.get(i).verificarAntiguedad(antiguedad)) {
                    listaEmpleados.add(this.empleados.get(i));
                }
            }
        }

        return listaEmpleados;
    }

}
