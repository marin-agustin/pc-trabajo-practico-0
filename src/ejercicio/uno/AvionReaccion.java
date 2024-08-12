package ejercicio.uno;

/**
 * *********** Autor ************* Agustin Marin, Legajo FAI-3975
 ********************************
 */
public class AvionReaccion extends Avion {

    private int cantidadMotores;

    public AvionReaccion(String matricula, int envergadura, int añoFabricacion, int cantidadMotores) {
        super(matricula, envergadura, añoFabricacion);
        this.cantidadMotores = cantidadMotores;
    }

    //getters
    public int getCantidadMotores() {
        return cantidadMotores;
    }

    public int obtenerModulo() {
        return cantidadMotores;
    }
}
