package ejercicio.uno;

/**
 * *********** Autor ************* Agustin Marin, Legajo FAI-3975
 ********************************
 */
public class AvionHelice extends Avion {

    private final int hpMotor;

    public AvionHelice(String matricula, int envergadura, int añoFabricacion, int hpMotor) {
        super(matricula, envergadura, añoFabricacion);
        this.hpMotor = hpMotor;
    }

    //getters
    public int getHpMotor() {
        return hpMotor;
    }

    public int obtenerModulo() {
        return hpMotor;
    }
}
