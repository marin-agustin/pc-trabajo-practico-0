package ejercicio.uno;

import java.time.*;

/**
 * *********** Autor ************* Agustin Marin, Legajo FAI-3975
 ********************************
 */
public class Alquiler {

    //creo los atributos que va a tener la clase
    private final Cliente cliente;
    private final LocalDateTime fechaHoraInicio;
    private final LocalDateTime fechaHoraFin;
    private final int numeroEstacionamiento;
    private final Avion avion;

    //constructor de la clase
    public Alquiler(Cliente cliente, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin, int numeroEstacionamiento, Avion avion) {
        this.cliente = cliente;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.numeroEstacionamiento = numeroEstacionamiento;
        this.avion = avion;
    }

    //getters
    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public int getNumeroEstacionamiento() {
        return numeroEstacionamiento;
    }

    public Avion getAvion() {
        return avion;
    }

    //metodos
    public long calcularCostoAlquiler() {
        //retorna el costo del alquiler
        Duration duracion = Duration.between(fechaHoraInicio, fechaHoraFin);
        long horas = duracion.toHours();
        
        int modulo = (avion.getEnvergadura() * 20) + avion.obtenerModulo();
        long costoAlquiler = (horas * modulo) + 250;

        return costoAlquiler;
    }
}
