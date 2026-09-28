package Ejercicio13_controlAccesoTarjeta;

public class Main {
    public static void main(String[] args) {
        ControladorDeAcceso controlador = new ControladorDeAcceso();
        controlador.definirZona("Oficinas", 1);
        controlador.definirZona("Sala de servidores", 3);
        controlador.registrarTarjeta("RF-1001");
        controlador.registrarTarjeta("RF-1002");

        LectorTarjetas lector = new LectorTarjetas(controlador);

        lector.acercarTarjeta(new TarjetaRFID("RF-1002", 3), "Sala de servidores");
        lector.acercarTarjeta(new TarjetaRFID("RF-1001", 1), "Sala de servidores");
        lector.acercarTarjeta(new TarjetaRFID("RF-9999", 3), "Oficinas");
    }
}
