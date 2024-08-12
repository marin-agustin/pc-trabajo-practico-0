package ejercicio.uno;

/**
 * *********** Autor ************* Agustin Marin, Legajo FAI-3975
 ********************************
 */
public class AvionComercial extends AvionHelice {

    private int capacidadPasajeros;

    public AvionComercial(String matricula, int envergadura, int añoFabricacion, int hpMotor, int cantidadPasajeros) {
        super(matricula, envergadura, añoFabricacion, hpMotor);
        this.capacidadPasajeros = cantidadPasajeros;
    }

    //getters
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public int obtenerModulo() {
        return getHpMotor() + capacidadPasajeros;
    }
}
