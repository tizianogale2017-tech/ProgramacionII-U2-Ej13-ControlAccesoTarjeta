package Ejercicio13_controlAccesoTarjeta;

public class LectorTarjetas {
    private ControladorDeAcceso controlador;

    public LectorTarjetas(ControladorDeAcceso controlador) {
        this.controlador = controlador;
    }

    public void acercarTarjeta(TarjetaRFID tarjeta, String zona) {
        System.out.println("Lectura de tarjeta " + tarjeta.getCodigo() + " en zona \"" + zona + "\"...");
        if (controlador.verificarAcceso(tarjeta, zona)) {
            System.out.println("  -> ACCESO CONCEDIDO: puerta abierta.");
        } else {
            System.out.println("  -> ACCESO DENEGADO.");
        }
    }
}
