package ejercicio.uno;

/**
 * *********** Autor ************* Agustin Marin, Legajo FAI-3975
 ********************************
 */
public abstract class Avion {

    private String matricula;
    private int envergadura;
    private int añoFabricacion;

    public Avion(String matricula, int envergadura, int añoFabricacion) {
        this.matricula = matricula;
        this.envergadura = envergadura;
        this.añoFabricacion = añoFabricacion;
    }

    //getters
    public String getMatricula() {
        return matricula;
    }

    public int getEnvergadura() {
        return envergadura;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public abstract int obtenerModulo();
}
